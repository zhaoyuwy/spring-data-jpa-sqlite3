package com.dom925.demo;

import com.dom925.demo.spring.hidernate.model.Person;
import com.dom925.demo.spring.hidernate.service.CatService;
import com.dom925.demo.spring.hidernate.service.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringHibernateMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/spring/app-context.xml");

        PersonService personService = context.getBean("personServiceImpl", PersonService.class);
        CatService catService = context.getBean("catServiceImpl", CatService.class);
        String path = personService.getpath();
        System.out.println(path);
        Person person = new Person();
        person.setFirstName("HILLARY");
        person.setLastName("CLINTON");
        personService.insertPerson(person);

        for (Person p : personService.getAllPersons()) {
            System.out.println(p);
        }
    }

    String getPatch() {
        return this.getClass().getClassLoader().getResource("").getPath();
    }

}
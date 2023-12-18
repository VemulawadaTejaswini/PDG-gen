/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;
import java.util.Scanner;
public class JavaApplication7{
    public static void main(String[] args) {
        String day;
        Scanner input = new Scanner(System.in);
        day = input.nextLine();
        if(day.equals("MON")){
            System.out.println("6");
            System.out.println("It is Monday today, and six days later, it will be Sunday.");
        }
        else if(day.equals("TUE")){
            System.out.println("5");
            System.out.println("It is Tuesday today, and five days later, it will be Sunday.");
        }
        else if(day.equals("WED")){
            System.out.println("4");
            System.out.println("It is Wednesday today, and four days later, it will be Sunday.");
        }
        else if(day.equals("THU")){
            System.out.println("3");
            System.out.println("It is Thursday today, and three days later, it will be Sunday.");
        }
        else if(day.equals("FRI")){
            System.out.println("3");
            System.out.println("It is Friday today, and two days later, it will be Sunday.");
        }else if(day.equals("SAT")){
            System.out.println("1");
            System.out.println("It is Saturday today, and tomorrow will be Sunday.");
        }
        else if(day.equals("SUN")){
            System.out.println("7");
            System.out.println("It is Sunday today, and seven days later, it will be Sunday again.");
        }
        
    }
    
}

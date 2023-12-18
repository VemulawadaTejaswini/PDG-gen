import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         Scanner r = new Scanner(System.in);
         String day = r.next();
         if (day == "SUN"){
             System.out.println("7");
         System.out.println("It is Sunday today, and seven days later, it will be Sunday again.");}
         else if (day == "MON"){
             System.out.println("6");
         System.out.println("It is Monday today, and six days later, it will be Sunday again.");}




         else if (day=="TUE"){
             System.out.println("5");
             System.out.println("It is Tuesday today, and five days later, it will be Sunday again.");
         }
         else if (day == "WED"){
             System.out.println("4");
             System.out.println("It is Wednesday today, and four days later, it will be Sunday again.");
         }
         else if (day == "THU"){
             System.out.println("3");
         System.out.println("It is Thursday today, and three days later, it will be Sunday again.");}
         else if (day == "FRI"){
             System.out.println("2");
         System.out.println("It is Friday today, and two days later, it will be Sunday again.");}
         else if (day == "SAT"){
             System.out.println("1");
             System.out.println("It is Saturday today, and tomorrow will be Sunday.");
         }
       }
      // System.out.println(x);

    }


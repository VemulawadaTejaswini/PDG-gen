import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        String []d={"Sunny","Cloudy","Rainy"};
        String input=reader.next();
       switch(input){
           case  "Sunny":
               {
                   System.out.println("Cloudy");
                   break;
               }
           case  "Cloudy":
               {
                   System.out.println("Rainy");
                   break;
               }
           case  "Rainy":
               {
                   System.out.println("Sunny");
                   break;
               }
        
       }
    }}
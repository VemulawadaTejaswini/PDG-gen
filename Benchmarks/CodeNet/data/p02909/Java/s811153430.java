import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       Scanner scn = new Scanner(System.in);
       String s = scn.nextLine();
       if(s.equals("Sunny")){
          System.out.println("Cloudy");
       } else if(s.equals("Rainy"){
          System.out.println("Sunny");
       } else {
          System.out.println("Rainy");
       }
    }
}

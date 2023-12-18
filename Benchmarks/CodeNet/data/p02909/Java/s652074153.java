import java.util.Scanner;

public class Main {
  
  	private final static Scanner sc = new Scanner(System.in);
  
  	public static void main (String [] args) {
      String today = sc.next();
      if(today.equals("Sunny")) {
        System.out.println("Cloudy");
      } else if (today.equals("Cloudy")) {
        System.out.println("Rainy");
      } else {
        System.out.println("Sunny");
      }
   }
}
import java.util.Scanner;
 
public class Main {
  public static void main ( String[] args ) {
 
    Scanner sc = new Scanner ( System.in );
 
    String S = sc.next();
    
    if("Sunny".equals(S)){
      System.out.println("Cloudy");
    }else if ("Cloudy".equals(S)){
      System.out.println("Rainy");
    }else{
      System.out.println("Sunny");
    }
  }
}
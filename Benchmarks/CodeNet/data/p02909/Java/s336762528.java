import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();
    
    if ("Sunny".equals(s)) System.out.println("Cloudy");
    if ("Cloudy".equals(s)) System.out.println("Rainy");
    if ("Rainy".equals(s)) System.out.println("Sunny");
  }
}
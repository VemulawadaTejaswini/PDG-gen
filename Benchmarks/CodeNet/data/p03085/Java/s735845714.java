import java.util.Scanner;

public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();

    if ("A".equals(s)) {
      System.out.println("T");
    } else if ("C".equals(s)) {
      ystem.out.println("G");
    } else if ("G".equals(s)) {
      System.out.println("C");
    } else if ("T".equals(s)) {
      System.out.println("A");
    }
    

  }

}

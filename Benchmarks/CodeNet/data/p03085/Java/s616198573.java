import java.util.Scanner;

public class Main {
 
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    scan.close();

    if (input.equals("A")) {
      System.out.println("T");
    } else if (input.equals("T")) {
      System.out.println("A");
    } else if (input.equals("C")) {
      System.out.println("G");
    } else {
      System.out.println("C");
    }
  }
}
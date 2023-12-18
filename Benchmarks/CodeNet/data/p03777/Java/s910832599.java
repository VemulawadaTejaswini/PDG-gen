import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    String a = scanner.next();
    String b = scanner.next();
    scanner.close();

    if (a.equals(b)) {
      System.out.println("H");
    } else {
      System.out.println("D");
    }
  }
}
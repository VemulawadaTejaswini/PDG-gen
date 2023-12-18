import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    final Scanner s = new Scanner(System.in);
    final int a = Integer.parseInt(s.next());
    final int b = Integer.parseInt(s.next());

    if (a > 0) {
      System.out.println("Positive");
    } else if (a == 0 || b >= 0) {
      System.out.println("Zero");
    } else {
      if ((b - a) % 2 == 0) {
        System.out.println("Negative");
      } else {
        System.out.println("Positive");
      }
    }
  }
}
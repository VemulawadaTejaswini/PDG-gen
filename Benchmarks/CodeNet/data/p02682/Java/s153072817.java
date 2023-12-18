import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    long a = scan.nextLong();
    long b = scan.nextLong();
    long c = scan.nextLong();
    long k = scan.nextLong();

    if (k <= a) {
      System.out.println(k);
      return;
    } else {
      if (k - a <= b) {
        System.out.println(a);
        return;
      } else {
        System.out.println(2 * a + b - k);
        return;
      }
    }

  }

}
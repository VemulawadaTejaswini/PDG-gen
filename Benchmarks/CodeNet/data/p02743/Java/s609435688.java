
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long a = scanner.nextLong();
    long b = scanner.nextLong();
    long c = scanner.nextLong();

    if(c - a -b > 2 * Math.sqrt(a * b)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
}

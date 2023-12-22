
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int k = scanner.nextInt();
    final int a = scanner.nextInt();
    final int b = scanner.nextInt();

    if (k * (a / k + 1) <= b || a % k == 0) {
      System.out.println("OK");
    } else {
      System.out.println("NG");
    }

  }
}

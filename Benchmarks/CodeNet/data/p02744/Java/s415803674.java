
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for (int i = 0; i < n; i++) {
      System.out.print('a');
    }
    System.out.println();
    if (n > 2) {
      for (int i = 0; i < n; i++) {
        if (i == 0 || i == n - 1) {
          System.out.print('a');
        } else {
          System.out.println('b');
        }

      }
      System.out.println();

    }
    if (n > 1) {
      for (int i = 0; i < n; i++) {
        System.out.print((char) ('a' + i));
      }
      System.out.println();
    }


  }
}

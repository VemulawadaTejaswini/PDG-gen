import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a, b;

    while (true) {
      a = scanner.nextInt();
      b = scanner.nextInt();
      if (a == 0 && b == 0) break;

      for (int i = 0; i < b; ++i) System.out.print("#");
      System.out.println();

      for (int i = 0; i < a - 2; ++i) {
        System.out.print("#");
        for (int j = 0; j < b - 2; ++j) System.out.printf(".");
        System.out.println("#");
      }
      for (int i = 0; i < b; ++i) System.out.print("#");
      System.out.println("\n");
    }
  }
}

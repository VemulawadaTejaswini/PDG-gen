import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a, b;

    while (true) {
      a = scanner.nextInt();
      b = scanner.nextInt();
      if (a == 0 && b == 0) break;
      for (int i = 0; i < a; ++i) {
        for (int j = 0; j < b; ++j) System.out.printf("#");
        System.out.println();
      }
      System.out.println();
    }
  }
}

import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n, x, c;

    while(true) {
      n = scanner.nextInt();
      x = scanner.nextInt();
      if (n == 0 && x == 0) break;
      c = 0;

      for (int i = 1; i <= n - 2; ++i) {
        for (int j = i + 1; j <= n - 1; ++j) {
          for (int k = j + 1; k <= n; ++k) {
            if (i + j + k == x) ++c;
          }
        }
      }

      System.out.println(c);
    }
  }
}

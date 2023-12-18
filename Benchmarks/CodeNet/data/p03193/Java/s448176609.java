import java.util.*;

public class Main {
  public static void main(final String[] args) throws Exception {
    final Scanner scanner = new Scanner(System.in);
    try {
      final int n = scanner.nextInt();
      final int h = scanner.nextInt();
      final int w = scanner.nextInt();

      int ans = 0;
      for (int i = 0; i < n; i++) {
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        if (h <= a && w <= b) ans++;
      }

      System.out.print(ans);
    } finally {
      scanner.close();
    }
  }
}

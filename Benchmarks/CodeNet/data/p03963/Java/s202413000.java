import java.util.*;

public class Main {
  public static void main(final String[] args) throws Exception {
    final Scanner scanner = new Scanner(System.in);
    try {
      int n = scanner.nextInt();
      int k = scanner.nextInt();
      int ans = k;
      for (int i = 1; i < n; i++) {
        ans *= k - 1;
      }
      System.out.println(ans);
    } finally {
      scanner.close();
    }
  }
}

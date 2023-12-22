import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    long a[] = new long[n];
    long dp[] = new long[81];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(sc.next());
    }
    dp[0] = 1000;
    for (int i = 1; i < n; i++) {
      long min = Integer.MAX_VALUE;
      for (int j = i - 1; j >= 0; j--) {
        min = Math.min(min, a[j]);
        dp[i] = Math.max(dp[j] / min * a[i] + dp[j] % min, dp[i]);
      }
    }
    long ans = 0;
    for (int i = 0; i < n; i++) {
      ans = Math.max(dp[i], ans);
    }
    pw.println(ans);
  }
}

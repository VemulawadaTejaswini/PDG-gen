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
    int[] dp = new int[n + 1];
    for (int i = 0; i <= n; i++) {
      dp[i] = 100001;
    }
    dp[0] = 0;
    for (int i = 0; i < n; i++) {
      dp[i + 1] = Math.min(dp[i] + 1, dp[i + 1]);
      for (int j = 6; i + j <= n; j *= 6) {
        dp[i + j] = Math.min(dp[i] + 1, dp[i + j]);
      }
      for (int j = 9; i + j <= n; j *= 9) {
        dp[i + j] = Math.min(dp[i] + 1, dp[i + j]);
      }
    }
    pw.println(dp[n]);
  }
}

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    final long INF = 1_000_000_000;
    int N = scanner.nextInt();
    int M = scanner.nextInt();
    char[] s = scanner.next().toCharArray();

    long[] dp = new long[N + 1];
    Arrays.fill(dp, INF);
    dp[N] = 0;
    for (int i = N - 1; i >= 0; i--)
      if (s[i] == '0')
        for (int j = i + 1; j <= i + M && j <= N; j++) dp[i] = Math.min(dp[i], dp[j] + 1);
    if (dp[0] == INF) {
      System.out.println(-1);
    } else {
      StringBuilder sb = new StringBuilder();
      int next = 0;
      while (next < N) {
        for (int i = next + 1; i <= next + M && i <= N; i++) {
          if (dp[i] == dp[next] - 1) {
            sb.append(i - next).append(' ');
            next = i;
            break;
          }
        }
      }
      sb.setLength(sb.length() - 1);
      System.out.println(sb.toString());
    }
  }
}

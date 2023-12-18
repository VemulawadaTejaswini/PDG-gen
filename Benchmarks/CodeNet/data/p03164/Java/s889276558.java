import java.util.Arrays;
import java.util.Scanner;

class Main {

  private static long INF = Long.MAX_VALUE / 4;
  private static int MAX_V = 100010;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = Integer.parseInt(scanner.next());
    long W = Long.parseLong(scanner.next());
    long[] w = new long[N];
    int[] v = new int[N];
    for (int i = 0; i < N; i++) {
      w[i] = Long.parseLong(scanner.next());
      v[i] = Integer.parseInt(scanner.next());
    }
    scanner.close();
    long[][] dp = new long[N + 1][MAX_V];
    for (long[] ls : dp) {
      Arrays.fill(ls, INF);
      ls[0] = 0;
    }
    for (int i = 0; i < N; i++) {
      for (int sum_v = 1; sum_v < MAX_V; sum_v++) {
        if (v[i] >= sum_v) {
          dp[i + 1][sum_v] = w[i];
        }
        dp[i + 1][sum_v] = Math.min(dp[i + 1][sum_v], dp[i][sum_v]);
        if (sum_v >= v[i]) {
          dp[i + 1][sum_v] = Math.min(dp[i + 1][sum_v], dp[i][sum_v - v[i]] + w[i]);
        }
      }
    }
    long ans = INF;
    for (int sum_v = 0; sum_v < MAX_V; sum_v++) {
      if (dp[N][sum_v] <= W) {
        ans = sum_v;
      }
    }
    System.out.println(ans);
  }

}

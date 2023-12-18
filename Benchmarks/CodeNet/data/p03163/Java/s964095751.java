import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int W = sc.nextInt();
    int[][] weightAndValues = new int[N][2];
    for (int i = 0; i < N; i++) {
      weightAndValues[i][0] = sc.nextInt();
      weightAndValues[i][1] = sc.nextInt();
    }
    long ans = solve(weightAndValues, N, W);
    System.out.println(ans);
  }

  private static long solve(int[][] weightAndValues, int n, int w) {
    long[] dp = new long[w + 1];
    for (int i = 0; i < n; i++) {
      for (int j = w - weightAndValues[i][0]; j >= 0; --j) {
        dp[j + weightAndValues[i][0]] =
            Math.max(weightAndValues[i][1] + dp[j], dp[j + weightAndValues[i][0]]);
      }
    }
    long max = Integer.MIN_VALUE;
    for (int i = 0; i <= w; i++) {
      max = Math.max(max, dp[i]);
    }
    return max;
  }
}

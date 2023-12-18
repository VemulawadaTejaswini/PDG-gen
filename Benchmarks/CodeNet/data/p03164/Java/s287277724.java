
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
    int V = 0;
    for (int i = 0; i < n; i++) {
      V += weightAndValues[i][1];
    }
    long[] dp = new long[V + 1];
    for (int i = 0; i < V + 1; i++) {
      dp[i] = Integer.MAX_VALUE;
    }
    dp[0] = 0;
    for (int i = 0; i < n; i++) {
      for (int j = V - weightAndValues[i][1]; j >= 0; --j) {
        dp[j + weightAndValues[i][1]] =
            Math.min(weightAndValues[i][0] + dp[j], dp[j + weightAndValues[i][1]]);
      }
    }
    long max = Integer.MIN_VALUE;
    for (int i = V; i >= 0; i--) {
      if (dp[i] <= w) {
        max = i;
        break;
      }
    }
    return max;
  }
}

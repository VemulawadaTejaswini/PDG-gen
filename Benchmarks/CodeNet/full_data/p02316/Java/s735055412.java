import java.util.Scanner;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Math;

public class Main {
  private static int N;
  private static int W;
  private static int[] weight;
  private static int[] value;
  private static int[][] dp;

  private static int calc() {
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= W; j++) {
        if (j < weight[i]) {
          dp[i][j] = dp[i - 1][j];
        } else {
          dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - weight[i]] + value[i]);
        }
      }
    }

    return dp[N][W];
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    N = in.nextInt();
    W = in.nextInt();

    value = new int[N + 1];
    weight = new int[N + 1];

    // init
    value[0] = 0;
    weight[0] = 0;
    for (int i = 1; i <= N; i++) {
      value[i] = in.nextInt();
      weight[i] = in.nextInt();
    }

    dp = new int[N + 1][W + 1];
    for (int i = 0; i <= N; i++) {
      dp[i][0] = 0;
    }
    for (int j = 0; j <= W; j++) {
      dp[0][j] = 0;
    }

    int result = calc();
    System.out.println(result);
  }
}
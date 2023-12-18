package DP.D;

import java.util.Scanner;

/** dp[n][w]: 重さw以下, 荷物nまでのときの品物の価値の総和の最大値 */
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.next());
    int w = Integer.parseInt(scanner.next());
    int[][] wv = new int[n][2];
    int wi, vi;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < 2; j++) {
        wv[i][j] = Integer.parseInt(scanner.next());
      }
    }
    double[][] dp = new double[n + 1][w + 1];
    for (int i = 0; i < n + 1; i++) {
      dp[0][i] = 0;
      dp[i][0] = 0;
    }
    for (int i = 1; i < n + 1; i++) {
      wi = wv[i-1][0];
      vi = wv[i-1][1];
      for (int j = 1; j < w + 1; j++) {
        if (j - wi >= 0) {
          dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - wi] + vi);
        } else {
          dp[i][j] = dp[i - 1][j];
        }
      }
    }
    System.out.println(dp[n][w]);
  }
}

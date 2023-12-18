import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[][] a = new int[N][3]; // a, b, c
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < 3; j++) {
        a[i][j] = sc.nextInt();
      }
    }
    int[][] dp = new int[N][3];
    for (int i = 0; i < 3; i++) {
      dp[0][i] = a[0][i];
    }
    for (int i = 1; i < N; i++) {
      for (int j = 0; j < 3; j++) {
        if (j == 0) { // B->A or C->A
          dp[i][j] = Math.max(dp[i - 1][1], dp[i - 1][2]);
        } else if (j == 1) { // A->B or C->B
          dp[i][j] = Math.max(dp[i - 1][0], dp[i - 1][2]);
        } else { // A->C or B->C
          dp[i][j] = Math.max(dp[i - 1][0], dp[i - 1][1]);
        }
        dp[i][j] += a[i][j];
      }
    }
    int ans = dp[N - 1][0];
    for (int i = 1; i < 3; i++) {
      if (ans < dp[N - 1][i]) {
        ans = dp[N - 1][i];
      }
    }
    System.out.println(ans);
  }
}
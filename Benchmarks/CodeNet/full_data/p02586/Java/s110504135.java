import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int R = sc.nextInt();
    int C = sc.nextInt();
    int k = sc.nextInt();
    long[][] p = new long[R][C];
    for(int i = 0; i < k; i++) {
      int r = sc.nextInt() - 1;
      int c = sc.nextInt() - 1;
      long v = sc.nextLong();
      p[r][c] = v;
    }
    long[][][] dp = new long[R][C][4];
    if(p[0][0] > 0) {
      dp[0][0][1] = p[0][0];  
    }
    for(int i = 0; i < R; i++) {
      for(int j = 0; j < C; j++) {
        //下へ行く
        if(i != (R - 1)) {
          for(int m = 0; m < 4; m++) {
            dp[i + 1][j][0] = Math.max(dp[i + 1][j][0], dp[i][j][m]);
            if(p[i + 1][j] > 0) dp[i + 1][j][0] = Math.max(dp[i + 1][j][0], dp[i][j][m] + p[i + 1][j]);
          }
        }
 
        //右へ行く
        if(j != (C - 1)) {
          for(int m = 0; m < 4; m++) {
            dp[i][j + 1][m] = Math.max(dp[i][j + 1][m], dp[i][j][m]);
            if((p[i][j + 1] > 0) && (m > 0)) dp[i][j + 1][m] = Math.max(dp[i][j + 1][m], dp[i][j][m - 1] + p[i][j + 1]);
          }
        }
      }
    }
    long ans = dp[R - 1][C - 1][0];
    ans = Math.max(ans, dp[R - 1][C - 1][1]);
    ans = Math.max(ans, dp[R - 1][C - 1][2]);
    ans = Math.max(ans, dp[R - 1][C - 1][3]);
    System.out.println(ans);
  }
}
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int k = sc.nextInt();
    long MOD = (long)Math.pow(10, 9) + 7;
    long[][] dp = new long[h + 1][w];
    dp[0][0] = 1;
    if(w != 1) {
    for(int i = 0; i < h; i++) {
      for(int j = 0; j < w; j++) {
        for(int t = 0; t < (int)Math.pow(2, w - 1); t++) {
          int[] m = new int[w - 1];
          int p = 0;
          for(int c = 0; c < w - 1; c++) {
            if((t & (1 << c)) != 0) m[c] = 1;
            if((c > 0) && ((m[c - 1] == 1) && (m[c] == 1))) p = 1; 
          }
          if(p == 0) { 
            if(j == 0) {
              if(m[0] == 1) {
                dp[i + 1][j + 1] = (dp[i + 1][j + 1] + dp[i][j]) % MOD;
              } else {
                dp[i + 1][j] = (dp[i + 1][j] + dp[i][j]) % MOD;
              }
            } else if(j == (w - 1)) {
              if(m[w - 2] == 1) {
                dp[i + 1][j - 1] = (dp[i + 1][j - 1] + dp[i][j]) % MOD;
              } else {
                dp[i + 1][j] = (dp[i + 1][j] + dp[i][j]) % MOD;
              }              
            } else {
              if(m[j - 1] == 1) {
                dp[i + 1][j - 1] = (dp[i + 1][j - 1] + dp[i][j]) % MOD;
              } else if(m[j] == 1) {
                dp[i + 1][j + 1] = (dp[i + 1][j + 1] + dp[i][j]) % MOD;
              } else {
                dp[i + 1][j] = (dp[i + 1][j] + dp[i][j]) % MOD;
              }              
            }
          }
        }
      }
    }
    System.out.println(dp[h][k - 1]);
    } else {
      System.out.println(1);
    }
  }
}
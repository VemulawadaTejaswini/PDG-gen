import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    long[][] c = new long[10][10];
    for(int i = 0; i < 10; i++) {
      for(int j = 0; j < 10; j++) {
        c[i][j] = sc.nextLong();
      }
    }
    long[][] dp = new long[10][10];
    for(int i = 0; i < 10; i++) {
      for(int j = 0; j < 10; j++) {
        dp[i][j] = c[i][j];
      }
    }
    for(int k = 0; k < 10; k++) {
      for(int i = 0; i < 10; i++) {
        for(int j = 0; j < 10; j++) {
          dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j]); 
        }
      }
    }
    long ans = 0;
    for(int i = 0; i < h; i++) {
      for(int j = 0; j < w; j++) {
        int d = sc.nextInt();
        if(d > -1) ans += dp[d][1];
      }
    }
    System.out.println(ans);
  }
}
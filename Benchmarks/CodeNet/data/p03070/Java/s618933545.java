
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long MOD = 998244353;
    int[] a = new int[n];
    long sum = 0;
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      sum += a[i];
    }
    long[][] dp = new long[n][100000];
    dp[0][0] = 2;
    dp[0][a[0]] = 1;
    for(int i = 1; i < n; i++) {
      for(int j = 0; j < 100000; j++) {
        if(j >= a[i]) {
          dp[i][j] = (2 * dp[i - 1][j] + dp[i - 1][j - a[i]]) % MOD;
        } else {
          dp[i][j] = (2 * dp[i - 1][j]) % MOD;
        }
      }
    }

    long ans = 1;
    for(int i = 0; i < n; i++) {
      ans = (ans * 3) % MOD;
    }
    long[][] dp2 = new long[n][50000];
    dp2[0][0] = 1;
    dp2[0][a[0]] = 1;
    for(int i = 1; i < n; i++) {
      for(int j = 0; j < 50000; j++) {
        if(j >= a[i]) {
          dp2[i][j] = (dp2[i - 1][j] + dp2[i - 1][j - a[i]]) % MOD;
        } else {
          dp2[i][j] = (dp2[i - 1][j]) % MOD;
        }        
      }
    }

    long t = 0;
    int q = (int)(sum / 2);
    if((sum % 2) == 1) q++;
    for(int j = q; j < 100000; j++) {
      t = (t + dp[n - 1][j]) % MOD;
    }
    t = (3 * t) % MOD;
    ans = (ans + MOD - t) % MOD;
    if((sum % 2) == 0) ans = (ans + 3 * dp2[n - 1][(int)(sum / 2)]) % MOD; 
    System.out.println(ans);
  }
}
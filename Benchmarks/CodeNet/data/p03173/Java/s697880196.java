import java.util.*;
import java.io.*;
 
class Main {
 
  
 
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    
    int n = in.nextInt();
    long[] a = new long[n];
    for (int i = 0; i < n; i++) {
      a[i] = in.nextInt();
    }

    for (int i = 1; i < n; i++) {
      a[i] += a[i - 1];
    }

    long[][] dp = new long[n][n];
    for (int i = 0; i < n; i++) {
      Arrays.fill(dp[i], Long.MAX_VALUE);
      dp[i][i] = 0;
    }

    
    for (int len = 2; len <= n; len++) {
      for (int i = 0; i < n; i++) {
        int j = len + i - 1;
        if (j >= n) {break;}
        for (int k = i; k < j; k++) {
          dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k + 1][j] + a[j] - (i == 0 ? 0 : a[i - 1]));
        }
      }
    }

    System.out.println(dp[0][n - 1]);
  }
 
}
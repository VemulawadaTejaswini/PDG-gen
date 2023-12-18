
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    long[] a = new long[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
    }
    Arrays.sort(a);
    int ans = 0;
    int left = 0;
    int right = n;
    while(left < right) {
      int med = (left + right) / 2;
      boolean[][] dp = new boolean[n][k]; 
      if(med != 0) {
        dp[0][0] = true;
        if(a[0] < k) dp[0][(int)a[0]] = true;
      } else {
        dp[0][0] = true;
        if(n > 1) {
          dp[1][0] = true;
          if(a[1] < k) dp[1][(int)a[1]] = true;
        }
      }
      for(int i = 1; i < n; i++) {
        dp[i][0] = true;
        for(int j = 1; j < k; j++) {
          dp[i][j] = dp[i - 1][j];
          if((i != med) && (j >= a[i])) dp[i][j] = (dp[i][j] || dp[i - 1][(int)(j - a[i])]);
        }
      }
      int p = 0;
      for(int j = (int)Math.max(0, k - a[med]); j < k; j++) {
        if(dp[n - 1][j]) p++;
      }
      if(p == 0) {
        left = med + 1;
      } else {
        ans = med;
        right = med;
      }
    }
    System.out.println(n - ans);
  }
}
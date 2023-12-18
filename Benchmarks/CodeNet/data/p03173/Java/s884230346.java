import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {

      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      int[] arr = new int[n];
      long[] sums = new long[n];
      long sum = 0;
      
      for(int i = 0; i < n ;i++) {
        arr[i] = scanner.nextInt();
        sum += arr[i];
        sums[i] = sum;
      }
      
      
      long[][] dp = new long[n][n];
      for(int l = n - 1; l >= 0; l--) {
        for(int r = l; r < n; r++) {
          if(l == r) {
            dp[l][r] = 0;
          }
          else {
            dp[l][r] = Long.MAX_VALUE;

            for(int i = l; i < r ;i++) {
              dp[l][r] = Math.min(dp[l][r], dp[l][i] + dp[i+1][r] 
                                  + Math.abs((l - 1 >=0 ? sums[l - 1] : 0) - sums[r]));
            }
          }
        }
      }       
      
        System.out.println(dp[0][n- 1]);
    }
}
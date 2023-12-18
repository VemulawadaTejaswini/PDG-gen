import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {

      
 public static void main(String[] args) {
    
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int N = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
    int W = in.nextInt();
    int[] ws = new int[N+1];
    int[] vs = new int[N+1];
    long ans = 0;
    int sum = 0;
    
    for (int i = 0 ; i < N; ++i) {
        ws[i] = in.nextInt();
        vs[i] = in.nextInt();
        sum += vs[i];
    }
    
    long[][] dp = new long[N+1][sum+1];
    for(int i = 1; i <= sum; i++) {
        dp[0][i] = Integer.MAX_VALUE;
    }
    
    for(int i = 1 ; i <= N; i++) {
        for(int j = 0; j <= sum; j++) {
            if(j >= vs[i-1]) {
                dp[i][j] = Math.min(dp[i-1][j], ws[i-1]+ dp[i-1][j-vs[i-1]]);
            }
            else {
                dp[i][j] = dp[i-1][j];
            }
            
            if(W >= dp[i][j]) {
                ans = Math.max(ans, j);
            }
        }
    }
    
    System.out.println(ans);
  }
  
}
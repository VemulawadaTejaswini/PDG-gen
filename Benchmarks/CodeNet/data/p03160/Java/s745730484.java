import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{
  
    public static void main(String[] args) {

        Scanner s = new Scanner(new BufferedInputStream(System.in));
        int N = s.nextInt();
        int W = s.nextInt();
        int[] wg = new int[N];
        long[] v = new long[N];
        long[][] dp = new long[N][W+1];

        for (int i = 0;i < N;i++) {
            wg[i] = s.nextInt();
            v[i] = s.nextLong();
        }

        for (int i = 0;i < N;i++) {
            for (int j = 1;j <= W;j++) {
                if (i > 0 && j - wg[i] > 0)
                dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-wg[i]]+v[i]);
                else if (i == 0) {
                    if (j - wg[i] >= 0) {
                        dp[i][j] = v[i];
                    }
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        System.out.println(dp[N-1][W]);
    }
 	 
  
  
  
}
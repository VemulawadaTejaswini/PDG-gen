import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{

public static void main(String[] args) {

        Scanner s = new Scanner(new BufferedInputStream(System.in));
        int N = s.nextInt();
        long W = s.nextLong();
        long[] w= new long[N];
        int[] v = new int[N];

        for (int i = 0;i < N;i++ ) {
            w[i] = s.nextLong();
            v[i] = s.nextInt();
        }
        long[][] dp = new long[N+1][100001];
        for (int i = 0;i < N+1;i++) {
            for (int j = 0;j < 100001;j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        dp[0][0] = 0;
        for (int i = 0;i < N;i++) {
                for (int sumv = 0;sumv < 100001;sumv++)
                {
                    if (sumv >= v[i]) {
                        dp[i+1][sumv] = Math.min(dp[i+1][sumv],dp[i][sumv-v[i]]+w[i]);
                    }
                    dp[i+1][sumv] = Math.min(dp[i+1][sumv],dp[i][sumv]);
                }
        }

        long ans = 0;
        for (int i = 0;i < 100001;i++) {
            if (dp[N][i] <= W) {
                ans = i;
            }
        }
        System.out.println(ans);
    }
  
}

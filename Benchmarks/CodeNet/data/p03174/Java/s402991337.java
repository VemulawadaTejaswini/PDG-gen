import java.io.*;
import java.util.*;
public class Main {
    static long MOD = 1000*1000*1000 + 7;
    public static void main(String args[]) {
        int n = 0;
        
        int[][] met = null;
        try (Scanner scanner = new Scanner(System.in)) {
            n = scanner.nextInt();
            met = new int[n][n];
            for(int i = 0; i < n ;i++) {
                for(int j = 0; j < n ;j++) {
                    met[i][j] = scanner.nextInt();
                }
            }
        }
        
        // we can go away from dp[men][1<<n] to dp[1<<n] because we are using men to get to met[men][w]
        // we are remove that loop and count number of bit set in wmask to give number of men already mapped.
        // we can do so because if a bit is 1 in wmask it mush be matching to anyone man. 
        long[] dp = new long[1<<n];
        dp[0] = 1;
        // for(int m = 0; m < n; m++) {
            for(int wmask = 0; wmask < (1<<n) ; wmask++) {
                int m = Integer.bitCount(wmask);
                for(int w = 0; w < n; w++) {
                    if((wmask & (1<<w)) ==0 && met[m][w] == 1){
                        int newWMask = wmask | (1<<w);
                        dp[newWMask] += dp[wmask]; 
                        // System.out.println(dp[m][newWMask] + " " + newWMask + " " + wmask);
                        if(dp[newWMask] >= MOD)
                            dp[newWMask] -= MOD;
                    }
                }
            }
        // }
        // System.out.println(Arrays.toString(dp));
        System.out.println(dp[(1<<n) - 1]);
        
    }
    
}
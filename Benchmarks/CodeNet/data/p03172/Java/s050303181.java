import java.io.*;
import java.util.*; 
import java.lang.*;

public class Main 
{   
    static int[] A;
    static long[][] dp;
    static int N1;
    static long mod = 1000000007;
    
    static long fn(int curr, int tot) {
        if (dp[curr][tot] != -1) { return dp[curr][tot]; }
        if (curr == N1-1) {
            if (tot > A[curr]) {
                return 0;
            }
            return 1;
        }
        long ans = 0;
        for (int x = 0; x <= A[curr]; x ++) {
            if (tot >= x) {
                ans += (fn(curr+1, tot-x)%mod);
            }
        }
        dp[curr][tot] = ans;
        return dp[curr][tot];
    }
    
    public static void main(String[] args) throws IOException 
    {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        N1 = N;
        A = new int[N];
        for (int n =0; n < N; n ++) {
            A[n] = scan.nextInt();
        }
        dp = new long[N][K+1];
        for (int i =0; i < N; i ++) {
            for (int j = 0; j <= K; j ++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(fn(0, K));
    }
}    
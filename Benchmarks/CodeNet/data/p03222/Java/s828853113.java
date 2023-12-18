import java.util.*;

public class Main {
    static int fib(int n) {
        int a = 1;
        int b = 1;
        for (int i=1;i<n;i++) {
            int tmp = b;
            b = a+b;
            a = tmp;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        int mod = 1_000_000_007;
        long[][] dp = new long[H+1][W+2];
        dp[0][1]=1;
        for (int i=1;i<H+1;i++) {
            for (int j=1;j<W+1;j++) {
                dp[i][j] = (dp[i][j]+dp[i-1][j-1]*fib(j-2)*fib(W-j))%mod;
                dp[i][j] = (dp[i][j]+dp[i-1][j]*fib(j-1)*fib(W-j))%mod;
                dp[i][j] = (dp[i][j]+dp[i-1][j+1]*fib(j-1)*fib(W-j-1))%mod;
            }
        }
        System.out.println(dp[H][K]);
    }
}
import java.util.*;

public class Main {
    static final long MODVAL = 998244353L;
    static long dp[][];
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        dp = new long[N+1][2];
        // s番目までのブロックを塗って重複塗りがk回の塗り方はdp[s][k]通りだとする。
        // dp[s+1][k] = dp[s][k] * (M-1) + dp[s][k-1]
        // 1st param: 1 -> N
        // 2nd param: 0 -> K
        dp[1][0] = M;
        long result = 0L;
        for(int k=0; k<=K; k++) {
            int current = k % 2;
            int previous = (k+1) % 2;
            switch(k) {
                case 0:
                    dp[1][current] = M;
                    break;
                case 1:
                    dp[1][current] = 0;
                    dp[1][previous] = M;
                    break;
                default:
                    dp[1][current] = 0;
                    dp[1][previous] = 0;
                    break;
            }
            for(int s=1; s<=N-1; s++) {
                if(k==0) {
                    dp[s+1][current] = (dp[s][current] * (M-1)) % MODVAL;
//                    System.out.println(String.format("dp[%d][%d]=%d", s+1, k, dp[s][current]));
                } else {
                    dp[s+1][current] = (dp[s][current] * (M-1) + dp[s][previous]) % MODVAL;
//                    System.out.println(String.format("dp[%d][%d]=%d", s+1, k, dp[s][current]));
                }
            }
            result = (result + dp[N][current]) % MODVAL;
        }
        System.out.println(result);
    }
}

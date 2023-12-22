import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int MOD = 998_244_353;
        
        final int N = sc.nextInt();
        final int K = sc.nextInt();
        
        final int[] L = new int[K];
        final int[] R = new int[K];
        
        for (int j = 0; j < K; j++) {
            L[j] = sc.nextInt();
            R[j] = sc.nextInt();
        }
        
        // マスidxに到達する方法の数を保持する。
        // 但しidxは0開始。
        final long[] dp = new long[N];
        dp[0] = 1;
        
        // dpの累積和を保持する。
        // つまり、sdp[n] = dp[0] + dp[1] + .. + dp[n]
        final long[] sdp = new long[N];
        sdp[0] = 1;
        
        // dp[1] .. dp[N - 1] を順に求める。
        for (int i = 1; i < N; i++) {
            
            for (int j = 0; j < K; j++) {
                if (R[j] < i) {
                    // dp[i] = dp[i - R] + dp[i - R + 1] + .. + dp[i - L - 1] + dp[i - L]
                    // である。
                    // ここで右辺について、
                    // dp[i - R] + dp[i - R + 1] + .. + dp[i - L - 1] + dp[i - L]
                    //   = dp[0] + dp[1] + .. + dp[i - R - 1] + dp[i - R] + dp[i - R + 1] + .. + dp[i - L - 1] + dp[i - L]
                    //   - dp[0] + dp[1] + .. + dp[i - R - 1]
                    //   = sdp[i - L] - sdp[i - R - 1]
                    // となる。
                    // まとめると、
                    //   dp[i] = sdp[i - L] - sdp[i - R - 1]
                    // これは区間jについてのみだから、実際にはそれぞれの区間jについて合計する。
                    dp[i] += sdp[i - L[j]] - sdp[i - R[j] - 1];
                    
                } else if (L[j] <= i) {
                    // dp[i] = dp[0] + dp[1] + .. dp[i - L - 1] + dp[i - L]
                    //       = sdp[i - L]
                    dp[i] += sdp[i - L[j]];
                    
                } else {
                    continue;
                }
                if (dp[i] < 0) {
                    dp[i] += MOD;
                } else {
                    dp[i] %= MOD;
                }
            }
            sdp[i] = sdp[i - 1] + dp[i];
            sdp[i] %= MOD;
        }
        
        System.out.println(dp[N - 1]);
    }
}

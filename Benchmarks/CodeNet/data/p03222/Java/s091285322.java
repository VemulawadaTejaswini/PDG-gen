
import java.util.Scanner;

public class Main {

    static final long MOD = 1000000007;
    
    static int H, W, K;
    static long[][] dp = new long[110][10];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        K = sc.nextInt() - 1;
        dp[0][0] = 1;
        for(int h=1; h<=H; ++h) {
            for(int w=0; w<W; ++w) {
                int[] kuji = new int[W-1];
                //mannaka
                if(w < W-1) kuji[w] = -1;
                if(w-1 >= 0) kuji[w-1] = -1;
                dp[h][w] += (kumi(kuji, 0) * dp[h-1][w]) % MOD;
                dp[h][w] %= MOD;
                //left
                if(w > 0) {
                    kuji = new int[W-1];
                    kuji[w-1] = 2;
                    dp[h][w] += (kumi(kuji, 0) * dp[h-1][w-1]) % MOD;
                    dp[h][w] %= MOD;
                }
                if(w < W-1) {
                    kuji = new int[W-1];
                    kuji[w] = 2;
                    dp[h][w] += (kumi(kuji, 0) * dp[h-1][w+1]) % MOD;
                    dp[h][w] %= MOD;
                }
            }
        }
        System.out.println(dp[H][K]);
    }
    
    static long kumi(int[] kuji, int n) {
        if(n == W-1) {
            for(int i=0; i<kuji.length-1; ++i) {
                if(kuji[i] > 0 && kuji[i+1] > 0) {
                    return 0;
                }
            }
            return 1;
        }
        long pos = 0;
        if(kuji[n] > 1) pos = kumi(kuji, n+1);
        else if(kuji[n] == 0) {
            kuji[n] = 1;
            pos = kumi(kuji, n+1);
            kuji[n] = 0;
        }
        long neg = 0;
        if(kuji[n] < 2) neg = kumi(kuji, n+1);
        return (neg + pos) % MOD;
    }
}

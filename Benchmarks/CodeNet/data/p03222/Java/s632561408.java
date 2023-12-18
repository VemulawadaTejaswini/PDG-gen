

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
                for(int b=0; b<(1<<(W-1)); ++b) {
                    int x = 3;
                    boolean flg = false;
                    while(x < 1<<20) {
                        if((x&b) == x) flg = true;
                        x <<= 1;
                    }
                    if(flg) continue;
                    if(w>0 && (b&(1<<(w-1)))>0) {
                        dp[h][w] += dp[h-1][w-1];
                    }
                    else if(w < W-1 && (b&(1<<w))>0) {
                        dp[h][w] += dp[h-1][w+1];
                    }
                    else {
                        dp[h][w] += dp[h-1][w];
                    }
                    dp[h][w] %= MOD;
                }
            }
        }
        System.out.println(dp[H][K]);
    }
}
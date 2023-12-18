import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt(), W = sc.nextInt(), K = sc.nextInt();
        sc.close();
        final int mod = 1000000007;
        int dp[][] = new int[H + 1][W];
        dp[0][0] = 1;
        for (int i = 0; i < H; ++i) {
            for (int j = 0; j < W; ++j) {
                for (int k = 0; k < 1 << (W - 1); ++k) {
                    boolean ok = true;
                    for (int l = 0; l < W - 2; ++l) {
                        if (((k >> l) & 1) == 1 && ((k >> (l + 1)) & 1) == 1) {
                            ok = false;
                        }
                    }
                    if (ok) {
                        if (j >= 1 && ((k >> (j - 1)) & 1) == 1) {
                            dp[i + 1][j - 1] += dp[i][j];
                            dp[i + 1][j - 1] %= mod;
                        } else if (j <= W - 2 && ((k >> j) & 1) == 1) {
                            dp[i + 1][j + 1] += dp[i][j];
                            dp[i + 1][j + 1] %= mod;
                        } else {
                            dp[i + 1][j] += dp[i][j];
                            dp[i + 1][j] %= mod;
                        }
                    }
                }
            }
        }

        System.out.println(dp[H][K - 1]);
    }
}
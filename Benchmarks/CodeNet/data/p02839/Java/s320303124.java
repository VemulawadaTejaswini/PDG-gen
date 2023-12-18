import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int H = scan.nextInt();
        int W = scan.nextInt();
        int[][] A = new int[H][W];
        int[][] B = new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                A[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                B[i][j] = scan.nextInt();
            }
        }
        int max = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                max = Math.max(max, Math.abs(A[i][j]-B[i][j]));
            }
        }
        int limit = max*80+1;
        boolean[][][] dp = new boolean[H][W][limit];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < H; j++) {
                Arrays.fill(dp[i][j], false);
            }
        }
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                int abs = Math.abs(A[i][j]-B[i][j]);
                if (i == 0) {
                    if (j == 0) {
                        dp[i][j][abs] = true;
                    } else {
                        for (int k = 0; k < limit; k++) {
                            if (k+abs<limit) {
                                dp[i][j][k + abs] = dp[i][j][k + abs] | dp[i][j - 1][k];
                            }
                            if (Math.abs(k-abs)<limit) {
                                dp[i][j][Math.abs(k - abs)] = dp[i][j][Math.abs(k - abs)] | dp[i][j - 1][k];
                            }
                        }
                    }
                    continue;
                }
                if (j == 0) {
                    for (int k = 0; k < limit; k++) {
                        if (k+abs<limit) {
                            dp[i][j][k + abs] = dp[i][j][k + abs] | dp[i-1][j][k];
                        }
                        if (Math.abs(k-abs)<limit) {
                            dp[i][j][Math.abs(k - abs)] = dp[i][j][Math.abs(k - abs)] | dp[i - 1][j][k];
                        }
                    }
                } else {
                    for (int k = 0; k < limit; k++) {
                        if (k+abs<limit) {
                            dp[i][j][k + abs] = dp[i][j][k + abs] | dp[i-1][j][k];
                            dp[i][j][k + abs] = dp[i][j][k + abs] | dp[i][j-1][k];
                        }
                        if (Math.abs(k-abs)<limit) {
                            dp[i][j][Math.abs(k - abs)] = dp[i][j][Math.abs(k - abs)] | dp[i - 1][j][k];
                            dp[i][j][Math.abs(k - abs)] = dp[i][j][Math.abs(k - abs)] | dp[i][j - 1][k];
                        }
                    }
                }
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int k = 0; k < limit; k++) {
            if (dp[H-1][W-1][k]) {
                ans = Math.min(ans, k);
                break;
            }
        }
        System.out.println(ans);
    }
}

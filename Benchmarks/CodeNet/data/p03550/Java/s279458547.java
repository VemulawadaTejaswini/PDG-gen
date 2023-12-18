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
        int N = scan.nextInt();
        int Z = scan.nextInt();
        int W = scan.nextInt();
        int[] a = new int[N+1];
        for (int i = 1; i <= N; i++) {
            a[i] = scan.nextInt();
        }
        if (N == 1) {
            System.out.println(Math.abs(a[N]-W));
            return;
        }
        // dp[i][0] i-1番目までのカードが消費されている場合で先手の場合の最高スコア
        // dp[i][1] i-1番目までのカードが消費されている場合で後手の場合の最高スコア
        long[][] dp = new long[N+1][2];
        for(int i = N; 1 <= i; i--) {
            // 後手はa[i-1]
            long base = i == 1 ? W : a[i-1];
            dp[i][0] = Long.MIN_VALUE;
            dp[i][0] = Math.max(dp[i][0],Math.abs(a[N]-base));
            for(int j = N-1; i + 1 <= j; j--) {
                dp[i][0] = Math.max(dp[i][0], dp[j][1]);
            }
            // 先手はa[i-1]
            base = i == 1 ? Z : a[i-1];
            dp[i][1] = Long.MAX_VALUE;
            dp[i][1] = Math.min(dp[i][1],Math.abs(a[N]-base));
            for(int j = N-1; i + 1 <= j; j--) {
                dp[i][1] = Math.min(dp[i][1], dp[j][0]);
            }
        }
        long answer = dp[1][0];
        System.out.println(answer);
    }
}

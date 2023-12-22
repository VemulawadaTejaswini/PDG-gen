import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CoinChangingProblem solver = new CoinChangingProblem();
        solver.solve(1, in, out);
        out.close();
    }

    static class CoinChangingProblem {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            final int INF = (int) 1e9;
            int n = in.nextInt();
            int variety = in.nextInt();
            int[] coins = new int[variety];
            for (int i = 0; i < variety; i++) {
                coins[i] = in.nextInt();
            }
            // 1を含むので払えない金額というのが存在しなくなる
            Arrays.sort(coins);
            int[] dp = new int[n + 1];
            Arrays.fill(dp, INF);
            dp[0] = 0;
            // n 円払うときの最小の枚数
            for (int idx = 0; idx < variety; idx++) {
                for (int i = coins[idx]; i <= n; i++) {
                    dp[i] = Math.min(dp[i], dp[i - coins[idx]] + 1);
                }
            }
            out.println(dp[n]);
        }

    }
}



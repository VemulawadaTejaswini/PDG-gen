import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int[][] happy = new int[n][3];
            for (int i = 0; i < n; i++) {
                happy[i][0] = Integer.parseInt(in.next());
                happy[i][1] = Integer.parseInt(in.next());
                happy[i][2] = Integer.parseInt(in.next());
            }

            int[][] dp = new int[n + 1][3];

            // dp遷移式
            // i-1日目までで得られる幸福度の最大値
            // dp[i]=dp[i-1]+max(a[i],b[i],c[i])

            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < 3; ++j) {
                    for (int k = 0; k < 3; ++k) {
                        if (j == k) continue;
                        dp[i + 1][k] = Math.max(dp[i + 1][k], dp[i][j] + happy[i][k]);
                    }
                }
            }

            long ans = 0;
            for (int i = 0; i < 3; i++) {
                ans = Math.max(ans, dp[n][i]);
            }
            out.println(ans);

        }

    }
}


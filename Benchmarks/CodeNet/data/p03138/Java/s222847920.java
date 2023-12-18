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
        XXOR solver = new XXOR();
        solver.solve(1, in, out);
        out.close();
    }

    static class XXOR {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long k = in.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
            }
            final int MAX_LENGTH = 50;

            int dnum = -1;
            for (int i = 0; i < MAX_LENGTH; i++) {
                if ((k >> i) > 0) {
                    dnum++;
                }
            }
            if (k == 0) {
                long result = 0;
                for (long l : a) {
                    result += l;
                }
                out.println(result);
                return;
            }

            // 桁数 | 未満フラグ
            long[][] dp = new long[100][2];

            for (int i = 0; i < MAX_LENGTH; i++) {
                int shift = MAX_LENGTH - i - 1;
                long mask = 1 << shift;

                if (dnum - shift < 0) {
                    continue;
                }
                int zero = 0;
                int one = 0;
                for (long l : a) {
                    if ((l >> shift & 1) == 1) {
                        one++;
                    } else {
                        zero++;
                    }
                }
                long cost1 = one * mask;
                long cost0 = zero * mask;

                for (int j = 0; j < 2; j++) {
                    if (j == 1) {
                        // 未満フラグ立っている
                        dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j] + Math.max(cost1, cost0));
                    } else {
                        // 未満フラグ立ってない j==0
                        // ぴったり->ぴったり
                        if ((k >> shift & 1) == 1) {
                            dp[i + 1][0] = Math.max(dp[i + 1][j], dp[i][0] + cost1);
                        } else {
                            dp[i + 1][0] = Math.max(dp[i + 1][j], dp[i][0] + cost0);
                        }

                        // ぴったり->未満
                        if ((k >> shift & 1) == 1) {
                            // kのbitが立っていたときに未満にできる
                            dp[i + 1][1] = Math.max(dp[i + 1][j], dp[i][0] + cost0);
                        }
                    }
                }
            }
            out.println(Math.max(dp[MAX_LENGTH][0], dp[MAX_LENGTH][1]));
        }

    }
}


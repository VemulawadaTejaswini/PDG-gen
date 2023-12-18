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

            boolean[] kk = new boolean[50];
            int dnum = 0;
            for (int i = 0; i < kk.length; i++) {
                if ((k >> i & 1) == 1) {
                    kk[i] = true;
                }
                if ((k >> i) <= 0) {
                    break;
                }
                dnum++;
            }
            if (dnum == 0) {
                long result = 0;
                for (long l : a) {
                    result += l;
                }
                out.println(result);
                return;
            }

            // 桁数 | 未満フラグ
            long[][] dp = new long[50][2];
            for (int i = dp.length - 1; 1 <= i; i--) {
                if (i > dnum) {
                    continue;
                }
                int shift = i - 1;
                int zero = 0;
                int one = 0;
                for (long l : a) {
                    if ((l >> shift & 1) == 1) {
                        one++;
                    } else {
                        zero++;
                    }
                }
                long cost1 = one << shift;
                long cost2 = zero << shift;
                for (int j = 0; j < 2; j++) {
                    if (j == 1) {
                        // 未満フラグ立っている
                        if (cost2 < cost1) {
                            // one を優先
                            dp[i - 1][j] = Math.max(dp[i - 1][j], dp[i][j] + cost1);
                        } else {
                            // zeroを優先
                            dp[i - 1][j] = Math.max(dp[i - 1][j], dp[i][j] + cost2);
                        }

                    } else {
                        // 未満フラグ立ってない
                        if (cost2 < cost1) {
                            // one を優先
                            if (kk[i]) {
                                dp[i - 1][1] = Math.max(dp[i - 1][j], dp[i][j] + cost1);
                            } else {
                                // zeroを優先
                                dp[i - 1][0] = Math.max(dp[i - 1][j], dp[i][j] + cost2);
                            }
                        } else {
                            // zeroを優先
                            dp[i - 1][j] = Math.max(dp[i - 1][j], dp[i][j] + cost2);
                        }
                    }

                }
            }
            out.println(Math.max(dp[0][0], dp[0][1]));
        }

    }
}


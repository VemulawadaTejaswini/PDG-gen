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
        Switches solver = new Switches();
        solver.solve(1, in, out);
        out.close();
    }

    static class Switches {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[][] s = new int[m + 1][n + 1];
            int[] p = new int[m + 1];

            // 電球m
            for (int i = 1; i <= m; i++) {
                int k = in.nextInt();
                // スイッチn
                for (int j = 1; j <= k; j++) {
                    int sw = in.nextInt();
                    s[i][sw] = 1;
                }
            }

            for (int i = 1; i <= m; i++) {
                // 電球mの条件
                p[i] = in.nextInt();
            }

            long result = 0;
            for (int bit = 0; bit < (1 << n); bit++) {
                int[] judge = new int[m + 1];
                for (int j = 1; j <= m; j++) {
                    for (int k = 0; k < n; k++) {
                        if ((1 & (bit >> k)) == 1) {
                            if (s[j][k + 1] == 1) {
                                judge[j]++;
                            }
                        }
                    }
                }
                boolean is_on = true;
                for (int i = 1; i <= m; i++) {
                    if (judge[i] % 2 != p[i]) {
                        is_on = false;
                        break;
                    }
                }
                if (is_on) {
                    result++;
                }
            }

            out.print(result);
        }

    }
}


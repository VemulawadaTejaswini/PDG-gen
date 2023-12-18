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
        static final long inf = (long) 1e17;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int m = Integer.parseInt(in.next());
            int x = Integer.parseInt(in.next());
            int[] c = new int[n];
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                c[i] = Integer.parseInt(in.next());
                for (int j = 0; j < m; j++) {
                    a[i][j] = Integer.parseInt(in.next());
                }
            }
            long ans = inf;

            for (int bit = 0; bit < (1 << n); ++bit) {
                long cost = 0;
                long[] skill = new long[m];
                for (int i = 0; i < n; ++i) {
                    if ((bit & (1 << i)) == 0) {
                        cost += c[i];
                        for (int j = 0; j < m; j++) {
                            skill[j] += a[i][j];
                        }
                    }
                    boolean ok = true;
                    for (int j = 0; j < m; j++) {
                        if (skill[j] < x) ok = false;
                    }
                    if (ok) ans = Math.min(ans, cost);
                }
            }

            if (ans == inf) {
                // 出力
                out.println(-1);
            } else {
                out.println(ans);
            }

        }

    }
}


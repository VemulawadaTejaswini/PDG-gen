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
            int m = Integer.parseInt(in.next());
            int k = Integer.parseInt(in.next());
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(in.next());
            }
            int[] b = new int[m];
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(in.next());
            }
            long[] sum_a = new long[n + 1];
            for (int i = 1; i < n + 1; i++) {
                sum_a[i] = sum_a[i - 1] + a[i - 1];
            }
            long[] sum_b = new long[m + 1];
            for (int i = 1; i < m + 1; i++) {
                sum_b[i] = sum_b[i - 1] + b[i - 1];
            }
            int ans = 0;
            int j = m;

            for (int i = 0; i < n + 1; i++) {
                if (sum_a[i] > k) break;
                while (sum_b[j] > k - sum_a[i]) {
                    j -= 1;
                }
                ans = Math.max(ans, i + j);
            }
            // 出力
            out.println(ans);
        }

    }
}


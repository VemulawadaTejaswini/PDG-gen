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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int k = Integer.parseInt(in.next());
            Integer p[] = new Integer[n];
            for (int i = 0; i < n; i++) {
                p[i] = Integer.parseInt(in.next());
                p[i]++;
            }

            long s[] = new long[n + 1];
            for (int i = 0; i < n; i++) {
                s[i + 1] = s[i] + p[i];
            }

            long ans = 0;
            for (int i = 0; i + k <= n; i++) {
                ans = Math.max(s[i + k] - s[i], ans);
            }


            // 出力
            out.println(String.format("%.12f", (double) ans / 2));

        }

    }
}


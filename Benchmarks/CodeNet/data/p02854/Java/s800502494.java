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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(in.next());
            }

            int s[] = new int[n + 1];
            for (int i = 0; i < n; ++i) s[i + 1] = s[i] + a[i];

            int ans = 2020202021;

            for (int i = 1; i < n; i++) {
                ans = Math.min(ans, Math.abs((s[i] - s[0]) - (s[n] - s[i])));
            }
            // 出力
            out.println(ans);

        }

    }
}


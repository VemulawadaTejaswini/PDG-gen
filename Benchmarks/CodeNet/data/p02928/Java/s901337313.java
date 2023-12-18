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
        static final long mod = 1000000007L;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            long k = Long.parseLong(in.next());
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(in.next());
            }
            long ans = 0;
            for (int i = 0; i < n; i++) {
                long right = 0;
                long all = 0;
                for (int j = i; j < n; j++) {
                    if (a[i] > a[j]) right++;
                }
                for (int j = 0; j < n; j++) {
                    if (a[i] > a[j]) all++;
                }
                ans += right * k % mod;
                ans %= mod;
                ans += (k - 1) * k / 2 % mod * (all % mod);
                ans %= mod;

            }

            // 出力
            out.println(ans);

        }

    }
}


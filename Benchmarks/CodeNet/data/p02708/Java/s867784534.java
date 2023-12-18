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
        static final int mod = 1000000007;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            long n = Long.parseLong(in.next());
            long k = Long.parseLong(in.next());
            long ans = 0;

            for (long i = k; i <= n + 1; i++)
                ans = (ans + (n + 1 - i) * i + 1) % mod;

            // 出力
            out.println(ans);

        }

    }
}


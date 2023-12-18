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
            long a = Long.parseLong(in.next());
            long b = Long.parseLong(in.next());
            long n = Long.parseLong(in.next());
            long ans = -1;
            long cnt = b;

            if (n < b) cnt = n;
            if (cnt > 1000000) cnt = 1000000;
            for (int i = 1; i <= cnt; i++) {
                long tmp = f(a, b, i);
                if (tmp - ans < 0) {
                    break;
                }
                ans = Math.max(ans, tmp);
            }

            // 出力
            out.println(ans);

        }

        public static long f(long a, long b, long x) {
            long res = 0;
            res = (long) (Math.floor(a * x / b) - a * Math.floor(x / b));
            return res;
        }

    }
}


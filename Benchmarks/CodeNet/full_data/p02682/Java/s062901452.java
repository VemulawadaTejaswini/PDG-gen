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
            long a = Long.parseLong(in.next());
            long b = Long.parseLong(in.next());
            long c = Long.parseLong(in.next());
            long k = Long.parseLong(in.next());
            long ans = 0;
            long tmp = k;

            if (a > 0) {
                if (a >= k) ans += k;
                else ans += a;
                tmp -= a;
                a = a - k;
                k = tmp;
            }
            if (a <= 0 && b > 0 && k > 0) {
                tmp -= b;
                b = b - k;
                k = tmp;
            }
            if (a <= 0 && b <= 0 && c > 0 && k > 0) {
                ans -= k;
            }

            // 出力
            out.println(ans);

        }

    }
}


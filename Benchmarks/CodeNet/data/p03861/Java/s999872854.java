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
        long a = 0;
        long b = 0;
        long x = 0;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            a = Long.parseLong(in.next());
            b = Long.parseLong(in.next());
            x = Long.parseLong(in.next());
            long ans = 0;

            ans = f(b) - f(a - 1);
            out.println(ans);
        }

        public long f(long n) {
            long res = 0;
            if (n >= 0) {
                res = n / x + 1;
            }
            return res;
        }

    }
}


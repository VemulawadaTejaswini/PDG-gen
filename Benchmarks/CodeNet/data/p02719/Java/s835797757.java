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
            long n = Long.parseLong(in.next());
            long k = Long.parseLong(in.next());
            long ans = 0;
            long x = 0;

            x = n;
            long tmp = Long.MAX_VALUE;
            while (true) {
                if (k == 1) tmp = 0;
                if (n % k == 1) tmp = 1;
                if (n % k == 0) tmp = 0;
                x = Math.abs(x - k);
                tmp = Math.min(tmp, x);
                if (x > tmp) break;
            }
            // 出力
            out.println(tmp);

        }

    }
}


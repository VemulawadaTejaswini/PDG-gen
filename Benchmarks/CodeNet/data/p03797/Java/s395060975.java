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
            long m = Long.parseLong(in.next());
            long ans = n;
            long tmp = 0;
            if (m >= 2 * n) {
                tmp = m - 2 * n;
                ans += tmp / 4;
            } else {
                tmp = m / 2;
                ans = tmp;
            }

            // 出力
            out.println(ans);

        }

    }
}


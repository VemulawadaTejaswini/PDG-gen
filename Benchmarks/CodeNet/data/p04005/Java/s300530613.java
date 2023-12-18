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
        A solver = new A();
        solver.solve(1, in, out);
        out.close();
    }

    static class A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            long a = Long.parseLong(in.next());
            long b = Long.parseLong(in.next());
            long c = Long.parseLong(in.next());
            long ans = 0;

            if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
                ans = 0;
            } else {
                ans = Math.min(b * c, c * a);
                ans = Math.min(ans, a * b);
            }
            // 出力
            out.println(ans);

        }

    }
}


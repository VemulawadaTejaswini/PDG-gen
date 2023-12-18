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
            int x = Integer.parseInt(in.next());

            long max = Integer.MIN_VALUE;
            long pw = 0;
            if (x == 1) {
                out.println(1);
                return;
            }
            for (int i = 31; i >= 2; --i) {
                for (int j = 10; j >= 2; --j) {
                    pw = (long) Math.pow(i, j);
                    if (pw <= x) {
                        max = Math.max(pw, max);
                    }
                }
            }
            out.println(max);

        }

    }
}


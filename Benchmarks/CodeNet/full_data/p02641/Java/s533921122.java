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
        ForbiddenList solver = new ForbiddenList();
        solver.solve(1, in, out);
        out.close();
    }

    static class ForbiddenList {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int x = in.nextInt();
            int n = in.nextInt();

            if (n == 0) {
                out.append(String.valueOf(x));
                return;
            }

            boolean[] p = new boolean[100 + 1];
            for (int i = 0; i < n; i++) {
                int a = in.nextInt();
                p[a] = true;
            }

            int pos = 0;
            while (true) {
                int minus = x - pos;
                if (0 <= minus && minus <= 100) {
                    if (!p[minus]) {
                        out.append(String.valueOf(minus));
                        return;
                    }
                }
                int plus = x + pos;
                if (0 <= plus && plus <= 100) {
                    if (!p[plus]) {
                        out.append(String.valueOf(plus));
                        return;
                    }
                }
                if (minus <= 0) {
                    out.append(String.valueOf(minus));
                    return;
                }

                if (100 < plus) {
                    out.append(String.valueOf(plus));
                    return;
                }
                pos++;
            }
        }

    }
}


import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
            int n = Integer.parseInt(in.next());
            int m = Integer.parseInt(in.next());
            int x = Integer.parseInt(in.next());
            int y = Integer.parseInt(in.next());
            int xn[] = new int[n];
            int ym[] = new int[m];
            for (int i = 0; i < n; i++) {
                xn[i] = Integer.parseInt(in.next());
            }
            for (int i = 0; i < m; i++) {
                ym[i] = Integer.parseInt(in.next());
            }

            Arrays.sort(xn);
            Arrays.sort(ym);

            int x1, y1;

            x1 = Math.max(x, xn[n - 1]);
            y1 = Math.min(y, ym[0]);

            out.println(y1 - x1 > 0 ? "No War" : "War");

        }

    }
}


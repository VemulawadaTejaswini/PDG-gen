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
            int x[] = new int[4];
            int y[] = new int[4];
            for (int i = 0; i < 2; i++) {
                x[i] = Integer.parseInt(in.next());
                y[i] = Integer.parseInt(in.next());
            }

            int xx = x[1] - x[0];
            int yy = y[1] - y[0];

            out.printf("%d %d %d %d\n", x[1] - yy, y[1] + xx, x[0] - yy, y[0] + xx);

        }

    }
}


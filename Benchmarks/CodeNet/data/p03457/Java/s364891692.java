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
        ABC086C solver = new ABC086C();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC086C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 整数の入力
            int N = Integer.parseInt(in.next());
            int[] t = new int[N + 1];
            int[] x = new int[N + 1];
            int[] y = new int[N + 1];
            for (int i = 0; i < N; i++) {
                t[i + 1] = Integer.parseInt(in.next());
                x[i + 1] = Integer.parseInt(in.next());
                y[i + 1] = Integer.parseInt(in.next());
            }

            boolean ans = true;

            for (int i = 0; i < N; i++) {
                int dt = t[i + 1] - t[i];
                int dest = Math.abs(x[i + 1] - x[i]) + Math.abs(y[i + 1] - y[i]);

                if (dt < dest) ans = false;
                if (dest % 2 != dt % 2) ans = false;
            }

            // 出力
            if (ans) {
                out.println("Yes");
            } else {
                out.println("No");
            }

        }

    }
}


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
            int N = Integer.parseInt(in.next());
            // 整数の入力
            int[] x = new int[N];
            int[] y = new int[N];
            for (int i = 0; i < N; i++) {
                x[i] = Integer.parseInt(in.next());
                y[i] = Integer.parseInt(in.next());
            }
            double ans = 0;

            int X = 2 * factorial(N - 1);

            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {
                    int xdist = x[i] - x[j];
                    int ydist = y[i] - y[j];
                    double dist = Math.sqrt(xdist * xdist + ydist * ydist);
                    ans += dist * X;

                }
            }
            // 出力
            out.println(ans / factorial(N));

        }

        static int factorial(int n) {
            if (n == 1) {
                return 1;
            }
            return n * factorial(n - 1);
        }

    }
}


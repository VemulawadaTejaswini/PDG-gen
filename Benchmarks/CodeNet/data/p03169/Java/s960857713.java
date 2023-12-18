import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        JSushi solver = new JSushi();
        solver.solve(1, in, out);
        out.close();
    }

    static class JSushi {
        double[][][] dp;
        int n;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            n = in.nextInt();
            int a = 0;
            int b = 0;
            int c = 0;
            for (int i = 0; i < n; i++) {
                int x = in.nextInt();
                if (x == 1) a++;
                if (x == 2) b++;
                if (x == 3) c++;
            }
            dp = new double[n + 1][n + 1][n + 1];
            boolean[][][] used = new boolean[n + 1][n + 1][n + 1];
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    for (int k = 0; k <= n; k++) {
                        dp[i][j][k] = 0;
                    }
                }
            }

            out.println(f(a, b, c));
        }

        double f(int a, int b, int c) {
            if (dp[a][b][c] > 0) {
                return dp[a][b][c];
            }

            if (a == 0 && b == 0 && c == 0) {
                return 0;
            }
            double N = n;
            double sum = a + b + c;
            double res = N / sum;

            if (a > 0) res += (double) a / sum * f(a - 1, b, c);
            if (b > 0) res += (double) b / sum * f(a + 1, b - 1, c);
            if (c > 0) res += (double) c / sum * f(a, b + 1, c - 1);

            return dp[a][b][c] = res;
        }

    }
}


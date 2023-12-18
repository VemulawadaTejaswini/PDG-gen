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
        BGoodDistance solver = new BGoodDistance();
        solver.solve(1, in, out);
        out.close();
    }

    static class BGoodDistance {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int d = in.nextInt();
            int x[][] = new int[n][d];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < d; j++) {
                    x[i][j] = in.nextInt();
                }
            }
            int nb = 0;
            for (int i = 0; i < n; i++)
                for (int j = i + 1; j < n; j++) {
                    long res = 0;
                    for (int k = 0; k < d; k++) {
                        res += (x[i][k] - x[j][k]) * (x[i][k] - x[j][k]);
                    }
                    double result = Math.sqrt(res);
                    int res1 = (int) result;
                    if (Math.abs(result - res1) <= 0.000001 || Math.abs(result - res1 - 1) <= 0.000001)
                        nb++;
                }
            out.println(nb);
        }

    }
}


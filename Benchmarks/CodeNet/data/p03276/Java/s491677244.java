import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CCandles solver = new CCandles();
        solver.solve(1, in, out);
        out.close();
    }

    static class CCandles {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt(), k = in.nextInt();
            int[] x = new int[n];
            int[] y = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = in.nextInt();
                y[n - i - 1] = -x[i];
            }
            int ans = Integer.MAX_VALUE;
            for (int i = 0; i < n - k + 1; i++) {
                ans = Math.min(ans, x[i + k - 1] - x[i] + Math.abs(x[i]));
                ans = Math.min(ans, y[i + k - 1] - y[i] + Math.abs(y[i]));
            }
            out.println(ans);
        }

    }
}


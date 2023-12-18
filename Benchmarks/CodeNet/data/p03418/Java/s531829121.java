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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            final int n = in.nextInt();
            final int k = in.nextInt();
            int ans = 0;
            if (k == 0) {
                out.println(n * n);
                return;
            }

            for (int b = k + 1; b <= n; b++) {
                ans += (b - k) * (n / b);
            }

            for (int b = k + 1; b <= n; b++) {
                int d = (b * (n / b)) + k - 1;
                if (d < n) {
                    ans += n - d;
                }
            }
            out.println(ans);
        }

    }
}


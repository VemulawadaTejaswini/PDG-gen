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
        ABC115_C solver = new ABC115_C();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC115_C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            long[] h = new long[n];
            for (int i = 0; i < n; i++) {
                h[i] = in.nextLong();
            }
            Arrays.sort(h);
            Long ans = Long.MAX_VALUE;
            for (int i = 0; i < n - (k - 1); i++) {
                ans = Math.min(ans, h[i + k - 1] - h[i]);
                if (ans == 0) break;
            }

            out.print(ans);


        }

    }
}


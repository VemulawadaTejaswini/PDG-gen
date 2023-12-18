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
        ManyMedians solver = new ManyMedians();
        solver.solve(1, in, out);
        out.close();
    }

    static class ManyMedians {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] x = new int[n];
            int[] sorted = new int[n];
            for (int i = 0; i < n; i++) {
                int xn = in.nextInt();
                x[i] = xn;
                sorted[i] = xn;
            }

            Arrays.sort(sorted);
            int left = sorted[n / 2 - 1];
            int right = sorted[n / 2];

            for (int i = 0; i < n; i++) {
                if (x[i] <= left) {
                    out.println(right);
                } else {
                    out.println(left);
                }
            }
        }

    }
}


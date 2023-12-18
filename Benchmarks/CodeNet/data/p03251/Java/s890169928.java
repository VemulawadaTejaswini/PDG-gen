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
        ABC_110_B solver = new ABC_110_B();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC_110_B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] x = new int[n + 1];
            int[] y = new int[m + 1];

            x[0] = in.nextInt();
            y[0] = in.nextInt();

            for (int i = 1; i < n + 1; i++) {
                x[i] = in.nextInt();
            }

            for (int i = 1; i < m + 1; i++) {
                y[i] = in.nextInt();
            }
            Arrays.sort(x);
            Arrays.sort(y);

            if (y[0] <= x[x.length - 1]) {
                out.print("War");
            } else {
                out.print("No War");
            }
        }

    }
}


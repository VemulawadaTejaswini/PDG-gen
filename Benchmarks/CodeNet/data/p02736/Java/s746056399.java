import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author EigenFunk
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        B123Triangle solver = new B123Triangle();
        solver.solve(1, in, out);
        out.close();
    }

    static class B123Triangle {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            in.nextLine();
            String inp = in.nextLine();
            int[] xs = new int[n];
            for (int i = 0; i < n; i++) {
                xs[i] = inp.charAt(i) - 48;
            }
            int sup = 3;
            for (int i = 2; i <= n; i++) {
                int innerMax = 0;
                for (int j = 0; j < n - i; j++) {
                    xs[j] = Math.abs(xs[j] - xs[j + 1]);
                    innerMax = Math.max(innerMax, xs[j]);
                }
                sup = Math.min(sup, innerMax);
                if (sup == 0) break;

            }
            out.println(sup);
        }

    }
}


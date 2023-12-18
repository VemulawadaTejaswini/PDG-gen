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
        BTwoArrays solver = new BTwoArrays();
        solver.solve(1, in, out);
        out.close();
    }

    static class BTwoArrays {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            long x = 0;
            long y = 0;

            int sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                x += a[i];

            }

            for (int i = 0; i < n; i++) {
                b[i] = in.nextInt();
                y += b[i];
            }

            for (int i = 0; i < n; i++) {
                if (a[i] < b[i]) {
                    sum += ((b[i] - a[i]) - 1 + 2) / 2;
                }
            }
            out.println(sum <= (y - x) ? "Yes" : "No");

        }

    }
}


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
        DRGBTriplets solver = new DRGBTriplets();
        solver.solve(1, in, out);
        out.close();
    }

    static class DRGBTriplets {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            char[] c = in.next().toCharArray();
            long r = 0;
            long g = 0;
            long b = 0;
            for (int i = 0; i < n; i++) {
                if (c[i] == 'R') r++;
                if (c[i] == 'G') g++;
                if (c[i] == 'B') b++;
            }

            long m = 0;
            for (int i = 0; i < n; i++) {
                for (int dif = 1; dif < n; dif++) {
                    if (i - dif >= 0 && i + dif < n) {
                        if (c[i] != c[i - dif] && c[i + dif] != c[i - dif] && c[i] != c[i + dif]) m++;
                    }
                }
            }

            out.println(r * g * b - m);

        }

    }
}


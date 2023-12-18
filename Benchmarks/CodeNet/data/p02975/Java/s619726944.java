import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        AXORCircle solver = new AXORCircle();
        solver.solve(1, in, out);
        out.close();
    }

    static class AXORCircle {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            int[] a = new int[n];
            boolean f = false;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            Arrays.sort(a);

            if (n % 3 == 0) {
                int k = n / 3;
                if (a[0] == a[k - 1] && a[k] == a[2 * k - 1] && a[2 * k] == a[3 * k - 1] && (a[0] ^ a[k]) == a[2 * k])
                    f = true;
                if (a[k - 1] == 0 && a[k] > 0 && a[k] == a[3 * k - 1]) f = true;
            }

            if (a[n - 1] == 0) f = true;

            out.println(f ? "Yes" : "No");

        }

    }
}


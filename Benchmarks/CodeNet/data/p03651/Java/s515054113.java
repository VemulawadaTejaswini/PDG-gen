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
        AGettingDifference solver = new AGettingDifference();
        solver.solve(1, in, out);
        out.close();
    }

    static class AGettingDifference {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int target = in.nextInt();
            int[] a = new int[n];
            long gcd = 0;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                gcd = Arith.gcd(gcd, a[i]);
            }

            Arrays.sort(a);
            if (a[n - 1] >= target && target % gcd == 0) {
                out.println("POSSIBLE");
            } else {
                out.println("IMPOSSIBLE");
            }

        }

    }

    static class Arith {
        public static long gcd(long a, long b) {
            if (b == 0) return a;
            return a % b == 0 ? b : gcd(b, a % b);
        }

    }
}


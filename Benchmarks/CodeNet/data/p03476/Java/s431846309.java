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
        LikeNumber solver = new LikeNumber();
        solver.solve(1, in, out);
        out.close();
    }

    static class LikeNumber {
        boolean[] primes;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            primes = eratos((int) Math.pow(10, 5));
            boolean[] memo = new boolean[(int) Math.pow(10, 5)];

            int q = in.nextInt();

            for (int i = 0; i < q; i++) {
                int s = in.nextInt();
                int e = in.nextInt();
                long result = 0;
                for (int j = s; j <= e; j += 2) {
                    if (memo[j] || (primes[j] && primes[(j + 1) / 2])) {
                        memo[j] = true;
                        result++;
                    }
                }
                out.println(result);
            }
        }

        static boolean[] eratos(int n) {
            boolean[] results = new boolean[n + 1];
            Arrays.fill(results, true);

            results[0] = false;
            results[1] = false;

            for (int i = 2; i <= n; i++) {
                int j = i + i;
                while (j <= n) {
                    results[j] = false;
                    j = j + i;
                }
            }
            return results;
        }

    }
}


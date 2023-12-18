import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FFrogJump solver = new FFrogJump();
        solver.solve(1, in, out);
        out.close();
    }

    static class FFrogJump {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++)
                arr[i] = in.nextLong();
            //long res = solveSimple(n, arr);
            long res = solveMe(n, arr);
            out.println(res);
        }

        private long solveMe(int n, long[] arr) {
            HashSet<Integer> used = new HashSet<>();
            long res = 0;
            //n-1 = a+(k-1)c
            for (int c = 1; c <= n; c++) {
                used = new HashSet<>();
                long score = 0;
                res = Math.max(res, score);
                for (int k = 1; (n - 1) - (k - 1) * c > 0; k++) {
                    if ((k - 1) * c == n - 1 - (k - 1) * c)
                        break;
                    if (used.contains((k - 1) * c) || used.contains(n - 1 - (k - 1) * c))
                        break;
                    score += arr[(k - 1) * c] + arr[n - 1 - (k - 1) * c];
                    used.add((k - 1) * c);
                    used.add(n - 1 - (k - 1) * c);
                    res = Math.max(score, res);
                }
            }
            return res;
        }

    }
}


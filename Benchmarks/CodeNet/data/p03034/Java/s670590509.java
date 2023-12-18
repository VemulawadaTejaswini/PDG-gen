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
            long res = solveMeOk(n, arr);
            out.println(res);
        }

        private long solveMeOk(int n, long[] arr) {
            HashSet<Integer> used = new HashSet<>();
            long res = 0;
            //n-1 = a+(k-1)c
            for (int c = 1; c < n; c++) {
                used = new HashSet<>();
                long score = 0;
                res = Math.max(res, score);
              used.add(0); used.add(n-1);
                for (int k = 1; k * c < n - 1; k++) {
                    if (k * c == n - 1 - k * c)
                        break;
                    if (used.contains(k * c) || used.contains(n - 1 - k * c))
                        break;
                    score += arr[k * c] + arr[n - 1 - k * c];
                    used.add(k * c);
                    used.add(n - 1 - k * c);
                    res = Math.max(score, res);
                }
            }
            return res;
        }

    }
}


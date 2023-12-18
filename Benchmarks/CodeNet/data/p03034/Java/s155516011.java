import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

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
            long res = solveMe3(n, arr);
            out.println(res);
        }

        private long solveMe3(int n, long s[]) {
            long ans = 0;
            for (int c = 1; c < n; c++) {
                long sum = 0;
                Set<Integer> set = new TreeSet<>();
                for (int k = 1; (k + 1) * c < n; k++) {
                    if (!set.add(k * c)) break;
                    if (!set.add(n - 1 - k * c)) break;
                    sum += s[k * c];
                    sum += s[n - 1 - k * c];
                    ans = Math.max(ans, sum);
                }
            }
            return ans;
        }

    }
}


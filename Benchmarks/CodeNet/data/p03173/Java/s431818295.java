import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author vdewansa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        NSlimes solver = new NSlimes();
        solver.solve(1, in, out);
        out.close();
    }

    static class NSlimes {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int[] a = new int[N + 1];
            long[] sum = new long[N + 1];
            for (int i = 1; i <= N; i++) {
                a[i] = in.nextInt();
                sum[i] = sum[i - 1] + a[i];
            }
            long[][] cost = new long[N + 1][N + 1];
            for (int start = N; start >= 1; start--) {
                for (int end = start + 1; end <= N; end++) {
                    cost[start][end] = Long.MAX_VALUE;
                    long sumAll = sum[end] - sum[start - 1];
                    for (int i = start + 1; i <= end; i++) {
                        long costLeft = cost[start][i - 1];
                        long costRight = cost[i][end];
                        cost[start][end] = Math.min(cost[start][end], costLeft + costRight + sumAll);
                    }
                }
            }
            out.println(cost[1][N]);
        }

    }
}


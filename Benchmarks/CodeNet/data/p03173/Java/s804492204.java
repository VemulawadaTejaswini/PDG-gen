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
            for (int i = 1; i <= N; i++) {
                a[i] = in.nextInt();
            }
            long[] cumsum = new long[N + 1];
            for (int i = 1; i <= N; i++) {
                cumsum[i] = cumsum[i - 1] + a[i];
            }
            long[][] cost = new long[N + 1][N + 2];
            for (int len = 2; len <= N; len++) {
                for (int start = 1; start + len - 1 <= N; start++) {
                    cost[len][start] = Long.MAX_VALUE;
                    final int end = start + len - 1;
                    for (int i = start; i <= end; i++) {
                        long costLeft = cost[i - start][start];
                        long costRight = cost[end - i][i + 1];
                        long sumAll = cumsum[end] - cumsum[start - 1];
                        long curCost = costLeft + costRight + sumAll;
                        if (i > start && i < end) {
                            long sum1 = cumsum[i] - cumsum[start - 1];
                            long sum2 = cumsum[end] - cumsum[i - 1];
                            curCost += Math.min(sum1, sum2);
                        }
                        cost[len][start] = Math.min(cost[len][start], curCost);
                    }
                }
            }
            out.println(cost[N][1]);
        }

    }
}


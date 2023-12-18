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
            long[][] cost = new long[N + 1][N + 1];
            for (int len = 2; len <= N; len++) {
                for (int start = 1; start + len - 1 <= N; start++) {
                    final int end = start + len - 1;
                    cost[len][start] = Math.min(
                            cost[len - 1][start + 1] + cumsum[end] - cumsum[start] + a[start],
                            2 * cost[len - 1][start] + cumsum[end - 1] - cumsum[start - 1] + a[end]);
                    for (int last = start + 1; last < end; last++) {
                        long costLeft = cost[last - start][start];
                        long costRight = cost[end - last][last + 1];
                        long sumLeft = cumsum[last] - cumsum[start - 1];
                        long sumRight = cumsum[end] - cumsum[last - 1];
                        long sumAll = cumsum[end] - cumsum[start - 1];
                        cost[len][start] = Math.min(cost[len][start],
                                costLeft + costRight + sumAll + Math.min(sumLeft, sumRight));
                    }
                }
            }
            out.println(cost[N][1]);
        }

    }
}


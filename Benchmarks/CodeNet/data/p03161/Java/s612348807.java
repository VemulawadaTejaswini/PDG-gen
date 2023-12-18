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
        BFrog2 solver = new BFrog2();
        solver.solve(1, in, out);
        out.close();
    }

    static class BFrog2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int K = in.nextInt();
            int[] h = new int[N];
            for (int i = 0; i < N; i++) {
                h[i] = in.nextInt();
            }
            long[] cost = new long[N];
            cost[0] = 0;
            cost[1] = Math.abs(h[1] - h[0]);
            for (int i = 2; i < N; i++) {
                cost[i] = Long.MAX_VALUE;
                int s = Math.max(0, i - K);
                for (int j = s; j <= i; j++) {
                    cost[i] = Math.min(cost[i], cost[j] + Math.abs(h[i] - h[j]));
                }
            }
            out.println(cost[N - 1]);
        }

    }
}


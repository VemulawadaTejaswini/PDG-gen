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
        EDP_A solver = new EDP_A();
        solver.solve(1, in, out);
        out.close();
    }

    static class EDP_A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] h = new int[n + 1];
            int[] cost = new int[100010];
            Arrays.fill(cost, Integer.MAX_VALUE);
            cost[0] = 0;
            cost[1] = 0;
            for (int i = 1; i <= n; i++) {
                h[i] = in.nextInt();

            }


            for (int i = 1; i <= n; i++) {
                if (i > 1) {
                    cost[i] = Math.min(cost[i], cost[i - 1] + Math.abs(h[i] - h[i - 1]));
                }

                if (i > 2) {
                    cost[i] = Math.min(cost[i], cost[i - 2] + Math.abs(h[i] - h[i - 2]));
                }
            }

            out.print(cost[n]);


        }

    }
}


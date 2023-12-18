import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];

            int sum = 0;
            for (int i = 0; i < n; i++) {
                int ai = in.nextInt();
                a[i] = ai;
                sum += ai;
            }

            int y = (int) Math.ceil((sum * 1.0d) / n);

            int cost1 = 0;
            for (int i = 0; i < n; i++) {
                cost1 += (y - a[i]) * (y - a[i]);
            }


            int cost2 = 0;
            for (int i = 0; i < n; i++) {
                cost2 += ((y + 1) - a[i]) * ((y + 1) - a[i]);
            }

            int cost3 = 0;
            for (int i = 0; i < n; i++) {
                cost3 += ((y - 1) - a[i]) * ((y - 1) - a[i]);
            }

            out.println(Math.min(Math.min(cost1, cost2), cost3));
        }

    }
}

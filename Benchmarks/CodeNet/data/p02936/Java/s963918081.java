import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Akash
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DKi solver = new DKi();
        solver.solve(1, in, out);
        out.close();
    }

    static class DKi {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int q = in.nextInt();
            long value[] = new long[n + 1];
            ArrayList<ArrayList<Integer>> a = new ArrayList<>();
            for (int i = 0; i < n + 1; i++) {
                a.add(new ArrayList<>());
            }
            for (int i = 0; i < n - 1; i++) {
                int x = in.nextInt();
                int y = in.nextInt();
                a.get(x).add(y);
            }
            while (q-- > 0) {
                int p = in.nextInt();
                int x = in.nextInt();
                value[p] += x;
            }
            for (int i = 1; i <= n; i++) {
                for (int t : a.get(i)) {
                    value[t] += value[i];
                }
            }
            for (int i = 1; i <= n; i++) {
                out.print(value[i] + " ");
            }
        }

    }
}


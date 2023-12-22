import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.HashMap;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ExhaustiveSearch solver = new ExhaustiveSearch();
        solver.solve(1, in, out);
        out.close();
    }

    static class ExhaustiveSearch {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            int m = in.nextInt();
            HashMap<Integer, Boolean> hm = new HashMap<>();
            int[] q = new int[m];
            for (int i = 0; i < m; i++) {
                q[i] = in.nextInt();
                hm.putIfAbsent(q[i], false);
            }

            for (int i = 0; i < Math.pow(2, n); i++) {
                int cmp = 0;
                for (int j = 0; j < n; j++) if ((i & (int) Math.pow(2, j)) == (int) Math.pow(2, j)) cmp += a[j];
                if (hm.containsKey(cmp)) hm.replace(cmp, false, true);
            }

            for (int value : q) {
                out.println(hm.get(value) ? "yes" : "no");
            }

        }

    }
}



import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        CSwitches solver = new CSwitches();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSwitches {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            boolean[][] optionsByM = new boolean[m][n];
            boolean[] p = new boolean[m];
            for (int i = 0; i < m; i++) {
                int k = in.nextInt();
                for (int j = 0; j < k; j++) {
                    optionsByM[i][in.nextInt() - 1] = true;
                }
            }

            for (int i = 0; i < m; i++) {
                p[i] = in.nextInt() == 1;
            }

            int max = (int) Math.pow(2, n);
            long comb = 0;
            for (int i = 0; i < max; i++) {
                boolean ok = true;
                for (int j = 0; j < m; j++) {
                    if (!solveMe(optionsByM[j], p[j], i, n))
                        ok = false;
                }
                if (ok)
                    comb++;
            }
            out.println(comb);
        }

        private boolean solveMe(boolean[] options, boolean p, int switches, int n) {
            int nb = 0;
            for (int i = 0; i < n; i++) {
                if (options[i] && (switches & (1 << i)) == (1 << i))
                    nb++;
            }
            boolean ans = nb % 2 == 1;
            return ans == p;
        }

    }
}


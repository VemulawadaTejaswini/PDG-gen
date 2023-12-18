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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[][] isHonest = new int[15][15];
            int[] nb = new int[15];

            for (int i = 0; i < n; i++) {
                int a = in.nextInt();
                nb[i] = a;
                for (int j = 0; j < a; j++) {
                    isHonest[i][in.nextInt() - 1] = in.nextInt() == 1 ? 1 : -1;
                }
            }

            long allOptions = 1L << (long) n;
            int best = 0;
            for (int option = 0; option < allOptions; option++) {
                boolean ok = true;
                int ans = 0;
                for (int i = 0; i < n; i++) {
                    boolean isHonestI = ((option & (1L << i)) == (1L << i));
                    if (isHonestI) {
                        ans++;
                        for (int j = 0; j < nb.length; j++) {
                            boolean isHonestJ = ((option & (1L << j)) == (1L << j));

                            if (isHonest[i][j] != 0 && (isHonest[i][j] == 1) != isHonestJ) {
                                ok = false;
                                continue;
                            }
                        }
                    }
                }
                if (ok)
                    best = Math.max(best, ans);
            }

            out.println(best);
        }

    }
}


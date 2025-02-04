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
        ThisMessageWillSelf solver = new ThisMessageWillSelf();
        solver.solve(1, in, out);
        out.close();
    }

    static class ThisMessageWillSelf {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long[][] map = new long[n + 1][n + 1];
            long[] tall = new long[n + 1];

            for (int i = 1; i <= n; i++) {
                tall[i] = in.nextLong();
            }

            int result = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    map[i][j] = Math.abs(tall[i] + tall[j]);
                    if (i != j && Math.abs(i - j) == map[i][j]) {
                        result++;
                    }
                }
            }

            out.append(String.valueOf(result / 2));
        }

    }
}


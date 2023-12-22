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
        TrickOrTreat solver = new TrickOrTreat();
        solver.solve(1, in, out);
        out.close();
    }

    static class TrickOrTreat {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();

            boolean[] statuses = new boolean[n + 1];

            for (int i = 0; i < k; i++) {
                int d = in.nextInt();
                for (int j = 0; j < d; j++) {
                    int a = in.nextInt();
                    statuses[a] = true;
                }
            }

            int result = 0;
            for (int i = 1; i < statuses.length; i++) {
                if (statuses[i]) {
                    result++;
                }
            }
            out.append(String.valueOf(n - result));
        }

    }
}


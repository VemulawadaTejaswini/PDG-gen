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
        Otoshidama solver = new Otoshidama();
        solver.solve(1, in, out);
        out.close();
    }

    static class Otoshidama {
        int n;
        long y;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            n = in.nextInt();
            y = in.nextLong();
            for (int i = 0; i <= n; i++) {
                // 10,000
                for (int j = 0; i + j <= n; j++) {
                    // 5,000

                    int k = n - i - j;
                    if (y == calc(i, j, k)) {
                        out.println(String.format("%d %d %d", i, j, k));
                        return;
                    }
                }
            }
            out.println(String.format("%d %d %d", -1, -1, -1));
        }

        private int calc(int x, int y, int z) {
            return 10000 * x + 5000 * y + 1000 * z;
        }

    }
}


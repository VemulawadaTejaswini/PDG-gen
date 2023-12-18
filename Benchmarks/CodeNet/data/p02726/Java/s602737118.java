import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

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
        DLine solver = new DLine();
        solver.solve(1, in, out);
        out.close();
    }

    static class DLine {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            int x = in.nextInt() - 1;
            int y = in.nextInt() - 1;
            int[] dist = new int[n + 1];
            Arrays.fill(dist, 0);
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (j < x || y < i) {
                        // 完全に外
                        dist[j - i]++;
                    } else if (i <= x && y <= j) {
                        // 内包する
                        dist[(x - i) + 1 + (j - y)]++;
                    } else if (x < i && j < y) {
                        // 内包される
                        dist[j - i]++;
                    } else if (i <= x && j <= y) {
                        dist[Math.min(j - i, (x - i) + 1 + (y - j))]++;
                    } else if (x <= i && y <= j) {
                        dist[Math.min(j - i, i - x + 1 + (j - y))]++;
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                if (i > 0) {
                    out.println(dist[i]);
                }
            }

        }

    }
}


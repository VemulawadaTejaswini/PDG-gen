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
        ABC_109_C solver = new ABC_109_C();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC_109_C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int X = in.nextInt();
            int ans = Integer.MAX_VALUE;
            int[] dist = new int[n];
            for (int i = 0; i < n; i++) {
                dist[i] = Math.abs(X - in.nextInt());
            }
            int gcd = 0;
            if (dist.length != 1) {
                gcd = gcd(dist[0], dist[1]);
                for (int i = 0; i < n - 1; i++) {
                    gcd = gcd(gcd, dist[i + 1]);
                }

            } else {
                gcd = dist[0];
            }

            out.print(gcd);
        }

        private int gcd(int i, int i1) {
            if (i1 == 0) {
                return i;
            }

            return gcd(i1, i % i1);
        }

    }
}


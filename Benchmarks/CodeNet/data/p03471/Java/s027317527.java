import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC085COtoshidama solver = new ABC085COtoshidama();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC085COtoshidama {
        private static final ABC085COtoshidama.Pochibukuro[][] dp = new ABC085COtoshidama.Pochibukuro[2001][20001];
        private static final ABC085COtoshidama.Pochibukuro IMPOSSIBLE = new ABC085COtoshidama.Pochibukuro(-1, -1, -1);

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            ABC085COtoshidama.Pochibukuro p = calc(in.nextInt(), in.nextInt() / 1000);
            out.print(p.yukichi);
            out.print(' ');
            out.print(p.ichiyo);
            out.print(' ');
            out.println(p.soseki);
        }

        private static ABC085COtoshidama.Pochibukuro calc(int n, int y) {
            if (n == 0 && y == 0) {
                return new ABC085COtoshidama.Pochibukuro(0, 0, 0);
            } else if (n == 0 || y <= 0) {
                return IMPOSSIBLE;
            } else if (dp[n][y] != null) {
                return dp[n][y];
            }
            ABC085COtoshidama.Pochibukuro p;
            if ((p = calc(n - 1, y - 10)) != IMPOSSIBLE) {
                return dp[n][y] = new ABC085COtoshidama.Pochibukuro(p.yukichi + 1, p.ichiyo, p.soseki);
            } else if ((p = calc(n - 1, y - 5)) != IMPOSSIBLE) {
                return dp[n][y] = new ABC085COtoshidama.Pochibukuro(p.yukichi, p.ichiyo + 1, p.soseki);
            } else if ((p = calc(n - 1, y - 1)) != IMPOSSIBLE) {
                return dp[n][y] = new ABC085COtoshidama.Pochibukuro(p.yukichi, p.ichiyo, p.soseki + 1);
            } else {
                return dp[n][y] = IMPOSSIBLE;
            }
        }

        private static class Pochibukuro {
            private int yukichi;
            private int ichiyo;
            private int soseki;

            private Pochibukuro(int yukichi, int ichiyo, int soseki) {
                this.yukichi = yukichi;
                this.ichiyo = ichiyo;
                this.soseki = soseki;
            }

        }

    }
}

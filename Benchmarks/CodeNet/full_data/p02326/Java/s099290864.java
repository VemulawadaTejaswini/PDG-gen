import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    void solve() throws IOException {
        int H = ni();
        int W = ni();
        boolean[][] B = new boolean[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                int x = ni();
                B[i][j] = (x == 0);
            }
        }

        int max = 0;

        int[][] dp = new int[H][W];
        for (int i = 0; i < H; i++) {
            if (B[i][0]) {
                dp[i][0] = 1;
                max = 1;
            }
        }
        for (int i = 0; i < W; i++) {
            if (B[0][i]) {
                dp[0][i] = 1;
                max = 1;
            }

        }

        for (int i = 1; i < H; i++) {
            for (int j = 1; j < W; j++) {
                if (!B[i][j]) continue;

                int x = Math.min(dp[i - 1][j], dp[i][j - 1]);
                if (B[i - x][j - x]) {
                    max = Math.max(max, x + 1);
                    dp[i][j] = x + 1;
                } else {
                    dp[i][j] = x;
                }
            }
        }

        out.println(max * max);
    }

    String ns() throws IOException {
        while (!tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine(), " ");
        }
        return tok.nextToken();
    }

    int ni() throws IOException {
        return Integer.parseInt(ns());
    }

    long nl() throws IOException {
        return Long.parseLong(ns());
    }

    double nd() throws IOException {
        return Double.parseDouble(ns());
    }

    String[] nsa(int n) throws IOException {
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = ns();
        }
        return res;
    }

    int[] nia(int n) throws IOException {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = ni();
        }
        return res;
    }

    long[] nla(int n) throws IOException {
        long[] res = new long[n];
        for (int i = 0; i < n; i++) {
            res[i] = nl();
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        tok = new StringTokenizer("");
        Main main = new Main();
        main.solve();
        out.close();
    }
}
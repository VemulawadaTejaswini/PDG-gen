import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    int[][] dp = new int[101][10001];
    int N, W;
    int[] v, w;

    void solve() throws IOException {
        N = ni();
        W = ni();
        v = new int[N];
        w = new int[N];
        for (int i = 0; i < N; i++) {
            v[i] = ni();
            w[i] = ni();
        }
        for (int[] a : dp) Arrays.fill(a, -1);

        out.println(calc(0, W));
    }

    int calc(int i, int x) {
        if (dp[i][x] >= 0) return dp[i][x];

        int ans;
        if (i == N) {
            ans = 0;
        } else if (x < w[i]) {
            ans = calc(i + 1, x);
        } else {
            ans = Math.max(calc(i + 1, x), calc(i + 1, x - w[i]) + v[i]);
        }

        return dp[i][x] = ans;
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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    int N;
    ArrayList<ArrayList<Pair>> G = new ArrayList<>();
    int[][] dp = new int[1 << 15][15];

    int INF = 1 << 20;

    void solve() throws IOException {
        N = ni();
        int M = ni();

        for (int i = 0; i < N; i++) {
            G.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int s = ni();
            int t = ni();
            int d = ni();

            G.get(s).add(new Pair(t, d));
        }

        for (int[] a : dp) Arrays.fill(a, -1);
        int ans = rec(0, 0);
        out.println(ans >= INF ? -1 : ans);
    }

    int rec(int S, int v) {
        if (dp[S][v] >= 0) return dp[S][v];

        if (S == (1 << N) - 1 && v == 0) {
            return 0;
        }

        int ans = INF;
        for (Pair p : G.get(v)) {
            if (((S >> p.x) & 1) == 0) {
                ans = Math.min(ans, rec(S | (1 << p.x), p.x) + p.y);
            }
        }
        return dp[S][v] = ans;
    }

    public class Pair {
        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
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
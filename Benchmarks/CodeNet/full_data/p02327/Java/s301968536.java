import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    void solve() throws IOException {
        int H = ni();
        int W = ni();
        int[][] dp = new int[H][W + 1];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                int x = ni();
                dp[i][j] = x ^ 1;
            }
        }

        for (int i = 1; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (dp[i][j] == 1) {
                    dp[i][j] = dp[i - 1][j] + 1;
                }
            }
        }

        int ans = 0;

        for (int i = 0; i < H; i++) {
            ArrayDeque<Pair> stack = new ArrayDeque<>();
            for (int j = 0; j <= W; j++) {
                int h = dp[i][j];
                if (stack.isEmpty() || stack.peek().x < h) {
                    stack.push(new Pair(h, j));
                } else if (stack.peek().x > h) {
                    int b = 0;
                    while (!stack.isEmpty() && stack.peek().x >= h) {
                        Pair p = stack.poll();
                        ans = Math.max(ans, p.x * (j - p.y));
                        b = p.y;
                    }
                    stack.push(new Pair(h, b));
                }
            }
        }

        out.println(ans);
    }

    public class Pair implements Comparable<Pair> {
        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int compareTo(Pair p) {
            return x == p.x ? y - p.y : x - p.x;
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
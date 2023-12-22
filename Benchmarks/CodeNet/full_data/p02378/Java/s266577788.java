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

    ArrayList<ArrayList<Integer>> G;
    boolean[] used;
    int[] match;

    void solve() throws IOException {
        int X = ni();
        int Y = ni();
        int E = ni();

        used = new boolean[X + Y];
        match = new int[X + Y];

        G = new ArrayList<>();
        for (int i = 0; i < X + Y; i++) {
            G.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            int x = ni();
            int y = ni();
            G.get(x).add(X + y);
            G.get(X + y).add(x);
        }

        int ans = 0;
        Arrays.fill(match, -1);
        for (int i = 0; i < X; i++) {
            if (match[i] == -1) {
                Arrays.fill(used, false);
                if (dfs(i)) ans++;
            }
        }

        out.println(ans);
    }

    boolean dfs(int from) {
        used[from] = true;
        for (int to : G.get(from)) {
            if (match[to] < 0 || !used[match[to]] && dfs(match[to])) {
                match[from] = to;
                match[to] = from;
                return true;
            }
        }
        return false;
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
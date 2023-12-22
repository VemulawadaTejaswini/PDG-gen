import java.io.*;
import java.util.*;

public class Main {

    void solve() throws IOException {
        double p = nd();
        int n = ni();
        ArrayList<Edge>[] G = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            G[i] = new ArrayList<Edge>();
        }

        for (int i = 0; i < n - 1; i++) {
            int x = ni() - 1, y = ni() - 1, c = ni();
            G[x].add(new Edge(y, c));
            G[y].add(new Edge(x, c));
        }

        double eachScore = dfs(G, 0, -1, p);
        out.println(dfs2(G, 0, -1, p, eachScore));
    }

    double dfs(ArrayList<Edge>[] G, int x, int parent, double p) {
        double score = 0;
        for (Edge e : G[x]) {
            if (e.to != parent) {
                score += p * (e.cost + dfs(G, e.to, x, p));
            }
        }
        return score;
    }

    double dfs2(ArrayList<Edge>[] G, int x, int parent, double p, double eachScore) {
        double score = 0;
        for (Edge e : G[x]) {
            if (e.to != parent) {
                score += p * (e.cost + dfs2(G, e.to, x, p, eachScore));
            }
        }
        score += eachScore;
        return score;
    }

    class Edge implements Comparable<Edge> {
        int to;
        int cost;

        Edge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }

        public int compareTo(Edge edge) {
            return cost - edge.cost;
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

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    public static void main(String[] args) throws IOException {
        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        tok = new StringTokenizer("");
        Main main = new Main();
        main.solve();
        out.close();
    }
}
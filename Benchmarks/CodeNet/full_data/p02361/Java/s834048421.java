import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    void solve() throws IOException {
        int v = ni();
        int e = ni();
        int r = ni();

        ArrayList<ArrayList<Edge>> G = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            G.add(new ArrayList<>());
        }

        for (int i = 0; i < e; i++) {
            int s = ni();
            int t = ni();
            int d = ni();

            G.get(s).add(new Edge(t, d));
        }

        PriorityQueue<Pair> Q = new PriorityQueue<>();
        Q.add(new Pair(r, 0));
        boolean[] used = new boolean[v];
        int[] dist = new int[v];
        int INF = Integer.MAX_VALUE;
        Arrays.fill(dist, INF);

        while (!Q.isEmpty()) {
            Pair p = Q.poll();
            if (used[p.x]) continue;
            used[p.x] = true;
            dist[p.x] = p.y;

            for (Edge edge : G.get(p.x)) {
                Q.add(new Pair(edge.to, p.y + edge.cost));
            }
        }

        for (int i = 0; i < v; i++) {
            if (dist[i] != INF) out.println(dist[i]);
            else out.println("INF");
        }
    }

    class Edge {
        int to;
        int cost;

        public Edge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }

    public class Pair implements Comparable<Pair> {
    	int x, y;

    	public Pair(int x, int y) {
    		this.x = x;
    		this.y = y;
    	}

    	public int compareTo(Pair p) {
    		return y - p.y;
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
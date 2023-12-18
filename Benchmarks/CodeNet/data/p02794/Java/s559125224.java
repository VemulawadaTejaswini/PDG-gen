import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<Integer> [] adj;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt();
        adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) adj[i] = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt(); int b = sc.nextInt();
            adj[a].add(b); adj[b].add(a);
        }
        log = (int)Math.ceil(Math.log(n) / Math.log(2));
        memo = new int[n + 1][log + 1];
        depth = new int[n + 1];
        for (int i = 0; i <= n; i++)
            Arrays.fill(memo[i], -1);
        idx = 0; map = new HashMap<>();
        parent = new int[n + 1];
        dfs(1, -1);
        int m = sc.nextInt();
        ArrayList<Integer> [] c = new ArrayList[m];
        for (int i = 0; i < m; i++) c[i] = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt(); int v = sc.nextInt();
            int lca = lca(u, v);
            while (u != lca) {
                int put = map.get(new Edge(u, parent[u]));
                c[i].add(put); u = parent[u];
            }
            while (v != lca) {
                int put = map.get(new Edge(v, parent[v]));
                c[i].add(put); v = parent[v];
            }
        }
        long ans = 0;
        for (int mask = 0; mask < (1L << m); mask++) {
            Set<Integer> bad = new HashSet<>();
            for (int j = 0; j < m; j++) {
                if (((mask >> j) & 1) == 1) {
                    for (Integer i: c[j]) bad.add(i);
                }
            }
            int rem = n - 1 - bad.size();
            if (Integer.bitCount(mask) % 2 == 0) ans += (1L << rem); else ans -= (1L << rem);
        }
        out.println(ans);
        out.close();
    }

    static int idx;
    static int [] parent;
    static int memo[][];
    static int [] depth;
    static int log;
    static Map<Edge, Integer> map;

    static class Edge {
        int c; int p;
        Edge(int c, int p) {
            this.c = c; this.p = p;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Edge edge = (Edge) o;
            return c == edge.c &&
                    p == edge.p;
        }

        @Override
        public int hashCode() {
            return Objects.hash(c, p);
        }
    }

    static void dfs(int u, int p)
    {
        if (p != -1) {
            map.put(new Edge(u, p), idx);
            idx++;
        }
        parent[u] = p;
        memo[u][0] = p;
        for (int i = 1; i <= log; i++) {
            if (memo[u][i - 1] != -1) memo[u][i] = memo[memo[u][i - 1]][i - 1];
        }

        for (int v : adj[u]) {
            if (v != p) {
                depth[v] = depth[u] + 1;
                dfs(v, u);
            }
        }
    }

    static int lca(int u, int v)
    {

        if (depth[u] < depth[v]) {
            int temp = u;
            u = v;
            v = temp;
        }

        for (int i = log; i >= 0; i--) {
            if ((depth[u] - (int)Math.pow(2, i)) >= depth[v])
                u = memo[u][i];
        }

        if (u == v)
            return u;
        for (int i = log; i >= 0; i--) {
            if (memo[u][i] != memo[v][i]) {
                u = memo[u][i];
                v = memo[v][i];
            }
        }

        return memo[u][0];
    }


    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }


    }

}
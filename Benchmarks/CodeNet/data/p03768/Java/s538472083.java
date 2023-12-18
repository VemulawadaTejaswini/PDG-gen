import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<Integer> [] adj;
    static int [][] dp;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt(); int m = sc.nextInt();
        adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) adj[i] = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt(); int v = sc.nextInt();
            adj[u].add(v); adj[v].add(u);
        }
        int q = sc.nextInt();
        Query [] queries = new Query[q + 1];
        int [] c = new int[q + 1];
        for (int i = 1; i <= q; i++) {
            queries[i] = new Query(sc.nextInt(), sc.nextInt());
            c[i] = sc.nextInt();
        }
        dp = new int[n + 1][20];
        for (int i = q; i > 0; i--) dfs(queries[i].v, queries[i].d, i);
        for (int i = 1; i <= n; i++) {
            int latestQuery = 0;
            for (int k = 0; k <= 10; k++) {
                latestQuery = Math.max(latestQuery, dp[i][k]);
            }
            out.println(c[latestQuery]);
        }
        out.close();
    }

    static void dfs(int cur, int depth, int query) {
        if (dp[cur][depth] > 0) return;
        dp[cur][depth] = query;
        if (depth == 0) return;
        dfs(cur, depth - 1, query);
        for (Integer next: adj[cur]) {
            dfs(next, depth - 1, query);
        }
    }

    static class Query {
        int v; int d;
        Query(int v, int d) {
            this.v = v; this.d = d;
        }
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
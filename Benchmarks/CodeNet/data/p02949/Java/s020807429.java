import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<Edge> [] adj;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt(); int m = sc.nextInt(); int p = sc.nextInt();
        adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) adj[i] = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt(); int v = sc.nextInt();
            int cost = sc.nextInt();
            adj[u].add(new Edge(v, -(cost - p)));
        }
        long [] dist = new long[n + 1];
        Arrays.fill(dist, (long) 1e14);
        dist[1] = 0;
        for (int t = 0; t < n; t++) {
            for (int i = 1; i <= n; i++) {
                for (Edge e: adj[i]) {
                    dist[e.to] = Math.min(dist[e.to], dist[i] + e.cost);
                }
            }
        }
        long ansBefore = dist[n];
        for (int i = 1; i <= n; i++) {
            for (Edge e: adj[i]) {
                long before = dist[e.to];
                dist[e.to] = Math.min(dist[e.to], dist[i] + e.cost);
            }
        }
        if (dist[n] != ansBefore) {
            out.println(-1);
            out.close();
            return;
        }
        out.println(Math.max(0, -dist[n]));
        out.close();
    }

    static class Edge {
        int to; int cost;
        Edge(int to, int cost) {
            this.to = to; this.cost = cost;
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
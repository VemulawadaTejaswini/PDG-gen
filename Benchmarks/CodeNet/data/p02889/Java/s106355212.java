import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static ArrayList<Edge> [] adj;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        n = sc.nextInt(); int m = sc.nextInt(); long l = sc.nextLong();
        adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) adj[i] = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt(); int b = sc.nextInt();
            long c = sc.nextLong();
            if (c > l) continue;
            adj[a].add(new Edge(b, c));
            adj[b].add(new Edge(a, c));
        }
        int [][] dp = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            PriorityQueue<Pair> pq = new PriorityQueue<>();
            pq.add(new Pair(i, 0, l));
            Arrays.fill(dp[i], (int) 1e9);
            dp[i][i] = 0;
            boolean [] vis = new boolean[n + 1];
            while (!pq.isEmpty()) {
                Pair next = pq.poll();
                if (vis[next.node]) continue;
                vis[next.node] = true;
                long fuel = next.fuel; int re = next.refills;
                for (Edge e: adj[next.node]) {
                    if (fuel >= e.c) {
                        if (re < dp[i][e.to]) {
                            dp[i][e.to] = re;
                            pq.add(new Pair(e.to, re, fuel - e.c));
                        }
                    } else {
                        if (re + 1 < dp[i][e.to]) {
                            dp[i][e.to] = re + 1;
                            pq.add(new Pair(e.to, re + 1, l - e.c));
                        }
                    }
                }
            }
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int s = sc.nextInt(); int t = sc.nextInt();
            out.println((dp[s][t] >= 1e4 ? -1 : dp[s][t]));
        }
        out.close();
    }

    static class Pair implements Comparable<Pair> {
        int node; int refills; long fuel;
        Pair(int node, int refills, long fuel) {
            this.refills = refills; this.fuel = fuel; this.node = node;
        }

        @Override
        public int compareTo(Pair o) {
            if (refills == o.refills) return Long.compare(o.fuel, fuel);
            return Integer.compare(refills, o.refills);
        }
    }

    static class Edge {
        int to; long c;
        Edge(int to, long c) {
            this.to = to; this.c = c;
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
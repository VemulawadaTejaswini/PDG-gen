//package com.company;

import java.io.*;
import java.util.*;

public class Main {
    static long TIME_START, TIME_END;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
//        Scanner sc = new Scanner(new FileInputStream("Test.in"));
        PrintWriter pw = new PrintWriter(System.out);
//        PrintWriter pw = new PrintWriter(new FileOutputStream("Test.out"));
//        PrintWriter pw = new PrintWriter(new FileOutputStream("Test.in"));

        Runtime runtime = Runtime.getRuntime();
        long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();
        TIME_START = System.currentTimeMillis();
        Task t = new Task();
        t.solve(sc, pw);
        TIME_END = System.currentTimeMillis();
        long usedMemoryAfter = runtime.totalMemory() - runtime.freeMemory();
        pw.close();
//        System.out.println("Memory increased:" + (usedMemoryAfter-usedMemoryBefore) / 1000000 );
//        System.out.println("Time used: " + (TIME_END - TIME_START) + ".");

    }


    public static class Task {

        public class Edge {
            int to, val;

            public Edge(int to, int val) {
                this.to = to;
                this.val = val;
            }
        }
        List<Edge>[] edges;
        int n;
        long[] pos;
        public void solve(Scanner sc, PrintWriter pw) throws IOException {
            n = sc.nextInt();
            int m = sc.nextInt();
            pos = new long[n];
            edges = new List[n];
            for (int i = 0; i < n; i++) {
                edges[i] = new ArrayList<>();
            }
            for (int i = 0; i < m; i++) {
                int l = sc.nextInt() - 1;
                int r = sc.nextInt() - 1;
                int d = sc.nextInt();
                edges[l].add(new Edge(r, d));
                edges[r].add(new Edge(l, -d));
            }
            if (solve()) {
                pw.println("YES");
            } else {
                pw.println("NO");
            }
        }

        public boolean dfs(int u, boolean[] vis, long dis){
            vis[u] = true;
            pos[u] = dis;

            for (Edge e : edges[u]) {
                if (vis[e.to]) {
                    if (pos[e.to] != dis + e.val) return false;
                } else {
                    if (!dfs(e.to, vis, dis + e.val)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public boolean solve(){
            boolean[] visit = new boolean[n];
            for (int i = 0; i < n; i++) {
                if (!visit[i]) {
                    if (!dfs(i, visit, 0)) {
                        return false;
                    }
                }
            }
            return true;

        }

    }



    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s){  br = new BufferedReader(new InputStreamReader(s));}

        public Scanner(FileReader s) throws FileNotFoundException {br = new BufferedReader(s);}

        public String next() throws IOException
        {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {return Integer.parseInt(next());}

        public long nextLong() throws IOException {return Long.parseLong(next());}

        public String nextLine() throws IOException {return br.readLine();}

        public double nextDouble() throws IOException { return Double.parseDouble(next()); }

        public boolean ready() throws IOException {return br.ready();}
    }
}

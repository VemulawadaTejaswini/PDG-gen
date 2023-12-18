import java.io.*;
import java.util.*;

public class Main {
    
    class DisjointSets {
        int[] parent, rank;
        
        public DisjointSets(int n) {
            this.parent = new int[n];
            this.rank = new int[n];
            for (int i = 0; i < n; i++) {
                this.parent[i] = i;
            }
        }
        
        public int find(int n) {
            while (n != parent[n]) {
                parent[n] = parent[ parent[n] ];
                n = parent[n];
            }
            return n;
        }
        
        public void union(int u, int v) {
            int pu = find(u);
            int pv = find(v);
            if (pu == pv) return;
            
            if (rank[pu] < rank[pv]) {
                parent[pu] = parent[pv];
            } else {
                parent[pv] = parent[pu];
                if (rank[pu] == rank[pv]) rank[pu]++;
            }
        }
       
    }
    
    class Answer {
        int N, M;
        int[] arr;
        
        public long solve(DisjointSets ds) {
            if (N == 1) return 0;
            
            ArrayList<Integer>[] list = new ArrayList[N];
            int count = 0;
            for (int i = 0; i < N; i++) {
                int pi = ds.find(i);
                if (list[pi] == null) {
                    list[pi] = new ArrayList<>();
                    count++;
                }
                list[pi].add( arr[i] );
            }
            
            long total = 0L;
            ArrayList<Integer> res = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                if (list[i] != null) {
                    Collections.sort( list[i] );
                    total += list[i].get(0);
                    if (list[i].size() > 1) res.addAll( list[i].subList(1, list[i].size()) );
                }
            }
            
            if (res.size() < count-2) return -1;
            
            Collections.sort(res);
            for (int i = 0; i < count-2; i++) total += res.get(i);
            return total;
        }
        
        public void main(FastScanner in, PrintWriter out) {
            N = in.nextInt();
            M = in.nextInt();
            arr = new int[N];
            for (int i = 0; i < N; i++) arr[i] = in.nextInt();
                
            DisjointSets ds = new DisjointSets(N);
                
            for (int i = 0; i < M; i++) {
                int u = in.nextInt();
                int v = in.nextInt();
                ds.union(u, v);
            }
            
            long ret = solve(ds);
            out.println( ret == -1 ? "Impossible" : ret );
        }
        
        public void p(Object o) { System.out.print(o); }
        public void pl(Object o) { System.out.println(o); }
        public void arp(int[] o) { pl( Arrays.toString(o) ); }
        public void arpp(int[][] o) { 
            for (int i = 0; i < o.length; i++) {
                for (int j = 0; j < o[0].length; j++) { p(o[i][j] + " "); }
                pl("");
            }
        }
        public void ck(Object o1, Object o2) { pl(o1 + " " + o2); }
        public void ckk(Object o1, Object o2, Object o3) { pl(o1 + " " + o2 + " " + o3); }
        public void ckkk(Object o1, Object o2, Object o3, Object o4) { 
            pl(o1 + " " + o2 + " " + o3 + " " + o4);
        }
    }

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        
        Main problem = new Main();
        Answer ans = problem.new Answer();
        ans.main(in, out);
        
        out.close();
        in.close();
    }
    
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        public FastScanner(InputStream in) { br = new BufferedReader(new InputStreamReader(in)); }
        public int nextInt() { return Integer.parseInt(next()); }
        public long nextLong() { return Long.parseLong(next()); }
        public double nextDouble() { return Double.parseDouble(next()); }
        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try { st = new StringTokenizer(br.readLine()); } 
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        public String nextLine() {
            String str = "";
            try { str = br.readLine();
            } catch (IOException e) { e.printStackTrace(); }
            return str;
        }
        public void close() throws IOException { br.close(); }
    }
}
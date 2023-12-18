import java.io.*;
import java.util.*;

public class Main {
    
    class DisjointSets {
        int[] parent;
        int[] rank;

        public DisjointSets(int size) {
            parent = new int[size];
            for (int i = 0; i < size; i++) parent[i] = i;
            rank = new int[size];
        }

        public int find(int n) {
            while ( n != parent[n] ) {
                parent[n] = parent[ parent[n] ];
                n = parent[n];
            }
            return n;
        }

        public void union(int u, int v) {
            u = find(u);
            v = find(v);
            
            if (u == v) return;
            
            if (rank[u] < rank[v]) {
                parent[u] = v;
            } else {
                parent[v] = u;
                if (rank[u] == rank[v]) rank[u]++;
            }
        }

    }
    
    class Answer {
        int N, M;
        int[] arr;
        
        public long solve(DisjointSets ds) {
            ArrayList<Integer>[] costs = new ArrayList[N];
            
            for (int i = 0; i < N; i++) {
                int pi = ds.find(i);
                if ( costs[pi] == null ) costs[pi] = new ArrayList<>();
                costs[pi].add( arr[i] );
            }
            
            ArrayList<Integer> leftover = new ArrayList<>();
            long sum = 0L;
            for (int i = 0; i < N; i++) {
                if (costs[i] != null) {
                    Collections.sort(costs[i]);
                    sum += costs[i].get(0);
                    leftover.addAll( costs[i].subList(1, costs[i].size()) );
                }
            }
            Collections.sort(leftover);
            
            for (int i = M; i < 2*(N-M-1); i++) {
                sum += leftover.get(i-M);
            }
            
            return sum;
        }
        
        public void print(ArrayList<Integer>[] costs) {
            int k = 0;
            for (ArrayList<Integer> c : costs) {
                p(k + " ");
                pl(c);
                k++;
            }    
        }
        
        public void main(FastScanner in, PrintWriter out) {
            N = in.nextInt();
            M = in.nextInt();
            if (M > 0) {
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
                
            } else {
                if (N == 1) out.println(0);
                else out.println("Impossible");
            }
            
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
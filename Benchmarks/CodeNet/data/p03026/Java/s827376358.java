import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<Integer>[] graph;
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int N = scanner.nextInt();
        graph = new ArrayList[N];
        int[] ans = new int[N];
        Pair[] edges = new Pair[N-1];
        for(int i = 0; i < N; i++) graph[i] = new ArrayList<>();
        for(int i = 1; i < N; i++) {
            int a = scanner.nextInt()-1;
            int b = scanner.nextInt()-1;
            graph[a].add(b);
            graph[b].add(a);
            edges[i-1] = new Pair(a, b);
        }
        int[] costs =new int[N];
        for(int i = 0; i < N; i++) {
            costs[i] = scanner.nextInt();
        }
        Arrays.sort(costs);
        PriorityQueue<Pair> queue = new PriorityQueue<>();
        int max = -1;
        int ind = -1;
        for(int i = 0; i < N; i++) {
            if (graph[i].size() > max) {
                max = graph[i].size();
                ind = i;
            }
        }
        queue.offer(new Pair(max, ind));
        int p = N-1;
        while(!queue.isEmpty()) {
            Pair cur = queue.poll();
            ans[cur.b] = costs[p--];
            for(int edge: graph[cur.b]) {
                if (ans[edge] == 0) queue.offer(new Pair(graph[edge].size(), edge));
            }
        }
        long sum = 0;
        for(Pair pair: edges) {
            sum += Math.min(ans[pair.a], ans[pair.b]);
        }
        out.println(sum);
        for(int i = 0; i < N; i++) {
            if (i > 0) out.print(" ");
            out.print(ans[i]);
        }
        out.flush();
    }
    
    public static class Pair implements Comparable<Pair> {
        int a, b;
        public Pair(int aa, int bb) {
            a = aa; b = bb;
        }
        public int compareTo(Pair o) {
            if (a == o.a) return Integer.compare(b, o.b);
            return -Integer.compare(a, o.a);
        }
    }
    
    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        
        public FastScanner(Reader in) {
            br = new BufferedReader(in);
        }
        
        public FastScanner() {
            this(new InputStreamReader(System.in));
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
        
        String readNextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
        
        int[] readIntArray(int n) {
            int[] a = new int[n];
            for (int idx = 0; idx < n; idx++) {
                a[idx] = nextInt();
            }
            return a;
        }
    }
}

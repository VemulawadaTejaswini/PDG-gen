import java.io.*;
import java.io.IOException;
import java.util.*;

import javax.management.InvalidAttributeValueException;

@SuppressWarnings({"rawtypes", "unchecked"})
class Main {
    final static int INF = 1 << 28;
    final static long LNF = 1L << 60;
    final static double EPS = 1e-9;
    final static double GOLDEN_RATIO = (1.0 + Math.sqrt(5)) / 2.0;

    static final long MOD = 1_000_000_007;

    public static void main(String[] args) throws Exception {
        final MyScanner sc = new MyScanner();
        int n;
        n = sc.nextInt();
        int m;
        m = sc.nextInt();
        int s;
        s = sc.nextInt()-1;
        int t;
        t = sc.nextInt()-1;
        int[] u = new int[(int)(m)];
        int[] v = new int[(int)(m)];
        long[] a = new long[(int)(m)];
        long[] b = new long[(int)(m)];
        for(int i = 0 ; i < m ; i++){
                u[i] = sc.nextInt()-1;
                v[i] = sc.nextInt()-1;
                a[i] = sc.nextLong();
                b[i] = sc.nextLong();
        }
        solve(n, m, s, t, u, v, a, b);
    }

    static void solve(int n, int m, int s, int t, int[] u, int[] v, long[] a, long[] b){
        int N = (int)n;
        int M = (int)m;

        Graph ga = new Graph(N);
        ga.addEdges(u, v, a);
        ga.addEdges(v, u, a);
        long[] amap = ga.dijekstra(s);

        Graph gb = new Graph(N);
        gb.addEdges(u, v, b);
        gb.addEdges(v, u, b);
        long[] bmap = gb.dijekstra(t);

        long ans = 1000000000000000l;

        long[] anss = new long[(int)N];
        for (int i = 0; i < N; i++) {
            anss[i] = ans - amap[i] - bmap[i];
        }

        for (int i = N-2; i >= 0; i--) {
            anss[i] = Math.max(anss[i], anss[i+1]);
        }

        for (int i = 0; i < anss.length; i++) {
            System.out.println(anss[i]);
        }
    
    }

    static class Graph {
        private Node[] nodes;

        private class Node {
            ArrayList<Pair<Node, Long>> connectedNodes = new ArrayList<>();
            int index;
            boolean fixed = false;
            Node(int index){
                this.index = index;
            }
        }

        private class Pair<F,S> {
            F first;
            S second;
            Pair(F first, S second) {
                this.first = first;
                this.second = second;
            }
        }

        public Graph(long N) {
            this.nodes = new Node[(int)N];
            for (int i = 0; i < N; i++) {
                nodes[i] = new Node(i);
            }
        }

        public void addEdges(int[] from, int[] to) {
            long[] w = new long[from.length]; 
            this.addEdges(from, to, w);
        }

        public void addEdges(int[] from, int[] to, long[] w) {
            for (int i = 0; i < from.length; i++) {
                this.nodes[from[i]]
                .connectedNodes
                .add(new Pair<Node, Long>(this.nodes[to[i]], w[i]));
            }
        }
        
        public long[] dijekstra(int from) {
            for (Node node : nodes) {
                node.fixed = false;
            }

            long[] distmap = new long[this.nodes.length];
            Arrays.fill(distmap, INF);

            PriorityQueue<Pair<Node, Long>> Q = new PriorityQueue<>((Pair<Node, Long> p1, Pair<Node, Long> p2) -> Long.compare(p1.second, p2.second));
            Q.add(new Pair(this.nodes[from], (long)0));

            while(!Q.isEmpty()) {
                Pair<Node, Long> p = Q.poll();
                if(p.first.fixed) continue;
                distmap[p.first.index] = p.second;
                p.first.fixed = true;

                for (Pair<Node, Long> edge: p.first.connectedNodes) {
                    Q.add(new Pair(edge.first, edge.second + p.second));
                }
            }
            return distmap;
        }

    }

    static class MyScanner {
 
        BufferedReader br;
        StringTokenizer st;
 
        MyScanner(FileReader fileReader) {
            br = new BufferedReader(fileReader);
        }
 
        MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String nn() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        String next() {
            String ans = "";
            try {
                ans = br.readLine();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            return ans;
        }
 
        char nextChar() {
            return nn().charAt(0);
        }
 
        int nextInt() {
            return Integer.parseInt(nn());
        }
 
        long nextLong() {
            return Long.parseLong(nn());
        }
 
        double nextDouble() {
            return Double.parseDouble(nn());
        }
 
        Integer[] niArr0(int n) {
            Integer[] ar = new Integer[n];
            for (int i = 0; i < n; i++) {
                ar[i] = nextInt();
            }
            return ar;
        }
 
        Integer[] niArr1(int n) {
            Integer[] ar = new Integer[n + 1];
            for (int i = 1; i <= n; i++) {
                ar[i] = nextInt();
            }
            return ar;
        }
 
        Long[] nlArr0(int n) {
            Long[] ar = new Long[n];
            for (int i = 0; i < n; i++) {
                ar[i] = nextLong();
            }
            return ar;
        }
 
        Long[] nlArr1(int n) {
            Long[] ar = new Long[n + 1];
            for (int i = 1; i <= n; i++) {
                ar[i] = nextLong();
            }
            return ar;
        }
    }

}

import java.io.*;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

@SuppressWarnings({ "rawtypes", "unchecked" })
class Main {
    final static int INF = 1 << 28;
    final static long LNF = 1L << 60;
    final static double EPS = 1e-9;
    final static double GOLDEN_RATIO = (1.0 + Math.sqrt(5)) / 2.0;

    static final long MOD = 1_000_000_007;

    public static void main(String[] args) throws Exception {
        final MyScanner sc = new MyScanner();
        long N;
        N = sc.nextLong();
        long Q;
        Q = sc.nextLong();
        int[] a = new int[(int) (N - 1)];
        int[] b = new int[(int) (N - 1)];
        for (int i = 0; i < N - 1; i++) {
            a[i] = sc.nextInt()-1;
            b[i] = sc.nextInt()-1;
        }
        int[] p = new int[(int) (Q)];
        long[] x = new long[(int) (Q)];
        for (int i = 0; i < Q; i++) {
            p[i] = sc.nextInt()-1;
            x[i] = sc.nextLong();
        }
        solve(N, Q, a, b, p, x);
    }

    static void solve(long N, long Q,int[] a,int[] b,int [] p, long[] x) {
        Tree tree = new Tree(N);
        for (int i = 0; i < Q; i++) {
            tree.nodes[p[i]].value += x[i];
        }

        tree.addEdges(a, b);
        tree.addEdges(b, a);

        long[] ans = tree.count();
        String ans1 = Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining(" "));
        System.out.println(ans1);
    }

    static public class Tree {
        final static int INF = 1 << 28;
        private Node[] nodes;
    
        public Tree(long N) {
            this.nodes = new Node[(int)N];
            for (int i = 0; i < N; i++) {
                nodes[i] = new Node(i);
            }
        }
        
        public long[] count() {
            long[] ans = new long[this.nodes.length];
            Arrays.fill(ans, 0);

            final class dfs {
                void f(Node n, long count) {
                    if(n.flag) return;
                    ans[n.index] = count + n.value;
                    n.flag = true;

                    for (Pair<Node, Long> pi: n.connectedNodes) {
                        f(pi.first, count + n.value);
                    }
                }
            }
    
            new dfs().f(this.nodes[0], 0L);
            return ans;
        }
    
        public void addEdges(int[] from, int[] to) {
            long[] w = new long[from.length]; 
            Arrays.fill(w, 1);
            this.addEdges(from, to, w);
        }
    
        public void addEdges(int[] from, int[] to, long[] w) {
            for (int i = 0; i < from.length; i++) {
                this.nodes[from[i]]
                .connectedNodes
                .add(new Pair<Node, Long>(this.nodes[to[i]], w[i]));
            }
        }
    
        private class Node {
            ArrayList<Pair<Node, Long>> connectedNodes = new ArrayList<>();
            int index;
            boolean flag = false;
            long value = 0;
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

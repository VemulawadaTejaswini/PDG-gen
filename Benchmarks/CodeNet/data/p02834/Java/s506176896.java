import java.io.*;
import java.io.IOException;
import java.util.*;

@SuppressWarnings({"rawtypes", "unchecked"})
class Main {
    final static int INF = 1 << 28;
    final static long LNF = 1L << 60;
    final static double EPS = 1e-9;
    final static double GOLDEN_RATIO = (1.0 + Math.sqrt(5)) / 2.0;

    static final long MOD = 1_000_000_007;

    public static void main(String[] args) throws Exception {
        final MyScanner sc = new MyScanner();
        int N;
        N = sc.nextInt();
        int u;
        u = sc.nextInt()-1;
        int v;
        v = sc.nextInt()-1;
        int[] A = new int[(int)(N-1)];
        int[] B = new int[(int)(N-1)];
        for(int i = 0 ; i < N-1 ; i++){
                A[i] = sc.nextInt() - 1;
                B[i] = sc.nextInt() - 1;
        }
        solve(N, u, v, A, B);
    }

    static void solve(int N, int u, int v, int[] A, int[] B){
        Node[] nodes = new Node[(int)N];
        for (int i = 0; i < N; i++) {
            nodes[i] = new Node(i);
        }
        HashMap<Integer, ArrayList<Integer>> hashmap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            hashmap.put(i, new ArrayList<Integer>());
        }
        for (int i = 0; i < A.length; i++) {
            hashmap.get(A[i]).add(B[i]);
            hashmap.get(B[i]).add(A[i]);
        }

        final class dfs {
            void f(int n) {
                nodes[n].connected = true;
                for (int i: hashmap.get(n)) {
                    if(nodes[i].connected) continue;
                    nodes[i].connected = true;
                    nodes[i].parent = nodes[n];
                    nodes[n].connectedNodes.add(nodes[i]);
                    f(i);
                }
            }
            void culdpt(Node p, int depth) {
                p.depth = depth;
                for (Node node : p.connectedNodes) {
                    culdpt(node, depth+1);
                }
            }
            int deepest(Node p) {
                if(p.connectedNodes.size() == 0) {
                    p.deepestc = p.depth;
                    return p.deepestc;
                }

                int depst = -1;
                for (Node node : p.connectedNodes) {
                    depst = Math.max(depst, deepest(node));
                }
                p.deepestc = depst;

                return p.deepestc;
            }
        }

        new dfs().f(v);
        new dfs().culdpt(nodes[v], 0);
        new dfs().deepest(nodes[v]);

        int deepest = nodes[u].depth;
        Node curnode = nodes[u];
        for (int i = 0; i < Math.ceil(nodes[u].depth / 2.0) - 1; i++) {
            curnode = curnode.parent;
            deepest = Math.max(deepest, curnode.deepestc);
        }
        System.out.println(deepest-1);
    }


    static class Node {
        Node parent;
        ArrayList<Node> connectedNodes = new ArrayList<>();
        int index;
        int depth = -1;
        int deepestc = -1;
        public boolean connected = false;
        Node(int index){
            this.index = index;
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

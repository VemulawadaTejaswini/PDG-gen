
import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<Integer>[]adj;
    static int[]vals,ans;
    static void dfs(int u,int p,SegmentTree tree){
        int pre=tree.query(vals[u],vals[u]);
        tree.update_point(vals[u],tree.query(1,vals[u]-1)+1);

        ans[u]=tree.sTree[1];
        for (int v:adj[u]){
            if (v!=p)
                dfs(v,u,tree);
        }
        tree.update_point(vals[u],pre);
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int sz=1;
        while (sz<n)sz*=2;
        SegmentTree tree = new SegmentTree(sz);
        adj= new ArrayList[n];
        for (int i =0;i<n;i++)adj[i]=new ArrayList<>();
        vals= new int[n];
        TreeSet<Integer>ts = new TreeSet<>();
        for (int i =0;i<n;i++){
            int x = sc.nextInt();
            vals[i]=x;
            ts.add(x);
        }
        HashMap<Integer,Integer>comp= new HashMap<>();
        while (!ts.isEmpty())comp.put(ts.pollFirst(),comp.size()+1);
        for (int i =0;i<n;i++)vals[i]=comp.get(vals[i]);
        for (int i =1;i<n;i++){
            int u = sc.nextInt()-1;
            int v = sc.nextInt()-1;
            adj[u].add(v);
            adj[v].add(u);
        }
        ans= new int[n];
        dfs(0,-1,tree);
        for (int x:ans)
            pw.println(x);
        pw.close();

    }
    static class SegmentTree {        // 1-based DS, OOP

        int N;            //the number of elements in the array as a power of 2 (i.e. after padding)
        int[] sTree;

        SegmentTree(int sz) {
            N = sz;
            sTree = new int[N << 1];        //no. of nodes = 2*N - 1, we add one to cross out index zero
        }

        void update_point(int index, int val)            // O(log n)
        {
            index += N - 1;
            sTree[index] = val;
            while (index > 1) {
                index >>= 1;
                sTree[index] = Math.max(sTree[index << 1] , sTree[index << 1 | 1]);
            }
        }


        int query(int i, int j) {
            return query(1, 1, N, i, j);
        }

        int query(int node, int b, int e, int i, int j)    // O(log n)
        {
            if (i > e || j < b)
                return 0;
            if (b >= i && e <= j)
                return sTree[node];
            int mid = b + e >> 1;
            int q1 = query(node << 1, b, mid, i, j);
            int q2 = query(node << 1 | 1, mid + 1, e, i, j);
            return Math.max(q1 , q2);

        }
    }
        static class Scanner {
        BufferedReader br;
        StringTokenizer st;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public int[] nextIntArr(int n) throws IOException {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(next());
            }
            return arr;
        }

    }

}

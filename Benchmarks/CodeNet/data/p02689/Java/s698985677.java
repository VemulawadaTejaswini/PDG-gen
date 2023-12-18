import java.io. *;
import java.lang.reflect.Array;
import java.util.*;
import static java.lang.Math.*;
public class Main {

    static int visited[];
    static ArrayList<ArrayList<Integer>> adjlist;
    static class edge implements  Comparator<edge>{
        int dest;
        int cost;

        public edge(int dest, int cost) {
            this.dest = dest;
            this.cost = cost;
        }

        @Override
        public int compare(edge o1, edge o2) {
            return o1.cost-o2.cost;
        }
    }

    static int dist[];
    static int nodesinSubtree[];
    static class Graph{
        int V;
        ArrayList<ArrayList<edge>> adj;
        PriorityQueue<edge> pq;

        public Graph(int V){
            this.V = V;
            adj = new ArrayList<>(V);
            pq = new PriorityQueue<>(V,new edge(-1,-1));
            dist = new int[V];
            nodesinSubtree = new int[V];
            for(int i=0; i<V; i++){
                dist[i] = Integer.MAX_VALUE;
                adj.add(i,new ArrayList<>());
            }
        }

        void addedge(int u, int v, int w ){
            adj.get(u).add(new edge(v,w));
            adj.get(v).add(new edge(u,w));
        }

        void rDfs(int src, int e){
            //nodes in a subtree
            nodesinSubtree[src] = 1;
            for(int i=0; i<adj.get(src).size(); i++){
                if(adj.get(src).get(i).dest==e){
                    continue;
                }
                rDfs(adj.get(src).get(i).dest,src);
                nodesinSubtree[src]+=nodesinSubtree[adj.get(src).get(i).dest];
            }
        }

        void DFS(int src){
            Stack<edge> st = new Stack<>();
            boolean visited[] = new boolean[V];
            visited[src] = true;
            st.push(new edge(src,0));
            dist[src] = 0;
            while (!st.empty()){
                int u = st.peek().dest;
                st.pop();
                for(int i=0; i<adj.get(u).size(); i++){
                    if(!visited[adj.get(u).get(i).dest]){
                        dist[adj.get(u).get(i).dest] = dist[u]+1;
                        visited[adj.get(u).get(i).dest] = true;
                        st.push(new edge(adj.get(u).get(i).dest,1));
                    }
                }
            }
        }
    }


/*
        void dijkstra(int src){
            for(int i=0; i<V; i++){
                dist[i] = Integer.MAX_VALUE;
            }
            dist[src] = 0;
            pq.add(new edge(src,0));
            while (!pq.isEmpty()){
                int u = pq.poll().dest;
                for(int i=0; i<adj.get(u).size(); i++){
                    int v = adj.get(u).get(i).dest;
                    int w = adj.get(u).get(i).cost;
                    if(dist[u]+w<=dist[v]){
                        dist[v] = dist[u] + w;
                        pq.add(new edge(v,dist[v]));
                    }
                }
            }

        }


    }

 */



    static  int I[];
    static  int L[];
    static void LIS(int n, int arr[]){
        I = new int[n+1];
        L = new int[n];
        I[0] = Integer.MIN_VALUE;
        for(int i=1;i<=n; i++){
            I[i] = Integer.MAX_VALUE;
        }
        int lisLength = 1;

        for(int i=n-1; i>=0; i--) {
            int low = 1;
            int high = lisLength;
            int mid = 0;
            while (low < high) {
                mid = (low + high) >> 1;
                if (I[mid] <= arr[i]) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }
            I[high] = arr[i];
            L[i] = high;
            if(lisLength<=high){
                lisLength++;
            }
        }
    }

    public static long gcd(long a, long b)
    {
        if (a == 0)
            return b;

        return gcd(b%a, a);
    }

    public static long lcm(long a, long b)
    {
        return (a*b)/gcd(a, b);
    }

    static long nCr(long n, long r)
    {
        return fact(n) / (fact(r) * fact(n - r));
    }

    // Returns factorial of n
    static long fact(long n)
    {
        long res = 1;
        for (int i = 2; i <= n; i++)
            res = (res * i)%MOD;
        return res;
    }


    static int MOD = 1000000007;
    static int power(int x, int y, int p)
    {

        // Initialize result
        int res = 1;

        // Update x if it is more than or
        // equal to p
        x = x % p;

        while (y > 0)
        {

            // If y is odd, multiply x
            // with result
            if (y % 2 == 1)
                res = (res * x) % p;

            // y must be even now
            y = y >> 1; // y = y/2
            x = (x * x) % p;
        }

        return res;
    }

    // Returns n^(-1) mod p
    static int modInverse(int n, int p)
    {
        return power(n, p-2, p);
    }

    static int nCrModPFermat(int n, int r,
                             int p)
    {

        if (r == 0)
            return 1;


        int[] fac = new int[n+1];
        fac[0] = 1;

        for (int i = 1 ;i <= n; i++)
            fac[i] = fac[i-1] * i % p;

        return (fac[n]* modInverse(fac[r], p)
                % p * modInverse(fac[n-r], p)
                % p) % p;
    }
    public static long log2(long N)
    {

        long result = (long)(Math.log(N) / Math.log(2));

        return result;
    }
    static class team implements Comparator<team>{
        long id;
        int m;

        public team(long id, int m) {
            this.id = id;
            this.m = m;
        }

        @Override
        public int compare(team o1, team o2) {
            return o2.m-o1.m;
        }
    }


    public static void main(String[] args) {
        FastReader sc = new FastReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int h[] = new int[n];
        boolean good[] = new boolean[n];
        for(int i=0; i<n; i++){
            h[i] = sc.nextInt();
        }
        for(int i=0; i<m; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            if(h[a]==h[b]){
                good[a] = true;
                good[b] = true;
            }else if(h[a]>h[b]){
                good[b] = true;
            }else{
                good[a] = true;
            }
        }
        int count = 0;
        for(int i=0; i<n; i++){
            if(!good[i]){
                count++;
            }
        }
        pw.println(count);

        pw.close();

    }

    static void debug(Object...obj) {
        System.err.println(Arrays.deepToString(obj));
    }

    static class FastReader {
        InputStream is;
        private byte[] inbuf = new byte[1024];
        private int lenbuf = 0, ptrbuf = 0;

        public FastReader(InputStream is) {
            this.is = is;
        }

        public int readByte(){
            if(lenbuf == -1)throw new InputMismatchException();
            if(ptrbuf >= lenbuf){
                ptrbuf = 0;
                try {
                    lenbuf = is.read(inbuf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if(lenbuf <= 0)
                    return -1;
            }
            return inbuf[ptrbuf++];
        }
        public boolean isSpaceChar(int c) {
            return !(c >= 33 && c <= 126);
        }
        public int skip() {
            int b;
            while ((b = readByte()) != -1 && isSpaceChar(b)) ;
            return b;
        }
        public String next(){
            int b = skip();
            StringBuilder sb = new StringBuilder();
            while(!(isSpaceChar(b))) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }
        public String nextLine(){
            int b = readByte();
            StringBuilder sb = new StringBuilder();
            while(b != '\n' || b != '\r'){
                sb.appendCodePoint(b);
            }
            return sb.toString();
        }
        public int nextInt() {
            int num = 0, b;
            boolean minus = false;
            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            while (true) {
                if (b >= '0' && b <= '9') {
                    num = (num << 3) + (num << 1) + (b - '0');
                } else {
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }
        public long nextLong() {
            long num = 0;
            int b;
            boolean minus = false;
            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            while (true) {
                if (b >= '0' && b <= '9') {
                    num = (num << 3) + (num << 1) + (b - '0');
                } else {
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }
        public double nextDouble() {
            return Double.parseDouble(next());
        }
        public char[] next(int n){
            char[] buf = new char[n];
            int b = skip(), p = 0;
            while (p < n && !(isSpaceChar(b))) {
                buf[p++] = (char) b;
                b = readByte();
            }
            return n == p ? buf : Arrays.copyOf(buf, p);
        }
        public char nextChar () {
            return (char) skip();
        }
    }
}

import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

public class B {

    String fileName = "";
    //////////////////////    SOLUTION   SOLUTION  SOLUTION    //////////////////////////////
    long INF = Long.MAX_VALUE / 1000;
    long MODULO = 998244353 ;
    int[][] steps = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    private final static Random rnd = new Random();
    double eps = 1e-1;

    class Pair implements Comparable<Pair>{
        int val, ind;

        public Pair(int val, int ind) {
            this.val = val;
            this.ind = ind;
        }

        @Override
        public int compareTo(Pair o) {
            return -Integer.compare(this.val, o.val);
        }
    }

    ArrayList<Integer>[] graph;
    boolean[] used;
    int[] dist;
    boolean flag = true;
    int[] count = new int[2];
    long[] pows;
    int l = 20;
    void solve() throws IOException {
        int d = readInt();

        if (d == 25) {
            out.println("Christmas");
        }else if (d == 24) {
            out.println("Christmas Eve");
        }else if (d == 23) {
            out.println("Christmas Eve Eve");
        }else if (d == 22) {
            out.println("Christmas Eve");
        }
    }

    void dfs(int from){
        used[from] = true;
        count[dist[from] % 2]++;
        for (int to: graph[from]){
            if (dist[to] %2 == dist[from] % 2) flag = false;
            if (!used[to]) dfs(to);
        }
    }
    class SegmentTree{
        long[] t;
        int n;
        SegmentTree(long[] arr, int n){
            t = new long[n*4];
            build(arr, 1, 1, n);
        }
        void build(long[] arr, int v, int tl , int tr){
            if (tl == tr) {
                t[v] = arr[tl];
                return;
            }
            int tm = (tl + tr) / 2;
            build(arr, 2 * v, tl, tm);
            build(arr, 2 * v + 1, tm + 1, tr);
            t[v] = Math.max(t[2*v], t[2*v + 1]);
        }

        long get(int v, int tl , int tr, int l , int r){
            if (l > r) return -1;
            if (tl == l && tr == r) return t[v];
            int tm = (tl + tr) / 2;
            long val1 = get(2 * v, tl, tm, l, Math.min(tm, r));
            long val2 = get(2 * v + 1, tm + 1, tr, Math.max(tm + 1, l), r);
            return Math.max(val1, val2);
        }

    }
    void brute(){
        int n = 10;
        int[] arr = new int[n];
        int[] b = new int[n];
        for (int it=0; it < 100; ++it){
            for (int i=0; i< n; ++i) {
                arr[i] = rnd.nextInt(100);
                b[i] = arr[i];
            }
            Arrays.sort(b);
            for (int k=0; k<n; ++k){
                int ans = orderStatistic(arr, k, 0, n-1);
                if (ans != b[k]) {
                    out.println("HACK!!!");
                    out.println(n +" " + (k+1));
                    for (int i: arr) out.print(i +" ");
                    out.println();
                    out.println(b[k] + " " + ans);
                }
            }
        }
    }
    int orderStatistic(int[] arr, int k, int l , int r){
        int part = partition(arr, l , r);
        if (part == k) return arr[part];
        if (part > k) return orderStatistic(arr, k, l, part);
        return orderStatistic(arr, k, part, r);
    }

    int partition(int[] arr, int l, int r){
        int i = l;
        int j = r;
        if (i == j) return i;
        int pivot = arr[l + rnd.nextInt(r - l)];
        while (true){
            while (arr[i] < pivot) i++;
            while (arr[j] > pivot) j--;
            if (j <= i) return j;
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            j--; i++;
        }
    }
    long binPow(long a, long b, long m) {
        if (b == 0) {
            return 1;
        }
        if (b % 2 == 1) {
            return ((a % m) * (binPow(a, b - 1, m) % m)) % m;
        } else {
            long c = binPow(a, b / 2, m);
            return (c * c) % m;
        }

    }

    class Fenwik {
        int[] t;
        int n;
        Fenwik(int n){
            t = new int[n];
            this.n = n;
        }

        void inc(int r, int delta){
            for (; r < n; r = r | (r + 1)) t[r] += delta;
        }
        int getSum(int r){
            int res = 0;
            for (; r >=0; r = (r & (r + 1) ) - 1) res += t[r];
            return res;
        }
    }
    boolean isPrime(int n){
        for (int i=2; i*i<=n; ++i){
            if (n%i==0) return false;
        }
        return true;
    }



    class Number implements Comparable<Number>{
        int x, cost;
        Number(int x, int cost){
            this.x = x;
            this.cost = cost;
        }

        @Override
        public int compareTo(Number o) {
            return Integer.compare(this.cost, o.cost);
        }
    }



    ///////////////////////////////////////////////////////////////////////////////////////////


    class SparseTable{
        int[][] rmq;
        int[] logTable;
        int n;
        SparseTable(int[] a){
            n = a.length;
            logTable = new int[n+1];
            for(int i = 2; i <= n; ++i){
                logTable[i] = logTable[i >> 1] + 1;
            }
            rmq = new int[logTable[n] + 1][n];
            for(int i=0; i<n; ++i){
                rmq[0][i] = a[i];
            }

            for(int k=1; (1 << k) < n; ++k){
                for(int i=0; i + (1 << k) <= n; ++i){
                    int max1 = rmq[k - 1][i];
                    int max2 = rmq[k-1][i + (1 << (k-1))];
                    rmq[k][i] = Math.max(max1, max2);
                }
            }
        }

        int max(int l, int r){
            int k = logTable[r - l];
            int max1 = rmq[k][l];
            int max2 = rmq[k][r - (1 << k) + 1];
            return Math.max(max1, max2);
        }
    }
    long checkBit(long mask, int bit){
        return (mask >> bit) & 1;
    }

    static int checkBit(int mask, int bit) {
        return (mask >> bit) & 1;
    }
    boolean isLower(char c){
        return c >= 'a' && c <= 'z';
    }
    class Edge{
        int to, dist;

        public Edge(int to, int dist) {
            this.to = to;
            this.dist = dist;
        }
    }
    class Vertex implements Comparable<Vertex>{
        int from, count;

        public Vertex(int from, int count) {
            this.from = from;
            this.count = count;
        }

        @Override
        public int compareTo(Vertex o) {
            return Long.compare(this.count, o.count);
        }
    }

    ////////////////////////////////////////////////////////////



    int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a%b);
    }
    long gcd(long a, long b){
        return b == 0 ? a : gcd(b, a%b);
    }
    double binPow(double a, int pow){
        if (pow == 0) return 1;
        if (pow % 2 == 1) {
            return a * binPow(a, pow - 1);
        } else {
            double c = binPow(a, pow / 2);
            return c * c;
        }
    }

    int minInt(int... values) {
        int min = Integer.MAX_VALUE;
        for (int value : values) min = Math.min(min, value);
        return min;
    }

    int maxInt(int... values) {
        int max = Integer.MIN_VALUE;
        for (int value : values) max = Math.max(max, value);
        return max;
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO Auto-generated method stub
        new B().run();
    }

    void run() throws NumberFormatException, IOException {
        solve();
        out.close();
    };

    BufferedReader in;
    PrintWriter out;

    StringTokenizer tok;
    String delim = " ";

    B() throws FileNotFoundException {
        try {
            in = new BufferedReader(new FileReader("input.txt"));
            out = new PrintWriter("output.txt");
        } catch (Exception e) {
            if (fileName.isEmpty()) {
                in = new BufferedReader(new InputStreamReader(System.in));
                out = new PrintWriter(System.out);
            } else {
                in = new BufferedReader(new FileReader(fileName + ".in"));
                out = new PrintWriter(fileName + ".out");
            }

        }
        tok = new StringTokenizer("");
    }

    String readLine() throws IOException {
        return in.readLine();
    }

    String readString() throws IOException {
        while (!tok.hasMoreTokens()) {
            String nextLine = readLine();
            if (null == nextLine) {
                return null;
            }

            tok = new StringTokenizer(nextLine);
        }
        return tok.nextToken();
    }

    int readInt() throws NumberFormatException, IOException {
        return Integer.parseInt(readString());
    }
    byte readByte() throws NumberFormatException, IOException {
        return Byte.parseByte(readString());
    }
    int[] readIntArray (int n) throws NumberFormatException, IOException {
        int[] a = new int[n];
        for(int i=0; i<n; ++i){
            a[i] = readInt();
        }
        return a;
    }
    int[] readIntArrayWithDecrease (int n) throws NumberFormatException, IOException {
        int[] a = new int[n];
        for(int i=0; i<n; ++i){
            a[i] = readInt() - 1;
        }
        return a;
    }
    Integer[] readIntegerArray (int n) throws NumberFormatException, IOException {
        Integer[] a = new Integer[n];
        for(int i=0; i<n; ++i){
            a[i] = readInt();
        }
        return a;
    }

    long readLong() throws NumberFormatException, IOException {
        return Long.parseLong(readString());
    }

    double readDouble() throws NumberFormatException, IOException {
        return Double.parseDouble(readString());
    }
}
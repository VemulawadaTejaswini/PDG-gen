import java.io.*;
import java.math.*;
import java.util.*;

class Main {

    private static final PrintWriter out = new PrintWriter(System.out);
    private static final Scanner scanner = new Scanner(System.in);
    private static int[] dx = {1, 0, -1, 0, 1, 1, -1, -1};
    private static int[] dy = {0, 1, 0, -1, 1, -1, 1, -1};
    private static int INF = 0x3f3f3f3f;

    private static List<Edge> es;
    private static UnionFind unionFind;

    public static void main(String[] args) {
        // From IntelliJ IDEA

        int n = fgetInt();
        int m = fgetInt();

        unionFind = new UnionFind(n+2);
        es = new ArrayList<>();

        for ( int i = 0; i < m; i++ ) {
            int a = fgetInt();
            int b = fgetInt();
            int x = fgetInt();
            es.add(new Edge(a, b, x));
        }

        Collections.sort(es);

        int res = m;
        for ( Edge edge : es ) {
            if ( !unionFind.isUnited(edge.u, edge.v) ) {
                unionFind.unite(edge.u, edge.v);
                res--;
            }
        }

        println(res);

        suomi();
    }

    private static boolean isMovable( int x, int y, int w, int h ) {
        return ( x >= 0 && y >= 0 && x < w && y < h );
    }
    private static String fgetStr(){
        return FastScanner.next();
    }
    private static String fgetLine(){
        return FastScanner.nextLine();
    }
    private static char fgetChar(){
        return fgetStr().charAt(0);
    }
    private static int fgetInt(){
        return FastScanner.nextInt();
    }
    private static long fgetLong(){
        return FastScanner.nextLong();
    }
    private static double fgetDouble(){
        return FastScanner.nextDouble();
    }
    private static BigInteger fgetBig(){
        return new BigInteger(fgetStr());
    }
    private static String reverseStr(String str){
        return new StringBuffer(str).reverse().toString();
    }
    private static void println(Object a){
        out.println(a);
    }
    private static void print(Object a){
        out.print(a);
    }
    private static void printf(String string, Object... args) {
        out.printf(string, args);
    }
    private static void suomi(){
        out.flush();
    }
    private static long pow ( long x, long n ) {
        final long MOD = 1000000007;
        long ans = 1;
        while ( n > 0 ) {
            if ( ( n & 1 ) == 1 ) {
                ans = (ans * x) % MOD;
            }
            x = ( x * x ) % MOD;
            n >>= 1;
        }
        return ans;
    }
    private static long gcd(long x, long y) {
        return x % y == 0 ? y : gcd(y, x % y);
    }
    private static long lcm(long x, long y) {
        return ( x / gcd(x, y) * y);
    }
}

class Edge implements Comparable<Edge> {

    int u;
    int v;
    int cost;

    public Edge(int u, int v, int cost) {
        this.u = u;
        this.v = v;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge edge) {
        return Integer.compare(this.cost, edge.cost);
    }
}

class FastScanner {

    private static final InputStream in = System.in;
    private static final byte[] buffer = new byte[1024];
    private static int ptr = 0;
    private static int bufferLength = 0;
    private static boolean hasNextByte() {
        if (ptr < bufferLength) {
            return true;
        }else{
            ptr = 0;
            try {
                bufferLength = in.read(buffer);
            } catch ( IOException e) {
                e.printStackTrace();
            }
            if (bufferLength <= 0) {
                return false;
            }
        }
        return true;
    }
    private static int readByte() {
        if (hasNextByte()) return buffer[ptr++];
        else return -1;
    }
    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }
    private static boolean hasNext() {
        while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        return hasNextByte();
    }
    static String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    static String nextLine() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b) || b == 32) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    static long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    static int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    static double nextDouble() {
        return Double.parseDouble(next());
    }
}

class Pair<F, S> implements Comparable<Pair<F, S>> {
    F first;
    S second;
    public Pair(F a, S b) {
        this.first = a;
        this.second = b;
    }

    @Override
    public int compareTo(Pair<F, S> pair) {
        int firstCmp = Objects.compare(this.first, pair.first, Comparator.comparing(Object::toString));
        if ( firstCmp == 0 ) {
            return Objects.compare(this.second, pair.second, Comparator.comparing(Object::toString));
        }
        return firstCmp;
    }


    public boolean equals(Pair<F, S> pair) {
        return this.first.equals(pair.first) && this.second.equals(pair.second);
    }

    public String toString() {
        return String.valueOf(first) + ", " + String.valueOf(second);
    }
}

class Vector2 implements Comparable<Vector2> {
    int x;
    int y;
    public Vector2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Vector2 vector2) {
        return this.y - vector2.y == 0 ? this.x - vector2.x : this.y - vector2.y;
    }

    public boolean equals(Vector2 vector2) {
        return this.y == vector2.y && this.x == vector2.x;
    }

    public String toString() {
        return "y: " + this.y + ", x: " + this.x;
    }
}

class UnionFind {
    protected int[] data;

    public UnionFind(int n) {
        data = new int[n+1];
        for (int i = 0; i < n; i++) {
            data[i] = -1;
        }
    }

    public boolean unite(int x, int y) {
        int rootX = getRoot(x);
        int rootY = getRoot(y);
        if ( rootX == rootY ) return false;
        if ( data[rootY] < data[rootX] ) {
            int tmp = rootX;
            rootX = rootY;
            rootY = tmp;
        }
        data[rootX] += data[rootY];
        data[rootY] = rootX;
        return true;
    }

    public int getRoot(int i) {
        return ( data[i] < 0 ) ? i : ( data[i] = getRoot(data[i]) );
    }

    public int getSize(int n) {
        return -data[getRoot(n)];
    }

    public boolean isUnited(int x, int y) {
        return getRoot(x) == getRoot(y);
    }
}
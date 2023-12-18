// template for atcode
import java.util.*;
import java.io.*;
import static java.lang.Math.*;
import java.util.stream.Collectors;

public class Main {

    private static final int MOD = (int)1e9 + 7; //998244353;
    // private static final long INF = (long)1e17;
    private static final int INF = (int)1e9;

    int N = 100000;
    List<Integer>[] adj;
    int cc;
    int[] id;
    int[] szx, szy;

    public Main(FastScanner in, PrintWriter out) {
        int n = in.nextInt();
        adj = new List[2 * N];
        for (int i = 0; i < adj.length; i++) adj[i] = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt() - 1;
            int y = in.nextInt() - 1 + N;;
            adj[x].add(y);
            adj[y].add(x);
        }
        cc = -1;
        id = new int[2 * N];
        Arrays.fill(id, -1);
        for (int i = 0; i < N; i++) {
            if (id[i] < 0 && !adj[i].isEmpty()) {
                cc++;
                dfs(i);
            }
        }

        szx = new int[cc + 1];
        szy = new int[cc + 1];
        for (int i = 0; i < id.length; i++) if (id[i] >= 0) {
            if (i < N) szx[id[i]]++;
            else szy[id[i]]++;
        }
        int[] sz = new int[cc + 1];
        for (int x = 0; x < N; x++) {
            for (int y : adj[x]) {
                sz[id[x]]++;
            }
        }
        long res = 0;
        for (int i = 0; i <= cc; i++) {
            res = 1L * szx[i] * szy[i] - sz[i];
        }
        out.println(res);
    }

    private void dfs(int v) {
        id[v] = cc;
        for (int w : adj[v]) {
            if (id[w] < 0) dfs(w);
        }
    }

    private int gcd(int a, int b) {
        while (true) {
            if (b == 0) return a;
            int tmp = a;
            a = b;
            b = tmp % b;
        }
    }

    private long gcd(long a, long b) {
        while (true) {
            if (b == 0) return a;
            long tmp = a;
            a = b;
            b = tmp % b;
        }
    }

    private long powm(long x, long p) {
        long res = 1;
        while (p > 0) {
            if (p % 2 == 1)
                res = res * x % MOD;
            x = x * x % MOD;
            p /= 2;
        }
        return res;
    }

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        // Scanner in = new Scanner(
                // new BufferedReader(new InputStreamReader(System.in)));
        FastScanner in = new FastScanner(System.in);

        Main sol = new Main(in, out);
        out.close();
    }
}

// Pair
class Pair<T extends Comparable<? super T>, U extends Comparable<? super U>> implements Comparable<Pair<T, U>> {
    T a;
    U b;
    Pair() { }
    Pair(T a, U b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() { return "("+a.toString()+", "+b.toString()+")"; }

    @Override
    public int hashCode() { return Objects.hash(a, b); }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;
        Pair that = (Pair) obj;
        if(this.a.getClass() != that.a.getClass()) return false;
        if(this.b.getClass() != that.b.getClass()) return false;
        if(!this.a.equals(that.a)) return false;
        if(!this.b.equals(that.b)) return false;
        return true;
    }

    @Override
    public int compareTo(Pair<T, U> that) {
        int c = (this.a).compareTo(that.a);
        if(c == 0) c = (this.b).compareTo(that.b);
        return c;
    }
}


class FastScanner{
    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;

    public FastScanner(InputStream stream)
    {
        this.stream = stream;
    }

    int read()
    {
        if (numChars == -1)
            throw new InputMismatchException();
        if (curChar >= numChars){
            curChar = 0;
            try{
                numChars = stream.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (numChars <= 0)
                return -1;
        }
        return buf[curChar++];
    }

    boolean isSpaceChar(int c)
    {
        return c==' '||c=='\n'||c=='\r'||c=='\t'||c==-1;
    }

    boolean isEndline(int c)
    {
        return c=='\n'||c=='\r'||c==-1;
    }

    int nextInt()
    {
        return Integer.parseInt(next());
    }

    long nextLong()
    {
        return Long.parseLong(next());
    }

    double nextDouble()
    {
        return Double.parseDouble(next());
    }

    String next(){
        int c = read();
        while (isSpaceChar(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do{
            res.appendCodePoint(c);
            c = read();
        }while(!isSpaceChar(c));
        return res.toString();
    }

    String nextLine(){
        int c = read();
        while (isEndline(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do{
            res.appendCodePoint(c);
            c = read();
        }while(!isEndline(c));
        return res.toString();
    }
}

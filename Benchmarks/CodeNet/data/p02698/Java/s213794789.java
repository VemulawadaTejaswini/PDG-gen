import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {

    private static final int MOD = 998244353;
    private int[] a;
    private List<Integer>[] adj;
    private int[] res;

    public Main(FastScanner in, PrintWriter out) {
        int N = in.nextInt();
        a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = in.nextInt();
        }
        adj = new List[N];
        for (int i = 0; i < N; i++) {
            adj[i] = new ArrayList();
        }
        for (int i = 0; i < N - 1; i++) {
            int u = in.nextInt() - 1;
            int v = in.nextInt() - 1;
            adj[u].add(v);
            adj[v].add(u);
        }

        res = new int[N];
        dfs(0, -1, new ArrayList<>());
        for (int x : res)
            out.println(x);
    }

    private void dfs(int u, int p, List<Integer> dp) {
        int i = Collections.binarySearch(dp, a[u]);
        if (i < 0) i = -(i + 1);
        int prev = -1;
        if (i == dp.size()) {
            dp.add(a[u]);
        } else {
            prev = dp.set(i, a[u]);
        }
        res[u] = dp.size();
        for (int v : adj[u]) {
            if (v == p) continue;
            dfs(v, u, dp);
        }
        if (prev == -1)
            dp.remove(i);
        else
            dp.set(i, prev);
    }

    private long gcd(long a, long b) {
        while (true) {
            if (b == 0) return a;
            long tmp = a;
            a = b;
            b = tmp % b;
        }
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

class BIT {
    private int[] a;

    BIT(int n) {
        a = new int[n + 1];
    }

    public void update(int i, int delta) {
        int n = a.length;
        while (i < n) {
            a[i] += delta;
            i += i & -i;
        }
    }

    public int query(int i) {
        int res = 0;
        while (i > 0) {
            res += a[i];
            i -= i & -i;
        }
        return res;
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

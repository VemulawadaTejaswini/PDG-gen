import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {

    private static final int MOD = (int)1e9 + 7; //998244353;
    private static final long INF = (long)1e15;

    int[] sz;
    int[] root;

    public Main(FastScanner in, PrintWriter out) {
        int N = in.nextInt();
        int M = in.nextInt();
        int K = in.nextInt();

        sz = new int[N];
        root = new int[N];
        for (int i = 0; i < N; i++) {
            root[i] = i;
            sz[i] = 1;
        }

        int[] friend = new int[N];
        for (int i = 0; i < M; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            friend[a]++;
            friend[b]++;
            union(a, b);
        }

        int[] block = new int[N];
        for (int i = 0; i < K; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
          	// only count if a b in the same group
            if (find(a) == find(b)) {
                block[a]++;
                block[b]++;
            }
        }

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < N; i++) {
            res.append(sz[find(i)] - friend[i] - block[i] - 1).append(' ');
        }
        out.println(res);
    }

    private int find(int a) {
        if (root[a] != a) root[a] = find(root[a]);
        return root[a];
    }

    private void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a == b) return;
        if (sz[a] < sz[b]) {
            root[a] = b;
            sz[b] += sz[a];
        } else {
            root[b] = a;
            sz[a] += sz[b];
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

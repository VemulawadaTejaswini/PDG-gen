import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {

    private static final int MOD = 998244353;

    public Main(FastScanner in, PrintWriter out) {
        int N = in.nextInt();
        int M = in.nextInt();
        int K = in.nextInt();

        // M * C(N-1, k) * (M - 1) ^(N - k - 1)
        // C(N-1,k) to split the row. Blocks on both side of the split have the
        // same color
        // The left most block can have M different colors
        // All other blocks left to the 1st split can have (M - 1) colors
        // The block to the right side of the 1st split can have 1 color -- the
        // same color as the block to the left of the split.

        long[] mp = new long[N]; // (M-1)^p
        mp[0] = 1;
        for (int i = 1; i < N; i++) {
            mp[i] = mp[i - 1] * (M - 1) % MOD;
        }

        long[] fact = new long[N];
        fact[0] = 1;
        for (int i = 1; i < N; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }

        long[] invfact = new long[N];
        invfact[0] = 1;
        for (int i = 1; i < N; i++) {
            invfact[i] = invfact[i - 1] * pow(i, MOD - 2) % MOD;
        }

        long res = 0;
        for (int k = 0; k <= K; k++) {
            long cnk = fact[N - 1] * invfact[k] % MOD * invfact[N - 1 - k] % MOD;
            long cur = cnk * M % MOD * mp[N - k - 1] % MOD;
            res += cur;
            res %= MOD;
        }
        out.println(res);
    }

    private int pow(int x, int p) {
        long res = 1, a = x;
        while (p > 0) {
            if (p % 2 == 1)
                res = res * a % MOD;

            a = a * a % MOD;
            p /= 2;
        }
        return (int)res;
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

import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {

    private static final int MOD = (int)1e9 + 7; //998244353;
    private static final long INF = (long)1e15;

    public Main(FastScanner in, PrintWriter out) {
        int N = in.nextInt();
        long K = in.nextLong();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) A[i] = in.nextLong();

        Arrays.sort(A);
        long lo = Math.min(A[0] * A[1], Math.min(A[N - 1] * A[N - 2], A[0] * A[N - 1]));
        long hi = Math.max(A[0] * A[1], Math.max(A[N - 1] * A[N - 2], A[0] * A[N - 1]));
        // out.println(Arrays.toString(A));
        // out.printf("%d, %d%n", lo, hi);
        while (lo < hi) {
            long mid = lo + (hi - lo) / 2;
            long x = count(A, mid);
            // out.printf("%d, %d, %d, %d%n", lo, mid, hi, x);
            if (x >= K) hi = mid;
            else lo = mid + 1;
        }
        out.println(lo);
    }

    private long count(long[] A, long n) {
        long res = 0;
        for (int i = 0; i < A.length; i++) {
            long x = A[i];
            if (x == 0) {
                if (n >= 0) res += A.length - 1;
            } else if (x > 0) {
                // x * y <= n -> y <= n / x
                long y = n / x;
                if (n < 0 && y <= 0 && n % x != 0) y--;
                int j = Arrays.binarySearch(A, y);
                if (j >= 0) {
                    res += j + 1;
                    if (i <= j) res--;
                } else {
                    j = -(j + 1);
                    res += j;
                    if (i < j) res--;
                }
            } else {
                // x < 0
                // x * y <= n -> y >= n / x
                long y = n / x;
                if (n < 0 && y >= 0 && n % x != 0) y++;
                int j = Arrays.binarySearch(A, y);
                if (j < 0) j = -(j + 1);
                res += A.length - j;
                if (i >= j) res--;
            }
            // if (n == 7) System.out.printf("count: x=%d, res=%d%n", x, res);
        }
        return res / 2;
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

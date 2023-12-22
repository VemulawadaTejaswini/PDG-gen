import java.util.*;
import java.io.*;

public class Main {

    private static final int MOD = (int)1e9 + 7;
    private long[] fact, invfact;

    public Main(FastScanner in, PrintWriter out, int test) {
        int N = in.nextInt();
        int M = in.nextInt();

        calcFactorial(M);

        long res = 0;
        for (int i = 0; i <= N; i++) {
            long cni = (fact[N] * invfact[i] % MOD) * invfact[N - i] % MOD;
            long pmi = fact[M] * invfact[M - i] % MOD;
            long p2 = fact[M - i] * invfact[M - N] % MOD;
            p2 = p2 * p2 % MOD;
            long cur = (cni * pmi % MOD) * p2 % MOD;
            res = res + (i % 2 == 0 ? cur : -cur) + MOD;
            res %= MOD;
        }
        out.println(res);
    }

    private void calcFactorial(int M) {
        fact = new long[M + 1];
        invfact = new long[M + 1];

        fact[0] = 1;
        for (int i = 1; i <= M; i++) {
            fact[i] = fact[i - 1] * i % MOD;
        }

        invfact[0] = 1;
        for (int i = 1; i <= M; i++) {
            invfact[i] = invfact[i - 1] * pow(i, MOD - 2) % MOD;
        }
    }

    private long pow(long x, long m) {
        long res = 1;
        while (m > 0) {
            if (m % 2 == 1)
                res = res * x % MOD;
            x = x * x % MOD;
            m /= 2;
        }
        return res;
    }

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        // Scanner in = new Scanner(
                // new BufferedReader(new InputStreamReader(System.in)));
        FastScanner in = new FastScanner(System.in);

        // int T = in.nextInt();
        for (int t = 1; t <= 1; t++) {
            Main sol = new Main(in, out, t);
        }

        out.close();
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
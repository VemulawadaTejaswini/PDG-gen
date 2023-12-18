import java.util.*;
import java.io.*;

public class Main {

    private final static int MOD = 998244353; // (int)1e9 + 7;
    private static final int INF = (int)1e9;

    public Main(FastScanner in, PrintWriter out) {
        int n = in.nextInt();
        int s = in.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = in.nextInt();
        }

        int ans = 0;
        // dp[i][j] --- for array ends at i (R = i), how many tuples met the
        // condition: L <= i1 < i2 < i3 ... < ik <= i such that Ai1 + Ai2 +
        // ... + Aik = S.
        // The answer is sum(dp[i][S] for i in [0:n])
        int[][] dp = new int[n + 1][s + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            int x = A[i - 1];
            for (int j = 0; j <= s; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j == x) {
                    // start a new sequence
                    dp[i][j] = (dp[i][j] + i) % MOD;
                }
                else if (j > x) {
                    // continue a sequence 
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - x]) % MOD;
                }
            }
            ans = (ans + dp[i][s]) % MOD;
        }
        out.println(ans);
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

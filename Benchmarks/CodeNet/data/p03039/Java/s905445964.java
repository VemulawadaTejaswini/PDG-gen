import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;


public class Main {
    private static final int MOD = (int)1e9 + 7;
    int N,M,K;
    long[] fac, finv, inv;

    private void comb(int size) {
        fac = new long[size];
        finv = new long[size];
        inv = new long[size];

        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for(int i = 2;i < size;i++) {
            fac[i] = fac[i - 1] * i % MOD;
            inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
            finv[i] = finv[i - 1] * inv[i] % MOD;
        }
    }

    private long nCk(int n,int k,int MOD)
    {
        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
        return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
    }

    private void solve() {
        N = nextInt();
        M = nextInt();
        K = nextInt();
        comb(N * M + 1);

        long ansX = 0;
        for(int i = 1;i < M;i++) {
            long pattern = (long)i * (M - i) % MOD;
            ansX += pattern % MOD;
            ansX %= MOD;
        }
        ansX *= (long)N * N % MOD;
        ansX *= nCk(N * M - 2,K - 2, MOD);
        ansX %= MOD;

        long ansY = 0;
        for(int i = 1;i < N;i++) {
            long pattern = (long)i * (N - i) % MOD;
            ansY += pattern % MOD;
            ansY %= MOD;
        }

        ansY *= (long)M * M % MOD;
        ansY *= nCk(N * M - 2,K - 2, MOD);
        ansY %= MOD;

        long ans = (ansX + ansY) % MOD;
        out.println(ans);
    }

    public static void main(String[] args) {
        out.flush();
        new Main().solve();
        out.close();
    }

    /* Input */
    private static final InputStream in = System.in;
    private static final PrintWriter out = new PrintWriter(System.out);
    private final byte[] buffer = new byte[4096];
    private int p = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (p < buflen)
            return true;
        p = 0;
        try {
            buflen = in.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (buflen <= 0)
            return false;
        return true;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrint(buffer[p])) {
            p++;
        }
        return hasNextByte();
    }

    private boolean isPrint(int ch) {
        if (ch >= '!' && ch <= '~')
            return true;
        return false;
    }

    private int nextByte() {
        if (!hasNextByte())
            return -1;
        return buffer[p++];
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = -1;
        while (isPrint((b = nextByte()))) {
            sb.appendCodePoint(b);
        }
        return sb.toString();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}

import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();
    static ModOp m = new ModOp();

    public static void main(String[] args) {
        int S = in.i();
        long ans = 0;
        int mod = 1_000_000_007;
        for (int i = 1; ; i++) {
            int n = S - 3 * i;
            if (n < 0) break;
            int r = i - 1;
            ans = (ans + m.nCr(n + r, r)) % mod;
        }
        out.println(ans);
    }
}

class ModOp {
    private static final int MAX = 510000;
    private static final int MOD = 1_000_000_007;

    private long[] fact = new long[MAX];
    private long[] factInv = new long[MAX];
    private long[] inv = new long[MAX];

    ModOp() {
        fact[0] = fact[1] = 1;
        factInv[0] = factInv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < MAX; i++) {
            fact[i] = fact[i - 1] * i % MOD;
            inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
            factInv[i] = factInv[i - 1] * inv[i] % MOD;
        }
    }

    long nCr(int n, int k) {
        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
        return fact[n] * (factInv[k] * factInv[n - k] % MOD) % MOD;
    }

    long fact(int n) {
        return fact[n];
    }

    long pow(long a, long b) {
        long ret = 1;
        while(b > 0){
            if((b & 1) == 1) {
                ret = ret * a % MOD;
            }
            a = a * a % MOD;
            b >>= 1;
        }
        return ret;
    }
}

class MyReader extends BufferedReader {
    char[] cbuf = new char[1024];
    int head = 0;
    int tail = 0;

    MyReader() {
        super(new InputStreamReader(System.in));
    }

    char next() {
        if (head == tail) {
            try {
                tail = super.read(cbuf, 0, cbuf.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
            head = 0;
        }
        return cbuf[head++];
    }

    void back() {
        head--;
    }

    boolean minus() {
        boolean minus;
        while (true) {
            char c = next();
            if (!isDelimiter(c)) {
                if (!(minus = c == '-')) back();
                return minus;
            }
        }
    }

    void skip() {
        while (isDelimiter(next()));
        back();
    }

    char[] s(int N) {
        char[] cbuf = new char[N];
        read(cbuf, 0, N);
        return cbuf;
    }

    public int read(char[] cbuf, int off, int len) {
        skip();
        int i;
        for (i = 0; i < cbuf.length; i++) {
            char c = next();
            if (isDelimiter(c)) {
                break;
            }
            cbuf[i] = c;
        }
        return i;
    }

    boolean isDelimiter(char c) {
        return c == ' ' || c == '\n' || c == '\r';
    }

    int i() {
        boolean minus = minus();
        int n = 0;
        while (true) {
            int k = next() - '0';
            if (k < 0 || 9 < k) break;
            n = 10 * n + k;
        }
        return minus ? -n : n;
    }

    int[] ii(final int N) {
        int[] a = new int[N];
        for (int j = 0; j < a.length; j++) a[j] = i();
        return a;
    }

    long l() {
        boolean minus = minus();
        long n = 0;
        while (true) {
            int k = next() - '0';
            if (k < 0 || 9 < k) break;
            n = 10 * n + k;
        }
        return minus ? -n : n;
    }
}

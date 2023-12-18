//master
import java.io.*;
import java.util.*;

public class Main {
    static int MOD = 1000000000 + 7;
    public static int MAX = 1000000;
    public static long[] fac = new long[MAX];
    public static long[] finv = new long[MAX];
    public static long[] inv = new long[MAX];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        long max = 0;
        long min = 0;
        int h = 0;
        int e = n;
        for(int i = 0; i<=n; i++) {
            max += i;
        } 
        min = max;
        long ans = 0;
        for(int i = k; i<=n+1; i++) {
            //pe(max+" "+min+" "+(max-min+1));
            ans += max - min + 1;
            ans %= MOD;
            max -= h;
            min -= e;
            h++;
            e--;
        }
        p(ans);
    }
    public static void COMinit() {
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for(int i = 2; i < MAX; i++) {
            fac[i] = fac[i-1] * i % MOD;
            inv[i] = MOD - inv[MOD%i] * (MOD/i) % MOD;
            finv[i] = finv[i-1] * inv[i] % MOD;
        }
    }
    
    public static long combination(int n, int k){
        if(n < k || n < 0 || k < 0) return 0;
        return fac[n] * (finv[k] * finv[n-k] % MOD) % MOD;
    }
    public static <T> void p(T message) {
        System.out.println(message);
    }

    public static <T> void pe(T message) {
        System.err.println(message);
    }

    public static <T> void pp(T message) {
        System.out.print(message);
    }
}
class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
 
    private int readByte() {
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }
 
    private boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }
 
    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
        return hasNextByte();
    }
 
    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
 
    public long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
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
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
 
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }
 
    public double nextDouble() {
        return Double.parseDouble(next());
    }
}

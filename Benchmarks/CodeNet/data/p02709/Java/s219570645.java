//master
import java.io.*;
import java.util.*;

class Child {
    int index;
    int power;
    public Child(int index, int power) {
        this.index = index;
        this.power = power;
    }
}

public class Main {
    static int MOD = 1000000000 + 7;
    public static int MAX = 1000000;
    public static long[] fac = new long[MAX];
    public static long[] finv = new long[MAX];
    public static long[] inv = new long[MAX];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Child[] c = new Child[n];
        for(int i = 0; i<n; i++) {
            c[i] = new Child(i, sc.nextInt());
        }
        Arrays.sort(c, (x,y)->(y.power -x.power));
        long[][] dp = new long[n+2][n+2];
        dp[0][1] = (long)c[0].power*Math.abs(n-1 - c[0].index);
        dp[1][0] = (long)c[0].power*Math.abs(c[0].index - 0); 
        for(int i = 2; i<=n; i++) {
            dp[i][0] = dp[i-1][0] + (long)c[i-1].power*Math.abs(c[i-1].index - (i-1));
            dp[0][i] = dp[0][i-1] + (long)c[i-1].power*Math.abs(n-i - c[i-1].index);
        }
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=n; j++) {
                if(i+j>n) continue;
                dp[i][j] = Math.max(dp[i][j-1] + (long)c[i+j-1].power*Math.abs(n-(j) - c[i+j-1].index), 
                                 dp[i-1][j] + (long)c[i+j-1].power*Math.abs(c[i+j-1].index - (i-1))); 
                
            }
        }
        long max = 0;
        for(int i = 0; i<=n; i++) {
            for(int j = 0; j<=n; j++) {
                if(i+j>n) continue;
                //pe(i+" "+j+" "+dp[i][j]);
                if(i+j==n) {
                    //pe(i+" "+j+" "+dp[i][j]);
                    max = Math.max(max,dp[i][j]);
                }
            }
        }
        p(max);

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

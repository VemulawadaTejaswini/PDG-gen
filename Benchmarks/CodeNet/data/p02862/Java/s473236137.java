import java.util.*;
import java.io.*;
class Main {
    static int COM_MAX = 1000000;
    static int MOD = 1000000007;
    static long[] fac, finv, inv;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        fac = new long[COM_MAX];
        finv = new long[COM_MAX];
        inv = new long[COM_MAX];

        if((X+Y) % 3 != 0) {
            System.out.println(0);
            return;
        } 
        int n = (2*Y - X)/3;
        int m = (-1*Y+2*X)/3;
        System.err.println(n+" "+m);
        if(n<0 || m<0) {
            System.out.println(0);
            return;
        }
        COMinit();
	    System.out.println(COM(n+m,n));
    }
    public static void COMinit() {
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for(int i = 2; i<COM_MAX; i++) {
            fac[i] = fac[i-1]*i%MOD;
            inv[i] = MOD - inv[MOD%i]*(MOD/i)%MOD;
            finv[i] = finv[i-1]*inv[i] % MOD;
        }
    }
    public static long COM(int n, int k) {
        if(n<k) return 0;
        if(n<0 || k<0) return 0;
        return fac[n] * (finv[k] * finv[n-k]%MOD) % MOD;
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
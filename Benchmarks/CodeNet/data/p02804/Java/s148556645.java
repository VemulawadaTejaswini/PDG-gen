import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.lang.Math;
import java.math.*;

public class Main {
    public final static long MOD = 1000000007;

    public static void main(String[] args) {
        FS reader = new FS();
        // write reader
        int N = reader.nextInt();
        int K = reader.nextInt();
        long[] A = new long[N];
        for (int i=0; i<N; i++) A[i] = reader.nextLong();
        Arrays.sort(A);
        long sumMax = 0;
        initFactorial();
        for (int i=K-1; i<N; i++) {
            sumMax = (sumMax + combination(i, K-1) * A[i]) % MOD;
        }
        long sumMin = 0;
        for (int i=N-K; 0<=i; i--) {
            sumMin = (sumMin + combination(N-1-i, K-1) * A[i]) % MOD;
        }
        long ans = (sumMax + MOD - sumMin) % MOD;
        System.out.println(ans);
    }

    // n! (save to memory)
    static long[] factorial = new long[100000];
    static void initFactorial() {
        factorial[0] = 1;
        for (int i=1; i<100000; i++) {
            factorial[i] = (factorial[i-1] * i) % MOD;
        }
    }

    // x^n
    static long pow(long x, long n) {
        long ans = 1;
        while (n != 0) {
            if (n % 2 == 1) ans = (ans * x) % MOD;
            x = (x * x) % MOD;
            n = n / 2;
        }
        return ans;
    }

    // nCk = n! * (k!)^(MOD-2) * ((n-k)!)^(MOD-2)
    static long combination(int n, int k) {
        if (n == 0 && k == 0) return 1;
        if (n < k || n < 0) return 0;
        long ans = ((factorial[n] * pow(factorial[k], MOD-2)) % MOD * pow(factorial[n-k], MOD-2)) % MOD;
        return ans;
    }

    // Read Class
    static class FS {
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
    
        private int readByte() { return hasNextByte() ? buffer[ptr++] : -1;}
        private boolean isPrintableChar(int c) {return 33 <= c && c <= 126;}
        private void skipUnprintable() {while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
    
        public boolean hasNext() { skipUnprintable(); return hasNextByte();}
        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while(isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }
        public int nextInt() {
            return (int)nextLong();
        }
        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
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
            while(true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if(b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }
    }
}


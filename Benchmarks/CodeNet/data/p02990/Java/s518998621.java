import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        FS reader = new FS();
        final long MOD = 1000000007;
        // write reader
        int N = reader.nextInt();
        int K = reader.nextInt();
        // f(i) = （K個のボールをN-K+1箇所のうちi箇所に割り振る方法）
        //      = (N-K+1)_C_i * (K-1)_C_(i-1)
        long[][] C = new long[2001][2001];
        for (int i=0; i<=N; i++) {
            for (int j=0; j<=i; j++) {
                if (j==0 || j==i) C[i][j] = 1;
                else C[i][j] = (C[i-1][j-1] + C[i-1][j]) % MOD;
            }
        }

        for (int i=1; i<=K; i++) {
            long ans = (C[N-K+1][i] * C[K-1][i-1]) % MOD;
            System.out.println(ans);
        }
    }
    
    public static void solver() {
        // write logic
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


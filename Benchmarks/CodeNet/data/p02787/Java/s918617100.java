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
        int H = reader.nextInt();
        int N = reader.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = reader.nextInt();
            B[i] = reader.nextInt();
        }
        // dp[i] : min sum mp to attack i damage
        int[] dp = new int[1000001];
        for (int i=1; i<1000001; i++) dp[i] = 1000000000;
        dp[0] = 0;
        for (int i=0; i<H; i++) {
            for (int j=0; j<N; j++) {
                dp[i+A[j]] = Math.min(dp[i]+B[j], dp[i+A[j]]);
            }
        }
        int ans = 1000000000;
        for (int i=0; i<10000; i++) {
            ans = Math.min(dp[H+i], ans);
        }
        System.out.println(ans);
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


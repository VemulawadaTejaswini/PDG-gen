import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.lang.Math;

public class Main {
    public static long maxXor(long[] A) {
        // setting
        int maxRank = 59;

        int rank = 0;
        int j    = 0;
        for (int i=maxRank; i>=0; i--) {
            for (j=rank; j<A.length; j++) {
                if ((A[j] & (1L << i)) != 0) break;
            }
            if (j == A.length) continue;
            if (j > rank) A[rank] ^= A[j];
            for (j=rank+1; j<A.length; j++) {
                A[j] = Math.min(A[j], A[j]^A[rank]);
            }
            rank++;
        }
        long res = 0;
        for (int i=0; i<A.length; i++) {
            res = Math.max(res, res^A[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        FS reader = new FS();
        // write reader
        int N = reader.nextInt();
        long[] A = new long[N];
        for (int i=0; i<N; i++) {
            A[i] = reader.nextLong();
        }
        long allXor = 0;
        for (int i=0; i<N; i++) {
            allXor ^= A[i];
        }
        for (int i=0; i<N; i++) {
            A[i] &= ~allXor;
        }
        
        long max = maxXor(A);
        long ans = allXor + max * 2;
        System.out.println(ans);
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


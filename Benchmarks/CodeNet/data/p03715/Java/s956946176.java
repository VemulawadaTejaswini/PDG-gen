import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.lang.Math;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        FS reader = new FS();
        // write reader
        int H   = reader.nextInt();
        int W   = reader.nextInt();
        int min = Integer.MAX_VALUE;

        // A|B|C
        if (W % 3 == 0) min = 0;
        else min = Math.min(min, H);

        // A
        // -
        // B
        // -
        // C
        if (H % 3 == 0) min = 0;
        else min = Math.min(min, W);

        //  |B
        // A|-
        //  |C
        for (int i=1; i<W; i++) {
            long[] t = new long[3];
            t[0] = (long)i * (long)H;
            t[1] = (long)(W-i) * (long)(H/2);
            t[2] = (long)H * (long)W - (long)t[0] - (long)t[1];
            Arrays.sort(t);
            min = (int)Math.min((long)min, t[2]-t[0]);
        }

        //  A 
        // ---
        // B|C
        for (int i=1; i<H; i++) {
            long[] t = new long[3];
            t[0] = (long)i * (long)W;
            t[1] = (long)(H-i) * (long)(W/2);
            t[2] = (long)W * (long)H - (long)t[0] - (long)t[1];
            Arrays.sort(t);
            min = (int)Math.min((long)min, t[2]-t[0]);
        }

        System.out.println(min);
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
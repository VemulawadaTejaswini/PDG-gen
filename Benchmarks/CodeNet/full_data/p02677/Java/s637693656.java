import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        FastScanner fs = new FastScanner();
        int a = fs.nextInt();
        int b = fs.nextInt();
        int h = fs.nextInt();
        int m = fs.nextInt();

        h %= 12;
        h += m / 60;
        m %= 60;

        int a2 = a * a;
        int b2 = b * b;
        double angle = ( (double)h/12.0*60.0 + ( (double)m / 60.0 * 5.0 ) - m ) * 6;
        if( 180 <= angle ){
            angle = 360 - angle;
        }
        double cos = Math.cos( Math.toRadians( angle ) );
        double ans = a2 + b2 - 2 * a * b * cos;
        System.out.println( Math.sqrt( ans ) );



    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int bufferLength = 0;

        private boolean hasNextByte() {
            if (ptr < bufferLength) {
                return true;
            } else {
                ptr = 0;
                try {
                    bufferLength = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return bufferLength > 0;
            }
        }

        private int readByte() {
            if (hasNextByte()) {
                return buffer[ptr++];
            } else {
                return -1;
            }
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
                ptr++;
            }
            return hasNextByte();
        }

        String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        long nextLong() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
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
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
                throw new NumberFormatException();
            }
            return (int) nl;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    private static int gcd( int a , int b ){
        int x;
        int y;
        if (a > b) {
            x = a;
            y = b;
        } else {
            x = b;
            y = a;
        }
        int tmp;
        while ((tmp = x % y) != 0) {
            x = y;
            y = tmp;
        }
        return y;
    }

}

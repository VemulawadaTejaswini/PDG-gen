import java.util.*;
import java.io.*;

public class Main {
    private static IO io = new IO();
    public static void main(String[] args) {

        while (io.hasNext()) {
            int n = io.nextInt();
            int prime[] = new int[n];    // i??????????´???°???????´?
            boolean isprime[] = new boolean[n+1];    // i???true??????i????´???°
            Arrays.fill(isprime, true);

            int ans = 0;
            for (int i = 2; i <= n; i++) {
                if (isprime[i]) {
                    prime[ans++] = i;
                    for (int j = 2 * i; j <= n; j += i) isprime[j] = false;
                }
            }

            System.out.println(ans);
        }
        
    }

    static class IO extends PrintWriter {
        private final InputStream in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        IO() {
            this(System.in);
        }

        IO(InputStream source) {
            super(System.out);
            this.in = source;
        }

        boolean hasNextByte() {
            if (ptr < buflen) return true;
            else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) return false;
            }
            return true;
        }
        int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }
        boolean isPrintableChar(int c) {return 33<=c &&c <=126;}
        void skipUnprintable() {while(hasNextByte() && !isPrintableChar(buffer[ptr]))ptr++;}
        boolean hasNext() {
            skipUnprintable();
            return hasNextByte();
        }

        long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) throw new NumberFormatException();
            while (true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) return minus ? -n : n;
                else throw new NumberFormatException();
                b = readByte();
            }
        }

        int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }

        public void close() {
            super.close();
            try {
                in.close();
            } catch (IOException ignored) {
            }
        }
    }
}
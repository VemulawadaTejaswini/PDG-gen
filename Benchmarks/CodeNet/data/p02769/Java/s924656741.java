import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        final long DIV = 1000000007;
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int k = sc.nextInt();

        long[] inv = new long[200010];
        for (int i = 1; i < inv.length; i++) {
            inv[i] = modinv(i, DIV);
        }

        if(k >= n-1){
            long ans = 1;
            for (int i = 0; i < n-1; i++) {
                ans *= n*2-1-i;
                ans %= DIV;
                ans *= inv[i+1];
                ans %= DIV;
            }
            System.out.println(ans);
        }else{
            long ans = 1;
            long ans0 = 1;
            long ans1 = 1;
            for (int i = 1; i <= k; i++) {
                ans0 *= n-i+1;
                ans0 %= DIV;
                ans0 *= inv[i];
                ans0 %= DIV;

                ans1 *= n-i;
                ans1 %= DIV;
                ans1 *= inv[i];
                ans1 %= DIV;

                long ans2 = (ans0 * ans1) % DIV;
                ans += ans2;
                ans %= DIV;
            }
            System.out.println(ans);
        }
    }

    
    static long modinv(long a, long m){
        long b = m, u = 1, v = 0;
        while(b > 0){
            long t = a / b;
            a -= t * b;
            long tmp = a;
            a = b;
            b = tmp;
            u -= t * v;
            tmp = u;
            u = v;
            v = tmp;
        }
        u %= m;
        if (u < 0) u += m;
        return u;
    }



    private static class FastScanner {
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

        private static boolean isPrintableChar(int c) {
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

}


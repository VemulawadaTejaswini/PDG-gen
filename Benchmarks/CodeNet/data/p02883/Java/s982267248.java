import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
    static int n;
    static long k;
    static long[] a, f;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        n = sc.nextInt();
        k = sc.nextLong();
        a = new long[n];
        f = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            f[i] = sc.nextLong();
        }

        Arrays.sort(a);
        Arrays.sort(f);

        long ml = -1;
        long mr = Long.MAX_VALUE - 10;
        while(mr > ml+1){
            long mm = (ml + mr) / 2;
            if(solve(mm)){
                mr = mm;
            }else{
                ml = mm;
            }
        }

        System.out.println(ml+1);

    }

    public static boolean solve(long score){
        long mk = k;
        for (int i = 0; i < n; i++) {
            if(a[i] * f[n-i-1] > score){
                if(score % f[n-i-1] == 0){
                    mk -= a[i] - (score / f[n-i-1]);
                }else{
                    mk -= a[i] - (score / f[n-i-1]);
                }
                if(mk < 0){
                    return false;
                }
            }
        }
        return true;
    }

    private static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            }else{
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
        private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
        private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
        public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
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
            while(true){
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                }else if(b == -1 || !isPrintableChar(b)){
                    return minus ? -n : n;
                }else{
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }
        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }
        public double nextDouble() { return Double.parseDouble(next());}
    }
}

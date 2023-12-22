import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        var sc = new FastScanner(System.in);
        var sb = new StringBuilder();
        final int N = sc.nextInt();
        final int Q = sc.nextInt();
        final var A = new long[N];
        Arrays.setAll(A, i -> sc.nextInt());
        var t = new FenwickTree(A);
        for (int $ = 0; $ < Q; $++) {
            int query = sc.nextInt();
            if (query == 0) {
                int p = sc.nextInt();
                int x = sc.nextInt();
                t.add(p, x);
            } else {
                int l = sc.nextInt();
                int r = sc.nextInt();
                sb.append(t.sum(l, r)).append('\n');
            }
        }
        var pw = new PrintWriter(System.out);
        pw.write(sb.toString());
        pw.flush();
        pw.close();
    }

    static class FenwickTree {
        final int N;
        final long[] Dat;
    
        public FenwickTree(int n) {
            this.N = n;
            this.Dat = new long[N];
        }
    
        public FenwickTree(long[] dat) {
            this(dat.length);
            System.arraycopy(dat, 0, Dat, 0, N);
            for (int i = 1; i <= N; i++) {
                int p = i + (i & -i);
                if (p <= N) Dat[p - 1] += Dat[i - 1];
            }
        }
    
        public void add(int p, long x) {
            exclusiveRangeCheck(p);
            p++;
            while (p <= N) {
                Dat[p - 1] += x;
                p += p & -p;
            }
        }
    
        public long sum(int l, int r) {
            if (l > r) {
                throw new IllegalArgumentException("TODO");
            }
            inclusiveRangeCheck(l);
            inclusiveRangeCheck(r);
            return sum(r) - sum(l);
        }
    
        private long sum(int r) {
            long s = 0;
            while (r > 0) {
                s += Dat[r - 1];
                r -= r & -r;
            }
            return s;
        }
    
        private void exclusiveRangeCheck(int p) {
            if (p < 0 || p >= N) {
                throw new IndexOutOfBoundsException(
                    "TODO"
                );
            }
        }
    
        private void inclusiveRangeCheck(int p) {
            if (p < 0 || p > N) {
                throw new IndexOutOfBoundsException(
                    "TODO"
                );
            }
        }
    }
    
    static class FastScanner {
        private final InputStream in;
        private final byte[] buf = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        public FastScanner(InputStream in) {this.in = in;}
        private boolean hasNextByte() {
            if (ptr < buflen) return true;
            ptr = 0;
            try {buflen = in.read(buf);}
            catch (final IOException e) {e.printStackTrace();}
            return buflen > 0;
        }
        private int readByte() {return hasNextByte() ? buf[ptr++] : -1;}
        public boolean hasNext() {
            while (hasNextByte() && !(33 <= buf[ptr] && buf[ptr] <= 126)) ptr++;
            return hasNextByte();
        }
        private StringBuilder nextSequence() {
            if (!hasNext()) throw new NoSuchElementException();
            final StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (33 <= b && b <= 126) {sb.appendCodePoint(b); b = readByte();}
            return sb;
        }
        public String next() {
            return nextSequence().toString();
        }
        public String next(int len) {
            return new String(nextChars(len));
        }
        public char[] nextChars() {
            final StringBuilder sb = nextSequence();
            int l = sb.length();
            char[] dst = new char[l];
            sb.getChars(0, l, dst, 0);
            return dst;
        }
        public char[] nextChars(int len) {
            if (!hasNext()) throw new NoSuchElementException();
            char[] s = new char[len];
            int i = 0;
            int b = readByte();
            while (33 <= b && b <= 126 && i < len) {s[i++] = (char) b; b = readByte();}
            if (i != len) throw new NoSuchElementException(String.format("length %d is longer than the sequence.", len));
            return s;
        }
        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {minus = true; b = readByte();}
            if (b < '0' || '9' < b) throw new NumberFormatException();
            while (true) {
                if ('0' <= b && b <= '9') n = n * 10 + b - '0';
                else if (b == -1 || !(33 <= b && b <= 126)) return minus ? -n : n;
                else throw new NumberFormatException();
                b = readByte();
            }
        }
        public int nextInt() {return Math.toIntExact(nextLong());}
        public double nextDouble() {return Double.parseDouble(next());}
    }
}

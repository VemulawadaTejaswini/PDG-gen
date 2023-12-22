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
        var bsu = new DisjointSetUnion(N);
        for (int $ = 0; $ < Q; $++) {
            int query = sc.nextInt();
            int u = sc.nextInt();
            int v = sc.nextInt();
            if (query == 0) {
                bsu.merge(u, v);
            } else {
                sb.append(bsu.same(u, v) ? 1 : 0).append('\n');
            }
        }
        var pw = new PrintWriter(System.out);
        pw.write(sb.toString());
        pw.flush();
        pw.close();
    }

    static class DisjointSetUnion {
        final int N;
        final int[] Dat;
    
        public DisjointSetUnion(int n) {
            this.N = n;
            this.Dat = new int[N];
            Arrays.fill(Dat, -1);
        }
    
        public int merge(int x, int y) {
            // exclusiveRangeCheck(x);
            // exclusiveRangeCheck(y);
            x = leader(x);
            y = leader(y);
            if (x == y) return x;
            if (-Dat[y] > -Dat[x]) {
                int tmp = x; x = y; y = tmp;
            }
            Dat[x] += Dat[y];
            Dat[y] = x;
            return x;
        }
    
        public boolean same(int x, int y) {
            // exclusiveRangeCheck(x);
            // exclusiveRangeCheck(y);
            return leader(x) == leader(y);
        }
    
        public int leader(int x) {
            exclusiveRangeCheck(x);
            if (Dat[x] < 0) return x;
            return Dat[x] = leader(Dat[x]);
        }
    
        public int size(int x) {
            // exclusiveRangeCheck(x);
            return -Dat[leader(x)];
        }
    
        public int[][] groups() {
            int[] leaderToGroup = new int[N];
            int[] size = new int[N];
            int cmp = 0;
            for (int i = 0; i < N; i++) {
                if (Dat[i] < 0) {
                    leaderToGroup[i] = cmp;
                    size[cmp] = -Dat[i];
                    cmp++;
                }
            }
            int[][] groups = new int[cmp][];
            for (int j = 0; j < cmp; j++) {
                groups[j] = new int[size[j]];
            }
            for (int i = 0; i < N; i++) {
                int j = leaderToGroup[leader(i)];
                groups[j][--size[j]] = i;
            }
            return groups;
        }
    
        private void exclusiveRangeCheck(int v) {
            if (v < 0 || v >= N) {
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

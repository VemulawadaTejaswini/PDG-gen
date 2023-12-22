import java.util.*;
import java.io.*;

public class Main {
    static IO io = new IO();
    static int p[] = new int[100001];   // p[i]: parent of i-th node
    static char ope[] = new char[100001];
    static int v[] = new int[100001];
    public static void main(String[] args) {

        while (true) {

            int n = io.nextInt();
            int q = io.nextInt();
            if (n==0 && q==0) break;
            p = io.arrayInt(n-1);
            UnionFind uni = new UnionFind(n);
            int ans = 0;
            for (int i=0; i<q; i++) {
                ope[i] = io.nextChar();
                v[i] = io.nextInt();
                if (ope[i]=='M') {
                    uni.mark(v[i]);
                    //System.out.println(v[i] + "?????????????????????");
                } else {
                    ans += uni.find(v[i]);
                }
            }
            System.out.println(ans);
            //System.out.println("ope: " + Arrays.toString(ope));
            //System.out.println("v: " + Arrays.toString(v));

        }

    }

    static class UnionFind {
        int par[];	// i??????(parent)
        int rank[];	// i?????±???
        boolean mark[]; // i??????????????????????????????

        // ????????????????????? n????´???§?????????
        UnionFind(int n) {
            par = new int[n+1];
            rank = new int[n+1];
            mark = new boolean[n+1];
            mark[1] = true;
            par[1] = 1;
            for (int i=2; i<=n; i++) par[i]=p[i-2];
        }

        // ??¨??????????±???????
        int find(int x) {
            if (par[x] == x || mark[x]) return x;
            //System.out.println(x + "????????????????????????????????§" + par[x] + "?????????");
            return find(par[x]);
        }

        // x??¨y???????????????????±????????????????
        Boolean same(int x,int y) {
            return find(x)==find(y);
        }

        // x??¨y????±??????????????????????
        void unite(int x,int y) {
            x = find(x);
            y = find(y);
            if (x==y) return;
            if (rank[x]<rank[y]) par[x] = y;
            else {
                par[y]=x;
                if (rank[x]==rank[y]) rank[x]++;
            }
        }

        // x??????????????????
        void mark(int x) {
            mark[x] = true;
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

        int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        boolean isNewLine(int c) {
            return c == '\n' || c == '\r';
        }

        void skipUnprintable() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        }

        void skipNewLine() {
            while (hasNextByte() && isNewLine(buffer[ptr])) ptr++;
        }

        boolean hasNext() {
            skipUnprintable();
            return hasNextByte();
        }

        boolean hasNextLine() {
            skipNewLine();
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

        char[] nextCharArray(int len) {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            char[] s = new char[len];
            int i = 0;
            int b = readByte();
            while (isPrintableChar(b)) {
                if (i == len) {
                    throw new InputMismatchException();
                }
                s[i++] = (char) b;
                b = readByte();
            }
            return s;
        }

        String nextLine() {
            if (!hasNextLine()) {
                throw new NoSuchElementException();
            }
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (!isNewLine(b)) {
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

        int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
                throw new NumberFormatException();
            }
            return (int) nl;
        }

        char nextChar() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return (char) readByte();
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        int[] arrayInt(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        long[] arrayLong(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }

        double[] arrayDouble(int n) {
            double[] a = new double[n];
            for (int i = 0; i < n; i++) a[i] = nextDouble();
            return a;
        }

        void arrayInt(int[]... a) {
            for (int i = 0; i < a[0].length; i++) for (int j = 0; j < a.length; j++) a[j][i] = nextInt();
        }

        int[][] matrixInt(int n, int m) {
            int[][] a = new int[n][];
            for (int i = 0; i < n; i++) a[i] = arrayInt(m);
            return a;
        }

        char[][] charMap(int n, int m) {
            char[][] a = new char[n][];
            for (int i = 0; i < n; i++) a[i] = nextCharArray(m);
            return a;
        }

        public void close() {
            super.close();
            try {
                in.close();
            } catch (IOException e) {
            }
        }
    }
}
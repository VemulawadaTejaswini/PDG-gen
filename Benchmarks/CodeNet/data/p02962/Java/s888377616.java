import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {
    private static final class KMP {
        static int[] createTable(String word) {
            int[] table = new int[word.length() + 1];
            table[0] = -1;
            int j = -1;
            for (int i = 0; i < word.length(); i++) {
                while (j >= 0 && word.charAt(i) != word.charAt(j)) {
                    j = table[j];
                }
                j++;
                table[i + 1] = j;
            }
            return table;
        }

        private final String word;
        private final int[] table;

        KMP(String word) {
            this.word = word;
            table = createTable(word);
        }
        boolean[] search(String text) {
            boolean[] result = new boolean[text.length()];
            for (int m = 0, i = 0; m < text.length();) {
                if (text.charAt((m + i) % text.length()) == word.charAt(i)) {
                    i++;
                    if (i == word.length()) {
                        result[m] = true;
                        m = m + i - table[i];
                        i = table[i];
                    }
                } else {
                    m = m + i - table[i];
                    if (i > 0) {
                        i = table[i];
                    }
                }
            }
            return result;
        }
    }
    private static final class UnionFindTree {
        private final int[] parent;
        private final int[] nodeCount;
        UnionFindTree(int n) {
            if (n < 1)
                throw new IllegalArgumentException();

            parent = new int[n];
            Arrays.setAll(parent, i -> i);

            nodeCount = new int[n];
            Arrays.setAll(nodeCount, i -> 1);
        }
        private int root(int x) {
            if (parent[x] == x)
                return x;
            return parent[x] = root(parent[x]);
        }
        boolean same(int x, int y) {
            return root(x) == root(y);
        }
        void unite(int x, int y) {
            int xr = root(x);
            int yr = root(y);
            if (xr == yr)
                return;
            parent[xr] = yr;
            nodeCount[yr] += nodeCount[xr];
        }
        int count(int x) {
            return nodeCount[root(x)];
        }
    }
    static void solve(MyScanner in, PrintWriter out) {
        String s = in.next();
        String t = in.next();

        StringBuilder sb = new StringBuilder();
        sb.append(s);
        while (sb.length() < t.length()) {
            sb.append(s);
        }
        s = sb.toString();

        boolean[] match = new KMP(t).search(s);
        UnionFindTree uft = new UnionFindTree(match.length);
        for (int i = 0; i < match.length; i++) {
            if (!match[i]) {
                continue;
            }
            int j = (i + t.length()) % s.length();
            if (uft.same(i, j)) {
                out.println(-1);
                return;
            }
            uft.unite(i, j);
        }

        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < match.length; i++) {
            ans = Math.max(ans, uft.count(i));
        }
        out.println(ans - 1);
    }

    public static void main(String[] args) {
        PrintWriter w = new PrintWriter(System.out);
        solve(new MyScanner(System.in), w);
        w.flush();
    }

    static final class MyScanner {
        static final int BUFFER_SIZE = 8192;
        private final InputStream in;
        private final byte[] buffer = new byte[BUFFER_SIZE];
        private int point;
        private int readLength;
        MyScanner(InputStream in) {
            this.in = in;
        }
        private int readByte() {
            if (point < readLength) {
                int result = buffer[point];
                point += 1;
                return result;
            }
            try {
                readLength = in.read(buffer);
            } catch (IOException e) {
                throw new AssertionError(null, e);
            }
            if (readLength == -1)
                return -1;
            point = 1;
            return buffer[0];
        }
        private static boolean isPrintableCharExceptSpace(int c) {
            return 33 <= c && c <= 126;
        }
        String next() {
            int c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c))) {
                c = readByte();
            }
            if (c == -1)
                throw new NoSuchElementException();
            StringBuilder b = new StringBuilder();
            do {
                b.appendCodePoint(c);
                c = readByte();
            } while (c != -1 && isPrintableCharExceptSpace(c));
            return b.toString();
        }
        long nextLong() {
            int c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c))) {
                c = readByte();
            }
            if (c == -1)
                throw new NoSuchElementException();
            boolean minus = false;
            if (c == '-') {
                minus = true;
                c = readByte();
            }
            long result = 0L;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                result = result * 10L + (c - '0');
                c = readByte();
            } while (c != -1 && isPrintableCharExceptSpace(c));
            return minus ? -result : result;
        }
        int nextInt() {
            long n = nextLong();
            if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE)
                throw new InputMismatchException();
            return (int)n;
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        int[] nextIntArray(int n) {
            int[] result = new int[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextInt();
            }
            return result;
        }
        private static boolean allSameLength(int[] a, int[] b, int[]... c) {
            if (a.length != b.length)
                return false;
            for (int[] element : c)
                if (a.length != element.length)
                    return false;
            return true;
        }
        private static boolean allSameLength(char[] a, char[] b, char[]... c) {
            if (a.length != b.length)
                return false;
            for (char[] element : c)
                if (a.length != element.length)
                    return false;
            return true;
        }
        void nextVerticalIntArrays(int[] a, int[] b, int[]... c) {
            if (!allSameLength(a, b, c))
                throw new IllegalArgumentException();
            for (int i = 0; i < a.length; i++) {
                a[i] = nextInt();
                b[i] = nextInt();
                for (int[] d : c) {
                    d[i] = nextInt();
                }
            }
        }
        long[] nextLongArray(int n) {
            long[] result = new long[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextLong();
            }
            return result;
        }
        char nextChar() {
            int c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c))) {
                c = readByte();
            }
            if (c == -1)
                throw new NoSuchElementException();
            return (char)c;
        }
        char[] nextCharArray(int n) {
            char[] result = new char[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextChar();
            }
            return result;
        }
        char[][] next2dCharArray(int n, int m) {
            char[][] result = new char[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    result[i][j] = nextChar();
                }
            }
            return result;
        }
        void nextVerticalCharArrays(char[] a, char[] b, char[]... c) {
            if (!allSameLength(a, b, c))
                throw new IllegalArgumentException();
            for (int i = 0; i < a.length; i++) {
                a[i] = nextChar();
                b[i] = nextChar();
                for (char[] d : c) {
                    d[i] = nextChar();
                }
            }
        }
    }
}

import java.io.InputStream;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.PrintWriter;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/E1";

    FastScanner in;
    PrintWriter out;

    public void solve() {
        int n = in.nextInt();
        String s = in.next();
        int Q = in.nextInt();
        char[] cur = s.toCharArray();
        BinaryIndexedTree[] bits = new BinaryIndexedTree[26];
        for (int i = 0; i < 26; i++) {
            bits[i] = BinaryIndexedTree.create(n);
        }
        for (int i = 0; i < n; i++) {
            int c = cur[i] - 'a';
            bits[c].add(i + 1, 1);
        }
        for (int i = 0; i < Q; i++) {
            int t = in.nextInt();
            if (t == 1) {
                int x = in.nextInt() - 1;
                char cc = in.next().charAt(0);
                if (cur[x] != cc) {
                    int c = cc - 'a';
                    int prev = cur[x] - 'a';
                    bits[prev].add(x + 1, -1);
                    bits[c].add(x + 1, 1);
                    cur[x] = cc;
                }
            } else {
                int res = 0;
                int l = in.nextInt();
                int r = in.nextInt();
                for (int j = 0; j < 26; j++) {
                    long v = bits[j].sum(r);
                    if (l != 1) {
                        v -= bits[j].sum(l - 1);
                    }
                    res += Math.min(v, 1);
                }
                out.println(res);
            }
        }
        out.close();
    }

    public void run() {
        if (__FILE_DEBUG_FLAG__ == __t__) {
            try {
                is = new FileInputStream(__DEBUG_FILE_NAME__);
            } catch (FileNotFoundException e) {
                // TODO 自動生成された catch ブロック
                e.printStackTrace();
            }
            System.out.println("FILE_INPUT!");
        } else {
            is = System.in;
        }
        in = new FastScanner(is);
        out = new PrintWriter(System.out);

        solve();
    }

    public static void main(final String[] args) {
        new Main().run();
    }

}


class FastScanner {
    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;

    public FastScanner(InputStream stream) {
        this.stream = stream;
        // stream = new FileInputStream(new File("dec.in"));
    }

    int read() {
        if (numChars == -1)
            throw new InputMismatchException();
        if (curChar >= numChars) {
            curChar = 0;
            try {
                numChars = stream.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (numChars <= 0)
                return -1;
        }
        return buf[curChar++];
    }

    public boolean isSpaceChar(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    public boolean isEndline(int c) {
        return c == '\n' || c == '\r' || c == -1;
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public int[] nextIntArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = nextInt();

        return array;
    }

    public int[][] nextIntMap(int n, int m) {
        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextIntArray(m);
        }
        return map;
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public long[] nextLongArray(int n) {
        long[] array = new long[n];
        for (int i = 0; i < n; i++)
            array[i] = nextLong();

        return array;
    }

    public long[][] nextLongMap(int n, int m) {
        long[][] map = new long[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextLongArray(m);
        }
        return map;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public double[] nextDoubleArray(int n) {
        double[] array = new double[n];
        for (int i = 0; i < n; i++)
            array[i] = nextDouble();

        return array;
    }

    public double[][] nextDoubleMap(int n, int m) {
        double[][] map = new double[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = nextDoubleArray(m);
        }
        return map;
    }

    public String next() {
        int c = read();
        while (isSpaceChar(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isSpaceChar(c));
        return res.toString();
    }

    public String[] nextStringArray(int n) {
        String[] array = new String[n];
        for (int i = 0; i < n; i++)
            array[i] = next();

        return array;
    }

    public String nextLine() {
        int c = read();
        while (isEndline(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do {
            res.appendCodePoint(c);
            c = read();
        } while (!isEndline(c));
        return res.toString();
    }

    public int[][] nextPackedIntArrays(int packN, int size) {
        int[][] res = new int[packN][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < packN; j++) {
                res[j][i] = nextInt();
            }
        }
        return res;
    }
}

class BinaryIndexedTree {
    final int n;
    final long[] a;

    private BinaryIndexedTree(int size, long[] a) {
        this.n = size;
        this.a = a;
    }

    public static BinaryIndexedTree create(int n) {
        int size = Integer.highestOneBit(n) << 1;
        return new BinaryIndexedTree(size, new long[size+1]);
    }

    public void add(int x, long w) {
        for (int i = x; i <= n; i += i & -i) {
            a[i] += w;
        }
    }

    public long sum(int x) {
        long res = 0;
        for (int i = x; i > 0; i -= i & -i) {
            res += a[i];
        }
        return res;
    }
}

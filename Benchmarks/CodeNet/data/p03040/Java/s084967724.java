import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.InputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.Map;
import java.io.FileNotFoundException;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/F5";

    FastScanner in;
    PrintWriter out;


    class Pair {
        final int p;
        final int cnt;

        public Pair(int p, int cnt) {
            this.p = p;
            this.cnt = cnt;
        }
    }

    public void solve() {
        int Q = in.nextInt();

        TreeSet<Pair> ts = new TreeSet<>((p1, p2) -> {
            if (p1.p == p2.p) {
                return p1.cnt - p2.cnt;
            } else {
                return p1.p - p2.p;
            }
        });
        Map<Integer, Integer> counts = new HashMap<>();

        Pair curValue = null;
        long res = 0;

        for (int q = 0; q < Q; q++) {
            int t = in.nextInt();
            if (t == 1) {
                int a = in.nextInt();
                int b = in.nextInt();

                int count = counts.getOrDefault(a, 0);
                counts.put(a, count + 1);
                Pair p = new Pair(a, count);
                ts.add(p);

                if (curValue == null) {
                    res += b;
                    curValue = p;
                } else if (ts.size() % 2 == 1 && curValue.p <= a) {
                    curValue = ts.higher(curValue);
                    res += Math.abs(curValue.p - (long) a) + b;
                } else if (ts.size() % 2 == 0 && curValue.p > a) {
                    res += Math.abs(curValue.p - (long) a) + b;
                    curValue = ts.lower(curValue);
                } else {
                    res += Math.abs(curValue.p - (long) a) + b;
                }
            } else {
                out.println(curValue.p + " " + res);
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

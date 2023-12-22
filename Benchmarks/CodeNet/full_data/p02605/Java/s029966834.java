import java.io.PrintWriter;
import java.util.Map;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileNotFoundException;
import java.util.TreeSet;
import java.util.InputMismatchException;
import java.io.FileInputStream;
import java.util.HashMap;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/main/java/F5";

    FastScanner in;
    PrintWriter out;

    class Point {
        final int x;
        final int y;
        final char u;

        public Point(int x, int y, char u) {
            this.x = x;
            this.y = y;
            this.u = u;
        }

        int to45x() {
            return x - y;
        }

        int to45y() {
            return x + y;
        }
    }

    public void solve() {
        int n = in.nextInt();
        Point[] ps = new Point[n];
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            char u = in.next().charAt(0);
            ps[i] = new Point(x * 10, y * 10, u);
        }
        Map<Character, Map<Integer, TreeSet<Integer>>> mx = new HashMap<>();
        Map<Character, Map<Integer, TreeSet<Integer>>> my = new HashMap<>();
        Map<Character, Map<Integer, TreeSet<Integer>>> m45x = new HashMap<>();
        Map<Character, Map<Integer, TreeSet<Integer>>> m45y = new HashMap<>();
        for (int i = 0; i < n; i++) {
            mx.computeIfAbsent(ps[i].u, k -> new HashMap<>())
                    .computeIfAbsent(ps[i].x, k -> new TreeSet<>())
                    .add(ps[i].y);
            my.computeIfAbsent(ps[i].u, k -> new HashMap<>())
                    .computeIfAbsent(ps[i].y, k -> new TreeSet<>())
                    .add(ps[i].x);
            m45x.computeIfAbsent(ps[i].u, k -> new HashMap<>())
                    .computeIfAbsent(ps[i].to45x(), k -> new TreeSet<>())
                    .add(ps[i].to45y());
            m45y.computeIfAbsent(ps[i].u, k -> new HashMap<>())
                    .computeIfAbsent(ps[i].to45y(), k -> new TreeSet<>())
                    .add(ps[i].to45x());
        }

        long res = Long.MAX_VALUE;
        Map<Integer, TreeSet<Integer>> EMPTY_MAP = new HashMap<>();
        TreeSet<Integer> EMPTY = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            if (ps[i].u == 'U') {
                {
                    Integer lv = mx.getOrDefault('D', EMPTY_MAP).getOrDefault(ps[i].x, EMPTY).higher(ps[i].y);
                    if (lv != null) {
                        res = Math.min(res, Math.abs(lv - ps[i].y) / 2);
                    }
                }
                {
                    Integer lv = m45x.getOrDefault('L', EMPTY_MAP).getOrDefault(ps[i].to45x(), EMPTY).higher(ps[i].to45y());
                    if (lv != null) {
                        res = Math.min(res, Math.abs(lv - ps[i].to45y()) / 2);
                    }
                }
                {
                    Integer lv = m45y.getOrDefault('R', EMPTY_MAP).getOrDefault(ps[i].to45y(), EMPTY).lower(ps[i].to45x());
                    if (lv != null) {
                        res = Math.min(res, Math.abs(lv - ps[i].to45x()) / 2);
                    }
                }
            } else if (ps[i].u == 'D') {
                {
                    Integer lv = m45y.getOrDefault('L', EMPTY_MAP).getOrDefault(ps[i].to45y(), EMPTY).higher(ps[i].to45x());
                    if (lv != null) {
                        res = Math.min(res, Math.abs(lv - ps[i].to45x()) / 2);
                    }
                }
                {
                    Integer lv = m45x.getOrDefault('R', EMPTY_MAP).getOrDefault(ps[i].to45x(), EMPTY).lower(ps[i].to45y());
                    if (lv != null) {
                        res = Math.min(res, Math.abs(lv - ps[i].to45y()) / 2);
                    }
                }
            } else if (ps[i].u == 'R') {
                Integer lv = my.getOrDefault('L', EMPTY_MAP).getOrDefault(ps[i].y, EMPTY).higher(ps[i].x);
                if (lv != null) {
                    res = Math.min(res, Math.abs(lv - ps[i].x) / 2);
                }
            }
        }
        System.out.println(res == Long.MAX_VALUE ? "SAFE" : res);
    }

    public void run() {
        if (__FILE_DEBUG_FLAG__ == __t__) {
            try {
                is = new FileInputStream(__DEBUG_FILE_NAME__);
            } catch (FileNotFoundException e) {
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

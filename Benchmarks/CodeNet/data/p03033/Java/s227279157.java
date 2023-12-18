import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/C1";

    FastScanner in;
    PrintWriter out;

    class Pair {
        final int type;
        final long time;
        final long dist;
        final int index;

        public Pair(int type, long time, long dist) {
            this(type, time, dist, -1);
        }

        public Pair(int type, long time, long dist, int index) {
            this.type = type;
            this.time = time;
            this.dist = dist;
            this.index = index;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "type=" + type +
                    ", time=" + time +
                    ", dist=" + dist +
                    ", index=" + index +
                    '}';
        }
    }

    public void solve() {
        int N = in.nextInt();
        int Q = in.nextInt();
        List<Pair> ps = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            final int S = in.nextInt();
            final int T = in.nextInt();
            final int X = in.nextInt();
            final int start = Math.max(0, S - X);
            final int end = T - X;
            if (end <= start) {
                continue;
            }
            ps.add(new Pair(0, start, X));
            ps.add(new Pair(1, end, X));
        }

        for (int i = 0; i < Q; i++) {
            int d = in.nextInt();
            ps.add(new Pair(2, d, -1, i));
        }

        ps.sort(Comparator.comparingLong(p -> p.time));
        TreeMap<Long, Integer> treeMap = new TreeMap<>();
        long[] res = new long[Q];
        Arrays.fill(res, -1);
        for (final Pair p : ps) {
            if (p.type == 0) {
                treeMap.put(p.dist, treeMap.getOrDefault(p.dist, 0) + 1);
            } else if (p.type == 1) {
                if (!treeMap.containsKey(p.dist) || treeMap.get(p.dist) == 0) {
                    throw new RuntimeException();
                }
                final int c = treeMap.get(p.dist);
                if (c == 1) {
                    treeMap.remove(p.dist);
                } else {
                    treeMap.put(p.dist, c - 1);
                }
            } else if (p.type == 2) {
                if (!treeMap.isEmpty()) {
                    res[p.index] = treeMap.firstKey();
                }
            } else {
                throw new RuntimeException();
            }
            // System.out.println(p + " " + treeMap);
        }
        for (int i = 0; i < Q; i++) {
            System.out.println(res[i]);
        }
    }

    /* MOD_CALCULATION */
    int MOD = 1_000_000_007;
    long ADD(long a, long b) {
        return (a + b) % MOD;
    }

    long SUB(long a, long b) {
        return (a - b + MOD) % MOD;
    }

    long MULT(long a, long b) {
        return (a * b) % MOD;
    }

    long POW(long a, long x) {
        long res = 1;
        for ( ; x > 0; x >>= 1) {
            if (x % 2 == 1) res = MULT(res, a);
            a = MULT(a, a);
        }

        return res;
    }

    long DIV(long a, long b) {
        return MULT(a, POW(b, MOD - 2));
    }
    /* end */


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

        boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        boolean isEndline(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++)
                array[i] = nextInt();

            return array;
        }

        int[][] nextIntMap(int n, int m) {
            int[][] map = new int[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextIntArray(m);
            }
            return map;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        long[] nextLongArray(int n) {
            long[] array = new long[n];
            for (int i = 0; i < n; i++)
                array[i] = nextLong();

            return array;
        }

        long[][] nextLongMap(int n, int m) {
            long[][] map = new long[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextLongArray(m);
            }
            return map;
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        double[] nextDoubleArray(int n) {
            double[] array = new double[n];
            for (int i = 0; i < n; i++)
                array[i] = nextDouble();

            return array;
        }

        double[][] nextDoubleMap(int n, int m) {
            double[][] map = new double[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = in.nextDoubleArray(m);
            }
            return map;
        }

        String next() {
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

        String[] nextStringArray(int n) {
            String[] array = new String[n];
            for (int i = 0; i < n; i++)
                array[i] = next();

            return array;
        }

        String nextLine() {
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
    }
}

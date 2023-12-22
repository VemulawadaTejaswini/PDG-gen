import java.util.Map;
import java.util.Set;
import java.io.IOException;
import java.util.HashSet;
import java.util.TreeMap;
import java.io.PrintWriter;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/main/java/test/sample-1.in";

    FastScanner in;
    PrintWriter out;

    public void solve() {
        int H = in.nextInt();
        int W = in.nextInt();
        int[] A = new int[H];
        int[] B = new int[H];
        for (int i = 0; i < H; i++) {
            A[i] = in.nextInt();
            B[i] = in.nextInt();
        }
        TreeMap<Integer, Integer> cnts = new TreeMap<>();
        TreeMap<Integer, Integer> tm = new TreeMap<>();

        for (int i = 1; i <= W; i++) {
            tm.put(i, i);
        }
        cnts.put(0, W);

        for (int i = 0; i < H; i++) {
            Set<Integer> rem = new HashSet<>();
            int max = 0;
            for (Map.Entry<Integer, Integer> e : tm.subMap(A[i], B[i] + 1).entrySet()) {
                int v = e.getKey() - e.getValue();
                if (cnts.get(v) == 1) {
                    cnts.remove(v);
                } else {
                    cnts.put(v, cnts.get(v) - 1);
                }
                rem.add(e.getKey());
                max = Math.max(e.getValue(), max);
            }
            rem.forEach(tm::remove);
            if (B[i] != W) {
                int k = B[i] + 1 - max;
                cnts.put(k, cnts.getOrDefault(k, 0) + 1);
                tm.put(B[i] + 1, max);
            }
            System.out.println(cnts.isEmpty() ? -1 : cnts.firstKey() + i + 1);
        }
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

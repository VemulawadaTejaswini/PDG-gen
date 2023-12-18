import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/D4";

    FastScanner in;
    PrintWriter out;

    int MOD = 1_000_000_007;
    class Pair {
        final int v;
        final int t;

        public Pair(int v, int t) {
            this.v = v;
            this.t = t;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "v=" + v +
                    ", t=" + t +
                    '}';
        }
    }

    public void solve() {
        int N = in.nextInt();
        int M = in.nextInt();
        int[] A = in.nextIntArray(N);
        int[] B = in.nextIntArray(M);
        HashSet<Integer> aHash = new HashSet<>();
        HashSet<Integer> bHash = new HashSet<>();
        for (int i = 0; i < N; i++) {
            if (aHash.contains(A[i])) {
                System.out.println("0");
                return;
            }
            aHash.add(A[i]);
        }
        for (int j = 0; j < M; j++) {
            if (bHash.contains(B[j])) {
                System.out.println("0");
                return;
            }
            bHash.add(B[j]);
        }
        if (N == 1 && M == 1) {
            System.out.println("1");
            return;
        }

        Pair[] ps = new Pair[N+M];
        for (int i = 0; i < N; i++) {
            ps[i] = new Pair(A[i], 0);
        }
        for (int i = 0; i < M; i++) {
            ps[i+N] = new Pair(B[i], 1);
        }
        Arrays.sort(ps, (p1, p2) -> Integer.compare(p2.v, p1.v));

        if (ps[0].v != ps[1].v) {
            System.out.println("0");
            return;
        }
        long res = 1;
        long rCnt = 1, cCnt = 1;
        int cellCnt = 1;
        for (int i = 2; i < N + M; i++, cellCnt++) {
            if (ps[i-1].v != ps[i].v + 1) {
                for (int j = ps[i - 1].v - 1; j > ps[i].v; j--) {
                    if (rCnt * cCnt == cellCnt) {
                        System.out.println("0");
                        return;
                    }
                    res = MULT(res, rCnt * cCnt - cellCnt);
                    cellCnt++;
                }
            }

            if (i < N + M - 1 && ps[i].v == ps[i+1].v) {
                if (ps[i].t == ps[i+1].t) {
                    throw new RuntimeException();
                }
                rCnt++;
                cCnt++;
                i++;
            } else {
                if (ps[i].t == 0) {
                    res = MULT(res, rCnt);
                    cCnt++;
                } else {
                    res = MULT(res, cCnt);
                    rCnt++;
                }
            }
        }
        long fact = 1;
        for (int i = 2; i <= ps[ps.length-1].v - 1; i++) {
            fact = MULT(fact, i);
        }
        res = MULT(res, fact);
        System.out.println(res);
    }

    long MULT(long a, long b) {
        long res = ((a % MOD) * (b % MOD)) % MOD;
        return res;
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

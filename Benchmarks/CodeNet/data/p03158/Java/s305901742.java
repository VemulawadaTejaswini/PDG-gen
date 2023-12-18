import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/A1";

    FastScanner in;
    PrintWriter out;

    public void solve() {
        /*
        int[] s = new int[101];
        Random r = new Random();
        for (int i = 0; i < 101; i++) {
            s[i] = r.nextInt(10000);
        }
        Arrays.sort(s);
        for (int i = 0; i < 101; i++) {
            System.out.print(s[i] + " ");
        }
        */
        int N = in.nextInt(), Q = in.nextInt();
        int[] a = in.nextIntArray(N);
        int[] X = in.nextIntArray(Q);

        long[] v = new long[(N+1)/2];
        long[] sum = new long[(N+1)/2+1];
        for (int i = N - 1; i >= N / 2; i--) {
            sum[0] += a[i];
        }
        for (int ptr = 0, i = N / 2, j = N % 2 == 0 ? 1 : 0; i < N; ptr++, i++, j += 2) {
            v[ptr] = a[j] + (a[i] - a[j]) / 2 + 1;
            sum[ptr+1] = sum[ptr] - (a[i] - a[j]);
            // System.out.println(v[ptr] + " " + sum[ptr+1]);
        }

        for (int i = 0; i < Q; i++) {
            int lo = -1, hi = v.length;
            while (hi - lo > 1) {
                int mid = (hi + lo) / 2;
                if (v[mid] < X[i] + 1) {
                    lo = mid;
                } else {
                    hi = mid;
                }
            }
            System.out.println(sum[lo+1]);
        }

        /*
        Set<List<Integer>> hash = new TreeSet<>((l1, l2) -> {
            for (int i = 0; i < l1.size(); i++) {
                if (l1.get(i) > l2.get(i)) {
                    return 1;
                } else if (l1.get(i) < l2.get(i)) {
                    return -1;
                }
            }
            return 0;
        });
        for (int i = 0; i < 10000; i++) {
            naive(a, i, hash);
        }
        */
    }

    private void naive(int[] a, int x, Set<List<Integer>> set) {
        int n = a.length;
        boolean[] used = new boolean[n];

        int turn = 0;
        List<Integer> takahashi = new ArrayList<>();
        List<Integer> aoki = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int nextIdx = -1;
            List<Integer> l = turn == 0 ? takahashi : aoki;
            for (int j = 0; j < n; j++) {
                if (!used[j]) {
                    if ((nextIdx == -1 && !used[j]) || (turn == 0 && a[nextIdx] < a[j]) || (turn == 1 && Math.abs(a[nextIdx] - x) > Math.abs(a[j] - x))) {
                        nextIdx = j;
                    }
                }
            }
            used[nextIdx] = true;
            l.add(nextIdx);
            turn ^= 1;
        }
        // System.out.println(x + " : " + takahashi + " " + aoki + " " + takahashi.stream().reduce(0, (i1, i2) -> i1 + i2));
        if (!set.contains(takahashi)) {
            System.out.println(x + " " + takahashi + " " + takahashi.stream().reduce(0, (i1, i2) -> i1 + a[i2]));
        }
        set.add(takahashi);
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

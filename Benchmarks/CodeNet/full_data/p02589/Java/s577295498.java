import java.util.InputMismatchException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.io.IOException;
import java.util.Map;
import java.util.Arrays;
import java.io.FileNotFoundException;

public class Main {
    InputStream is;

    int __t__ = 1;
    int __f__ = 0;
    int __FILE_DEBUG_FLAG__ = __f__;
    String __DEBUG_FILE_NAME__ = "src/main/java/B2";

    FastScanner in;
    PrintWriter out;

    // System.out.println(BigInteger.probablePrime(55, new Random(1245)));
    final long MOD = 28794180140857213L;

    public void solve() {
        int n = in.nextInt();
        String[] s = in.nextStringArray(n);
        Arrays.sort(s, (s1, s2) -> s1.length() - s2.length());

        long res = 0;
        Map<Long, Map<Integer, Integer>> map1 = new HashMap<>();

        int[] cnt = new int[26];
        for (int i = 0; i < n; i++) {
            long hash = 0;
            int l = s[i].length();
            Arrays.fill(cnt, 0);

            for (int j = l - 1; j >= 0; j--) {
                int c = s[i].charAt(j) - 'a' + 1;
                if (map1.containsKey(hash)) {
                    for (Map.Entry<Integer, Integer> e : map1.get(hash).entrySet()) {
                        cnt[e.getKey()] += e.getValue();
                    }
                }
                res += cnt[c-1];
                cnt[c-1] = 0;
                if (j == 0) {
                    int c0 = s[i].charAt(0) - 'a';
                    Map<Integer, Integer> m = map1.computeIfAbsent(hash, k -> new HashMap<>());
                    m.put(c0, m.getOrDefault(c0, 0) + 1);
                }
                hash = (hash * 31 + c) % MOD;
            }
        }
        System.out.println(res);
        /*
        int n = in.nextInt();
        int T = 5, F = 4;
        int[][][] cnt = new int[5][T][F];
        for (int i = 0; i < n; i++) {
            String[] s = in.next().split("[.]");
            int a = Integer.valueOf(s[0]);
            if (s.length == 1) {
                cnt[0][d(a, 2)][d(a, 5)]++;
                System.out.println(s[0] + ", " + d(a, 2) + " " + d(a, 5));
                continue;
            }

            String x = f(s[1]);
            int l = x.length();
            if (l <= 4) {
                long b = conv(f(s[1]));
                long c = a * pow(10, l) + b;
                System.out.println(s[0] + "." + s[1] + ", " + l + " " + d(c, 2) + " " + d(c, 5));
                cnt[l][d(c, 2)][d(c, 5)]++;
            }
        }

        long res = 0;
        for (int i = 0; i < 5; i++) for (int j = 0; j < 5; j++) {
            for (int t1 = 0; t1 < T; t1++) for (int f1 = 0; f1 < F; f1++) {
                for (int t2 = 0; t2 < T; t2++) for (int f2 = 0; f2 < F; f2++) {
                    if (Math.min(t1 + t2, f1 + f2) >= i + j) {
                        if (i == j && t1 == t2 && f1 == f2) {
                            if (cnt[i][t1][f1] >= 2) {
                                System.out.println(i + " " + t1 + " " + f1 + " " + cnt[i][t1][f1]);
                            }
                            res += (cnt[i][t1][f1] * (cnt[j][t2][f2] - 1)) / 2;
                        } else {
                            if (cnt[i][t1][f1] != 0 && cnt[j][t2][f2] != 0) {
                                System.out.println(i + " " + t1 + " " + f1 + " " + j + " " + t2 + " " + f2 + " " + cnt[i][t1][f1] + " " + cnt[j][t2][f2]);
                            }
                            res += cnt[i][t1][f1] * cnt[j][t2][f2];
                        }
                    }
                }
            }
        }
        System.out.println(res);

         */
    }

    private long pow(int v, int b) {
        long res = 1;
        for (int i = 0; i < b; i++) {
            res *= v;
        }
        return res;
    }

    private int d(long b, int i) {
        int res = 0;
        while (b % i == 0) {
            res++;
            b /= i;
        }
        return res;
    }

    private String f(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != '0') {
                return s.substring(0, i + 1);
            }
        }
        return "";
    }

    private long conv(String s) {
        long res = 0;
        for (int i = 0; i < s.length(); i++) {
            res = (res * 10) + (s.charAt(i) - '0');
        }
        return res;
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

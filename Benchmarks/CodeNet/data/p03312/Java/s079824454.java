import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {

    private long[] s;
    private int n;

    void solve() throws Throwable {
        n = readInt();
        s = new long[n + 1];
        for (int i = 0; i < n; i++) {
            s[i + 1] = readLong() + s[i];
        }
        long mi = Long.MAX_VALUE;
        for (int edge = 2; edge < n - 1; edge++) {
            int a = binsearch(0, edge);
            int b = binsearch(edge, n);
            //System.err.println(edge + " " + a + " " + b);
            for (int da = -1; da <= 1; da++) {
                for (int db = -1; db <= 1; db++) {
                    int x = a + da;
                    int y = edge;
                    int z = b + db;
                    long t = f(x, y, z);
                    if (t < mi) {
                        mi = t;
//                        System.err.println(x + " " + y + " " + z);
//                        System.err.println(sum(0, x) + " " + sum(x, y) + " " + sum(y, z));
//                        System.err.println();
                    }
                }
            }
        }
        System.err.println(mi);
    }

    private long f(int a, int b, int c) {
        if (a > 0 && a < b && b < c && c < n) {
            long[] t = {sum(0, a), sum(a, b), sum(b, c), sum(c, n)};
            Arrays.sort(t);
            return t[3] - t[0];
        } else {
            return Long.MAX_VALUE;
        }
    }

    private int binsearch(int a, int b) {
        // find max edge при котором слева меньше
        int l = a, r = b;
        while (l < r - 1) {
            int mid = (l + r) / 2;
            if (sum(a, mid) < sum(mid, b)) {
                l = mid;
            } else {
                r = mid;
            }
        }
        return l;
    }

    long sum(int l, int r) {
        return s[r] - s[l];
    }

    //-------------------------------------------------

    final boolean ONLINE_JUDGE = !new File("input.txt").exists();

    BufferedReader in;
    PrintWriter out;
    StringTokenizer tok;

    public void run() {
        Runnable run = () -> {
            try {
                long startTime = System.currentTimeMillis();
                Locale.setDefault(Locale.US);
                if (ONLINE_JUDGE) {
                    in = new BufferedReader(new InputStreamReader(System.in));
                    out = new PrintWriter(System.out);
                } else {
                    in = new BufferedReader(new FileReader("input.txt"));
                    out = new PrintWriter("output.txt");
                }
                tok = new StringTokenizer("");
                solve();
                in.close();
                out.close();
                long endTime = System.currentTimeMillis();
                long totalMemory = Runtime.getRuntime().totalMemory();
                long freeMemory = Runtime.getRuntime().freeMemory();
                System.err.println();
                System.err.println("Time = " + (endTime - startTime) + " ms");
                //System.err.println("Memory = " + ((totalMemory - freeMemory) / 1024) + " KB");
            } catch (Throwable e) {
                e.printStackTrace(System.err);
                System.exit(-1);
            }
        };
        new Thread(null, run, "run", 256 * 1024 * 1024).start();
        min(0, 0);
    }

    String readString() {
        while (!tok.hasMoreTokens()) {
            String line;
            try {
                line = in.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (line == null) return null;
            tok = new StringTokenizer(line);
        }
        return tok.nextToken();
    }

    int readInt() {
        return Integer.parseInt(readString());
    }

    long readLong() throws IOException {
        return Long.parseLong(readString());
    }

    double readDouble() throws IOException {
        return Double.parseDouble(readString());
    }

    void debug(Object... o) {
        if (!ONLINE_JUDGE) {
            System.err.println(Arrays.deepToString(o));
        }
    }

    /*long binpow(long a, long n) {
        long r = 1;
        while (n > 0) {
            if ((n & 1) > 0) {
                r *= a;
            }
            a *= a;
            n /= 2;
        }
        return r;
    }/**/

    long binpow(long a, long n, long mod) {
        long r = 1;
        while (n > 0) {
            if ((n & 1) > 0) {
                r = (r * a) % mod;
            }
            a = (a * a) % mod;
            n /= 2;
        }
        return r;
    }/**/

    static long gcd(long x, long y) {
        return y == 0 ? x : gcd(y, x % y);
    }

    private long[] readLongArray(int n) throws IOException {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = readLong();
        }
        return a;
    }

    private int[] readIntArray(int n) throws IOException {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = readInt();
        }
        return a;
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
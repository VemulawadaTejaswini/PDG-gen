import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {

    private Pair[] ma1;
    private Pair[] ma2;

    //TreeSet<Pair>[] sets;

    void solve() throws Throwable {
        int p = readInt();
        int n = 1 << p;
        long[] a = readLongArray(n);

        ma1 = new Pair[n];
        ma2 = new Pair[n];
        for (int i = 0; i < n; i++) {
            ma1[i] = ma2[i] = new Pair(0, i);
        }
        for (int mask = 0; mask < n; mask++) {
            update(mask, new Pair(a[mask], mask));
            for (int i = 0; i < p; i++) {
                int newMask = mask | (1 << i);
                if (mask != newMask) {
                    update(newMask, ma1[mask]);
                    update(newMask, ma2[mask]);
                    //update(newMask, sets[mask].first());
                    //update(newMask, sets[mask].last());
                }
            }
        }
        //System.err.println(Arrays.toString(ma1));
        //System.err.println(Arrays.toString(ma2));
        long[] ans = new long[n];
        for (int k = 1; k < n; k++) {
            ans[k] = max(ans[k - 1], ma1[k].val + ma2[k].val);
            System.out.println(ans[k]);
        }
    }

    static class Pair implements Comparable<Pair> {
        final long val;
        final int ind;

        Pair(long val, int ind) {
            this.val = val;
            this.ind = ind;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return val == pair.val &&
                    ind == pair.ind;
        }

        @Override
        public int hashCode() {

            return Objects.hash(val, ind);
        }

        @Override
        public int compareTo(Pair o) {
            if (val != o.val) {
                return Long.compare(val, o.val);
            }
            return Integer.compare(ind, o.ind);
        }
    }

    private void update(int ind, Pair p) {
        if (p.compareTo(ma2[ind]) > 0) {
            ma1[ind] = ma2[ind];
            ma2[ind] = p;
        } else if (p.compareTo(ma1[ind]) > 0 && !p.equals(ma2[ind])) {
            ma1[ind] = p;
        }
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
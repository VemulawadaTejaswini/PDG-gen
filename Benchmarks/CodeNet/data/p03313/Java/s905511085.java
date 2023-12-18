import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {

    //private long[] ma1;
    //private long[] ma2;

    TreeSet<Pair>[] sets;

    void solve() throws Throwable {
        int p = readInt();
        int n = 1 << p;
        long[] a = readLongArray(n);
        sets = new TreeSet[n];
        for (int i = 0; i < n; i++) {
            sets[i] = new TreeSet<>();
        }

        //ma1 = new long[n];
        //ma2 = new long[n];
        for (int mask = 0; mask < n; mask++) {
            update(mask, new Pair(a[mask], mask));
            for (int i = 0; i < p; i++) {
                int newMask = mask | (1 << i);
                if (mask != newMask) {
                    //update(newMask, ma1[mask]);
                    //update(newMask, ma2[mask]);
                    update(newMask, sets[mask].first());
                    update(newMask, sets[mask].last());
                }
            }
        }
        //System.err.println(Arrays.toString(ma1));
        //System.err.println(Arrays.toString(ma2));
        long[] ans = new long[n];
        for (int k = 1; k < n; k++) {
            ans[k] = max(ans[k - 1], sets[k].first().val + sets[k].last().val);
            System.out.println(ans[k]);
        }
    }

    private void update(int mask, Pair pair) {
        TreeSet<Pair> set = sets[mask];
        set.add(pair);
        if (set.size() > 2) {
            set.remove(set.first());
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
        public int compareTo(Pair o) {
            if (val != o.val) {
                return Long.compare(val, o.val);
            }
            return Integer.compare(ind, o.ind);
        }
    }

//    private void update(int ind, long val) {
//        if (val > ma2[ind]) {
//            ma1[ind] = ma2[ind];
//            ma2[ind] = val;
//        } else if (val > ma1[ind]) {
//            ma1[ind] = val;
//        }
//    }

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
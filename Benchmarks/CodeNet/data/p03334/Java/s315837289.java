import sun.reflect.generics.tree.Tree;

import java.io.*;
import java.util.*;

import static java.lang.Math.*;
//import static java.lang.Math.*;

public class Main {

    int n, d1, d2;

    void solve() throws IOException {
        n = readInt();
        d1 = readInt();
        d2 = readInt();
        List<Pair> t1 = find(d1);
        List<Pair> t2 = find(d2);
        List<Pair> t = new ArrayList<>();
        t.addAll(t1);
        t.addAll(t2);
//        System.out.println(a);
//        System.out.println(b);
        List<Pair> ans = new ArrayList<>();
        boolean[][] b = new boolean[2 * n][2 * n];
        int required = n * n;

        List<Pair> pts = new ArrayList<>();
        for (int i = 0; i < 2 * n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                pts.add(new Pair(i, j));
            }
        }
        pts.sort(Comparator.comparing(p -> abs(p.x - n) + abs(p.y - n)));

        Comparator comp = Comparator.comparing((PairCnt p) -> p.cnt).thenComparing((PairCnt p) -> p.p.x).thenComparing((PairCnt p) -> p.p.y);
        TreeSet<PairCnt> cnt = new TreeSet<>(comp);
        int[][] cntAr = new int[2 * n][2 * n];
        for (Pair pt : pts) {
            cnt.add(new PairCnt(pt, 0));
        }

        for (int i = 0; i < required; i++) {
            PairCnt p = cnt.last();
            cnt.remove(p);
            ans.add(p.p);
            for (Pair tp : t) {
                int toX = p.p.x + tp.x;
                int toY = p.p.y + tp.y;
                if (inside(toX, toY)) {
                    for (Pair tp2 : t) {
                        int toX2 = toX + tp2.x;
                        int toY2 = toY + tp2.y;
                        incCnt(cnt, cntAr, toX, toY);
                    }
                }
            }
        }

        if (ans.size() < required) {
            System.out.println("fail");
            throw new RuntimeException();
        } else {
            for (Pair p : ans) {
                System.out.println(p.x + " " + p.y);
            }
        }
    }

    private void incCnt(TreeSet<PairCnt> cnt, int[][] cntAr, int x, int y) {
        PairCnt p = new PairCnt(new Pair(x, y), cntAr[x][y]);
        if (cnt.contains(p)) {
            cnt.remove(p);
            cntAr[x][y]++;
            new PairCnt(new Pair(x, y), cntAr[x][y]);
        }
    }

    private boolean inside(int toX, int toY) {
        return toX >= 0 && toY >= 0 && toX < 2 * n && toY < 2 * n;
    }

    private List<Pair> find(int d) {
        List<Pair> r = new ArrayList<>();
        for (int x = 0; x <= d; x++) {
            int sqrY = d - x * x;
            int y = (int) round(sqrt(sqrY));
            if (y * y == sqrY) {
                r.add(new Pair(x, y));
                r.add(new Pair(x, -y));
                r.add(new Pair(-x, y));
                r.add(new Pair(-x, -y));
            }
        }
        return r;
    }

    static class Pair {
        final int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    static class PairCnt {
        final Pair p;
        final int cnt;

        PairCnt(Pair p, int cnt) {
            this.p = p;
            this.cnt = cnt;
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

    long binpow(int a, int n) {
        long r = 1;
        while (n > 0) {
            if ((n & 1) > 0) {
                r *= a;
            }
            a *= a;
            n /= 2;
        }
        return r;
    }

    static long gcd(long x, long y) {
        return y == 0 ? x : gcd(y, x % y);
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
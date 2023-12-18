import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;

    int[] p;
    int[] a;

    boolean[] ok;
    int[] sz;

    int[] min;

    int[] tin, tout;
    int time;

    ArrayList<Integer>[] g;

    void go(int v) {
        tin[v] = time++;
        for (int to : g[v]) {
            go(to);
        }
        tout[v] = time - 1;
    }

    void solve() {
        int n = in.nextInt();
        int[] p = new int[n];
        int[] a = new int[n];
        for (int i = 1; i < n; i++) {
            p[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        solve(n, p, a);
    }

    void solve(int n, int[] p, int[] a) {
        this.p = p;
        this.a = a;
        Random rnd = new Random(123);
        tin = new int[n];
        tout = new int[n];
        time = 0;
        g = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 1; i < n; i++) {
            g[p[i]].add(i);
        }
        go(0);
        min = new int[n];
        sz = new int[n];
        ok = new boolean[n];
        updateOk(-1);
        ArrayList<Integer> queries = new ArrayList<>();
        int[] arr = new int[n + 1];
        while (!ok[0]) {
//            System.err.println(sz[0]);
            if (queries.size() > 25000) {
                throw new AssertionError();
            }
            int cur = a[0];
            updateOk(cur);
            while (true) {
                int usedSize = 0, next = -1;
                int arrSz = 0;
                for (int to : g[cur]) {
                    if (!ok[to]) {
                        int nextSize = usedSize + sz[to];
                        if (rnd.nextInt(nextSize) < usedSize) {

                        } else {
                            next = to;
                        }
                        usedSize = nextSize;
                    }
                }
                if (next == -1) {
                    break;
                }
                cur = next;
            }
            move(cur);
            updateOk(-1);
            queries.add(cur);
        }
        out.println(queries.size());
        for (int x : queries) {
            out.println(x);
        }
    }

    void move(int g) {
        int newValue = a[0];
        while (g != 0) {
            int tmp = a[g];
            a[g] = newValue;
            newValue = tmp;
            g = p[g];
        }
        a[g] = newValue;
    }

    void updateOk(int curValue) {
        Arrays.fill(sz, 0);
        Arrays.fill(ok, true);
        Arrays.fill(min, Integer.MAX_VALUE);
        for (int i = a.length - 1; i >= 0; i--) {
            int cur = a[i];
            if (tin[cur] <= tin[i] && tout[cur] <= tout[i]) {

            } else {
                ok[i] = false;
            }
            if (cur < curValue) {
                ok[i] = false;
            }
            min[i] = Math.min(min[i], a[i]);
            min[p[i]] = Math.min(min[p[i]], min[i]);
            if (!ok[i]) {
                sz[i]++;
                sz[p[i]] += sz[i];
                ok[p[i]] = false;
            }
        }
    }

    void run() {
        try {
            in = new FastScanner(new File("MainT.in"));
            out = new PrintWriter(new File("MainT.out"));

            solve();

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    void runIO() {

        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);

        solve();

        out.close();
    }

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        boolean hasMoreTokens() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return false;
                st = new StringTokenizer(s);
            }
            return true;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}
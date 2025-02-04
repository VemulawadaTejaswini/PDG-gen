
import com.sun.source.tree.Tree;

import java.io.*;
import java.util.*;

public class Main {
    private static final boolean N_CASE = false;

    private static final int MOD = 998_244_353;
    private static final int M = 200005;
    private long[][] v;

    private long get(int a, int b, int x) {
        return ((v[x][b] - v[x][a - 1]) % MOD + MOD)%MOD;
    }

    private static class R implements Comparable<R> {
        int l, r, x;

        public R(int l, int r, int x) {
            this.l = l;
            this.r = r;
            this.x = x;
        }

        @Override
        public int compareTo(R r) {
            return l - r.l;
        }
    }

    private long add(long a, long b) {
        return ((a + b) % MOD + MOD) % MOD;
    }

    private void solve() {
        v = new long[10][M];

        for (int i = 0; i < 10; i++) {
            for (int j = 1; j < M; j++) {
                v[i][j] = (v[i][j - 1] * 10 + i) % MOD;
            }
        }

        int N = sc.nextInt();
        int Q = sc.nextInt();

        TreeMap<Integer, R> s = new TreeMap<>();
        s.put(1, new R(1, N, 1));
        long ans = get(1, N, 1);
        while (Q-- > 0) {
            int r = N - sc.nextInt() + 1;
            int l = N - sc.nextInt() + 1;
            int d = sc.nextInt();

            Integer st = s.lowerKey(l);
            if (st == null) st = 0;
            List<R> add = new ArrayList<>();
            List<Integer> rm = new ArrayList<>();
            for (R rg : s.subMap(st, r + 1).values()) {
                rm.add(rg.l);
                ans = add(ans, -get(rg.l, rg.r, rg.x));
                if (rg.l < l) {
                    add.add(new R(rg.l, l - 1, rg.x));
                    ans = add(ans, get(rg.l, l - 1, rg.x));
                }

                if (rg.r > r) {
                    add.add(new R(r + 1, rg.r, rg.x));
                    ans = add(ans, get(r + 1, rg.r, rg.x));
                }
            }
            ans = add(ans,get(l, r, d));
            for (int t : rm) {
                s.remove(t);
            }

            for (R rg : add) {
                s.put(rg.l, rg);
            }
            s.put(l, new R(l, r, d));
            out.println(ans);
        }
    }

    private void run() {
        int T = N_CASE ? sc.nextInt() : 1;
        for (int t = 0; t < T; ++t) {
            solve();
        }
    }

    private static MyWriter out;
    private static MyScanner sc;

    private static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        private MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
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

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        int[][] nextIntArray(int n, int m) {
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextLong();
            }
            return a;
        }

        long[][] nextLongArray(int n, int m) {
            long[][] a = new long[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = nextLong();
                }
            }
            return a;
        }

        List<Integer> nextList(int n) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(nextInt());
            }
            return list;
        }

        List<Long> nextLongList(int n) {
            List<Long> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(nextLong());
            }
            return list;
        }

        char[] nextCharArray(int n) {
            return sc.next().toCharArray();
        }

        char[][] nextCharArray(int n, int m) {
            char[][] c = new char[n][m];
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                for (int j = 0; j < m; j++) {
                    c[i][j] = s.charAt(j);
                }
            }
            return c;
        }
    }

    private static class MyWriter extends PrintWriter {
        private MyWriter(OutputStream outputStream) {
            super(outputStream);
        }

        void printArray(int[] a) {
            for (int i = 0; i < a.length; ++i) {
                print(a[i]);
                print(i == a.length - 1 ? '\n' : ' ');
            }
        }

        void printArray(long[] a) {
            for (int i = 0; i < a.length; ++i) {
                print(a[i]);
                print(i == a.length - 1 ? '\n' : ' ');
            }
        }

        void println(int[] a) {
            for (int v : a) {
                println(v);
            }
        }

        void print(List<Integer> list) {
            for (int i = 0; i < list.size(); ++i) {
                print(list.get(i));
                print(i == list.size() - 1 ? '\n' : ' ');
            }
        }

        void println(List<Integer> list) {
            list.forEach(this::println);
        }
    }

    private <T> List<List<T>> createGraph(int n) {
        List<List<T>> g = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            g.add(new ArrayList<>());
        }
        return g;
    }

    private void fill(int[][] a, int value) {
        for (int[] row : a) {
            fill(row, value);
        }
    }

    private void fill(int[] a, int value) {
        Arrays.fill(a, value);
    }

    public static void main(String[] args) {
        out = new MyWriter(new BufferedOutputStream(System.out));
        sc = new MyScanner();
        new Main().run();
        out.close();
    }
}
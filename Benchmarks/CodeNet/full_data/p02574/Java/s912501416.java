
import java.io.*;
import java.util.*;

public class Main {
    private static final boolean N_CASE = false;
    private static final int M = 1000;

    private List<Integer> sieve() {
        List<Integer> prime = new ArrayList<>();
        boolean[] isPrime = new boolean[M + 1];
        Arrays.fill(isPrime, true);
        for (int i = 2; i <= M; ++i) {
            if (isPrime[i]) {
                prime.add(i);
                for (int j = 2; j * i <= M; ++j) {
                    isPrime[i * j] = false;
                }
            }
        }
        return prime;
    }

    private void solve() {
        List<Integer> prime = sieve();
        List<List<Integer>> fac = new ArrayList<>();
        for (int i = 0; i <= 1000000; ++i) {
            fac.add(new ArrayList<>());
            if (i < 2) {
                continue;
            }

            int v = i;
            for (int p : prime) {
                if (v < p) {
                    break;
                }
                if (v % p == 0) {
                    fac.get(i).add(v);
                    while (v % p == 0) v /= p;
                }
            }
            if (v > 1) {
                fac.get(i).add(v);
            }
        }

        int N = sc.nextInt();
        int[] A = sc.nextIntArray(N);

        Map<Integer, Integer> c = new HashMap<>();
        for (int i = 0; i < N; ++i) {
            for (int v : fac.get(A[i])) {
                c.put(v, c.getOrDefault(v, 0) + 1);
            }
        }

        boolean ok = true;
        for (Map.Entry<Integer, Integer> e : c.entrySet()) {
            if (e.getValue() > 1) {
                ok = false;
                break;
            }
        }

        if (ok) {
            out.println("pairwise coprime");
            return;
        }

        ok = true;
        for (Map.Entry<Integer, Integer> e : c.entrySet()) {
            if (e.getValue() >= N) {
                ok = false;
                break;
            }
        }

        if (ok) {
            out.println("setwise coprime");
        } else {
            out.println("not coprime");
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
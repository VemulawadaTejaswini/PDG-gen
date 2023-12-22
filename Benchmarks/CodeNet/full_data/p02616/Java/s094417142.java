
import java.io.*;
import java.util.*;

public class Main {
    private static final boolean N_CASE = false;
    private static final int MOD = 1000_000_007;

    private void solve() {
        int N = sc.nextInt();
        int K = sc.nextInt();
        List<Integer> A = sc.nextList(N);
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for (int x : A) {
            if (x >= 0) {
                pos.add(x);
            } else {
                neg.add(x);
            }
        }

        Collections.sort(pos);
        Collections.sort(neg);

        long ans = 1;
        if (pos.size() < K && (K - pos.size()) % 2 == 1) {
            int i = 0, j = neg.size() - 1;
            while (K > 0) {
                if (i < pos.size() && j >= 0) {
                    if (Math.abs(pos.get(i)) < Math.abs(neg.get(i))) {
                        ans = (ans * pos.get(i)) % MOD;
                        ++i;
                    } else {
                        ans = (ans * neg.get(j)) % MOD;
                        --j;
                    }
                } else if (i < pos.size()) {
                    ans = (ans * pos.get(i)) % MOD;
                    ++i;
                } else {
                    ans = (ans * neg.get(j)) % MOD;
                    --j;
                }
                --K;
            }
            ans = (ans + MOD) % MOD;
        } else {
            int i = pos.size() - 1;
            int j = 0;
            while (j + 1 + pos.size() < K) {
                j += 2;
            }

            while (i - 1 >= 0 && j + 1 < neg.size() && (long)pos.get(i) * pos.get(i - 1) < (long)neg.get(j) * neg.get(j + 1)) {
                i -= 2;
                j += 2;
            }

            for (int k = 0; k <= i; ++k) {
                ans = (ans * pos.get(k)) % MOD;
            }

            for (int k = 0; k < j; ++k) {
                ans = (ans * -neg.get(k)) % MOD;
            }
        }

        out.println(ans);
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
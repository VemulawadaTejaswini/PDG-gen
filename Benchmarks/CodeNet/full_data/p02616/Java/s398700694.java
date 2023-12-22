
import java.io.*;
import java.util.*;

public class Main {
    private static final boolean N_CASE = false;
    private static final int MOD = 1000_000_007;

    private void solve() {
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = sc.nextIntArray(N);

        PriorityQueue<Integer> q = new PriorityQueue<>();
        List<Integer> neg = new ArrayList<>();
        for (int x : A) {
            if (x >= 0) {
                q.add(x);
            } else {
                neg.add(x);
            }

            while (q.size() > K) {
                q.poll();
            }
        }

        Collections.sort(neg);
        if (q.size() < K && (K - q.size()) % 2 == 1) {
            long ans = 1;
            for (int i = 0; i < K; ++i) {
                ans *= neg.get(neg.size() - 1 - i);
                ans %= MOD;
            }
            ans = (ans + MOD) % MOD;
            out.println(ans);
        } else {
            long ans = 1;
            int tot = q.size();
            for (int i = 0; i + 1 < neg.size(); i += 2) {
                if (tot < K) {
                    ans = (ans * -neg.get(i)) % MOD;
                    ans = (ans * -neg.get(i + 1)) % MOD;
                    tot += 2;
                } else {
                    if (q.size() >= 2) {
                        int x = q.poll();
                        int y = q.poll();
                        if ((long)x * y < neg.get(i) * neg.get(i + 1)) {
                            ans = (ans * -neg.get(i)) % MOD;
                            ans = (ans * -neg.get(i + 1)) % MOD;
                        } else {
                            q.add(x); q.add(y);
                            break;
                        }
                    }
                }
            }
            while (!q.isEmpty()) {
                ans *= q.poll();
                ans %= MOD;
            }
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
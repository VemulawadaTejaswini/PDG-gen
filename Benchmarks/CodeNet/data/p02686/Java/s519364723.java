
import java.io.*;
import java.util.*;

public class Main {
    class RMQ {
        private static final int M = 1 << 20;
        int n;
        int[] dat;
        int[] idx;

        void init(int m) {
            idx = new int[M * 2 - 1];
            dat = new int[M * 2 - 1];
            n = 1;
            while (n < m) {
                n *= 2;
            }

            for (int i = 0; i < 2 * n - 1; i++) {
                dat[i] = Integer.MIN_VALUE;
            }
        }

        void update(int k , int a) {
            int t = k;
            k += n - 1;
            dat[k] = a;
            idx[k] = t;

            while (k > 0) {
                k = (k - 1) / 2;
                int l = k * 2 + 1;
                int r = k * 2 + 2;
                if (dat[l] > dat[r]) {
                    dat[k] = dat[l];
                    idx[k] = idx[l];
                } else {
                    dat[k] = dat[r];
                    idx[k] = idx[r];
                }
            }
        }

        int[] query(int a, int b, int k, int l, int r) {
            if (r <= a || b <= l) {
                return new int[] { Integer.MIN_VALUE, 0 };
            }

            if (a <= l && r <= b) {
                return new int[] { dat[k], idx[k] };
            } else {
                int[] vl = query(a, b, k * 2 + 1, l, (l + r) / 2);
                int[] vr = query(a, b, k * 2 + 2, (l + r) / 2, r);
                return vl[0] > vr[0] ? vl : vr;
            }
        }
    }

    private void solve() {
        int N = sc.nextInt();
        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.next();
        }

        final int M = 1000005;
        RMQ rmq = new RMQ();
        rmq.init(M);

        List<PriorityQueue<Integer>> a = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            a.add(new PriorityQueue<>(Collections.reverseOrder()));
        }

        for (int i = 0; i < N; i++) {
            int m = S[i].length();
            int ul = 0;
            int ur = 0;
            for (int j = 0; j < m; j++) {
                if (S[i].charAt(j) == ')') {
                    if (ur == 0) {
                        ++ul;
                    } else {
                        --ur;
                    }
                } else {
                    ++ur;
                }
            }

            int left = ul;

            ul = 0;
            ur = 0;
            for (int j = m - 1; j >= 0; --j) {
                if (S[i].charAt(j) == '(') {
                    if (ul == 0) {
                        ++ur;
                    } else {
                        --ul;
                    }
                } else {
                    ++ul;
                }
            }

            int right = ur;
            a.get(left).add(right - left);
        }

        for (int i = 0; i < M; i++) {
            PriorityQueue<Integer> q = a.get(i);
            if (!q.isEmpty()) {
                rmq.update(i, q.poll());
            }
        }

        int cur = 0;
        for (int i = 0; i < N; i++) {
            int[] max = rmq.query(0, cur + 1, 0, 0, rmq.n);
            if (max[0] == Integer.MIN_VALUE) {
                out.println("No");
                return;
            }

            cur += max[0];
            PriorityQueue<Integer> q = a.get(max[1]);
            if (q.isEmpty()) {
                rmq.update(max[1], Integer.MIN_VALUE);
            } else {
                rmq.update(max[1], q.poll());
            }
        }

        out.println(cur == 0 ? "Yes" : "No");
    }

    private static PrintWriter out;
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
    }

    public static void main(String[] args) {
        out = new PrintWriter(new BufferedOutputStream(System.out));
        sc = new MyScanner();
        new Main().solve();
        out.close();
    }
}

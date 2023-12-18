
import java.io.*;
import java.util.*;

public class Main {
    private void solve() {
        int N = sc.nextInt();
        int K = sc.nextInt();
        int C = sc.nextInt() + 1;

        String s = sc.next();

        int[] pre = new int[N];
        for (int i = 0; i < N; ++i) {
            char c = s.charAt(i);
            if (c == 'o') {
                pre[i] = i < C ?  1 : pre[i - C] + 1;
            }

            if (i > 0) {
                pre[i] = Math.max(pre[i], pre[i - 1]);
            }
        }

        int[] suf = new int[N];
        for (int i = N - 1; i >= 0; --i) {
            char c = s.charAt(i);
            if (c == 'o') {
                suf[i] = i + C >= N ? 1 : suf[i + C] + 1;
            }
            if (i + 1 < N) {
                suf[i] = Math.max(suf[i], suf[i + 1]);
            }
        }

        List<Integer> ans = new ArrayList<>();
        if (C == 1) {
            for (int i = 0; i < N; i++) {
                if (s.charAt(i) == 'o') {
                    int lv = i == 0 ? 0 : pre[i - 1];
                    int rv = i == N - 1 ? 0 : suf[i + 1];
                    if (lv + rv < K) {
                        ans.add(i + 1);
                    }
                }
            }
        } else {
            PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> b[0] - a[0]);
            int m = Math.min(C, N);
            for (int i = 0; i < m; i++) {
                int li = i - C;
                int lv = li >= 0 ? pre[li] : 0;
                int rv = suf[i];
                q.add(new int[]{lv + rv, i});
            }

            for (int i = 0; i < N; i++) {
                while (!q.isEmpty() && q.peek()[1] <= i) {
                    q.poll();
                }

                if (s.charAt(i) == 'o') {
                    int max = q.isEmpty() ? 0 : q.peek()[0];
                    if (max < K) {
                        ans.add(i + 1);
                    }
                }

                int ri = i + C;
                int lv = pre[i];
                int rv = ri < N ? suf[ri] : 0;

                q.add(new int[]{lv + rv, i + C});
            }
        }

        ans.forEach(out::println);
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

import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.stream.LongStream;
import java.util.Set;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.OptionalLong;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScanner in = new MyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            int N = in.Int();
            int K = in.Int();
            int[] P = new int[N];
            for (int i = 0; i < N; i++) {
                P[i] = in.Int() - 1;
            }
            int[] C = in.Int(N);

            long ans = Long.MIN_VALUE;
            boolean[] f = new boolean[N];
            for (int n = 0; n < N; n++) {
                if (f[n]) continue;
                Set<Integer> set = new HashSet<>();
                int cur = n;
                long sum = 0;
                while (!set.contains(cur)) {
                    f[cur] = true;
                    set.add(cur);
                    cur = P[cur];
                    sum += C[cur];
                }
                int k = K % set.size();
                long[] c = new long[N];
                long[] c2 = new long[N];
                long max = Long.MIN_VALUE;
                for (int i = 0; i < set.size(); i++) {
                    if (i == k) c2 = Arrays.copyOf(c, N);
                    long[] cc = new long[N];
                    for (int j : set) {
                        cc[P[j]] = c[j] + C[j];
                    }
                    c = cc;
                    max = Math.max(max, LongStream.of(c).max().getAsLong());
                }
                long max2 = LongStream.of(c2).max().getAsLong();
                ans = Math.max(ans, Math.max(max, sum * (K / set.size()) + max2));
            }
            out.println(ans);
        }

    }

    static class MyScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public MyScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    return null;
                }
            }
            return st.nextToken();
        }

        public int Int() {
            return Integer.parseInt(next());
        }

        public int[] Int(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Int();
            }
            return a;
        }

    }
}


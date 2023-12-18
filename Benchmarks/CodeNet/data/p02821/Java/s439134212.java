import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.stream.LongStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AtCoder149E solver = new AtCoder149E();
        solver.solve(1, in, out);
        out.close();
    }

    static class AtCoder149E {
        int n;
        long m;
        Long[] a;
        int[] A;
        long[] t = new long[1_000_01];

        public void solve(int testNumber, FastReader in, PrintWriter out) {
        /*if (testNumber==1) {
            random();
            return;
        }*/
            n = in.nextInt();
            m = in.nextLong();
            a = toArray(in.nextArrLong(n));

            long res = solveMeOther();
            out.println(res);
            //out.print("Case #"+ testNumber + ": ");
        }

        private long solveMeOther() {
            A = new int[n + 1];
            Arrays.sort(a, (a1, a2) -> Long.compare(a2, a1));
            for (int i = 0; i < n; i++)
                A[i + 1] = (int) (long) a[i];
            /*for (int i = 1; i <= n; i++) A[i] = (int)(long)a[i-1];
            Arrays.sort(A, 1, n+1);
            for (int i = 0; i < n/2; i++) {
                int tmp = A[i+1]; A[i+1] = A[n-i]; A[n-i] = tmp;
            }*/
            t = new long[n + 1];
            t[0] = A[0];
            for (int i = 1; i <= n; i++) t[i] = t[i - 1] + A[i];
            return binSearch();
        }

        private long[] ansOfSum(int sum) {
            long ans = 0;
            long cnt = 0;

            int b = n;
            for (int a = 1; a <= n; a++) {
                while (A[a] + A[b] < sum && b > 0) b--;
                if (b == 0) break;
                ans += (long) b * A[a] + t[b];
                cnt += b;
            }
            return new long[]{ans, cnt};
        }

        private long binSearch() {
            int l = 0;
            int r = 200000;
            long[] mv = null;

            while (l <= r) {
                int mid = (l + r) >>> 1;
                mv = ansOfSum(mid);

                if (mv[1] > m) l = mid + 1;
                else if (mv[1] < m) r = mid - 1;
                else {
                    return mv[0];
                }
            }
            return mv[0] + (l - 1) * (m - mv[1]);
        }

        private Long[] toArray(long[] a) {
            return Arrays.stream(a).boxed().toArray(Long[]::new);
        }

    }

    static class FastReader {
        public BufferedReader br;
        public StringTokenizer st;
        String context = null;

        public FastReader(InputStream in) {
            this(new InputStreamReader(in));
        }

        public FastReader(InputStreamReader input) {
            br = new BufferedReader(input);
        }

        public String next() {
            if (context != null) {
                System.err.print("[" + context + "] Wait for input ...");
            }
            while (st == null || !st.hasMoreElements()) {
                try {
                    String s = br.readLine();
                    if (s == null)
                        return null;
                    st = new StringTokenizer(s);
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new RuntimeException("Could not read");
                }
            }
            String res = st.nextToken();
            if (context != null) {
                System.err.println("[" + context + "] ... received : " + res);
            }
            return res;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public long[] nextArrLong(int n) {
            long[] a = new long[n];
            for (int i = 0; i < a.length; i++)
                a[i] = nextLong();
            return a;
        }

    }
}


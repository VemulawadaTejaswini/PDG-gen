import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author shangu
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BVotingJudges solver = new BVotingJudges();
        solver.solve(1, in, out);
        out.close();
    }

    static class BVotingJudges {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int n = in.nextInt();
            long njudge = in.nextLong(), v = in.nextLong();
            int P = in.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
            }
            mySort(a);
            for (int i = 0; i < a.length / 2; i++) {
                long tmp = a[n - 1 - i];
                a[n - 1 - i] = a[i];
                a[i] = tmp;
            }
            int L = 0, R = n;
            while (R - L > 1) {
                int M = (L + R) >> 1;
                long x = a[M];
                if (x + njudge < a[(int) (P - 1)]) R = M;
                else if (M < P) L = M;
                else {
                    long used = (P - 1) * njudge;
                    for (int i = (P - 1); i < n; i++) {
                        used += Math.min(x + njudge - a[i], njudge);
                    }
                    if (used >= njudge * v) L = M;
                    else R = M;
                }
            }
            out.println(L + 1);
        }

        private void mySort(long[] a) {
            Random random = new Random(System.currentTimeMillis());
            for (int i = 0; i < a.length; i++) {
                int j = random.nextInt(i + 1);
                long tmp = a[j];
                a[j] = a[i];
                a[i] = tmp;
            }
            Arrays.sort(a);
        }

    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader(InputStream stream) {
            br = new BufferedReader(new InputStreamReader(stream), 32768);
            st = null;
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}


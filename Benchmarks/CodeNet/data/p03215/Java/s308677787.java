import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            long[] a = in.nextLongArray(n);

            long[] tmp = new long[n + 1];
            for (int i = 0; i < n; i++) {
                tmp[i + 1] = tmp[i] + a[i];
            }

            TreeSet<Long> set = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    set.add(tmp[j] - tmp[i]);
                }
            }

            long ans = 0;
            for (int i = 60; i >= 0; i--) {
                int cnt = 0;
                for (long x : set) {
                    cnt += x >> i & 1;
                }
                if (cnt >= k) {
                    ans |= 1L << i;
                    TreeSet<Long> next = new TreeSet<>();
                    for (long x : set) {
                        if ((x >> i & 1) == 1) {
                            next.add(x);
                        }
                    }
                    set = next;
                }
            }

            out.println(ans);
        }

    }

    static class InputReader {
        private BufferedReader br;
        private StringTokenizer st;

        public InputReader(InputStream inputStream) {
            br = new BufferedReader(new InputStreamReader(inputStream));
            st = new StringTokenizer("");
        }

        public String nextString() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public long nextLong() {
            return Long.parseLong(nextString());
        }

        public long[] nextLongArray(int n) {
            long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong();
            }
            return res;
        }

    }
}


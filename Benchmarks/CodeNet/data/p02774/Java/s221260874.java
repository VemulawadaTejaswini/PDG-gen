import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Tarek
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DPairs solver = new DPairs();
        solver.solve(1, in, out);
        out.close();
    }

    static class DPairs {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            boolean is = true;
            int n = in.nextInt();
            long k = in.nextLong();
            Integer[] pos = new Integer[n];
            Integer[] neg = new Integer[n];
            for (int i = 0; i < n; i++) {
                pos[i] = in.nextInt();
                neg[i] = -pos[i];
            }
            Arrays.sort(pos);
            Arrays.sort(neg);
            long ans = 0;
            long low = (long) -1e18;
            long hi = (long) 1e18;
            while (low <= hi) {
                long mid = low + hi >> 1;
                long count = 0;
                for (int i = 0; i < n; i++) {
                    if (pos[i] < 0) {
                        int ll = 0;
                        int hh = n - 1;
                        int idx = -1;
                        while (ll <= hh) {
                            int mm = ll + hh >> 1;
                            if (-1l * neg[mm] * pos[i] <= mid) {
                                idx = mm;
                                ll = mm + 1;
                            } else hh = mm - 1;
                        }
                        if (idx != -1)
                            count += idx + 1;
                        if (idx != -1 && neg[idx] >= -1 * pos[i])
                            count--;
                    } else {
                        int ll = 0;
                        int hh = n - 1;
                        int idx = -1;
                        while (ll <= hh) {
                            int mm = ll + hh >> 1;
                            if (1l * pos[mm] * pos[i] <= mid) {
                                idx = mm;
                                ll = mm + 1;
                            } else hh = mm - 1;
                        }
                        if (idx != -1)
                            count += idx + 1;
                        if (idx != -1 && pos[idx] >= pos[i])
                            count--;
                    }
                }
                if (count / 2 >= k) {
                    ans = mid;
                    hi = mid - 1;
                } else low = mid + 1;
            }
            out.println(ans);
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}


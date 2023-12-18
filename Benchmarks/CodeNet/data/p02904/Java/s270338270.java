import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.SortedSet;
import java.util.Set;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.HashSet;
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
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        B_SortingASegment solver = new B_SortingASegment();
        solver.solve(1, in, out);
        out.close();
    }

    static class B_SortingASegment {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            int[] maxSuffix = new int[n];
            {
                SortedSet<Integer> set = new TreeSet<>();
                for (int i = 0; i < n; i++) {
                    if (i - k >= 0) {
                        set.remove(a[i - k]);
                    }
                    if (i - k + 1 >= 0 && a[i] > set.last()) {
                        maxSuffix[i - k + 1] = 1 + (i - k < 0 ? 0 : maxSuffix[i - k]);
                    }
                    set.add(a[i]);
                }
            }
            int[] maxPrefix = new int[n];
            {
                SortedSet<Integer> set = new TreeSet<>();
                for (int i = n - 1; i >= 0; i--) {
                    if (i + k < n) {
                        set.remove(a[i + k]);
                    }
                    if (i + k - 1 < n && a[i] < set.first()) {
                        maxPrefix[i] = 1 + (i + k >= n ? 0 : maxPrefix[i + 1]);
                    }
                    set.add(a[i]);
                }
            }
//        out.println(Arrays.toString(maxPrefix));
//        out.println(Arrays.toString(maxSuffix));
            Set<Long> intervals = new HashSet<>();
            for (int i = 0; i + k <= n; i++) {
                int l = i + maxPrefix[i];
                int r = i + k - 1 - maxSuffix[i];
                if (r - l + 1 > 1) {
                    intervals.add((long) l * n + r);
                } else {
                    intervals.add(-1L);
                }
            }
            out.println(intervals.size());
        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
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
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}


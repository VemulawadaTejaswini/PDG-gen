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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ProblemC_Swaps solver = new ProblemC_Swaps();
        solver.solve(1, in, out);
        out.close();
    }

    static class ProblemC_Swaps {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = in.nextInt();
            }

            Pair[] p = new Pair[n];
            for (int i = 0; i < n; i++) {
                p[i] = new Pair();
                p[i].a = a[i];
                p[i].b = i;
            }

            Arrays.sort(p, (u, v) -> -(u.a - v.a));
            Arrays.sort(b);
            Pair[] c = new Pair[n];
            {
                int j = n;
                for (int i = 0; i < n; i++) {
                    while (j > 0 && b[j - 1] >= p[i].a) {
                        --j;
                    }
                    c[i] = new Pair();
                    // .a = position now
                    // .b = leftmost possible position after swap
                    c[i].a = p[i].b;
                    c[i].b = j;
                }
            }

            Arrays.sort(c, (u, v) -> -(u.b - v.b));

            for (int i = 0; i < n; i++) {
                if (n - 1 - c[i].b < i) {
                    out.println("No");
                    return;
                }
            }

            out.println("Yes");
        }

        class Pair {
            int a;
            int b;

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


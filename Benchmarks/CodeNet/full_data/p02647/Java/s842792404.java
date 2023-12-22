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
        C_Lamps solver = new C_Lamps();
        solver.solve(1, in, out);
        out.close();
    }

    static class C_Lamps {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            for (int step = 0; step < k; step++) {
                int[] na = once(a);
                if (Arrays.equals(a, na)) {
                    break;
                }
                a = na;
            }
            for (int i = 0; i < n; i++) {
                if (i > 0) {
                    out.print(" ");
                }
                out.print(a[i]);
            }
            out.println();
        }

        private int[] once(int[] a) {
            int n = a.length;
            int[] add = new int[n + 1];
            for (int i = 0; i < a.length; i++) {
                int l = Math.max(i - a[i], 0);
                int r = Math.min(i + a[i], n - 1);
                ++add[l];
                --add[r + 1];
            }
            int[] na = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += add[i];
                na[i] = sum;
            }
            return na;
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
                    st = new StringTokenizer(in.readLine());
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


import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author vikas.k
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        private final long MAXN = 50;

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            long[] p = new long[51];
            long[] u = new long[51];
            long K = in.nextLong();
            for (int i = 0; i < MAXN; i++) {
                u[i] = K / MAXN;
                p[i] = MAXN - 1;
            }
            for (int i = 0; i < K % MAXN; i++) u[i]++;
            for (int i = 0; i < MAXN; i++) {
                p[i] += u[i] * MAXN;
                for (int j = 0; j < MAXN; j++) if (i != j) p[j] -= u[i];
            }

            out.print(MAXN);
            for (int i = 0; i < MAXN; i++) {
                out.print(p[i] + " ");
            }
        }

    }

    static class FastScanner {
        private BufferedReader bufferedReader;
        private StringTokenizer stringTokenizer;

        public FastScanner(InputStream inputStream) {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        }

        public String next() {
            if (stringTokenizer == null || !stringTokenizer.hasMoreElements()) {
                try {
                    stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return stringTokenizer.nextToken();
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}


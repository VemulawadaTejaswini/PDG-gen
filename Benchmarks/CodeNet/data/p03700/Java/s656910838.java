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
        int N;
        int A;
        int B;
        int[] h;

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            N = in.nextInt();
            A = in.nextInt();
            B = in.nextInt();

            h = new int[N + 1];

            for (int i = 1; i <= N; i++) {
                h[i] = in.nextInt();
            }

            long lo = 0;
            long hi = (int) 1e9;

            while (hi - lo > 1) {
                long md = lo + (hi - lo) / 2;

                if (checkExplosives(md)) hi = md;
                else lo = md;
            }

            for (long i = lo; i <= hi; i++) {
                if (checkExplosives(i)) {
                    out.println(i);
                    return;
                }
            }
        }

        private boolean checkExplosives(long u) {
            long count = 0;

            for (int i = 1; i <= N; i++) {
                long v = h[i] - B * u;
                if (v < 0) continue;
                long c = v / (A - B);
                if (v % (A - B) != 0) {
                    c++;
                }
                count += c;
            }
            return count <= u;
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}


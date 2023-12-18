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
 * @author Tarek
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CPeaks solver = new CPeaks();
        solver.solve(1, in, out);
        out.close();
    }

    static class CPeaks {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int h[] = new int[n + 1];
            boolean[] good = new boolean[n + 1];
            for (int i = 1; i <= n; i++) {
                good[i] = true;
                h[i] = in.nextInt();
            }
            while (m-- > 0) {
                int u = in.nextInt();
                int v = in.nextInt();
                if (h[u] >= h[v]) {
                    good[v] = false;
                }
                if (h[u] <= h[v]) {
                    good[u] = false;
                }
            }
            int cnt = 0;
            for (int i = 1; i <= n; i++) {
                cnt += good[i] == true ? 1 : 0;
            }
            out.println(cnt);
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}


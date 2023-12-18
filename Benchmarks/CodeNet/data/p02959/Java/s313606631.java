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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long[] a = new long[n + 1];
            long[] b = new long[n];
            for (int i = 0; i <= n; i++)
                a[i] = in.nextInt();
            for (int i = 0; i < n; i++)
                b[i] = in.nextInt();
            long ans, rest;
            if (b[0] >= a[0]) {
                ans = a[0];
                rest = b[0] - a[0];
            } else {
                ans = b[0];
                rest = 0;
            }
            for (int i = 1; i < n; i++) {
                long can = rest + b[i];
                if (can >= a[i]) {
                    ans += a[i];
                    rest = Math.min(can - a[i], b[i]);
                } else {
                    ans += can;
                    rest = 0;
                }
            }
            if (rest > 0) {
                if (rest >= a[n])
                    ans += a[n];
                else
                    ans += rest;
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}
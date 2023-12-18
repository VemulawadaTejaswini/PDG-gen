import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
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
        TwoArrays solver = new TwoArrays();
        solver.solve(1, in, out);
        out.close();
    }

    static class TwoArrays {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long[] a = in.nextLongArray(0, n), b = in.nextLongArray(0, n);
            for (int i = 0; i < n - 1; i++) {
                long diff = b[i] - a[i];
                if (diff > 0) b[i + 1] += (diff - diff % 2) / 2;
                else {
                    b[i] += -diff;
                    a[i + 1] += -diff * 2;
                }
            }
            if (a[n - 1] > b[n - 1]) out.println("No");
            else out.println("Yes");
        }

    }

    static class InputReader {
        private StringTokenizer tokenizer;
        private BufferedReader reader;

        public InputReader(InputStream inputStream) {
            reader = new BufferedReader(new InputStreamReader(inputStream));
        }

        private void fillTokenizer() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public String next() {
            fillTokenizer();
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public long[] nextLongArray(int offset, int length) {
            long[] arr = new long[offset + length];
            for (int i = offset; i < offset + length; i++) {
                arr[i] = nextLong();
            }
            return arr;
        }

    }
}


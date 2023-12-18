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
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DLazyFaith solver = new DLazyFaith();
        solver.solve(1, in, out);
        out.close();
    }

    static class DLazyFaith {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int a = in.nextInt(), b = in.nextInt(), q = in.nextInt();

            long[] s = new long[a];
            for (int i = 0; i < a; i++) {
                s[i] = in.nextLong();
            }
            long[] t = new long[b];
            for (int i = 0; i < b; i++) {
                t[i] = in.nextLong();
            }

            for (int query = 0; query < q; query++) {
                long answer = Long.MAX_VALUE;

                long x = in.nextLong();

                int i = Arrays.binarySearch(s, x);
                if (i < 0) {
                    i = -i - 1;
                }
                int j = Arrays.binarySearch(t, x);
                if (j < 0) {
                    j = -j - 1;
                }

                for (int si = i - 1; si <= i; si++) {
                    for (int ti = j - 1; ti <= j; ti++) {
                        if (si >= 0 && si < a && ti >= 0 && ti < b) {
                            answer = Math.min(answer, Math.abs(s[si] - x) + Math.abs(t[ti] - s[si]));
                            answer = Math.min(answer, Math.abs(t[ti] - x) + Math.abs(t[ti] - s[si]));
                        }
                    }
                }

                out.println(answer);
            }
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}


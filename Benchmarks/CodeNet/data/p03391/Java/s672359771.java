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
 * @author anand.oza
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ETozanAndGezan solver = new ETozanAndGezan();
        solver.solve(1, in, out);
        out.close();
    }

    static class ETozanAndGezan {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
                b[i] = in.nextLong();
            }

            long answer = solve(a, b);

            out.println(answer);
        }

        long solve(long[] a, long[] b) {
            int n = a.length;
            long answer = 0;
            boolean equal = true;

            long minimumAGreaterThanB = Long.MAX_VALUE;
            int index = -1;

            for (int i = 0; i < n; i++) {
                answer += a[i]; // either one just want total sum

                if (a[i] > b[i]) {
                    if (a[i] - b[i] < minimumAGreaterThanB) {
                        index = i;
                        minimumAGreaterThanB = a[i] - b[i];
                    }
                }
            }

            if (index >= 0) {
                answer -= b[index];
            } else {
                answer = 0;
            }

            return answer;
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


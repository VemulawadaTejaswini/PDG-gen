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
        DXXOR solver = new DXXOR();
        solver.solve(1, in, out);
        out.close();
    }

    static class DXXOR {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long k = in.nextLong();
            long[] a = new long[n];
            long maxAK = k;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
                maxAK = Math.max(maxAK, a[i]);
            }

            long answer = 0;
            long x = 0;
            for (long bit = Long.highestOneBit(maxAK) * 2; bit >= 1; bit /= 2) {
                long on = 0, off = 0;
                for (long A : a) {
                    if ((A & bit) > 0) {
                        on += bit;
                    } else {
                        off += bit;
                    }
                }

                if (x + bit <= k && off > on) {
                    answer += off;
                    x += bit;
                } else {
                    answer += on;
                }
            }

            out.println(answer);
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


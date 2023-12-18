import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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
        DIntegerCards solver = new DIntegerCards();
        solver.solve(1, in, out);
        out.close();
    }

    static class DIntegerCards {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }

            Arrays.sort(a);

            DIntegerCards.Pair[] pairs = new DIntegerCards.Pair[m];

            for (int i = 0; i < m; i++) {
                int b = in.nextInt();
                long c = in.nextInt();
                pairs[i] = new DIntegerCards.Pair(b, c);
            }

            Arrays.sort(pairs);

            int indexA = 0;

            outer:
            for (int j = m - 1; j >= 0; j--) {
                for (int k = 0; k < pairs[j].b; k++) {
                    if (a[indexA] < pairs[j].c) {
                        a[indexA++] = pairs[j].c;
                        if (indexA >= n) {
                            break outer;
                        }
                    } else {
                        break outer;
                    }
                }
            }

            long sum = 0;
            for (long x : a) {
                sum += x;
            }

            out.println(sum);
        }

        static class Pair implements Comparable<DIntegerCards.Pair> {
            final int b;
            final long c;

            Pair(int b, long c) {
                this.b = b;
                this.c = c;
            }

            public int compareTo(DIntegerCards.Pair o) {
                return Long.compare(this.c, o.c);
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

    }
}


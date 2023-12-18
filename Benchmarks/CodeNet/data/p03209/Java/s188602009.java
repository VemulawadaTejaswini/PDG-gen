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
        DChristmas solver = new DChristmas();
        solver.solve(1, in, out);
        out.close();
    }

    static class DChristmas {
        long[] patties;
        long[] layers;

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long x = in.nextLong();

            patties = new long[n + 1];
            layers = new long[n + 1];
            patties[0] = 1;
            layers[0] = 1;
            for (int i = 1; i <= n; i++) {
                patties[i] = 2 * patties[i - 1] + 1;
                layers[i] = 2 * layers[i - 1] + 3;
            }

            long answer = solve(x, n);
            out.println(answer);
        }

        long solve(long x, int n) {
            if (x >= layers[n]) {
                return patties[n];
            }

            if (x <= 0) {
                return 0;
            }

            long result = 0;
            x--; // bun
            result += solve(x, n - 1);
            x -= layers[n - 1]; // small burger
            if (x > 0)
                result++; // middle patty
            x--; // middle patty
            result += solve(x, n - 1);

            return result;
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


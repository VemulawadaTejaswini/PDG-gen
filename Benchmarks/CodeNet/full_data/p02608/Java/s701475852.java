
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner(System.in);
        final int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            int counter = 0;
            for (int x = 1; x <= Math.sqrt(n); x++) {
                for (int y = 1; y <= Math.sqrt(n); y++) {
                    final int tmp = 4 * i - 2 * x * y - 3 * x * x - 3 * y * y;
                    if (tmp <= 0) {
                        break;
                    }

                    final int root = (int) Math.sqrt(tmp);
                    final int z = (-(x + y) + root) / 2;
                    if (z > 0 && x * x + y * y + z * z + x * y + y * z + z * x == i) {
                        counter++;
                    }
                }
            }

            System.out.println(counter);
        }
    }

    private static class FastScanner {
        private final BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(final InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (final IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (final IOException e) {
                    throw new RuntimeException(e);
                }
            }

            return tokenizer.nextToken("\n");
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}
    
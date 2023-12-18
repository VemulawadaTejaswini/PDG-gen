
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static final String VACANT = "Vacant";

    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner(System.in);
        final int n = scanner.nextInt();
        printAndFlush(0);
        final String initial = scanner.next();
        if (initial.equals(VACANT)) {
            return;
        }

        String previous = initial;
        int left = 0;
        int right = n - 1;
        for (int i = 0; i < 19; i++) {
            if (right - left <= 1) {
                printAndFlush(right);
                scanner.next();
                return;
            }
            final int mid = (left + right) / 2;
            printAndFlush(mid);
            final String current = scanner.next();
            if (current.equals(VACANT)) {
                return;
            }

            if ((mid - left) % 2 == 0) {
                if (previous.equals(current)) {
                    left = mid;
                } else {
                    right = mid - 1;
                }
            } else {
                if (previous.equals(current)) {
                    right = mid - 1;
                } else {
                    left = mid;
                }
            }
            previous = current;
        }
    }

    private static void printAndFlush(Object obj) {
        System.out.println(obj);
        System.out.flush();
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
    }
}

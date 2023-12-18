
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
        System.out.println(0);
        System.out.flush();
        final String initial = scanner.next();
        if (initial.equals(VACANT)) {
            System.out.println(0);
            return;
        }

        String previous = initial;
        int left = 0;
        int right = n;
        while (true) {
            if (right - left <= 1) {
                System.out.println(right);
                return;
            }
            final int mid = (left + right) / 2;
            System.out.println(mid);
            System.out.flush();
            final String current = scanner.next();
            if (current.equals(VACANT)) {
                System.out.println(mid);
                return;
            }

            if ((mid - left) % 2 == 0) {
                if (previous.equals(current)) {
                    left = mid;
                } else {
                    right = mid;
                }
            } else {
                if (previous.equals(current)) {
                    right = mid;
                } else {
                    left = mid;
                }
            }
            previous = current;
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
    }
}

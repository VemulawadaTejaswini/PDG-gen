
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner(System.in);
        final int n = scanner.nextInt();

        final List<Integer> answers;

        if (n <= 15_000) {
            if ((n - 1) % 3 == 0) {
                answers = IntStream.rangeClosed(1, n - 1)
                        .mapToObj(i -> i * 2)
                        .collect(Collectors.toList());
                answers.add(3);
            } else if ((n - 1) % 3 == 1) {
                final int base = (n - 1) / 3 * 3;
                answers = IntStream.rangeClosed(1, base)
                        .mapToObj(i -> i * 2)
                        .collect(Collectors.toList());
                answers.add(2 * (base + 3));
                answers.add(3);
            } else {
                final int base = (n - 1) / 3 * 3;
                answers = IntStream.rangeClosed(1, base)
                        .mapToObj(i -> i * 2)
                        .collect(Collectors.toList());
                answers.add(2 * (base + 1));
                answers.add(2 * (base + 2));
                answers.add(3);
            }
        } else {
            final int rest = n - 15_000;
            answers = IntStream.rangeClosed(1, 15_000)
                    .mapToObj(i -> i * 2)
                    .collect(Collectors.toList());

            int tmp = 3;
            for (int i = 0; i < rest; i++) {
                answers.add(tmp);
                tmp += 6;
            }
        }

        final String answer = answers.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" "));
        System.out.println(answer);
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

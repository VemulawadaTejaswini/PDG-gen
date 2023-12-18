
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
        final int x = scanner.nextInt();

        if (x == n) {
            System.out.println("Yes");
            final String answer = IntStream.rangeClosed(1, 2 * n - 1)
                    .mapToObj(Integer::toString)
                    .collect(Collectors.joining(" "));
            System.out.println(answer);
        } else if (x >= 3 && x <= 2 * n - 3) {
            System.out.println("Yes");
            final List<Integer> list = IntStream.rangeClosed(1, 2 * n - 1)
                    .filter(i -> !(i >= x - 2 && i <= x + 2))
                    .boxed()
                    .collect(Collectors.toList());
            list.add(n - 3, x + 2);
            list.add(n - 2, x - 1);
            list.add(n - 1, x);
            list.add(n, x + 1);
            list.add(n + 1, x - 2);
            final String answer = list.stream()
                    .map(i -> Integer.toString(i))
                    .collect(Collectors.joining(" "));
            System.out.println(answer);
        } else if (x == 2) {
            System.out.println("Yes");
            final List<Integer> list = IntStream.rangeClosed(5, 2 * n - 1)
                    .boxed()
                    .collect(Collectors.toList());
            list.add(n - 3, 4);
            list.add(n - 2, 1);
            list.add(n - 1, 2);
            list.add(n, 3);
            final String answer = list.stream()
                    .map(i -> Integer.toString(i))
                    .collect(Collectors.joining(" "));
            System.out.println(answer);
        } else if (x == 2 * n - 2) {
            System.out.println("Yes");
            final List<Integer> list = IntStream.rangeClosed(1, 2 * n - 5)
                    .boxed()
                    .collect(Collectors.toList());
            list.add(n - 3, 2 * n - 4);
            list.add(n - 2, 2 * n - 1);
            list.add(n - 1, 2 * n - 2);
            list.add(n, 2 * n - 3);
            final String answer = list.stream()
                    .map(i -> Integer.toString(i))
                    .collect(Collectors.joining(" "));
            System.out.println(answer);
        } else {
            System.out.println("No");
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

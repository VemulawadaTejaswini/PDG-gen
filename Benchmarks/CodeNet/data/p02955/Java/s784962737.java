

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner(System.in);
        final int n = scanner.nextInt();
        final int k = scanner.nextInt();

        final List<Integer> list = IntStream.range(0, n)
            .mapToObj(i -> scanner.nextInt())
            .collect(Collectors.toList());

        final int sum = list.stream()
            .mapToInt(Integer::intValue)
            .sum();

        final List<Integer> divided = IntStream.rangeClosed(1, sum)
            .filter(i -> sum % i == 0)
            .boxed().collect(Collectors.toList());
        Collections.reverse(divided);
        for (final int value : divided) {
            final List<Integer> tmp = list.stream()
                .filter(i -> i%value != 0)
                .map(i -> i % value)
                .sorted()
                .collect(Collectors.toList());
            if (tmp.size() == 0) {
                System.out.println(value);
                return;
            }

            final int[] fromLeft = new int[tmp.size()];
            fromLeft[0] = tmp.get(0);
            for (int i = 1; i < tmp.size(); i++) {
                fromLeft[i] = fromLeft[i - 1] + tmp.get(i);
            }
            final int[] fromRight = new int[tmp.size()];
            fromRight[tmp.size() - 1] = value - tmp.get(tmp.size() - 1);
            for (int i = tmp.size() - 2; i >= 0; i--) {
                fromRight[i] = fromRight[i + 1] + value - tmp.get(i);
            }

            for (int i = 0; i < tmp.size() - 1; i++) {
                if (fromLeft[i] == fromRight[i + 1]) {
                    if (fromLeft[i] <= k) {
                        System.out.println(value);
                        return;
                    } else {
                        break;
                    }
                }
            }
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
    
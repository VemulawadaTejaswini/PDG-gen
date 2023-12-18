
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
        final int k = scanner.nextInt();

        final List<Integer> list = IntStream.range(0, n)
            .mapToObj(i -> scanner.nextInt())
            .collect(Collectors.toList());

        final int sum = list.stream()
            .mapToInt(Integer::intValue)
            .sum();

        IntStream.range(0, sum)
            .map(i -> sum - i)
            .filter(i -> sum % i == 0)
            .filter(dividable -> {
                final List<Integer> mods = list.stream()
                    .filter(i -> i % dividable != 0)
                    .map(i -> i % dividable)
                    .sorted()
                    .collect(Collectors.toList());
                if (mods.size() == 0) {
                    return true;
                }

                final int[] fromLeft = new int[mods.size()];
                fromLeft[0] = mods.get(0);
                for (int i = 1; i < mods.size(); i++) {
                    fromLeft[i] = fromLeft[i - 1] + mods.get(i);
                }

                final int[] fromRight = new int[mods.size()];
                fromRight[mods.size() - 1] = dividable - mods.get(mods.size() - 1);
                for (int i = mods.size() - 1; i > 0; i--) {
                    fromRight[i - 1] = fromRight[i] + dividable - mods.get(i - 1);
                }

                for (int i = 0; i < mods.size() - 1; i++) {
                    if (fromLeft[i] == fromRight[i + 1]) {
                        return fromLeft[i] <= k;
                    }
                }
                return false;
            })
            .findAny()
            .ifPresent(System.out::println);
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
    
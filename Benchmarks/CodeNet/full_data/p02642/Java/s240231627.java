
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner(System.in);
        final int n = scanner.nextInt();
        final List<Integer> list = IntStream.range(0, n)
            .mapToObj(i -> scanner.nextInt())
            .sorted()
            .collect(Collectors.toList());

        final Map<Integer, List<Integer>> count = list.stream()
            .collect(Collectors.groupingBy(Integer::intValue));

        final Set<Integer> candidates = new HashSet<>();
        for (final int value : list) {
            boolean flag = true;
            for (final Integer candidate : candidates) {
                if (value % candidate == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                candidates.add(value);
            }
        }

        for (final Map.Entry<Integer, List<Integer>> entry : count.entrySet()) {
            if (entry.getValue().size() >= 2) {
                candidates.remove(entry.getKey());
            }
        }

        System.out.println(candidates.size());
    }

    private static void merge(final Map<Integer, Long> a, final Map<Integer, Long> b) {
        for (final Map.Entry<Integer, Long> entry : b.entrySet()) {
            a.compute(entry.getKey(), (k, v) -> v == null ? entry.getValue() : a.get(entry.getKey()) + entry.getValue());
        }
    }

    private static Map<Integer, Long> primeFactorization(int n) {
        final double sqrt = Math.sqrt(n);
        final Map<Integer, Long> countMap = new HashMap<>();
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                countMap.compute(i, (k, v) -> v = v == null ? 1 : v + 1);
                n /= i;
                i--;
            }
        }

        if (n != 1) {
            countMap.compute(n, (k, v) -> v = v == null ? 1 : v + 1);
        }

        return countMap;
    }

    private static class FastScanner implements AutoCloseable {
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

        @Override
        public void close() throws Exception {
            reader.close();
        }
    }
}

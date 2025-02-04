
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner(System.in);
        scanner.nextInt();
        scanner.nextInt();
        final int m = scanner.nextInt();

        final Map<Integer, Integer> hCounts = new HashMap<>();
        final Map<Integer, Integer> wCounts = new HashMap<>();
        final Map<Integer, Set<Integer>> points = new HashMap<>();
        for (int i = 0; i < m; i++) {
            final int tmpH = scanner.nextInt();
            final int tmpW = scanner.nextInt();
            hCounts.compute(tmpH, (k, v) -> v == null ? 1 : v + 1);
            wCounts.compute(tmpW, (k, v) -> v == null ? 1 : v + 1);
            points.computeIfAbsent(tmpH, v -> new HashSet<>()).add(tmpW);
        }

        final int maxH = hCounts.values().stream().max(Integer::compare).orElseThrow();
        final int maxW = wCounts.values().stream().max(Integer::compareTo).orElseThrow();

        final Map<Integer, Integer> filteredH = hCounts.entrySet().stream()
            .filter(e -> e.getValue() == maxH)
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        final Map<Integer, Integer> filteredW = wCounts.entrySet().stream()
            .filter(e -> e.getValue() == maxW)
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        final int base = maxH + maxW;
        if ((long) filteredH.size() * (long) filteredW.size() > m) {
            System.out.println(base);
            return;
        }

        filteredH.entrySet().stream()
            .flatMap(h -> filteredW.entrySet().stream()
                .filter(w -> !points.containsKey(h.getKey()) || !points.get(h.getKey()).contains(w.getKey()))
            ).findAny()
            .ifPresentOrElse(
                e -> System.out.println(base),
                () -> System.out.println(base - 1)
            );
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

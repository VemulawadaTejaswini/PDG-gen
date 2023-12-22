
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner(System.in);
        final int h = scanner.nextInt();
        final int w = scanner.nextInt();
        final int m = scanner.nextInt();

        final Map<Integer, Integer> hCounts = new HashMap<>();
        final Map<Integer, Integer> wCounts = new HashMap<>();
        final Map<Integer, Set<Integer>> point = new HashMap<>();
        for (int i = 0; i < m; i++) {
            final int tmpH = scanner.nextInt();
            final int tmpW = scanner.nextInt();
            hCounts.compute(tmpH, (k, v) -> v == null ? 1 : v + 1);
            wCounts.compute(tmpW, (k, v) -> v == null ? 1 : v + 1);
            point.computeIfAbsent(tmpH, v -> new HashSet<>()).add(tmpW);
        }

        final List<Pair> sortedH = hCounts.entrySet().stream()
            .sorted(Comparator.comparingInt(e -> -e.getValue()))
            .limit(Math.min(h, 5 * 1000))
            .map(e -> new Pair(e.getKey(), e.getValue()))
            .collect(Collectors.toList());

        final List<Pair> sortedW = wCounts.entrySet().stream()
            .sorted(Comparator.comparingInt(e -> -e.getValue()))
            .limit(Math.min(w, 5 * 1000))
            .map(e -> new Pair(e.getKey(), e.getValue()))
            .collect(Collectors.toList());

        int max = 0;
        for (final Pair hPair : sortedH) {
            for (final Pair wPair : sortedW) {
                if (point.get(hPair.a) != null && point.get(hPair.a).contains(wPair.a)) {
                    max = Math.max(max, hPair.b + wPair.b - 1);
                } else {
                    max = Math.max(max, hPair.b + wPair.b);
                }
            }
        }
        System.out.println(max);
    }

    private static class Pair {
        final int a;
        final int b;

        Pair(final int a, final int b) {
            this.a = a;
            this.b = b;
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

        double nextDouble() {
            return Double.parseDouble(next());
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
    }
}

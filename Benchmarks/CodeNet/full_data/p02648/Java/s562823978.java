
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    private static Item[] items;
    private static final Map<Integer, int[]> tree = new HashMap<>();

    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner(System.in);
        final int n = scanner.nextInt();
        items = new Item[n + 1];
        for (int i = 1; i <= n; i++) {
            items[i] = new Item(scanner.nextInt(), scanner.nextInt());
        }

        final int[] initial = new int[100_001];
        Arrays.fill(initial, -1);
        initial[0] = 0;
        initial[items[1].weight] = items[1].value;
        tree.put(1, initial);

        final int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            final int v = scanner.nextInt();
            final int l = scanner.nextInt();
            System.out.println(entry(v, l));
        }
    }

    private static int entry(final int current, final int l) {
        if (tree.containsKey(current)) {
            return Arrays.stream(tree.get(current), 0, l + 1).max().orElseThrow();
        }

        final int parent = current / 2;
        if (!tree.containsKey(parent)) {
            recursive(parent);
        }

        final int[] previous = tree.get(parent);
        final int[] array = Arrays.copyOf(previous, previous.length);
        final Item item = items[current];
        for (int i = item.weight; i <= 100_000; i++) {
            if (previous[i - item.weight] >= 0) {
                if (array[i] >= 0) {
                    array[i] = Math.max(array[i], previous[i - item.weight] + item.value);
                } else {
                    array[i] = previous[i - item.weight] + item.value;
                }
            }
        }

        tree.put(current, array);
        return Arrays.stream(array, 0, l + 1).max().orElseThrow();
    }

    private static void recursive(final int current) {
        if (tree.containsKey(current)) {
            return;
        }

        final int parent = current / 2;
        if (!tree.containsKey(parent)) {
            recursive(parent);
        }

        final int[] previous = tree.get(parent);
        final int[] array = Arrays.copyOf(previous, previous.length);
        final Item item = items[current];
        for (int i = item.weight; i <= 100_000; i++) {
            if (previous[i - item.weight] >= 0) {
                if (array[i] >= 0) {
                    array[i] = Math.max(array[i], previous[i - item.weight] + item.value);
                } else {
                    array[i] = previous[i - item.weight] + item.value;
                }
            }
        }

        tree.put(current, array);
    }

    private static class Item {
        final int value;
        final int weight;

        Item(final int value, final int weight) {
            this.value = value;
            this.weight = weight;
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

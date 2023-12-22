
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;

public class Main {
    private static final int[] xMove = {-1, 0, 1, 0};
    private static final int[] yMove = {0, -1, 0, 1};

    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner(System.in);
        final int n = scanner.nextInt();

        final boolean[][] isSitting = new boolean[n][n + 1];
        for (final boolean[] array : isSitting) {
            Arrays.fill(array, true);
        }

        final int[][] distances = new int[n][n + 1];
        for (final int[] array : distances) {
            Arrays.fill(array, Integer.MAX_VALUE);
        }
        Arrays.fill(distances[0], 0);
        Arrays.fill(distances[n - 1], 0);
        for (int i = 1; i < n - 1; i++) {
            distances[i][1] = 0;
            distances[i][n] = 0;
            for (int j = 2; j < n; j++) {
                if (j > n - j + 1) {
                    break;
                }
                distances[i][j] = Math.min(Math.min(distances[i - 1][j], distances[i][j - 1]), Math.min(distances[i + 1][j], distances[i][j + 1])) + 1;
                distances[i][n - j + 1] = Math.min(Math.min(distances[i - 1][n - j + 1], distances[i][n - j]), Math.min(distances[i + 1][n - j + 1], distances[i][n - j + 2])) + 1;
            }
        }

        final UnaryOperator<Integer> bfs = point -> {
            final int x = (point - 1) / n;
            final int y = (point - 1) % n + 1;
            final int distance = distances[x][y];
            isSitting[x][y] = false;

            final Deque<Integer> queue = new ArrayDeque<>();
            queue.add(point);
            while (!queue.isEmpty()) {
                final int current = queue.pollFirst();
                final int currentX = (current - 1) / n;
                final int currentY = (current - 1) % n + 1;
                for (int i = 0; i < 4; i++) {
                    final int nextX = currentX + xMove[i];
                    final int nextY = currentY + yMove[i];
                    if (nextX == -1 || nextX == n || nextY == 0 || nextY == n + 1) {
                        continue;
                    }

                    final int nextDistance = distances[currentX][currentY] + (isSitting[currentX][currentY] ? 1 : 0);
                    if (nextDistance < distances[nextX][nextY]) {
                        final int next = nextX * n + nextY;
                        queue.add(next);
                        distances[nextX][nextY] = nextDistance;
                    }
                }
            }

            return distance;
        };

        final long count = IntStream.range(0, n * n)
            .map(i -> bfs.apply(scanner.nextInt()))
            .sum();

        System.out.println(count);
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

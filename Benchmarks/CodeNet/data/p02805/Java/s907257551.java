
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.Math.*;

public class Main {
    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner(System.in);
        final int n = scanner.nextInt();
        final List<Point> list = IntStream.range(0, n)
                .mapToObj(i -> new Point(scanner.nextDouble(), scanner.nextDouble()))
                .collect(Collectors.toList());

        if (list.size() == 2) {
            final double length = sqrt(pow(list.get(0).x - list.get(1).x, 2) + pow(list.get(0).y - list.get(1).y, 2));
            System.out.println(length / 2d);
            return;
        }

        double min = Double.MAX_VALUE;
        for (int i = 0; i < n - 2; i++) {
            final Point a = list.get(i);
            for (int j = i + 1; j < n - 1; j++) {
                final Point b = list.get(j);
                for (int k = j + 1; k < n; k++) {
                    final Point c = list.get(k);
                    final Point outerCenter = calcOuterCenter(a, b, c);
                    final double max = list.stream()
                            .mapToDouble(d -> sqrt(pow(d.x - outerCenter.x, 2) + pow(d.y - outerCenter.y, 2)))
                            .max()
                            .orElseThrow(RuntimeException::new);
                    min = min(min, max);
                }
            }
        }

        System.out.println(min);
    }

    private static Point calcOuterCenter(final Point a, final Point b, final Point c) {
        final double sin2A = sin(2 * acos(a, b, c));
        final double sin2B = sin(2 * acos(b, c, a));
        final double sin2C = sin(2 * acos(c, a, b));

        final double x = (sin2A * a.x + sin2B * b.x + sin2C * c.x) / (sin2A + sin2B + sin2C);
        final double y = (sin2A * a.y + sin2B * b.y + sin2C * c.y) / (sin2A + sin2B + sin2C);

        return new Point(x, y);
    }

    private static double acos(final Point a, final Point b, final Point c) {
        final double vec1x = b.x - a.x;
        final double vec1y = b.y - a.y;
        final double vec2x = c.x - a.x;
        final double vec2y = c.y - a.y;
        final double lengthAB = sqrt(pow(vec1x, 2) + pow(vec1y, 2));
        final double lengthAC = sqrt(pow(vec2x, 2) + pow(vec2y, 2));
        return Math.acos((vec1x * vec2x + vec1y * vec2y) / (lengthAB * lengthAC));
    }

    private static class Point {
        final double x;
        final double y;

        Point(final double x, final double y) {
            this.x = x;
            this.y = y;
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

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}
    
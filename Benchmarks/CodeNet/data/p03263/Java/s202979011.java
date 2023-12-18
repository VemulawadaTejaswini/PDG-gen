
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Main {
    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner(System.in);
        final int h = scanner.nextInt();
        final int w = scanner.nextInt();
        final int[][] table = new int[h][w];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                table[i][j] = scanner.nextInt();
            }
        }

        final List<Integer> points = new ArrayList<>();

        for (int i = 0; i < h; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < w; j++) {
                    if (i == h - 1 && j == w - 1) {
                        break;
                    }

                    if (table[i][j] % 2 == 0) {
                        continue;
                    }

                    if (j == w - 1) {
                        table[i][j]--;
                        table[i + 1][j]++;
                        points.add(i);
                        points.add(j);
                        points.add(i + 1);
                        points.add(j);
                        continue;
                    }

                    table[i][j]--;
                    table[i][j + 1]++;
                    points.add(i);
                    points.add(j);
                    points.add(i);
                    points.add(j + 1);
                }
            } else {
                for (int j = w - 1; j >= 0; j--) {
                    if (i == h - 1 && j == 0) {
                        break;
                    }

                    if (table[i][j] % 2 == 0) {
                        continue;
                    }

                    if (j == 0) {
                        table[i][j]--;
                        table[i + 1][j]++;
                        points.add(i);
                        points.add(j);
                        points.add(i + 1);
                        points.add(j);
                        continue;
                    }

                    table[i][j]--;
                    table[i][j - 1]++;
                    points.add(i);
                    points.add(j);
                    points.add(i);
                    points.add(j - 1);
                }
            }
        }

        System.out.println(points.size() / 4);
        for (int i = 0; i < points.size(); i++) {
            System.out.print(points.get(i) + 1);
            if (i % 4 == 3) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }

    static class FastScanner {
        private final BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(final InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
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

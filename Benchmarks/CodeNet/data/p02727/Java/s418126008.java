
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner(System.in);
        final int x = scanner.nextInt();
        final int y = scanner.nextInt();
        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        final List<Long> aApples = IntStream.range(0, a)
                .mapToObj(i -> scanner.nextLong())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        final List<Long> bApples = IntStream.range(0, b)
                .mapToObj(i -> scanner.nextLong())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        final List<Long> cApples = IntStream.range(0, c)
                .mapToObj(i -> scanner.nextLong())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        final List<Long> aSub = aApples.subList(0, x);
        final List<Long> bSub = bApples.subList(0, y);

        long sum = aSub.stream()
                .mapToLong(Long::longValue)
                .sum()
                + bSub.stream()
                .mapToLong(Long::longValue)
                .sum();

        int aIndex = x - 1;
        int bIndex = y - 1;
        for (final long cApple : cApples) {
            final long aTmp = aIndex >= 0 ? aSub.get(aIndex) : Integer.MAX_VALUE;
            final long bTmp = bIndex >= 0 ? bSub.get(bIndex) : Integer.MAX_VALUE;
            if (aTmp > cApple && bTmp > cApple) {
                break;
            }

            if (aTmp < bTmp) {
                sum = sum - aTmp + cApple;
                aIndex--;
            } else {
                sum = sum - bTmp + cApple;
                bIndex--;
            }
        }
        System.out.println(sum);
    }


    private static class FastScanner {
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

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            return tokenizer.nextToken("\n");
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}

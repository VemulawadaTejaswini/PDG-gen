
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner(System.in);
        final int n = scanner.nextInt();
        final List<Integer> list = IntStream.rangeClosed(0, n)
            .mapToObj(i -> scanner.nextInt())
            .collect(Collectors.toList());

        if (list.get(0) != 0) {
            System.out.println(-1);
            return;
        }

        final BigInteger[] nodes = new BigInteger[n + 1];
        nodes[0] = BigInteger.ONE;
        for (int depth = 1; depth <= n; depth++) {
            final int leaves = list.get(depth);

            final BigInteger kyoyou = nodes[depth - 1].multiply(BigInteger.TWO);
            if (kyoyou.bitLength() < 30 && leaves > kyoyou.longValue()) {
                System.out.println(-1);
                return;
            }

            nodes[depth] = nodes[depth - 1].multiply(BigInteger.TWO).subtract(BigInteger.valueOf(leaves));
        }

        BigInteger all = BigInteger.ZERO;
        BigInteger rests = BigInteger.ZERO;
        for (int depth = n; depth > 0; depth--) {
            final int leaves = list.get(depth);
            all = all.add(BigInteger.valueOf(leaves)).add(rests);
            rests = nodes[depth - 1].min(BigInteger.valueOf(leaves).add(rests));
        }

        System.out.println(all.longValue() + 1);
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

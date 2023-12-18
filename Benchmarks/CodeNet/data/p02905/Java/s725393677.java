import java.io.*;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class Main {

    private static int MOD = 998244353;
    private static int MAX = 1000000;

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int n = scanner.nextInt();
        int[] sums = new int[MAX + 1];
        long ans = 0;
        for (int i = 0; i < n; ++i) {
            int t = scanner.nextInt();
            ArrayList<Integer> divisors = new ArrayList<>((int) Math.log1p(t));
            for (int j = 1; j * j <= t; ++j) {
                if (t % j == 0) {
                    divisors.add(j);
                    if (j * j != t)
                        divisors.add(t / j);
                }
            }
            divisors.sort(Comparator.reverseOrder());
            int[] divisorSums = new int[divisors.size()];
            for (int j = 0; j < divisors.size(); ++j) {
                int sum = sums[divisors.get(j)];
                if (sum > 0) {
                    for (int k = 0; k < j; ++k) {
                        if (divisors.get(k) % divisors.get(j) == 0)
                            sum = (sum - divisorSums[k] + MOD) % MOD;
                    }
                    ans = (ans + (long) t / divisors.get(j) * sum) % MOD;
                }
                divisorSums[j] = sum;
            }
            for (int divisor : divisors)
                sums[divisor] += t;
        }
        writer.println(ans);

        writer.close();
    }

    private static class SimpleScanner {

        private static final int BUFFER_SIZE = 10240;

        private Readable in;
        private CharBuffer buffer;
        private boolean eof;

        SimpleScanner(InputStream in) {
            this.in = new BufferedReader(new InputStreamReader(in));
            buffer = CharBuffer.allocate(BUFFER_SIZE);
            buffer.limit(0);
            eof = false;
        }


        private char read() {
            if (!buffer.hasRemaining()) {
                buffer.clear();
                int n;
                try {
                    n = in.read(buffer);
                } catch (IOException e) {
                    n = -1;
                }
                if (n <= 0) {
                    eof = true;
                    return '\0';
                }
                buffer.flip();
            }
            return buffer.get();
        }

        private void checkEof() {
            if (eof)
                throw new NoSuchElementException();
        }

        private char nextChar() {
            checkEof();
            char b = read();
            checkEof();
            return b;
        }

        private String next() {
            char b;
            do {
                b = read();
                checkEof();
            } while (Character.isWhitespace(b));
            StringBuilder sb = new StringBuilder();
            do {
                sb.append(b);
                b = read();
            } while (!eof && !Character.isWhitespace(b));
            return sb.toString();
        }

        private int nextInt() {
            return Integer.parseInt(next());
        }

        private long nextLong() {
            return Long.parseLong(next());
        }

        private double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            long mod = (long) 1000000007;
            List<Integer> pn = Numbers.generatePrimeNumbers(n);

            Map<Integer, Long> pnCount = new HashMap<>();
            for (int i = 2; i <= n; i++) {
                int cn = i;
                for (int cpn : pn) {
                    if (cn <= 1)
                        break;
                    long count = 0;
                    while (cn % cpn == 0) {
                        cn /= cpn;
                        count++;
                    }
                    pnCount.put(cpn, pnCount.getOrDefault(cpn, (long) 0) + count);
                }
            }

            long ans = 1;
            for (int cpn : pnCount.keySet()) {
                long pc = pnCount.get(cpn);
                ans *= (pc + 1);
                ans %= mod;
            }

            out.println(ans);
        }

    }

    static class FastScanner {
        private InputStream in;
        private byte[] buffer = new byte[1024];
        private int bufPointer;
        private int bufLength;

        public FastScanner(InputStream in) {
            this.in = in;
        }

        private int readByte() {
            if (bufPointer >= bufLength) {
                if (bufLength == -1)
                    throw new InputMismatchException();

                bufPointer = 0;
                try {
                    bufLength = in.read(buffer);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (bufLength <= 0)
                    return -1;
            }
            return buffer[bufPointer++];
        }

        private static boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public long nextLong() {
            long n = 0;

            int b = readByte();
            while (isSpaceChar(b))
                b = readByte();

            boolean minus = (b == '-');
            if (minus)
                b = readByte();

            while (b >= '0' && b <= '9') {
                n *= 10;
                n += b - '0';
                b = readByte();
            }

            if (!isSpaceChar(b))
                throw new NumberFormatException();

            return minus ? -n : n;
        }

        public int nextInt() {
            long n = nextLong();

            if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE)
                throw new NumberFormatException();

            return (int) n;
        }

    }

    static class Numbers {
        public static List<Integer> generatePrimeNumbers(int max) {
            boolean[] isPrime = new boolean[max + 1];
            for (int i = 2; i <= max; i++) isPrime[i] = true;

            int sqrtMax = (int) Math.sqrt(max);
            for (int i = 2; i <= sqrtMax; i++) {
                if (isPrime[i]) {
                    for (int j = i * i; j <= max; j += i) {
                        isPrime[j] = false;
                    }
                }
            }

            ArrayList<Integer> primeNumbers = new ArrayList<>();
            for (int i = 2; i <= max; i++) if (isPrime[i]) primeNumbers.add(i);

            return primeNumbers;
        }

    }
}


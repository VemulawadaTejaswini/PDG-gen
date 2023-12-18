import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.io.IOException;
import java.util.NoSuchElementException;
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
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            long n = in.nextLong();
            long p = in.nextLong();

            List<Integer> pn = Numbers.generatePrimeNumbers(1000000);

            long ans = 1;
            for (int cpn : pn) {
                long count = 0;
                long cp = p;
                while (cp % cpn == 0) {
                    cp /= (long) cpn;
                    count++;
                }
                if (count >= n) {
                    ans *= Math.pow((long) cpn, count / n);
                }
            }

            if (n == 1) {
                ans = p;
            }

            out.println(ans);
        }

    }

    static class Numbers {
        public static List<Integer> generatePrimeNumbers(int max) {
            boolean[] isPrime = new boolean[max + 1];
            for (int i = 2; i <= max; i++) isPrime[i] = true;

            int sqrtMax = (int) Math.sqrt(max);
            for (int i = 2; i < sqrtMax; i++) {
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

    static class FastScanner {
        private InputStream in;
        private byte[] buffer;
        private int bufPointer;
        private int bufLength;

        public FastScanner(InputStream in) {
            this.in = in;
            buffer = new byte[1024];
        }

        private boolean hasNextByte() {
            if (bufPointer < bufLength) return true;
            bufPointer = 0;
            try {
                bufLength = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return (bufLength > 0);
        }

        private int readByte() {
            return hasNextByte() ? buffer[bufPointer++] : -1;
        }

        private static boolean isPrintableChar(int c) {
            return (c >= 33 && c <= 126);
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[bufPointer]))
                bufPointer++;
            return hasNextByte();
        }

        public long nextLong() {
            if (!hasNext())
                throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || b > '9')
                throw new NumberFormatException();

            while (true) {
                if (b >= '0' && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }

    }
}


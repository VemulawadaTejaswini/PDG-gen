import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.HashMap;
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
        FasterScanner in = new FasterScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, FasterScanner in, PrintWriter out) {
            final int n = in.nextInt();

            List<Integer> pn = Numbers.generatePrimeNumbers(3000);

            int[] a = new int[n];

            HashMap<Integer, Integer> pnc = new HashMap<>();

            for (int i = 0; i < n; i++) a[i] = in.nextInt();

            for (int i = 0; i < n; i++) {
                int cn = a[i];
                for (int cp : pn) {
                    int count = 0;
                    while (cn % cp == 0) {
                        cn /= cp;
                        count++;
                    }

                    pnc.put(cp, Math.max(count, pnc.getOrDefault(cp, 0)));
                    if (cn == 1 || pn.contains(cn)) {
                        pnc.put(cn, Math.max(1, pnc.getOrDefault(cp, 0)));
                        break;
                    }
                }
            }

            long m = 1;
            for (int cp : pnc.keySet()) {
                int cm = pnc.get(cp);
                if (cm == 0) continue;
                for (int i = 0; i < cm; i++) m *= cp;
            }

            m--;

            long ans = 0;
            for (int i = 0; i < n; i++) {
                ans += m % a[i];
            }

            out.println(ans);
        }

    }

    static class FasterScanner {
        private InputStream in;
        private byte[] buffer;
        private int bufPointer;
        private int bufLength;

        public FasterScanner(InputStream in) {
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
            if (hasNextByte()) return buffer[bufPointer++];
            return -1;
        }

        private static boolean isPrintableChar(int c) {
            return (c >= 33 && c <= 126);
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[bufPointer])) bufPointer++;
            return hasNextByte();
        }

        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }

        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || b > '9') throw new NumberFormatException();

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
}


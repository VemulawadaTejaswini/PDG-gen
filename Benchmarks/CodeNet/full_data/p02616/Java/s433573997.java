import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Collections;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author KharYusuf
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "KharYusuf", 1 << 27);
        thread.start();
        thread.join();
    }

    static class TaskAdapter implements Runnable {
        @Override
        public void run() {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            FastReader in = new FastReader(inputStream);
            PrintWriter out = new PrintWriter(outputStream);
            EMultiplication4 solver = new EMultiplication4();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class EMultiplication4 {
        final long mod = (long) 1e9 + 7;

        public void solve(int testNumber, FastReader s, PrintWriter w) {
            int n = s.nextInt(), k = s.nextInt();
            ArrayList<Integer> pos = new ArrayList<>(), neg = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int x = s.nextInt();
                if (x > 0) pos.add(x);
                else neg.add(x);
            }
            Collections.sort(pos, Collections.reverseOrder());
            Collections.sort(neg);
            if (pos.size() == 0) {
                long ans = 1;
                int ptr = neg.size() - 1;
                while (ptr >= 0 && neg.get(ptr) == 0) ptr--;
                if (ptr + 1 >= k && k % 2 == 0) {
                    for (int i = 0; i < k; i++) {
                        ans *= neg.get(i);
                        ans %= mod;
                    }
                } else {
                    for (int i = neg.size() - 1, j = 0; j < k; j++, i--) {
                        ans *= neg.get(i);
                        ans %= mod;
                    }
                }
                w.println((ans + mod) % mod);
                return;
            }
            long ans = 1;
            int ptr1 = 0, ptr2 = 0;
            while (ptr1 + 1 < pos.size() && ptr2 + 1 < neg.size() && k > 1) {
                if (pos.get(ptr1) * (long) pos.get(ptr1 + 1) > neg.get(ptr2) * (long) neg.get(ptr2 + 1)) {
                    ans *= (pos.get(ptr1) * (long) pos.get(ptr1 + 1)) % mod;
                    ans %= mod;
                    ptr1 += 2;
                } else {
                    ans *= (neg.get(ptr2) * (long) neg.get(ptr2 + 1)) % mod;
                    ans %= mod;
                    ptr2 += 2;
                }
                k -= 2;
            }
            while (ptr1 + 1 < pos.size() && k > 1) {
                ans *= (pos.get(ptr1) * (long) pos.get(ptr1 + 1)) % mod;
                ans %= mod;
                ptr1 += 2;
                k -= 2;
            }
            while (ptr2 + 1 < neg.size() && k > 1) {
                ans *= (neg.get(ptr2) * (long) neg.get(ptr2 + 1)) % mod;
                ans %= mod;
                ptr2 += 2;
                k -= 2;
            }
            while (ptr1 < pos.size() && k > 0) {
                ans *= pos.get(ptr1++);
                ans %= mod;
                k--;
            }
            while (ptr2 < neg.size() && k > 0) {
                ans *= neg.get(ptr2++);
                ans %= mod;
                k--;
            }
            w.println((ans + mod) % mod);
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {

            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {

                curChar = 0;

                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
            }

            return buf[curChar++];
        }

        public int nextInt() {

            int c = read();

            while (isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;

            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();

                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public boolean isSpaceChar(int c) {

            if (filter != null)
                return filter.isSpaceChar(c);

            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}


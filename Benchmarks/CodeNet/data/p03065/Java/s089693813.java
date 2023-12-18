import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyInput in = new MyInput(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EPolynomialDivisors solver = new EPolynomialDivisors();
        solver.solve(1, in, out);
        out.close();
    }

    static class EPolynomialDivisors {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = in.nextIntArray(n + 1);

            for (int i = 0; i < n; i++) {
                a[i] = Math.abs(a[i]);
            }

            final List<Integer> ps = new ArrayList<>();
            int p = a[n];
            for (int i = 2; i * i <= p; i++) {
                if (p % i == 0) {
                    ps.add(i);
                    while (p % i == 0) p /= i;
                }
            }
            if (p != 1) {
                ps.add(p);
            }

            final Random random = new Random();
            for (int j = 0; j < 5; j++) {
                final List<Integer> next = new ArrayList<>(ps.size());
                for (int pp : ps) {
                    int x0 = random.nextInt(pp);
                    long x = 1;
                    long s = 0;
                    for (int i = n - 1; i >= 0; i--) {
                        x = x * x0 % pp;
                        s += a[i] * x % pp;
                    }
                    if (s % pp == 0) {
                        next.add(pp);
                    }
                }
                ps = next;
            }

            printList(out, ps);
        }

        static void printList(PrintWriter out, List<?> p) {
            for (int i = 0; i < p.size(); i++) {
                out.print(p.get(i) + (i == p.size() - 1 ? "\n" : " "));
            }
        }

    }

    static class MyInput {
        private final BufferedReader in;
        private static int pos;
        private static int readLen;
        private static final char[] buffer = new char[1024 * 8];
        private static char[] str = new char[500 * 8 * 2];
        private static boolean[] isDigit = new boolean[256];
        private static boolean[] isSpace = new boolean[256];
        private static boolean[] isLineSep = new boolean[256];

        static {
            for (int i = 0; i < 10; i++) {
                isDigit['0' + i] = true;
            }
            isDigit['-'] = true;
            isSpace[' '] = isSpace['\r'] = isSpace['\n'] = isSpace['\t'] = true;
            isLineSep['\r'] = isLineSep['\n'] = true;
        }

        public MyInput(InputStream is) {
            in = new BufferedReader(new InputStreamReader(is));
        }

        public int read() {
            if (pos >= readLen) {
                pos = 0;
                try {
                    readLen = in.read(buffer);
                } catch (IOException e) {
                    throw new RuntimeException();
                }
                if (readLen <= 0) {
                    throw new MyInput.EndOfFileRuntimeException();
                }
            }
            return buffer[pos++];
        }

        public int nextInt() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            int i = 0;
            int ret = 0;
            if (str[0] == '-') {
                i = 1;
            }
            for (; i < len; i++) ret = ret * 10 + str[i] - '0';
            if (str[0] == '-') {
                ret = -ret;
            }
            return ret;
        }

        public char nextChar() {
            while (true) {
                final int c = read();
                if (!isSpace[c]) {
                    return (char) c;
                }
            }
        }

        int reads(int len, boolean[] accept) {
            try {
                while (true) {
                    final int c = read();
                    if (accept[c]) {
                        break;
                    }
                    if (str.length == len) {
                        char[] rep = new char[str.length * 3 / 2];
                        System.arraycopy(str, 0, rep, 0, str.length);
                        str = rep;
                    }
                    str[len++] = (char) c;
                }
            } catch (MyInput.EndOfFileRuntimeException e) {
            }
            return len;
        }

        public int[] nextIntArray(final int n) {
            final int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
        }

        static class EndOfFileRuntimeException extends RuntimeException {
        }

    }
}


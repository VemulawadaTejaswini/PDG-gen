import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.InputStreamReader;
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
        DFaceProducesUnhappiness solver = new DFaceProducesUnhappiness();
        solver.solve(1, in, out);
        out.close();
    }

    static class DFaceProducesUnhappiness {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            char[] s = in.nextChars();

            int ans = 0;

            for (int t = 0; t < 2; t++) {
                int rev = 0;
                int seg = 0;
                int edge = 0;
                for (int i = 0, cur = 0; i < n; i++) {
                    if (i > 0 && s[i - 1] != s[i]) {
                        if (s[i] == 'L') {
                            rev++;
                            edge += seg == 0 ? 1 : 0;
                        }
                        cur = 0;
                        seg++;
                    }
                    cur++;
                    if (i == n - 1) {
                        if (s[i] == 'L') {
                            rev++;
                        }
                        seg++;
                    }
                }

                int val = n - seg + Math.min(k, rev - edge) * 2;
                if (k > rev - edge) {
                    val++;
                }

                ans = Math.max(ans, val);

                for (int i = 0; i < n; i++) {
                    s[i] = s[i] == 'L' ? 'R' : 'L';
                }
                for (int i = 0; i < n / 2; i++) {
                    swap(s, i, n - 1 - i);
                }
            }

            out.println(ans);
        }

        static void swap(char[] xs, int i, int j) {
            char t = xs[i];
            xs[i] = xs[j];
            xs[j] = t;
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

        public char[] nextChars() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            return Arrays.copyOf(str, len);
        }

        static class EndOfFileRuntimeException extends RuntimeException {
        }

    }
}


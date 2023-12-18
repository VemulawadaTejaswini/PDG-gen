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
        AKenkenRace solver = new AKenkenRace();
        solver.solve(1, in, out);
        out.close();
    }

    static class AKenkenRace {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int n = in.nextInt();
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            int c = in.nextInt() - 1;
            int d = in.nextInt() - 1;
            char[] s = in.nextChars();

            while (true) {
                if (a < b == c < d) {
                    out.println(can(s, a, c) && can(s, b, d) ? "Yes" : "No");
                    return;
                }
                if (a < b) {
                    int step = can1(s, a, b);
                    if (step < 0) {
                        step = can1(s, b, a);

                        if (step < 0 || b > d) {
                            out.println("No");
                            return;
                        }
                        b += step;
                    } else {
                        a += step;
                    }
                } else {
                    int step = can1(s, b, a);
                    if (step < 0) {
                        step = can1(s, a, b);

                        if (step < 0 || a > c) {
                            out.println("No");
                            return;
                        }
                        a += step;
                    } else {
                        b += step;
                    }
                }
            }
        }

        int can1(char[] s, int a, int b) {
            if (a + 1 < s.length && s[a + 1] != '#' && a + 1 != b) {
                return 1;
            }
            if (a + 2 < s.length && s[a + 2] != '#' && a + 2 != b) {
                return 2;
            }
            return -1;
        }

        boolean can(char[] s, int p, int q) {
            while (p < q) {
                if (p + 1 < s.length && s[p + 1] != '#') {
                    p++;
                    continue;
                }
                if (p + 2 < s.length && s[p + 2] != '#') {
                    p += 2;
                    continue;
                }
                return false;
            }
            return p == q;
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


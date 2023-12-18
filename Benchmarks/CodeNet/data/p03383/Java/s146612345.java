import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.stream.Stream;
import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;
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
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();
            char[][] cs = new char[h][];
            int[][] cnt = new int[h][26];
            for (int y = 0; y < h; y++) {
                cs[y] = in.nextChars();
                for (int x = 0; x < w; x++) {
                    cnt[y][cs[y][x] - 'a']++;
                }
            }

            TreeMap<int[], Integer> map = new TreeMap<>((a, b) -> {
                for (int i = 0; i < a.length; i++) {
                    if (a[i] != b[i]) return a[i] - b[i];
                }
                return 0;
            });

            for (int[] c : cnt) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            if (h % 2 == 0) {
                boolean ok = map.entrySet().stream().allMatch(e -> e.getValue() % 2 == 0);
                out.println(ok ? "YES" : "NO");
            } else {
                boolean ok = true;
                int odd = 0;
                for (Map.Entry<int[], Integer> e : map.entrySet()) {
                    if (e.getValue() % 2 == 0) {
                        odd++;
                        int o = 0;
                        for (int c : e.getKey()) {
                            if (c % 2 == 1) o++;
                        }
                        if (o != w % 2) {
                            ok = false;
                        }
                    }
                }
                ok &= odd == 1;
                out.println(ok ? "YES" : "NO");
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


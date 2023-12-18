import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.InputStreamReader;
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
        MyInput in = new MyInput(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EGolf solver = new EGolf();
        solver.solve(1, in, out);
        out.close();
    }

    static class EGolf {
        int k;

        public void solve(int testNumber, MyInput in, PrintWriter out) {
            k = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();

            if ((x + y) % 2 == 1 && k % 2 == 0) {
                out.println(-1);
                return;
            }

            List<int[]> ans = solve(x + y, x - y);

//        for (int[] xs : ans) dump(xs);

            out.println(ans.size() - 1);
            int curX = 0, curY = 0;
            for (int i = ans.size() - 2; i >= 0; i--) {
                int x1 = (ans.get(i)[0] + ans.get(i)[1]) / 2;
                int y1 = (ans.get(i)[0] - ans.get(i)[1]) / 2;
                int x2 = (ans.get(i + 1)[0] + ans.get(i + 1)[1]) / 2;
                int y2 = (ans.get(i + 1)[0] - ans.get(i + 1)[1]) / 2;

                curX += x1 - x2;
                curY += y1 - y2;
                out.println(curX + " " + curY);
            }
        }

        List<int[]> solve(int x, int y) {
            if (x < 0) {
                List<int[]> res = solve(-x, y);
                for (int[] r : res) r[0] *= -1;
                return res;
            }
            if (y < 0) {
                List<int[]> res = solve(x, -y);
                for (int[] r : res) r[1] *= -1;
                return res;
            }
            if (x < y) {
                List<int[]> res = solve(y, x);
                for (int[] r : res) swap(r, 0, 1);
                return res;
            }

            if (x % k == 0) {
                List<int[]> res = new ArrayList<>();
                res.add(new int[]{x, y});
                while (x > k) {
                    x -= k;
                    y -= y <= 0 ? -k : k;
                    res.add(new int[]{x, y});
                }
                res.add(new int[]{0, 0});
                return res;
            }

            if (k % 2 == 0) {
                List<int[]> res = new ArrayList<>();
                res.add(new int[]{x, y});

                if (y % k != 0) {
                    if (y > k) {
                        x -= k;
                        y -= y % k;
                        res.add(new int[]{x, y});
                    } else {
                        x -= k;
                        y += k - y % k;
                        res.add(new int[]{x, y});
                    }
                }

                while (x > k) {
                    x -= k;
                    if (y > k) y -= k;
                    res.add(new int[]{x, y});
                }
                res.add(new int[]{0, 0});
                return res;
            }

            if (y % k == 0) {
                List<int[]> res = new ArrayList<>();
                res.add(new int[]{x, y});
                while (x > k || y != k) {
                    x -= x <= 0 ? -k : k;
                    y -= y <= 0 ? -k : k;
                    res.add(new int[]{x, y});
                }
                res.add(new int[]{0, 0});
                return res;
            }

            if (x < k && y < k) {
                List<int[]> res = new ArrayList<>();
                res.add(new int[]{x, y});
                if (x % 2 == 1 && y % 2 == 1) {
                    x += 1;
                    y -= k;
                    res.add(new int[]{x, y});
                    x += k - x % k;
                    y += k;
                } else if (x % 2 == 0) {
                    x += k - x % k;
                    y -= k;
                } else {
                    x -= k;
                    y += k - y % k;
                }
                res.add(new int[]{x, y});
                res.add(new int[]{0, 0});
                return res;
            }

            if (y % k % 2 != 0) {
                List<int[]> res1 = solve(x - k, y + k - y % k);
                List<int[]> res2 = solve(x - k, y - y % k);

                List<int[]> res = res1.size() < res2.size() ? res1 : res2;
                res.add(0, new int[]{x, y});
            }

            return solve(x - k, y - k);
        }

        static void swap(int[] xs, int i, int j) {
            int t = xs[i];
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

        static class EndOfFileRuntimeException extends RuntimeException {
        }

    }
}


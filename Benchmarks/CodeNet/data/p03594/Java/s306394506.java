import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        char[][] ans;
        int w;
        int h;
        int d;

        public void solve(int testNumber, MyInput in, PrintWriter out) {
            h = in.nextInt();
            w = in.nextInt();
            d = in.nextInt();
            if (d % 2 == 1) {
                for (int y = 0; y < h; y++) {
                    for (int x = 0; x < w; x++) {
                        out.print((x + y) % 2 == 0 ? 'R' : 'G');
                    }
                    out.println();
                }
                return;
            }

            ans = new char[h][w];
        /*
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                TreeSet<Character> unused = new TreeSet<>(Arrays.asList('R', 'G', 'B', 'Y'));
                for (int dy = -1; dy <= 1; dy += 2) {
                    for (int dx = -1; dx <= 1; dx += 2) {
                        int xx = x + d/2*dx;
                        int yy = y + d/2*dy;
                        char c = get(xx, yy);
                        if (c != 0) {
                            unused.remove(c);
                            set(x-d/2*dx, y-d/2*dy, c);
                        }
                    }
                }
                for (int i = 0; i < 2; i++) {
                    char ch = 0;
                    for (int dy = -1; dy <= 1; dy++) {
                        for (int dx = -1; dx <= 1; dx++) {
                            if (dx * dy == 0 && dx + dy != 0) {
                                int xx = x + d * dx;
                                int yy = y + d * dy;
                                char c = get(xx, yy);
//                                if (x == 2 && y == 0) {
//                                    out.println(xx + "," + yy + "," + c + "," + ch);
//                                }
                                if (c != 0) {
                                    unused.remove(c);
                                    ch = c;
                                }
                                set(xx, yy, ch);
                            }
                        }
                    }
                }
                if (ans[y][x] == 0) {
                    ans[y][x] = unused.first();
                }
//                out.println(x + "," + y);
//                for (char[] cs : ans) out.println(new String(cs));
            }
        }
        */
//        out.println(dfs(0, 0));
            for (int y = 0; y < h; y++) {
                for (int x = 0; x < w; x++) {
                    for (char c : "RGBY".toCharArray()) {
                        boolean ok = true;
                        for (int dy = 0; dy < d - 1 && ok; dy++) {
                            final int di = Math.abs(dy - (d - 1) / 2);
                            int dw = ((d - 1) / 2 - di + 1) * 2;
                            for (int dx = 0; dx < dw; dx++) {
                                int xx = x + dx + di, yy = y + dy;
                                if (xx < 0 || xx >= w || yy < 0 || yy >= h) {
                                    ok = false;
                                    break;
                                }
                                if (ans[yy][xx] != 0) {
                                    ok = false;
                                    break;
                                }
                                ans[yy][xx] = c;
                                if (dy == 0 && dx == 0 && !valid(xx, yy)) {
                                    ok = false;
                                    ans[yy][xx] = 0;
                                    break;
                                }
                                ans[yy][xx] = 0;
                            }
                        }
                        if (ok) {
//                        dump(x, y, ok);
                            for (int dy = 0; dy < d - 1; dy++) {
                                final int di = Math.abs(dy - (d - 1) / 2);
                                int dw = ((d - 1) / 2 - di + 1) * 2;
                                for (int dx = 0; dx < dw; dx++) {
                                    int xx = x + dx + di, yy = y + dy;
                                    ans[yy][xx] = c;
//                                dump(xx, yy);
                                }
                            }
                            break;
                        }
                    }
                }
            }
            boolean res = dfs(0, 0);
//        dump(res);
            for (int y = 0; y < h; y++) {
                for (int x = 0; x < w; x++)
                    if (ans[y][x] == 0) {
                        ans[y][x] = 'x';
                    }
            }

            for (char[] cs : ans) out.println(new String(cs));
        }

        boolean dfs(int x, int y) {
            if (x >= w) return dfs(0, y + 1);
            if (y >= h) return true;
            if (ans[y][x] != 0) return dfs(x + 1, y);
            for (char c : "RGBY".toCharArray()) {
                ans[y][x] = c;
                if (valid(x, y) && dfs(x + 1, y)) {
                    return true;
                }
            }
            ans[y][x] = 0;
            return false;
        }

        boolean valid(int x, int y) {
            for (int i = 0; i <= d; i++) {
                for (int sy = -1; sy <= 1; sy += 2) {
                    for (int sx = -1; sx <= 1; sx += 2) {
                        int tx = x + sx * i;
                        int ty = y + sy * (d - i);
//                    dump(x, y, tx, ty);
                        if (get(tx, ty) == ans[y][x]) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }

        char get(int x, int y) {
            if (x >= 0 && x < w && y >= 0 && y < h) {
                return ans[y][x];
            }
            return 0;
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


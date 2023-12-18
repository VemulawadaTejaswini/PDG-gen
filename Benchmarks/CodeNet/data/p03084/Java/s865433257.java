import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.AbstractCollection;
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
        FMoreRealisticManhattanDistance solver = new FMoreRealisticManhattanDistance();
        solver.solve(1, in, out);
        out.close();
    }

    static class FMoreRealisticManhattanDistance {
        int h;
        int w;
        int q;
        TreeSet<Integer> left = new TreeSet<>();
        TreeSet<Integer> right = new TreeSet<>();
        TreeSet<Integer> up = new TreeSet<>();
        TreeSet<Integer> down = new TreeSet<>();

        public void solve(int testNumber, MyInput in, PrintWriter out) {
            h = in.nextInt();
            w = in.nextInt();
            q = in.nextInt();
            char[] s = in.nextChars();
            char[] t = in.nextChars();
            for (int i = 0; i < h; i++) {
                if (s[i] == 'W') left.add(i);
                else right.add(i);
            }
            for (int i = 0; i < w; i++) {
                if (t[i] == 'N') up.add(i);
                else down.add(i);
            }
            while (q-- > 0) {
                int y0 = in.nextInt() - 1;
                int x0 = in.nextInt() - 1;
                int y1 = in.nextInt() - 1;
                int x1 = in.nextInt() - 1;
                out.println(dijkstra(x0, y0, x1, y1));
            }
        }

        int dijkstra(int x0, int y0, int x1, int y1) {
            PriorityQueue<S> que = new PriorityQueue<>();
            que.add(new S(x0, y0, 0, 0));
//        int dr = Integer.MAX_VALUE;
//        int dl = Integer.MIN_VALUE;
//        int dd = Integer.MAX_VALUE;
//        int du = Integer.MIN_VALUE;
            while (!que.isEmpty()) {
                S s = que.poll();
                if (s.x == x1 && s.y == y1) {
//                dump(s.x, s.y, s.d, s.t);
                    return s.d;
                }
                if (s.t >= 5) continue;
//            if (dr <= s.x && s.x >= x1) continue;
//            if (dl >= s.x && s.x <= x1) continue;
//            if (dd <= s.y && s.y >= y1) continue;
//            if (du >= s.y && s.y <= y1) continue;
//            if (s.x >= x1) dr = Math.min(dr, s.x);
//            if (s.x <= x1) dl = Math.max(dl, s.x);
//            if (s.y >= y1) dd = Math.min(dd, s.y);
//            if (s.y <= y1) du = Math.max(du, s.y);
//            dump(s.x, s.y, s.d);
                if (right.contains(s.y)) {
                    nextR(que, x1, s, up);
                    nextR(que, x1, s, down);
                }
                if (left.contains(s.y)) {
                    nextL(que, x1, s, up);
                    nextL(que, x1, s, down);
                }
                if (up.contains(s.x)) {
                    nextU(que, y1, s, left);
                    nextU(que, y1, s, right);
                }
                if (down.contains(s.x)) {
                    nextD(que, y1, s, left);
                    nextD(que, y1, s, right);
                }
            }
            return -1;
        }

        void nextR(PriorityQueue<S> que, int x1, S s, TreeSet<Integer> st) {
            Integer x = st.higher(s.x);
            if (x != null) que.add(new S(x, s.y, s.d + Math.abs(s.x - x), s.t + 1));
            if (x1 >= s.x) {
                x = st.higher(x1);
                if (x != null) que.add(new S(x, s.y, s.d + Math.abs(s.x - x), s.t + 1));
                if (s.x != x1) que.add(new S(x1, s.y, s.d + Math.abs(s.x - x1), s.t + 1));
            }
        }

        void nextL(PriorityQueue<S> que, int x1, S s, TreeSet<Integer> st) {
            Integer x = st.lower(s.x);
            if (x != null) que.add(new S(x, s.y, s.d + Math.abs(s.x - x), s.t + 1));
            if (x1 <= s.x) {
                x = st.lower(x1);
                if (x != null) que.add(new S(x, s.y, s.d + Math.abs(s.x - x), s.t + 1));
                if (s.x != x1) que.add(new S(x1, s.y, s.d + Math.abs(s.x - x1), s.t + 1));
            }
        }

        void nextU(PriorityQueue<S> que, int y1, S s, TreeSet<Integer> st) {
            Integer y = st.lower(s.y);
            if (y != null) que.add(new S(s.x, y, s.d + Math.abs(s.y - y), s.t + 1));
            if (y1 <= s.y) {
                y = st.lower(y1);
                if (y != null) que.add(new S(s.x, y, s.d + Math.abs(s.y - y), s.t + 1));
                if (s.y != y1) que.add(new S(s.x, y1, s.d + Math.abs(s.y - y1), s.t + 1));
            }
        }

        void nextD(PriorityQueue<S> que, int y1, S s, TreeSet<Integer> st) {
            Integer y = st.higher(s.y);
            if (y != null) que.add(new S(s.x, y, s.d + Math.abs(s.y - y), s.t + 1));
            if (y1 >= s.y) {
                y = st.higher(y1);
                if (y != null) que.add(new S(s.x, y, s.d + Math.abs(s.y - y), s.t + 1));
                if (s.y != y1) que.add(new S(s.x, y1, s.d + Math.abs(s.y - y1), s.t + 1));
            }
        }

        class S implements Comparable<S> {
            final int x;
            final int y;
            final int d;
            final int t;

            S(int x, int y, int d, int t) {
                this.x = x;
                this.y = y;
                this.d = d;
                this.t = t;
            }

            public int compareTo(S o) {
                return d - o.d;
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


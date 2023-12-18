import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.util.Comparator;
import java.util.Collections;
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
            char[] s = in.nextChars();
            for (int i = 0; i < s.length; i++) {
                s[i] -= 'a';
            }
            int n = in.nextInt();
            List<int[]> rng = new ArrayList<>();
            SegRMQInt rmq = new SegRMQInt(s.length);
            SegRMQInt rot = new SegRMQInt(s.length);
            for (int i = 0; i < n; i++) {
                int l0 = in.nextInt() - 1;
                int r0 = in.nextInt() - 1;
                int l = Math.min(l0, s.length - 1 - l0);
                int r = Math.min(r0, s.length - 1 - r0);
                if (l == l0 && r != r0) {
                    if (l > r) {
                        int t = l;
                        l = r;
                        r = t;
                    }
                    r--;
                }
                if (s.length % 2 == 1 && r == s.length / 2) {
                    r--;
                }
//            dump(l, r);
                if (l <= r) {
                    rng.add(new int[]{l, r});
                    rmq.add(l, r + 1, 1);
                }
            }
            Collections.sort(rng, Comparator.comparingInt(a -> a[1] - a[0]));
            Collections.reverse(rng);
            for (int[] rn : rng) {
                int l = rn[0];
                int r = rn[1];
                rmq.add(l, r + 1, -1);
                int idx = rmq.getMin(l, r + 1);
//            dump(l, r);
                if (rmq.seg[idx] == 0) {
                    idx -= rmq.n - 1;
                    int ri = rot.get(idx, idx + 1);
                    for (int i = 0; i < 26; i++) {
                        if ((s[idx] + ri + i) % 26 == s[s.length - 1 - idx]) {
                            rot.add(l, r + 1, i);
//                        dump((char)(s[idx]+'a'), (char)(s[s.length-1-idx]+'a'), i);
                            break;
                        }
//                    dump((char)(s[idx]+'a'), (char)(s[s.length-1-idx]+'a'), i);
                    }
                }
            }
            for (int i = 0; i < s.length / 2; i++) {
//            dump((char)((s[i]+rot.get(i, i + 1))%26+'a'), (char)(s[s.length-1-i]+'a'), i);
                if ((s[i] + rot.get(i, i + 1)) % 26 != s[s.length - 1 - i]) {
                    out.println("NO");
                    return;
                }
            }
            out.println("YES");
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

    static class SegRMQInt {
        final int INF = 1 << 29;
        final int n;
        final int[] seg;
        final int[] add;

        public SegRMQInt(final int n) {
            this.n = Integer.highestOneBit(n) << 1;
            seg = new int[this.n << 1];
            add = new int[this.n << 1];
//        Arrays.fill(seg, INF);
        }

        void propagate(int curL, int curR, int k) {
            if (add[k] != 0) {
                final int curM = (curL + curR) / 2;
                add(curL, curR, 2 * k + 1, add[k], curL, curM);
                add(curL, curR, 2 * k + 2, add[k], curM, curR);
                add[k] = 0;
            }
        }

        int getMin(int l, int r) {
            return getMin(l, r, 0, 0, n);
        }

        int getMin(int l, int r, int k, int curL, int curR) {
            if (curR <= l || curL >= r) return -1;
            if (curR - curL == 1) {
                return k;
            }
            propagate(curL, curR, k);
            final int curM = (curL + curR) / 2;
            if (l <= curL && curR <= r) {
                return seg[2 * k + 1] < seg[2 * k + 2] ? getMin(l, r, 2 * k + 1, curL, curM) : getMin(l, r, 2 * k + 2, curM, curR);
            }
            int li = getMin(l, r, 2 * k + 1, curL, curM);
            int ri = getMin(l, r, 2 * k + 2, curM, curR);
            return li == -1 ? ri : ri == -1 ? li : seg[li] < seg[ri] ? li : ri;
        }

        int get(int l, int r) {
            return get(l, r, 0, 0, n);
        }

        int get(int l, int r, int k, int curL, int curR) {
            if (curR <= l || curL >= r) return INF;
            if (l <= curL && curR <= r) {
                return seg[k];
            }
            propagate(curL, curR, k);
            final int curM = (curL + curR) / 2;
            return Math.min(
                    get(l, r, 2 * k + 1, curL, curM),
                    get(l, r, 2 * k + 2, curM, curR));
        }

        void add(int l, int r, int v) {
            add(l, r, 0, v, 0, n);
        }

        void add(int l, int r, int k, int v, int curL, int curR) {
            if (curR <= l || curL >= r) return;
            if (l <= curL && curR <= r) {
                seg[k] += v;
                add[k] += v;
                return;
            }
            final int curM = (curL + curR) / 2;
            propagate(curL, curR, k);
            add(l, r, 2 * k + 1, v, curL, curM);
            add(l, r, 2 * k + 2, v, curM, curR);
            seg[k] = Math.min(seg[2 * k + 1], seg[2 * k + 2]);
        }

    }
}


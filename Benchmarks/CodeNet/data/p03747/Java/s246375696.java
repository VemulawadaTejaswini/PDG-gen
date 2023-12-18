import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.util.Collection;
import java.io.IOException;
import java.util.Deque;
import java.io.UncheckedIOException;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author daltao
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "daltao", 1 << 27);
        thread.start();
        thread.join();
    }

    static class TaskAdapter implements Runnable {
        @Override
        public void run() {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            FastInput in = new FastInput(inputStream);
            PrintWriter out = new PrintWriter(outputStream);
            AntsonaCircle solver = new AntsonaCircle();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class AntsonaCircle {
        public void solve(int testNumber, FastInput in, PrintWriter out) {
            int n = in.readInt();
            int l = in.readInt();
            int t = in.readInt();

            Ant[] ants = new Ant[n];
            for (int i = 0; i < n; i++) {
                ants[i] = new Ant();
                ants[i].x = in.readInt();
                ants[i].w = in.readInt();
                ants[i].id = i;
                ants[i].label = i;
            }

            boolean allSameDirection = true;
            for (int i = 1; i < n; i++) {
                allSameDirection = allSameDirection && ants[i].w == ants[i - 1].w;
            }

            if (allSameDirection) {
                for (int i = 0; i < n; i++) {
                    int x = ants[i].x;
                    if (ants[i].w == 1) {
                        x += t;
                    } else {
                        x -= t;
                    }
                    out.println(DigitUtils.mod(x, l));
                }
                return;
            }

            int diffIndex = 0;
            for (int i = 1; i < n; i++) {
                if (ants[i].w == 2 && ants[i - 1].w == 1) {
                    diffIndex = i;
                    break;
                }
            }
            if (diffIndex == n) {
                diffIndex = 0;
            }

            Deque<Ant> cw = new ArrayDeque<>(2 * n);
            Deque<Ant> ccw = new ArrayDeque<>(2 & n);
            for (int i = 0; i < n; i++) {
                Ant ant = ants[DigitUtils.mod(diffIndex + i, n)];
                if (ant.w == 2) {
                    ccw.addLast(ant);
                }
            }

            for (int i = 0; i < n; i++) {
                Ant ant = ants[DigitUtils.mod(diffIndex - i, n)];
                if (ant.w == 1) {
                    cw.addLast(ant);
                }
            }

            int antId = antOn(new ArrayDeque<>(ccw), new ArrayDeque<>(cw), l, l).id;
            int modId = antOn(ccw, cw, t % l, l).id;

            int[] perm1 = new int[n];
            int[] perm2 = new int[n];
            for (int i = 0; i < n; i++) {
                perm1[i] = perm2[i] = i;
            }

            SequenceUtils.rotate(perm1, 0, DigitUtils.mod(0 + antId - diffIndex, n), n - 1);
            SequenceUtils.rotate(perm2, 0, DigitUtils.mod(0 + modId - diffIndex, n), n - 1);

            PermutationUtils.PowerPermutation pp1 = new PermutationUtils.PowerPermutation(perm1);
            PermutationUtils.PowerPermutation pp2 = new PermutationUtils.PowerPermutation(perm2);

            for (int i = 0; i < n; i++) {
                Ant ant = ants[pp2.apply(pp1.apply(i, t / l), 1)];
                int x = ant.x;
                if (ant.w == 1) {
                    x += t;
                } else {
                    x -= t;
                }
                x = DigitUtils.mod(x, l);
                out.println(x);
            }
        }

        public Ant antOn(Deque<Ant> ccw, Deque<Ant> cw, int t, int l) {
            int totalMove = t * 2;
            while (!ccw.isEmpty() && !cw.isEmpty()) {
                int distBetween = DigitUtils.mod(ccw.peekFirst().x - (t * 2 - totalMove) - cw.peekFirst().x, l);
                if (distBetween == 0) {
                    distBetween = l;
                }
                if (distBetween > totalMove) {
                    return ccw.removeFirst();
                }
                totalMove -= distBetween;
                ccw.addLast(ccw.removeFirst());

                distBetween = DigitUtils.mod(ccw.peekFirst().x - (t * 2 - totalMove) - cw.peekFirst().x, l);
                if (distBetween == 0) {
                    distBetween = l;
                }
                if (distBetween > totalMove) {
                    return cw.removeFirst();
                }
                cw.addLast(cw.removeFirst());
                totalMove -= distBetween;
            }

            return ccw.isEmpty() ? cw.peekFirst() : ccw.peekFirst();
        }

    }

    static class Ant {
        int id;
        int x;
        int w;
        int label;

    }

    static class SequenceUtils {
        private static int gcd0(int a, int b) {
            return b == 0 ? a : gcd0(b, a % b);
        }

        public static void rotate(int[] list, int l, int newBeg, int r) {
            int offset = l;
            int len = r - l + 1;
            int step = len - (newBeg - l);
            int g = gcd0(newBeg, r - l + 1);
            for (int i = 0; i < g; i++) {
                int take = list[i + offset];
                int ni = i;
                while ((ni = (ni + step) % len) != i) {
                    int tmp = list[ni + offset];
                    list[ni + offset] = take;
                    take = tmp;
                }
                list[i + offset] = take;
            }
        }

    }

    static class FastOutput implements AutoCloseable, Closeable {
        private StringBuilder cache = new StringBuilder(10 << 20);
        private final Writer os;

        public FastOutput(Writer os) {
            this.os = os;
        }

        public FastOutput(OutputStream os) {
            this(new OutputStreamWriter(os));
        }

        public FastOutput flush() {
            try {
                os.append(cache);
                os.flush();
                cache.setLength(0);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
            return this;
        }

        public void close() {
            flush();
            try {
                os.close();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }

        public String toString() {
            return cache.toString();
        }

    }

    static class DigitUtils {
        private static final long[] DIGIT_VALUES = new long[19];

        static {
            DIGIT_VALUES[0] = 1;
            for (int i = 1; i < 19; i++) {
                DIGIT_VALUES[i] = DIGIT_VALUES[i - 1] * 10;
            }
        }

        private DigitUtils() {
        }

        public static int mod(int x, int mod) {
            x %= mod;
            if (x < 0) {
                x += mod;
            }
            return x;
        }

    }

    static class FastInput {
        private final InputStream is;
        private byte[] buf = new byte[1 << 13];
        private int bufLen;
        private int bufOffset;
        private int next;

        public FastInput(InputStream is) {
            this.is = is;
        }

        private int read() {
            while (bufLen == bufOffset) {
                bufOffset = 0;
                try {
                    bufLen = is.read(buf);
                } catch (IOException e) {
                    bufLen = -1;
                }
                if (bufLen == -1) {
                    return -1;
                }
            }
            return buf[bufOffset++];
        }

        public void skipBlank() {
            while (next >= 0 && next <= 32) {
                next = read();
            }
        }

        public int readInt() {
            int sign = 1;

            skipBlank();
            if (next == '+' || next == '-') {
                sign = next == '+' ? 1 : -1;
                next = read();
            }

            int val = 0;
            if (sign == 1) {
                while (next >= '0' && next <= '9') {
                    val = val * 10 + next - '0';
                    next = read();
                }
            } else {
                while (next >= '0' && next <= '9') {
                    val = val * 10 - next + '0';
                    next = read();
                }
            }

            return val;
        }

    }

    static class PermutationUtils {
        private static final long[] PERMUTATION_CNT = new long[21];

        static {
            PERMUTATION_CNT[0] = 1;
            for (int i = 1; i <= 20; i++) {
                PERMUTATION_CNT[i] = PERMUTATION_CNT[i - 1] * i;
            }
        }

        public static class PowerPermutation {
            int[] g;
            int[] idx;
            int[] l;
            int[] r;
            int n;

            public PowerPermutation(int[] p) {
                this(p, p.length);
            }

            public PowerPermutation(int[] p, int len) {
                n = len;
                boolean[] visit = new boolean[n];
                g = new int[n];
                l = new int[n];
                r = new int[n];
                idx = new int[n];
                int wpos = 0;
                for (int i = 0; i < n; i++) {
                    int val = p[i];
                    if (visit[val]) {
                        continue;
                    }
                    visit[val] = true;
                    g[wpos] = val;
                    l[wpos] = wpos;
                    idx[val] = wpos;
                    wpos++;
                    while (true) {
                        int x = p[g[wpos - 1]];
                        if (visit[x]) {
                            break;
                        }
                        visit[x] = true;
                        g[wpos] = x;
                        l[wpos] = l[wpos - 1];
                        idx[x] = wpos;
                        wpos++;
                    }
                    for (int j = l[wpos - 1]; j < wpos; j++) {
                        r[j] = wpos - 1;
                    }
                }
            }

            public int apply(int x, int p) {
                int i = idx[x];
                int dist = DigitUtils.mod((i - l[i]) + p, r[i] - l[i] + 1);
                return g[dist + l[i]];
            }

            public String toString() {
                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < n; i++) {
                    builder.append(apply(i, 1)).append(' ');
                }
                return builder.toString();
            }

        }

    }
}


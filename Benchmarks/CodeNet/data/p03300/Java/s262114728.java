import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collection;
import java.io.IOException;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.io.UncheckedIOException;
import java.util.List;
import java.util.stream.Stream;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 29);
        thread.start();
        thread.join();
    }

    static class TaskAdapter implements Runnable {
        @Override
        public void run() {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            FastInput in = new FastInput(inputStream);
            FastOutput out = new FastOutput(outputStream);
            ESynchronizedSubsequence solver = new ESynchronizedSubsequence();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class ESynchronizedSubsequence {
        Debug debug = new Debug(false);

        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            int[] s = new int[n * 2];
            for (int i = 0; i < 2 * n; i++) {
                s[i] = in.readChar() - 'a';
            }
            List<Block> blocks = new ArrayList<>(n);
            int cur = 0;
            int left = 0;
            for (int i = 0; i < 2 * n; i++) {
                if (s[i] == 0) {
                    cur--;
                } else {
                    cur++;
                }
                if (cur == 0) {
                    Block b = new Block();
                    b.start = s[left];
                    b.data = Arrays.copyOfRange(s, left, i + 1);
                    left = i + 1;
                    if (b.start == 0) {
                        extractType0(b);
                    } else {
                        extractType1(b);
                    }
                    blocks.add(b);
                }
            }
            debug.debug("blocks", blocks);

            List<Block> type1 = blocks.stream().filter(x -> x.start == 1).collect(Collectors.toList());
            for (int i = 0; i < type1.size(); i++) {
                type1.get(i).index = i;
            }
            type1.sort((a, b) -> {
                int ans = -a.seq.compareTo(b.seq);
                if (ans == 0) {
                    ans = a.index - b.index;
                }
                return ans;
            });

            StringBuilder ans = new StringBuilder();
            int now = 0;
            for (Block b : type1) {
                if (b.index < now) {
                    continue;
                }
                ans.append(b.seq);
                now = b.index + 1;
            }
            int tail = blocks.size();
            while (tail > 0 && blocks.get(tail - 1).start == 0) {
                tail--;
            }
            for (int i = tail; i < blocks.size(); i++) {
                ans.append(blocks.get(i).seq);
            }
            for (int i = 0; i < ans.length(); i++) {
                ans.setCharAt(i, (char) (ans.charAt(i) - '0' + 'a'));
            }
            out.println(ans.toString());
        }

        public String build(int[] data, boolean[] added) {
            StringBuilder builder = new StringBuilder(data.length);
            for (int i = 0; i < data.length; i++) {
                if (added[i]) {
                    builder.append(data[i]);
                }
            }
            return builder.toString();
        }

        public int[][] getIndices(int[] data) {
            int[][] indices = new int[2][data.length / 2];
            int[] wpos = new int[2];
            for (int i = 0; i < data.length; i++) {
                indices[data[i]][wpos[data[i]]++] = i;
            }
            return indices;
        }

        public void extractType0(Block b) {
            int[] data = b.data;
            int[][] indices = getIndices(data);
            StringBuilder ans = new StringBuilder(data.length);
            int cur = 0;
            for (int i = 0; i < data.length / 2; i++) {
                if (cur <= indices[0][i]) {
                    ans.append("01");
                    cur = indices[1][i] + 1;
                }
            }
            b.seq = ans.toString();
        }

        public String max(String a, String b) {
            return a.compareTo(b) >= 0 ? a : b;
        }

        public void extractType1(Block b) {
            int[] data = b.data;
            int[][] indices = getIndices(data);
            boolean[] added = new boolean[data.length];
            Arrays.fill(added, true);
            String s = build(data, added);
            for (int i = 0; i < data.length / 2; i++) {
                added[indices[0][i]] = added[indices[1][i]] = false;
                String cur = build(data, added);
                s = max(s, cur);
            }
            b.seq = s;
        }

    }

    static class Block {
        int start;
        int[] data;
        int index;
        String seq;

        public String toString() {
            return seq;
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

        public char readChar() {
            skipBlank();
            char c = (char) next;
            next = read();
            return c;
        }

    }

    static class Debug {
        private boolean offline;
        private PrintStream out = System.err;
        static int[] empty = new int[0];

        public Debug(boolean enable) {
            offline = enable && System.getSecurityManager() == null;
        }

        public Debug debug(String name, Object x) {
            return debug(name, x, empty);
        }

        public Debug debug(String name, Object x, int... indexes) {
            if (offline) {
                if (x == null || !x.getClass().isArray()) {
                    out.append(name);
                    for (int i : indexes) {
                        out.printf("[%d]", i);
                    }
                    out.append("=").append("" + x);
                    out.println();
                } else {
                    indexes = Arrays.copyOf(indexes, indexes.length + 1);
                    if (x instanceof byte[]) {
                        byte[] arr = (byte[]) x;
                        for (int i = 0; i < arr.length; i++) {
                            indexes[indexes.length - 1] = i;
                            debug(name, arr[i], indexes);
                        }
                    } else if (x instanceof short[]) {
                        short[] arr = (short[]) x;
                        for (int i = 0; i < arr.length; i++) {
                            indexes[indexes.length - 1] = i;
                            debug(name, arr[i], indexes);
                        }
                    } else if (x instanceof boolean[]) {
                        boolean[] arr = (boolean[]) x;
                        for (int i = 0; i < arr.length; i++) {
                            indexes[indexes.length - 1] = i;
                            debug(name, arr[i], indexes);
                        }
                    } else if (x instanceof char[]) {
                        char[] arr = (char[]) x;
                        for (int i = 0; i < arr.length; i++) {
                            indexes[indexes.length - 1] = i;
                            debug(name, arr[i], indexes);
                        }
                    } else if (x instanceof int[]) {
                        int[] arr = (int[]) x;
                        for (int i = 0; i < arr.length; i++) {
                            indexes[indexes.length - 1] = i;
                            debug(name, arr[i], indexes);
                        }
                    } else if (x instanceof float[]) {
                        float[] arr = (float[]) x;
                        for (int i = 0; i < arr.length; i++) {
                            indexes[indexes.length - 1] = i;
                            debug(name, arr[i], indexes);
                        }
                    } else if (x instanceof double[]) {
                        double[] arr = (double[]) x;
                        for (int i = 0; i < arr.length; i++) {
                            indexes[indexes.length - 1] = i;
                            debug(name, arr[i], indexes);
                        }
                    } else if (x instanceof long[]) {
                        long[] arr = (long[]) x;
                        for (int i = 0; i < arr.length; i++) {
                            indexes[indexes.length - 1] = i;
                            debug(name, arr[i], indexes);
                        }
                    } else {
                        Object[] arr = (Object[]) x;
                        for (int i = 0; i < arr.length; i++) {
                            indexes[indexes.length - 1] = i;
                            debug(name, arr[i], indexes);
                        }
                    }
                }
            }
            return this;
        }

    }

    static class FastOutput implements AutoCloseable, Closeable, Appendable {
        private StringBuilder cache = new StringBuilder(10 << 20);
        private final Writer os;

        public FastOutput append(CharSequence csq) {
            cache.append(csq);
            return this;
        }

        public FastOutput append(CharSequence csq, int start, int end) {
            cache.append(csq, start, end);
            return this;
        }

        public FastOutput(Writer os) {
            this.os = os;
        }

        public FastOutput(OutputStream os) {
            this(new OutputStreamWriter(os));
        }

        public FastOutput append(char c) {
            cache.append(c);
            return this;
        }

        public FastOutput append(String c) {
            cache.append(c);
            return this;
        }

        public FastOutput println(String c) {
            return append(c).println();
        }

        public FastOutput println() {
            cache.append(System.lineSeparator());
            return this;
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
}


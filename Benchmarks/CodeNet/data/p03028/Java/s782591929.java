import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Deque;
import java.util.function.Supplier;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.util.Collection;
import java.io.IOException;
import java.io.Serializable;
import java.io.UncheckedIOException;
import java.util.function.Consumer;
import java.io.Closeable;
import java.io.Writer;
import java.util.ArrayDeque;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 27);
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
            FRandomTournament solver = new FRandomTournament();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class FRandomTournament {
        BitSet[] adj;
        BitSet[] lWinner;
        BitSet[] rWinner;
        int[] lWinnerR;
        int[] rWinnerL;
        Buffer<BitSet> buffer;
        int[][] dpL;
        int[][] dpR;

        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            adj = new BitSet[n];
            for (int i = 0; i < n; i++) {
                adj[i] = new BitSet(n);
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    if (in.readChar() == '0') {
                        adj[j].set(i);
                    } else {
                        adj[i].set(j);
                    }
                }
            }

            lWinner = new BitSet[n];
            rWinner = new BitSet[n];
            lWinnerR = new int[n];
            rWinnerL = new int[n];
            dpL = new int[n][n];
            dpR = new int[n][n];
            SequenceUtils.deepFill(dpL, -1);
            SequenceUtils.deepFill(dpR, -1);
            for (int i = 0; i < n; i++) {
                lWinner[i] = new BitSet(n);
                rWinner[i] = new BitSet(n);
                lWinner[i].set(i);
                rWinner[i].set(i);
                lWinnerR[i] = rWinnerL[i] = i;
                dpL[i][i] = dpR[i][i] = 1;
            }

            buffer = new Buffer<>(() -> new BitSet(n));

            for (int i = 0; i < n; i++) {
                solveLToR(i, n - 1);
            }

            BitSet possible = winner(0, n - 1);
            int ans = possible.size();
            out.println(ans);
        }

        public BitSet winner(int l, int r) {
            solveLToR(l, r);
            solveRToL(l, r);
            BitSet set = buffer.alloc();
            set.copy(lWinner[l]);
            set.and(rWinner[r]);
            return set;
        }

        public void solveLToR(int l, int r) {
            while (lWinnerR[l] < r) {
                ++lWinnerR[l];
                if (dpR(l, lWinnerR[l]) == 1) {
                    lWinner[l].set(lWinnerR[l]);
                }
            }
        }

        public void solveRToL(int l, int r) {
            while (rWinnerL[r] > l) {
                --rWinnerL[r];
                if (dpL(rWinnerL[r], r) == 1) {
                    rWinner[r].set(rWinnerL[r]);
                }
            }
        }

        public int dpR(int l, int r) {
            if (dpR[l][r] == -1) {
                BitSet bs = winner(l, r - 1);
                bs.and(adj[r]);
                dpR[l][r] = Integer.signum(bs.size(l, r - 1));
                buffer.release(bs);
            }
            return dpR[l][r];
        }

        public int dpL(int l, int r) {
            if (dpL[l][r] == -1) {
                BitSet bs = winner(l + 1, r);
                bs.and(adj[l]);
                dpL[l][r] = Integer.signum(bs.size(l + 1, r));
                buffer.release(bs);
            }
            return dpL[l][r];
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

    static class Buffer<T> {
        private Deque<T> deque;
        private Supplier<T> supplier;
        private Consumer<T> cleaner;
        private int allocTime;
        private int releaseTime;

        public Buffer(Supplier<T> supplier) {
            this(supplier, (x) -> {
            });
        }

        public Buffer(Supplier<T> supplier, Consumer<T> cleaner) {
            this(supplier, cleaner, 0);
        }

        public Buffer(Supplier<T> supplier, Consumer<T> cleaner, int exp) {
            this.supplier = supplier;
            this.cleaner = cleaner;
            deque = new ArrayDeque<>(exp);
        }

        public T alloc() {
            allocTime++;
            return deque.isEmpty() ? supplier.get() : deque.removeFirst();
        }

        public void release(T e) {
            releaseTime++;
            cleaner.accept(e);
            deque.addLast(e);
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

        public FastOutput append(int c) {
            cache.append(c);
            return this;
        }

        public FastOutput println(int c) {
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

    static final class BitSet implements Serializable, Cloneable {
        private long[] data;
        private long tailAvailable;
        private int capacity;
        private int m;
        private static final int SHIFT = 6;
        private static final int LOW = 63;
        private static final int BITS_FOR_EACH = 64;
        private static final long ALL_ONE = ~0L;
        private static final long ALL_ZERO = 0L;
        private static final int MAX_OFFSET = 63;

        public BitSet(int n) {
            capacity = n;
            this.m = (capacity + 64 - 1) / 64;
            data = new long[m];
            tailAvailable = oneBetween(0, offset(capacity - 1));
        }

        public BitSet(BitSet bs) {
            this.data = bs.data.clone();
            this.tailAvailable = bs.tailAvailable;
            this.capacity = bs.capacity;
            this.m = bs.m;
        }

        private BitSet(BitSet bs, int l, int r) {
            capacity = r - l + 1;
            tailAvailable = oneBetween(0, offset(capacity - 1));
            data = Arrays.copyOfRange(bs.data, word(l), word(r) + 1);
            this.m = data.length;
            leftShift(offset(l));
            this.m = (capacity + 64 - 1) / 64;
            data[m - 1] &= tailAvailable;
            for (int i = m; i < data.length; i++) {
                data[i] = 0;
            }
        }

        public void set(int i) {
            data[word(i)] |= (1L << offset(i));
        }

        private static int word(int i) {
            return i >>> SHIFT;
        }

        private static int offset(int i) {
            return i & LOW;
        }

        private long oneBetween(int l, int r) {
            if (r < l) {
                return 0;
            }
            long lBegin = 1L << offset(l);
            long rEnd = 1L << offset(r);
            return (ALL_ONE ^ (lBegin - 1)) & ((rEnd << 1) - 1);
        }

        public int capacity() {
            return capacity;
        }

        public int size() {
            int ans = 0;
            for (long x : data) {
                ans += Long.bitCount(x);
            }
            return ans;
        }

        public int size(int l, int r) {
            if (r < l) {
                return 0;
            }
            int ans = 0;
            int lWord = l >>> SHIFT;
            int rWord = r >>> SHIFT;
            for (int i = lWord + 1; i < rWord; i++) {
                ans += Long.bitCount(data[i]);
            }
            //lword
            if (lWord == rWord) {
                ans += Long.bitCount(data[lWord] & oneBetween(offset(l), offset(r)));
            } else {
                ans += Long.bitCount(data[lWord] & oneBetween(offset(l), MAX_OFFSET));
                ans += Long.bitCount(data[rWord] & oneBetween(0, offset(r)));
            }
            return ans;
        }

        public void copy(BitSet bs) {
            int n = Math.min(this.m, bs.m);
            System.arraycopy(bs.data, 0, data, 0, n);
            Arrays.fill(data, n, n, 0);
        }

        public void and(BitSet bs) {
            int n = Math.min(this.m, bs.m);
            for (int i = 0; i < n; i++) {
                data[i] &= bs.data[i];
            }
        }

        public int nextSetBit(int start) {
            int offset = offset(start);
            int w = word(start);
            if (offset != 0) {
                long mask = oneBetween(offset, MAX_OFFSET);
                if ((data[w] & mask) != 0) {
                    return Long.numberOfTrailingZeros(data[w] & mask) + w * BITS_FOR_EACH;
                }
                w++;
            }

            while (w < m && data[w] == ALL_ZERO) {
                w++;
            }
            if (w >= m) {
                return capacity();
            }
            return Long.numberOfTrailingZeros(data[w]) + w * BITS_FOR_EACH;
        }

        public void leftShift(int n) {
            int wordMove = word(n);
            int offsetMove = offset(n);
            int rshift = MAX_OFFSET - (offsetMove - 1);

            if (offsetMove != 0) {
                //slightly
                for (int i = 0; i < m; i++) {
                    if (i > 0) {
                        data[i - 1] |= data[i] << rshift;
                    }
                    data[i] >>>= offsetMove;
                }
            }
            if (wordMove > 0) {
                for (int i = 0; i < m; i++) {
                    if (i >= wordMove) {
                        data[i - wordMove] = data[i];
                    }
                    data[i] = 0;
                }
            }
        }

        public BitSet clone() {
            return new BitSet(this);
        }

        public String toString() {
            StringBuilder builder = new StringBuilder("{");
            for (int i = nextSetBit(0); i < capacity(); i = nextSetBit(i + 1)) {
                builder.append(i).append(',');
            }
            if (builder.length() > 1) {
                builder.setLength(builder.length() - 1);
            }
            builder.append("}");
            return builder.toString();
        }

        public int hashCode() {
            int ans = 1;
            for (int i = 0; i < m; i++) {
                ans = ans * 31 + Long.hashCode(data[i]);
            }
            return ans;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof BitSet)) {
                return false;
            }
            BitSet other = (BitSet) obj;
            if (other.capacity != capacity) {
                return false;
            }
            for (int i = 0; i < m; i++) {
                if (other.data[i] != data[i]) {
                    return false;
                }
            }
            return true;
        }

    }

    static class SequenceUtils {
        public static void deepFill(Object array, int val) {
            if (!array.getClass().isArray()) {
                throw new IllegalArgumentException();
            }
            if (array instanceof int[]) {
                int[] intArray = (int[]) array;
                Arrays.fill(intArray, val);
            } else {
                Object[] objArray = (Object[]) array;
                for (Object obj : objArray) {
                    deepFill(obj, val);
                }
            }
        }

    }
}


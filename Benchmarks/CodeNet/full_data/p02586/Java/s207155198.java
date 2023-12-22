import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.io.BufferedWriter;
import java.util.Collection;
import java.io.IOException;
import java.util.List;
import java.io.Writer;
import java.util.Queue;
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
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        EPickingGoods solver = new EPickingGoods();
        solver.solve(1, in, out);
        out.close();
    }

    static class EPickingGoods {
        public void solve(int testNumber, InputReader in, OutputWriter out) {

            int r = in.readInt(), c = in.readInt(), k = in.readInt();


            Indexer<Integer> xs = new Indexer<>();
            Indexer<Integer> ys = new Indexer<>();

            List<Integer> lx = new ArrayList<>();
            List<Integer> ly = new ArrayList<>();

            List<int[]> points = new ArrayList<>();

            for (int i = 0; i < k; ++i) {
                int x = in.readInt() - 1;
                int y = in.readInt() - 1;
                int v = in.readInt();
                lx.add(x);
                ly.add(y);
                points.add(new int[]{x, y, v});
            }

            Collections.sort(lx);
            Collections.sort(ly);

            for (int e : lx) xs.get(e);
            for (int e : ly) ys.get(e);

            r = xs.size() + 1;
            c = ys.size() + 1;

            int[][] grid = new int[xs.size() + 1][ys.size() + 1];

            for (int[] p : points) {
                int x = p[0];
                int y = p[1];
                int v = p[2];
                grid[xs.get(x)][ys.get(y)] = v;
            }

            long[][][] state = new long[xs.size() + 1][ys.size() + 1][4];


            Queue<EPickingGoods.State> queue = new LinkedList<>();


            queue.add(new EPickingGoods.State(0, 0, 0, 0));
            state[0][0][0] = 0;

            if (grid[0][0] > 0) {
                state[0][0][1] = grid[0][0];
                queue.add(new EPickingGoods.State(0, 0, 1, grid[0][0]));
            }

            while (!queue.isEmpty()) {
                EPickingGoods.State cur = queue.poll();
                int x = cur.x;
                int y = cur.y;
                long cost = cur.cost;
                int moves = cur.moves;

                if (x + 1 < r && cur.cost > state[cur.x + 1][y][0]) {
                    queue.add(new EPickingGoods.State(x + 1, y, 0, cost));
                    state[x + 1][y][0] = cost;
                }
                if (y + 1 < c && cost > state[x][y + 1][moves]) {
                    queue.add(new EPickingGoods.State(x, y + 1, moves, cost));
                    state[x][y + 1][moves] = cost;
                }

                if (x + 1 < r && cost + grid[x + 1][y] > state[x + 1][y][1]) {
                    queue.add(new EPickingGoods.State(x + 1, y, 1, cost + grid[x + 1][y]));
                    state[x + 1][y][1] = cost + grid[x + 1][y];
                }
                if (moves < 3 && y + 1 < c && cost + grid[x][y + 1] > state[x][y + 1][moves + 1]) {
                    state[x][y + 1][moves + 1] = cost + grid[x][y + 1];
                    queue.add(new EPickingGoods.State(x, y + 1, moves + 1, cost + grid[x][y + 1]));
                }
            }

            out.printLine(ArrayUtils.maxElement(state[xs.size()][ys.size()]));

        }

        static class State {
            int x;
            int y;
            int moves;
            long cost;

            public State(int x, int y, int m, long c) {
                this.x = x;
                this.y = y;
                this.moves = m;
                this.cost = c;
            }

        }

    }

    static class ArrayUtils {
        public static long maxElement(long[] array) {
            return new LongArray(array).max();
        }

    }

    static class LongArray extends LongAbstractStream implements LongList {
        private long[] data;

        public LongArray(long[] arr) {
            data = arr;
        }

        public int size() {
            return data.length;
        }

        public long get(int at) {
            return data[at];
        }

        public void removeAt(int index) {
            throw new UnsupportedOperationException();
        }

    }

    static interface LongStream extends Iterable<Long>, Comparable<LongStream> {
        public LongIterator longIterator();

        default public Iterator<Long> iterator() {
            return new Iterator<Long>() {
                private LongIterator it = longIterator();

                public boolean hasNext() {
                    return it.isValid();
                }

                public Long next() {
                    long result = it.value();
                    it.advance();
                    return result;
                }
            };
        }

        default public int compareTo(LongStream c) {
            LongIterator it = longIterator();
            LongIterator jt = c.longIterator();
            while (it.isValid() && jt.isValid()) {
                long i = it.value();
                long j = jt.value();
                if (i < j) {
                    return -1;
                } else if (i > j) {
                    return 1;
                }
                it.advance();
                jt.advance();
            }
            if (it.isValid()) {
                return 1;
            }
            if (jt.isValid()) {
                return -1;
            }
            return 0;
        }

        default public long max() {
            long result = Long.MIN_VALUE;
            for (LongIterator it = longIterator(); it.isValid(); it.advance()) {
                long current = it.value();
                if (current > result) {
                    result = current;
                }
            }
            return result;
        }

    }

    static interface LongList extends LongReversableCollection {
        public abstract long get(int index);

        public abstract void removeAt(int index);

        default public LongIterator longIterator() {
            return new LongIterator() {
                private int at;
                private boolean removed;

                public long value() {
                    if (removed) {
                        throw new IllegalStateException();
                    }
                    return get(at);
                }

                public boolean advance() {
                    at++;
                    removed = false;
                    return isValid();
                }

                public boolean isValid() {
                    return !removed && at < size();
                }

                public void remove() {
                    removeAt(at);
                    at--;
                    removed = true;
                }
            };
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int readInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

    static interface LongReversableCollection extends LongCollection {
    }

    static interface LongIterator {
        public long value() throws NoSuchElementException;

        public boolean advance();

        public boolean isValid();

    }

    static class Indexer<K> extends HashMap<K, Integer> {
        private int index = 0;

        public Integer get(Object key) {
            if (!containsKey(key)) {
                put((K) key, index++);
            }
            return super.get(key);
        }

    }

    static interface LongCollection extends LongStream {
        public int size();

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

        public void printLine(long i) {
            writer.println(i);
        }

    }

    static abstract class LongAbstractStream implements LongStream {
        public String toString() {
            StringBuilder builder = new StringBuilder();
            boolean first = true;
            for (LongIterator it = longIterator(); it.isValid(); it.advance()) {
                if (first) {
                    first = false;
                } else {
                    builder.append(' ');
                }
                builder.append(it.value());
            }
            return builder.toString();
        }

        public boolean equals(Object o) {
            if (!(o instanceof LongStream)) {
                return false;
            }
            LongStream c = (LongStream) o;
            LongIterator it = longIterator();
            LongIterator jt = c.longIterator();
            while (it.isValid() && jt.isValid()) {
                if (it.value() != jt.value()) {
                    return false;
                }
                it.advance();
                jt.advance();
            }
            return !it.isValid() && !jt.isValid();
        }

        public int hashCode() {
            int result = 0;
            for (LongIterator it = longIterator(); it.isValid(); it.advance()) {
                result *= 31;
                result += it.value();
            }
            return result;
        }

    }
}


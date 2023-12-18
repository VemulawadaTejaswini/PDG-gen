import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.stream.LongStream;
import java.util.PriorityQueue;
import java.io.BufferedWriter;
import java.util.Set;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.stream.Collectors;
import java.util.HashSet;
import java.util.List;
import java.util.AbstractCollection;
import java.util.stream.Stream;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.Comparator;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int x = in.readInt();
            int y = in.readInt();
            int z = in.readInt();
            int k = in.readInt();

            long[] a = in.readLongArray(x);
            long[] b = in.readLongArray(y);
            long[] c = in.readLongArray(z);

            List<Long> aa = Arrays.stream(a).boxed().collect(Collectors.toList());
            List<Long> bb = Arrays.stream(b).boxed().collect(Collectors.toList());
            List<Long> cc = Arrays.stream(c).boxed().collect(Collectors.toList());

            aa.sort(Comparator.reverseOrder());
            bb.sort(Comparator.reverseOrder());
            cc.sort(Comparator.reverseOrder());

            PriorityQueue<Cake> q = new PriorityQueue<>(Comparator.reverseOrder());
            Set<Integer> used = new HashSet<>();
            used.add(0);
            q.add(new Cake(aa.get(0) + bb.get(0) + cc.get(0), 0, 0, 0));
            while (!q.isEmpty()) {
                Cake cake = q.poll();
                out.printLine(cake.sum);
                k--;
                if (k == 0) return;

                if (cake.i < x - 1) {
                    if (!used.contains((cake.i + 1) * y * z + cake.j * z + cake.k)) {
                        used.add((cake.i + 1) * y * z + cake.j * z + cake.k);
                        q.add(new Cake(aa.get(cake.i + 1) + bb.get(cake.j) + cc.get(cake.k), cake.i + 1, cake.j, cake.k));
                    }
                }
                if (cake.j < y - 1) {
                    if (!used.contains(cake.i * y * z + (cake.j + 1) * z + cake.k)) {
                        used.add(cake.i * y * z + (cake.j + 1) * z + cake.k);
                        q.add(new Cake(aa.get(cake.i) + bb.get(cake.j + 1) + cc.get(cake.k), cake.i, cake.j + 1, cake.k));
                    }
                }
                if (cake.k < z - 1) {
                    if (!used.contains(cake.i * y * z + cake.j * z + cake.k + 1)) {
                        used.add(cake.i * y * z + cake.j * z + cake.k + 1);
                        q.add(new Cake(aa.get(cake.i) + bb.get(cake.j) + cc.get(cake.k + 1), cake.i, cake.j, cake.k + 1));
                    }
                }
            }
        }

        class Cake implements Comparable<Cake> {
            long sum;
            int i;
            int j;
            int k;

            public Cake(long sum, int i, int j, int k) {
                this.sum = sum;
                this.i = i;
                this.j = j;
                this.k = k;
            }

            public int compareTo(Cake cake) {
                return Long.compare(sum, cake.sum);
            }

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

        public long[] readLongArray(int size) {
            long[] array = new long[size];
            for (int i = 0; i < size; i++) {
                array[i] = readLong();
            }
            return array;
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

        public long readLong() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
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
}


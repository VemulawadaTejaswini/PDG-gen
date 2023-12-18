import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.stream.LongStream;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.stream.Collectors;
import java.util.List;
import java.util.stream.Stream;
import java.util.Map;
import java.util.Map.Entry;
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
        DMaximumAverageSets solver = new DMaximumAverageSets();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMaximumAverageSets {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            int a = in.readInt();
            int b = in.readInt();
            long[] v = in.readLongArray(n);

            List<LongLongPair> list = Arrays.stream(v).boxed()
                    .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                    .entrySet().stream()
                    .map(e -> new LongLongPair(e.getKey(), e.getValue()))
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());

            long p = 0;
            long q = 1;
            long count = 0;
            for (int i = a; i <= b; i++) {
                int use = 0;
                long sum = 0;
                for (LongLongPair pair : list) {
                    if (use + pair.second < i) {
                        sum += pair.first * pair.second;
                        use += pair.second;
                    } else {
                        long c = 1;
                        long add = i - use;
                        for (int j = 0; j < add; j++) {
                            c *= pair.second - j;
                            c /= j + 1;
                        }
                        sum += pair.first * add;
                        if (p * i < sum * q) {
                            count = c;
                            p = sum;
                            q = i;
                        } else if (p * i == sum * q) {
                            count += c;
                        }
                        break;
                    }
                }
            }

            out.printLine((double) p / q);
            out.printLine(count);
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

    static class LongLongPair implements Comparable<LongLongPair> {
        public final long first;
        public final long second;

        public LongLongPair(long first, long second) {
            this.first = first;
            this.second = second;
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            LongLongPair pair = (LongLongPair) o;

            return first == pair.first && second == pair.second;
        }

        public int hashCode() {
            int result = Long.hashCode(first);
            result = 31 * result + Long.hashCode(second);
            return result;
        }

        public String toString() {
            return "(" + first + "," + second + ")";
        }

        public int compareTo(LongLongPair o) {
            int value = Long.compare(first, o.first);
            if (value != 0) {
                return value;
            }
            return Long.compare(second, o.second);
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

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void printLine(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

        public void printLine(long i) {
            writer.println(i);
        }

    }
}


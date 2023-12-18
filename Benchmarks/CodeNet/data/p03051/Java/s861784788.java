import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.stream.IntStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.stream.LongStream;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.Map;
import java.io.Writer;
import java.io.OutputStreamWriter;
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
        EXORPartitioning solver = new EXORPartitioning();
        solver.solve(1, in, out);
        out.close();
    }

    static class EXORPartitioning {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            int[] a = in.readIntArray(n);

            int[] xor = ArrayUtils.xorSum(a);
            RangeSum r = new RangeSum(Arrays.stream(xor).map(x -> x == 0 ? 1 : 0).toArray());

            int[] before = new int[1 << 20];
            Arrays.fill(before, -1);

            int count0 = 0;
            Map<Integer, List<IntIntPair>> map = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                if (xor[i] == 0) {
                    count0++;
                    continue;
                }
                if (!map.containsKey(xor[i])) {
                    map.put(xor[i], new ArrayList<>());
                    map.get(xor[i]).add(new IntIntPair(xor[i], 0));
                }
                List<IntIntPair> list = map.get(xor[i]);
                long sum = r.getSum(before[xor[i]] + 1, i);
                if (sum == 0) {
                    int first = list.get(list.size() - 1).first;
                    int second = list.get(list.size() - 1).second;
                    list.set(list.size() - 1, new IntIntPair(first, second + 1));
                } else {
                    list.add(new IntIntPair(0, (int) sum));
                    list.add(new IntIntPair(xor[i], 1));
                }
                before[xor[i]] = i;
            }
            for (int x : map.keySet()) {
                map.get(x).add(new IntIntPair(0, (int) r.getSum(before[x] + 1, n)));
            }

            Modulo m = new Modulo(MiscUtils.MOD7);
            if (xor[n - 1] != 0) {
                List<IntIntPair> list = map.get(xor[n - 1]);
                long dp0 = 1;
                long dpX = 0;
                for (int i = 0; i < list.size() - 1; i++) {
                    if (list.get(i).first == 0) {
                        if (i > 0) dp0 = m.add(dp0, m.mlt(dpX, list.get(i).second));
                    } else {
                        dpX = m.add(dpX, m.mlt(dp0, list.get(i).second));
                    }
                }
                out.printLine(dp0);
            } else {
                long ans = m.pow(2, count0 - 1);
                for (int x : map.keySet()) {
                    List<IntIntPair> list = map.get(x);
                    long dp0 = 1;
                    long dpX = 0;
                    for (int i = 0; i < list.size() - 1; i++) {
                        if (list.get(i).first == 0) {
                            if (i > 0) dp0 = m.add(dp0, m.mlt(dpX, list.get(i).second));
                        } else {
                            dpX = m.add(dpX, m.mlt(dp0, list.get(i).second));
                        }
                    }
                    ans = m.add(ans, dpX);
                }
                out.printLine(ans);
            }
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

    static class ArrayUtils {
        public static int[] xorSum(int[] a) {
            int n = a.length;
            int[] ret = new int[n];
            ret[0] = a[0];
            for (int i = 1; i < n; i++) {
                ret[i] = ret[i - 1] ^ a[i];
            }
            return ret;
        }

    }

    static class IntIntPair implements Comparable<IntIntPair> {
        public final int first;
        public final int second;

        public IntIntPair(int first, int second) {
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

            IntIntPair pair = (IntIntPair) o;

            return first == pair.first && second == pair.second;
        }

        public int hashCode() {
            int result = first;
            result = 31 * result + second;
            return result;
        }

        public String toString() {
            return "(" + first + "," + second + ")";
        }

        public int compareTo(IntIntPair o) {
            int value = Integer.compare(first, o.first);
            if (value != 0) {
                return value;
            }
            return Integer.compare(second, o.second);
        }

    }

    static class RangeSum {
        private long[] sum;

        public RangeSum(long[] arr) {
            sum = new long[arr.length + 1];
            System.arraycopy(arr, 0, sum, 1, arr.length);
            for (int i = 0; i < sum.length - 1; i++) {
                sum[i + 1] += sum[i];
            }
        }

        public RangeSum(int[] arr) {
            this(IntStream.of(arr).mapToLong(x -> x).toArray());
        }

        public long getSum(int startInclusive, int endExclusive) {
            if (startInclusive > endExclusive || startInclusive < 0
                    || endExclusive >= sum.length) {
                throw new IllegalArgumentException();
            }

            return sum[endExclusive] - sum[startInclusive];
        }

    }

    static class MiscUtils {
        public static final int MOD7 = (int) (1e9 + 7);

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

        public int[] readIntArray(int size) {
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = readInt();
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

    static class Modulo {
        long m;

        public Modulo(long m) {
            this.m = m;
        }

        public long add(long a, long b) {
            return (a + b) % m;
        }

        public long mlt(long a, long b) {
            return (a * b) % m;
        }

        public long pow(long a, long x) {
            long ans = 1 % m;
            while (x > 0) {
                if ((x & 1) != 0) {
                    ans = (ans * a) % m;
                }
                x >>= 1;
                a = (a * a) % m;
            }
            return ans;
        }

    }
}


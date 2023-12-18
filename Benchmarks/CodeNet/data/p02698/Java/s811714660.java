import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.function.Supplier;
import java.util.function.IntPredicate;
import java.util.ArrayList;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;
import java.util.function.IntFunction;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Nikita Mikhailov
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        FLISOnTree solver = new FLISOnTree();
        solver.solve(1, in, out);
        out.close();
    }

    static class FLISOnTree {
        TreeGraph tg;
        int[] a;
        int[] maxStreaks;
        LongestSubsequence lsa;

        private void dfs(int node, int from) {
            int val = lsa.push(a[node]);
            maxStreaks[node] = val;

            for (int i = 0; i < tg.edges[node].size(); i++) {
                int to = tg.edges[node].get(i);
                if (to == from) continue;

                dfs(to, node);
            }

            lsa.pop();
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            lsa = new LongestSubsequence(n);
            a = in.readIntArray(n);

            tg = new TreeGraph(n);
            for (int i = 0; i < n - 1; i++) {
                tg.addEdgeBi(in.readInt() - 1, in.readInt() - 1);
            }

            maxStreaks = new int[n];

            dfs(0, -1);
            for (int i = 0; i < n; i++) {
                out.println(maxStreaks[i]);
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

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public int[] readIntArray(int size) {
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = readInt();
            }
            return array;
        }

        private int read() {
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

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

    static final class Utils {
        private Utils() {
        }

        public static <T> T[] makeArrayInd(int n, IntFunction<T> creator) {
            if (n > 0) {
                T first = creator.apply(0);
                T[] res = (T[]) Array.newInstance(first.getClass(), n);
                res[0] = first;

                for (int i = 1; i < n; i++) {
                    res[i] = creator.apply(i);
                }

                return res;
            } else {
                return null;
            }
        }

        public static <T> T[] makeArray(int n, Supplier<T> creator) {
            return makeArrayInd(n, value -> creator.get());
        }

    }

    static final class BinarySearch {
        private BinarySearch() {
        }

        public static int bsLowerBound(int fromInclusive, int toExclusive, IntPredicate predicate) {
            int low = fromInclusive, high = toExclusive, middle;
            while (low < high) {
                middle = (low & high) + ((low ^ high) >> 1);
                if (predicate.test(middle)) {
                    high = middle;
                } else {
                    low = middle + 1;
                }
            }
            return high;
        }

    }

    static class LongestSubsequence {
        private int n;
        private int[] dp;
        private int res = 0;
        private FastStack<LongestSubsequence.Change> stack;

        public LongestSubsequence(int n) {
            this.n = n;
            dp = new int[n + 1];
            dp[0] = Integer.MIN_VALUE;

            for (int i = 1; i <= n; i++) {
                dp[i] = Integer.MAX_VALUE;
            }
            stack = new FastStack<>(n);
        }

        public int push(int value) {
            int j = BinarySearch.bsLowerBound(0, n + 1, val -> dp[val] >= value);

            if (dp[j - 1] < value && value < dp[j]) {
                stack.push(new LongestSubsequence.Change(j, dp[j], res));
                dp[j] = value;
                res = Math.max(res, j);
            } else {
                stack.push(null);
            }
            return res;
        }

        public void pop() {
            LongestSubsequence.Change head = stack.pool();

            if (head != null) {
                dp[head.index] = head.oldValue;
                res = head.maxValue;
            }
        }

        private static class Change {
            final int index;
            final int oldValue;
            final int maxValue;

            public Change(int index, int oldValue, int maxValue) {
                this.index = index;
                this.oldValue = oldValue;
                this.maxValue = maxValue;
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

        public void println(int i) {
            writer.println(i);
        }

    }

    static class TreeGraph {
        public int n;
        public ArrayList<Integer>[] edges;

        public TreeGraph(int n) {
            this.n = n;
            this.edges = Utils.makeArray(n, ArrayList::new);
        }

        public void addEdge(int from, int to) {
            edges[from].add(to);
        }

        public void addEdgeBi(int a, int b) {
            addEdge(a, b);
            addEdge(b, a);
        }

    }

    static class FastStack<T> {
        private ArrayList<T> stack;

        public FastStack(int n) {
            stack = new ArrayList<>(n);
        }

        public void push(T val) {
            stack.add(val);
        }

        public T peek() {
            return stack.size() > 0 ? stack.get(stack.size() - 1) : null;
        }

        public T pool() {
            T var = peek();
            stack.remove(stack.size() - 1);
            return var;
        }

    }
}


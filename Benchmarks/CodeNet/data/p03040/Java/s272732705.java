import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Ribhav
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FAbsoluteMinima solver = new FAbsoluteMinima();
        solver.solve(1, in, out);
        out.close();
    }

    static class FAbsoluteMinima {
        public void solve(int testNumber, FastReader s, PrintWriter out) {
            int n = s.nextInt();
            long added = 0;
            PriorityQueue<Long> minHeap = new PriorityQueue<>();
            PriorityQueue<Long> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
//        TreeSet<Integer>
            long median = 0;
            for (int i = 0; i < n; i++) {
                int type = s.nextInt();
                if (type == 1) {
                    long a = s.nextLong();
                    long b = s.nextLong();
                    added += b;
                    if (minHeap.size() == maxHeap.size()) {
                        if (a > median) {
                            median = a;
                            minHeap.add(a);
                        } else {
                            median = a;
                            maxHeap.add(a);
                        }
                    } else if (minHeap.size() > maxHeap.size()) {
                        if (a > median) {
                            maxHeap.add(minHeap.poll());
                            minHeap.add(a);
                            median = (minHeap.peek() + maxHeap.peek()) / 2;
                        } else {
                            maxHeap.add(a);
                            median = (minHeap.peek() + maxHeap.peek()) / 2;
                        }
                    } else {
                        if (a > median) {
                            minHeap.add(a);
                            median = (minHeap.peek() + maxHeap.peek()) / 2;
                        } else {
                            minHeap.add(maxHeap.poll());
                            maxHeap.add(a);
                            median = (minHeap.peek() + maxHeap.peek()) / 2;
                        }
                    }
                } else {
                    Iterator<Long> iter = minHeap.iterator();
                    long ans = 0;

                    while (iter.hasNext()) {
                        ans += Math.abs(iter.next() - median);
                    }

                    iter = maxHeap.iterator();
                    while (iter.hasNext()) {
                        ans += Math.abs(iter.next() - median);
                    }
                    out.println(median + " " + (ans + added));
                }
            }
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
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

        public int nextInt() {
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

        public long nextLong() {
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
}


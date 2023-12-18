import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FasterScanner in = new FasterScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, FasterScanner in, PrintWriter out) {
            final int n = in.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++)
                a[i] = in.nextLong();

            Arrays.sort(a);

            ArrayDeque<Long> q = new ArrayDeque<>();
            for (int i = 0; i < n; i++) q.add(a[i]);

            ArrayDeque<Long> b = new ArrayDeque<>();
            b.add(q.pollFirst());
            boolean f = false;
            while (q.size() > 0) {
                if (f) {
                    b.addFirst(q.pollFirst());
                    if (q.size() > 0) b.addLast(q.pollFirst());
                } else {
                    b.addFirst(q.pollLast());
                    if (q.size() > 0) b.addLast(q.pollLast());
                }
                f = !f;
            }

            ArrayDeque<Long> c = new ArrayDeque<>();
            for (int i = 0; i < n; i++) q.add(a[i]);

            c.add(q.pollLast());
            f = true;
            while (q.size() > 0) {
                if (f) {
                    c.addFirst(q.pollFirst());
                    if (q.size() > 0) c.addLast(q.pollFirst());
                } else {
                    c.addFirst(q.pollLast());
                    if (q.size() > 0) c.addLast(q.pollLast());
                }
                f = !f;
            }

            long ans1 = 0;
            long ans2 = 0;
            while (b.size() > 1) {
                ans1 += Math.abs(b.poll() - b.peekFirst());
                ans2 += Math.abs(c.poll() - c.peekFirst());
            }

            out.println(Math.max(ans1, ans2));
        }

    }

    static class FasterScanner {
        private InputStream in;
        private byte[] buffer;
        private int bufPointer;
        private int bufLength;

        public FasterScanner(InputStream in) {
            this.in = in;
            buffer = new byte[1024];
        }

        private boolean hasNextByte() {
            if (bufPointer < bufLength) return true;
            bufPointer = 0;
            try {
                bufLength = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return (bufLength > 0);
        }

        private int readByte() {
            if (hasNextByte()) return buffer[bufPointer++];
            return -1;
        }

        private static boolean isPrintableChar(int c) {
            return (c >= 33 && c <= 126);
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[bufPointer])) bufPointer++;
            return hasNextByte();
        }

        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }

        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || b > '9') throw new NumberFormatException();

            while (true) {
                if (b >= '0' && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }

    }
}


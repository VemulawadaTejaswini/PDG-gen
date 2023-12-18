import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.util.Objects;
import java.io.Closeable;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author HBonsai
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        C2DPlane2NPoints solver = new C2DPlane2NPoints();
        solver.solve(1, in, out);
        out.close();
    }

    static class C2DPlane2NPoints {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int N = in.nextInt();
            Pair[] red = new Pair[N];
            for (int i = 0; i < N; i++) {
                red[i] = new Pair(in.nextInt(), in.nextInt());
            }
            Arrays.sort(red, Comparator.comparingInt(Pair::getSecond).reversed());
            Pair[] blue = new Pair[N];
            for (int i = 0; i < N; i++) {
                blue[i] = new Pair(in.nextInt(), in.nextInt());
            }
            Arrays.sort(blue, Comparator.comparingInt(Pair::getFirst));

            int ans = 0;
            for (int i = 0; i < N; i++) {
                int j = 0;
                while (j < N) {
                    if (blue[i].first > red[j].first && blue[i].second > red[j].second) {
                        ans++;
                        red[j] = new Pair(201, 201); // INF
                        break;
                    }
                    j++;
                }
            }
            out.println(ans);
        }

        class Pair {
            public int first;
            public int second;

            public Pair(int first, int second) {
                this.first = first;
                this.second = second;
            }

            public int getFirst() {
                return first;
            }

            public int getSecond() {
                return second;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Pair pair = (Pair) o;
                return first == pair.first &&
                        second == pair.second;
            }

            public int hashCode() {
                return Objects.hash(first, second);
            }

        }

    }

    static class FastScanner implements Closeable {
        private final InputStream in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        public FastScanner(InputStream in) {
            this.in = in;
        }

        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
            return hasNextByte();
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
            if (b < '0' || '9' < b) {
                throw new NumberFormatException();
            }
            while (true) {
                if ('0' <= b && b <= '9') {
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

        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }

        public void close() {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}


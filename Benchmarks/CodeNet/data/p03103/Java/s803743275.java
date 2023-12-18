import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.io.Closeable;
import java.io.IOException;
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
        CEnergyDrinkCollector solver = new CEnergyDrinkCollector();
        solver.solve(1, in, out);
        out.close();
    }

    static class CEnergyDrinkCollector {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int N = in.nextInt();
            int M = in.nextInt();
//        List<Pair> stores = new ArrayList<>();

            PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> x.first - y.first >= 0 ? 1 : -1);
            for (int i = 0; i < N; i++) {
//            stores.add(new Pair(in.nextLong(), in.nextLong()));
                pq.offer(new Pair(in.nextLong(), in.nextLong()));
            }
//        stores.sort((x,y) -> x.first - y.first >= 0 ? 1 : -1);
            long ans = 0;
            long remain = M;
            out:
            for (int i = 0; i < N; i++) {
                Pair store = pq.poll();
                for (long j = store.second; j > 0; j--) {
                    ans += store.first;
                    remain--;
                    if (remain <= 0) break out;
                }
            }
            out.println(ans);
        }

        class Pair {
            public long first;
            public long second;

            public Pair(long first, long second) {
                this.first = first;
                this.second = second;
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


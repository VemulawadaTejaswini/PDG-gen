import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.io.IOException;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.ArrayList;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, FasterScanner in, PrintWriter out) {
            final int n = in.nextInt();
            final int m = in.nextInt();

            List<TaskD.Cake> cakes = new ArrayList<>();
            for (int i = 0; i < n; i++) cakes.add(new TaskD.Cake(in.nextLong(), in.nextLong(), in.nextLong()));

            Comparator<TaskD.Cake> sumComparator = Comparator.comparing(TaskD.Cake::getSum);

            cakes.sort(sumComparator);
            long ans = 0;
            for (int i = 0; i < 8; i++) {
                // +++
                // ++-
                // +-+
                // +--
                // -++
                // -+-
                // --+
                // ---
                for (TaskD.Cake cc : cakes) {
                    if (i >= 4) cc.negateX();
                    if (i % 4 >= 2) cc.negateY();
                    if (i % 2 == 1) cc.negateZ();
                }

                cakes.sort(sumComparator);
                long sumX = 0;
                long sumY = 0;
                long sumZ = 0;
                for (int j = 0; j < m; j++) {
                    TaskD.Cake cc = cakes.get(j);
                    sumX += cc.getX();
                    sumY += cc.getY();
                    sumZ += cc.getZ();
                }
                long score = Math.abs(sumX) + Math.abs(sumY) + Math.abs(sumZ);
                if (score > ans) ans = score;

                for (TaskD.Cake cc : cakes) {
                    if (i >= 4) cc.negateX();
                    if (i % 4 >= 2) cc.negateY();
                    if (i % 2 == 1) cc.negateZ();
                }
            }
            out.println(ans);
        }

        private static class Cake {
            long x;
            long y;
            long z;
            long sum;

            Cake(long x, long y, long z) {
                this.x = x;
                this.y = y;
                this.z = z;
                setSum();
            }

            public long getX() {
                return x;
            }

            public long getY() {
                return y;
            }

            public long getZ() {
                return z;
            }

            public void negateX() {
                x = -x;
                setSum();
            }

            public void negateY() {
                y = -y;
                setSum();
            }

            public void negateZ() {
                z = -z;
                setSum();
            }

            public long getSum() {
                return sum;
            }

            private void setSum() {
                sum = x + y + z;
            }

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


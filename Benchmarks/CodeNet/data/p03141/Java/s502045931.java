import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.LinkedList;
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
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            List<TaskC.Dish> dishes = new LinkedList<>();
            for (int i = 0; i < n; i++)
                dishes.add(new TaskC.Dish(in.nextLong(), in.nextLong()));
            Comparator<TaskC.Dish> tc = (d1, d2) -> (d1.getSa() == d2.getSa() ? (int) (d1.getA() - d2.getA()) : (int) (d1.getSa() - d2.getSa()));
            Comparator<TaskC.Dish> ac = (d1, d2) -> (d1.getSb() == d2.getSb() ? (int) (d1.getB() - d2.getB()) : (int) (d2.getSb() - d1.getSb()));

            long takahashi = 0;
            long aoki = 0;
            for (int i = 0; i < n; i++) {
                if ((i & 1) == 0) {
                    dishes.sort(tc);
                    takahashi += dishes.get(0).getA();
                    dishes.remove(0);
                } else {
                    dishes.sort(ac);
                    aoki += dishes.get(0).getB();
                    dishes.remove(0);
                }
            }

            out.println(takahashi - aoki);

        }

        private static class Dish {
            long a;
            long b;
            long sa;
            long sb;

            Dish(long a, long b) {
                this.a = a;
                this.b = b;
                this.sa = a - b;
                this.sb = b - a;
            }

            public long getA() {
                return a;
            }

            public long getB() {
                return b;
            }

            public long getSa() {
                return sa;
            }

            public long getSb() {
                return sb;
            }

        }

    }

    static class FastScanner {
        private InputStream in;
        private byte[] buffer = new byte[1024];
        private int bufPointer;
        private int bufLength;

        public FastScanner(InputStream in) {
            this.in = in;
        }

        private int readByte() {
            if (bufPointer >= bufLength) {
                if (bufLength == -1)
                    throw new InputMismatchException();

                bufPointer = 0;
                try {
                    bufLength = in.read(buffer);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (bufLength <= 0)
                    return -1;
            }
            return buffer[bufPointer++];
        }

        private static boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public long nextLong() {
            long n = 0;

            int b = readByte();
            while (isSpaceChar(b))
                b = readByte();

            boolean minus = (b == '-');
            if (minus)
                b = readByte();

            while (b >= '0' && b <= '9') {
                n *= 10;
                n += b - '0';
                b = readByte();
            }

            if (!isSpaceChar(b))
                throw new NumberFormatException();

            return minus ? -n : n;
        }

        public int nextInt() {
            long n = nextLong();

            if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE)
                throw new NumberFormatException();

            return (int) n;
        }

    }
}


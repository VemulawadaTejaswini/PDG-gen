import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Comparator;
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
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            List<TaskC.Dish> dt = new ArrayList<>();
            List<TaskC.Dish> da = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TaskC.Dish d = new TaskC.Dish(in.nextLong(), in.nextLong());
                da.add(d);
                dt.add(d);
            }
//        Comparator<Dish> tc = (d1, d2) -> (d1.getA() + d1.getSa()) > (d2.getSa() + d2.getA())? 1 : -1;
//        Comparator<Dish> ac = (d1, d2) -> (d1.getB() + d1.getSb()) > (d2.getSb() + d2.getB())? 1 : -1;
            Comparator<TaskC.Dish> c = (d1, d2) -> (d1.getA() + d1.getB()) > (d2.getSa() + d2.getSb()) ? 1 : -1;
            dt.sort(c);
            da.sort(c);

            long takahashi = 0;
            long aoki = 0;
            Set<TaskC.Dish> taken = new HashSet<>();
            int ti = 0;
            int ai = 0;
            for (int i = 0; i < n; i++) {
                if ((i & 1) == 0) {
                    while (taken.contains(dt.get(ti)))
                        ti++;
                    takahashi += dt.get(ti).getA();
                    taken.add(dt.get(ti));
                } else {
                    while (taken.contains(da.get(ai)))
                        ai++;
                    aoki += da.get(ai).getB();
                    taken.add(da.get(ai));
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
                this.sa = b - a;
                this.sb = a - b;
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


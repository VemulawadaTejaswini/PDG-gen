import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.List;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.NoSuchElementException;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author ogiekako
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScanner in = new MyScanner(inputStream);
        MyPrintWriter out = new MyPrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, MyScanner in, MyPrintWriter out) {
            int x1 = in.nextInt(), y1 = in.nextInt(), x2 = in.nextInt(), y2 = in.nextInt();
            int N = in.nextInt();
            int[] X = new int[N], Y = new int[N];
            for (int i = 0; i < N; i++) {
                X[i] = in.nextInt();
                Y[i] = in.nextInt();
            }
            if (x1 > x2) {
                x1 = -x1;
                x2 = -x2;
                for (int i = 0; i < N; i++) {
                    X[i] = -X[i];
                }
            }
            if (y1 > y2) {
                y1 = -y1;
                y2 = -y2;
                for (int i = 0; i < N; i++) {
                    Y[i] = -Y[i];
                }
            }
            int L = x2 - x1;
            int R = y2 - y1;
            TreeSet<Integer> xSet = new TreeSet<>();
            TreeSet<Integer> ySet = new TreeSet<>();
            xSet.add(x1);
            xSet.add(x2);
            ySet.add(y1);
            ySet.add(y2);
            for (int i = 0; i < X.length; i++) {
                if (x1 <= X[i] && X[i] <= x2 && y1 <= Y[i] && Y[i] <= y2) {
                    xSet.add(X[i]);
                    ySet.add(Y[i]);
                }
            }
            int[] sortedX = Cast.toInt(xSet);
            int[] sortedY = Cast.toInt(ySet);
            x1 = Arrays.binarySearch(sortedX, x1);
            x2 = Arrays.binarySearch(sortedX, x2);
            y1 = Arrays.binarySearch(sortedY, y1);
            y2 = Arrays.binarySearch(sortedY, y2);

            List<E> es = new ArrayList<>();
            for (int i = 0; i < X.length; i++) {
                if (xSet.contains(X[i]) && ySet.contains(Y[i])) {
                    E e = new E();
                    e.x = Arrays.binarySearch(sortedX, X[i]);
                    e.y = Arrays.binarySearch(sortedY, Y[i]);
                    es.add(e);
                }
            }
            Collections.sort(es);
//        Debug.debug(x1, x2, y1, y2);
//        Debug.debug(es);
            int[] left = new int[N];
            Arrays.fill(left, N + 10);
            left[0] = 0;
            for (E e : es) {
                int i = Arrays.binarySearch(left, e.y);
                if (i >= 0) {
                    left[i + 1] = left[i];
                } else {
                    left[-i - 1] = e.y;
                }
            }
            int res = 0;
            for (int i = 0; i < N; i++) {
                if (left[i] <= y2) {
                    res = i;
                }
            }
//        Debug.debug(res);
            double len = 100.0 * (L + R);
            len += (-20 + 5 * Math.PI) * res;
            if (L + 1 == res || R + 1 == res) {
                len += 5 * Math.PI;
            }
            out.printFormat("%.15f", len);
        }

        class E implements Comparable<E> {
            int x;
            int y;


            public int compareTo(E o) {
                return x - o.x;
            }


            public String toString() {
                return "(" + x + ", " + y + ")";
            }

        }

    }

    static class MyPrintWriter {
        PrintWriter out;

        public MyPrintWriter(OutputStream outputStream) {
            out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public MyPrintWriter(Writer writer) {
            out = new PrintWriter(writer);
        }

        public void close() {
            out.close();
        }

        public void printFormat(String format, Object... args) {
            out.printf(format, args);
        }

    }

    static class MyScanner {
        private final InputStream in;
        private static final int BUFSIZE = 65536;
        int bufLen;
        int bufPtr;
        byte[] buf = new byte[BUFSIZE];

        public MyScanner(InputStream in) {
            this.in = in;
        }

        public int read() {
            if (bufLen == -1)
                throw new InputMismatchException();
            if (bufPtr >= bufLen) {
                bufPtr = 0;
                try {
                    bufLen = in.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (bufLen <= 0)
                    return -1;
            }
            return buf[bufPtr++];
        }

        public int nextInt() {
            int c = read();
            if (c == -1) throw new NoSuchElementException();
            while (c != '-' && (c < '0' || '9' < c)) {
                c = read();
                if (c == -1) throw new NoSuchElementException();
            }
            if (c == '-') return -nextInt();
            int res = 0;
            do {
                res *= 10;
                res += c - '0';
                c = read();
            } while ('0' <= c && c <= '9');
            return res;
        }

    }

    static class Cast {
        public static int[] toInt(Collection<Integer> integerCollection) {
            return toInt(integerCollection.toArray(new Integer[integerCollection.size()]));
        }

        public static int[] toInt(Integer[] Is) {
            int[] is = new int[Is.length];
            for (int i = 0; i < is.length; i++) is[i] = Is[i];
            return is;
        }

    }
}


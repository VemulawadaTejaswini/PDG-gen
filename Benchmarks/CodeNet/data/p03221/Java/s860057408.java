import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.Closeable;
import java.io.IOException;
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
        CID solver = new CID();
        solver.solve(1, in, out);
        out.close();
    }

    static class CID {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int N = in.nextInt();
            int M = in.nextInt();
            City[] cs = new City[M];
            for (int i = 0; i < M; i++) {
                cs[i] = new City();
                cs[i].pref = in.nextInt();
                cs[i].year = in.nextInt();
                cs[i].inputNo = i;
            }
            Arrays.sort(cs, Comparator.comparingInt(City::getPref).thenComparingInt(City::getYear));
            int now = -1;
            int nowId = 1;
            for (int i = 0; i < M; i++) {
                if (now != cs[i].pref) {
                    now = cs[i].pref;
                    nowId = 1;
                }
                cs[i].id = nowId;
                nowId++;
            }
            Arrays.sort(cs, Comparator.comparingInt(City::getInputNo));
            for (int i = 0; i < M; i++) {
                out.println(String.format("%06d%06d", cs[i].pref, cs[i].id));
            }
        }

        class City {
            public int pref;
            public int year;
            public int inputNo;
            public int id;

            public int getPref() {
                return pref;
            }

            public int getYear() {
                return year;
            }

            public int getInputNo() {
                return inputNo;
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


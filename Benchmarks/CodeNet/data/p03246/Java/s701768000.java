import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.HashMap;
import java.io.IOException;
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

            Map<Integer, Integer> ve = new HashMap<>();
            Map<Integer, Integer> vo = new HashMap<>();
            ve.put(0, n / 2);
            vo.put(0, n / 2 + n % 2);

            int minVO = 0;
            int minVO2 = 0;
            int minVE = 0;
            int minVE2 = 0;

            for (int i = 0; i < n; i++) {
                int cn = in.nextInt();
                if (i % 2 == 0) {
                    int cv = vo.getOrDefault(cn, n / 2 + n % 2) - 1;
                    vo.put(cn, cv);
                    if (cv < vo.get(minVO)) {
                        minVO2 = minVO;
                        minVO = cn;
                    }
                } else {
                    int cv = ve.getOrDefault(cn, n / 2) - 1;
                    ve.put(cn, cv);
                    if (cv < ve.get(minVE)) {
                        minVE2 = minVE;
                        minVE = cn;
                    }
                }
            }

            int ans;
            if (minVE != minVO) {
                ans = vo.get(minVO) + ve.get(minVE);
            } else if (minVE2 == 0 && minVO2 == 0) {
                ans = Math.min(n / 2 + n % 2, n / 2);
            } else {
                ans = Math.min(vo.get(minVO) + ve.get(minVE2), vo.get(minVO2) + ve.get(minVE));
            }
            out.println(ans);
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


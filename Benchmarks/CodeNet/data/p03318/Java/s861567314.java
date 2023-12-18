import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.io.IOException;
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
        public double getScore(long n) {
            String cn = Long.toString(n);
            double s = 0;
            for (char cc : cn.toCharArray()) s += cc - 48;
            // System.out.println((double)n / s);
            return (double) n / s;
        }

        public void solve(int testNumber, FasterScanner in, PrintWriter out) {
            int k = in.nextInt();
            List<Long> possibleNum = new ArrayList<>();

            long cn = 1;

            while (k > 0) {
                String cs = Long.toString(cn);
                double cScore = getScore(cn);
                for (int i = 0; i < cs.length(); i++) {
                    for (int j = 0; j <= 9; j++) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(cs.substring(0, cs.length() - i - 1));
                        sb.append(j);
                        for (int l = 0; l < i; l++) sb.append('9');
                        long nn = Long.parseLong(sb.toString());
                        double nScore = getScore(nn);
                        if (nn > cn && nScore < cScore) {
                            cn = nn;
                            cScore = nScore;
                        }
                    }
                }

                out.println(cn++);
                k--;
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


import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CPeaks solver = new CPeaks();
        solver.solve(1, in, out);
        out.close();
    }

    static class CPeaks {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            ArrayList<Integer> listH = new ArrayList<>();
            int total = n;
            for (int i = 0; i < n; i++) {
                listH.add(in.nextInt());
            }
            ArrayList<Integer> listRoot1 = new ArrayList<>();
            ArrayList<Integer> listRoot2 = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                listRoot1.add(in.nextInt());
                listRoot2.add(in.nextInt());
            }
            for (int i = 1; i <= n; i++) {
                int height = listH.get(i - 1);
                if (!listRoot1.contains(i) && !listRoot2.contains(i)) {
                    total--;
                }
                for (int j = 0; j < m; j++) {
                    if (listRoot1.get(j) == i) {
                        if (height < listH.get(listRoot2.get(j))) {
                            total--;
                            break;
                        }
                    } else if (listRoot2.get(j) == i) {
                        if (height < listH.get(listRoot1.get(j))) {
                            total--;
                            break;
                        }
                    }
                }

            }

            out.println(total);
        }

    }

    static class Scanner {
        private final InputStream in;
        private final byte[] buffer;
        private int ptr;
        private int buflen;

        public Scanner(InputStream in) {
            this.in = in;
            this.buffer = new byte[1024];
            this.ptr = 0;
            this.buflen = 0;
        }

        private boolean hasNextByte() {
            if (ptr < buflen) return true;
            else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) return false;
            }
            return true;
        }

        private byte readByte() {
            if (hasNextByte()) return buffer[ptr++];
            return -1;
        }

        private boolean isPrintableChar(byte c) {
            return '!' <= c && c <= '~';
        }

        private void skipUnprintable() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
                ptr++;
            }
        }

        public boolean hasNext() {
            skipUnprintable();
            return hasNextByte();
        }

        public int nextInt() {
            if (!hasNext()) throw new NoSuchElementException();
            int n = 0;
            boolean minus = false;
            byte b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) throw new NumberFormatException();
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

    }
}


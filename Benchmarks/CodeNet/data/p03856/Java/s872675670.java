import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {

    private void solve(FastScanner sc) {
        String s = sc.next();
        int i = 0;
        while (i < s.length()) {
            if (i+5 > s.length()) {
                System.out.println("NO");
                return;
            }
            String t = s.substring(i, i+5);
            if (t.equals("dream")) {
                i += 5;
                if (i+5 <= s.length()) {
                    String u = s.substring(i, i+5);
                    if (u.equals("erase")) {
                        i += 5;
                        if (i + 1 > s.length()) {
                            break;
                        }
                        String v = s.substring(i, i + 1);
                        if (v.equals("r")) {
                            i += 1;
                        }
                    }
                }
                if (i+2 > s.length()) {
                    break;
                }
                String u = s.substring(i, i+2);
                if (u.equals("er")) {
                    i += 2;
                }
            } else if (t.equals("erase")) {
                i += 5;
                if (i+1 > s.length()) {
                    break;
                }
                String u = s.substring(i, i+1);
                if (u.equals("r")) {
                    i += 1;
                }
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    /*
     * template
     */

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        new Main().solve(sc);
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int bufLen = 0;

        private boolean hasNextByte() {
            if (ptr < bufLen) {
                return true;
            } else {
                ptr = 0;
                try {
                    bufLen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (bufLen <= 0) {
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

        boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
            return hasNextByte();
        }

        String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        long nextLong() {
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

        int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}
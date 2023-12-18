import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Map.Entry;
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
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CGuessTheNumber solver = new CGuessTheNumber();
        solver.solve(1, in, out);
        out.close();
    }

    static class CGuessTheNumber {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            Map<Integer, Integer> maps = new HashMap<>();
            for (int i = 0; i < m; i++) {
                maps.put(in.nextInt(), in.nextInt());
            }

            String output = "-1";
            for (int i = 1; i <= 999; i++) {
                boolean isError = false;
                int digit1 = -1;
                int digit2 = -1;
                int digit3 = -1;
                if (String.valueOf(i).length() > n) break;
                for (Map.Entry<Integer, Integer> map : maps.entrySet()) {
                    if (map.getKey() == 1) {
                        if (map.getValue() == 0) {
                            isError = true;
                            break;
                        }
                        if (digit1 != -1 && digit1 != map.getValue()) {
                            isError = true;
                            break;
                        } else {
                            digit1 = map.getValue();
                        }

                    }
                    if (map.getKey() == 2) {
                        if (digit2 != -1 && digit2 != map.getValue()) {
                            isError = true;
                            break;
                        } else {
                            digit2 = map.getValue();
                        }
                    }
                    if (map.getKey() == 3) {
                        if (digit3 != -1 && digit3 != map.getValue()) {
                            isError = true;
                            break;
                        } else {
                            digit3 = map.getValue();
                        }
                    }
                }

                if (!isError && digit1 != -1) {
                    output = String.valueOf(digit1) + (digit2 == -1 ? 0 : digit2) + (digit3 == -1 ? 0 : digit3);
                    break;
                }

            }

            out.println(output);
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


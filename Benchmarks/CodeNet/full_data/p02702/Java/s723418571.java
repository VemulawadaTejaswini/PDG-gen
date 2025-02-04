import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.io.IOException;
import java.util.LinkedList;
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
        DMultipleOf2019 solver = new DMultipleOf2019();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMultipleOf2019 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            int count = 0;
            LinkedList<String> array = new LinkedList<>();
            LinkedList<String> array2 = new LinkedList<>();
            for (int i = 4; i <= s.length(); i++) {
                for (int j = i; j <= s.length(); j++) {
                    String string = s.substring(j - i, j);
                    if (array.contains(string)) {
                        count++;
                    } else if (array2.contains(string)) {

                    } else if (mod0(string)) {
                        array.add(string);
                        count++;
                    } else {
                        array2.add(string);
                    }
                }
                array.clear();
                array2.clear();
            }

            out.println(count);

        }

        boolean mod0(String str) {
            BigDecimal o1 = new BigDecimal(str);
            BigDecimal o2 = new BigDecimal("2019");

            BigDecimal result = o1.remainder(o2);

            return result.equals(BigDecimal.ZERO);

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

        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            byte b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

    }
}


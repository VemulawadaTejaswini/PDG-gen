import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
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
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, FasterScanner in, PrintWriter out) {
            String s = in.next();
            Set<Character> c = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                c.add(s.charAt(i));
            }

            if (c.size() < 26) {
                char cc = 'a';
                while (cc < 'z' && c.contains(cc)) {
                    cc++;
                }
                out.print(s + cc);
                return;
            }

            char lim = 'z';
            while (lim >= 'a') {
                for (int i = 'z' - lim; i < s.length(); i++) {
                    char cc = s.charAt(i);
                    if ((i == 'z' - lim) && cc == lim) break;
                    else if (s.charAt(i) == lim) {
                        char pre = s.charAt(i - 1);
                        out.println(s.substring(0, i - 1) + ++pre);
                        return;
                    }
                }
                lim--;
            }

            out.println(-1);
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

        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

    }
}


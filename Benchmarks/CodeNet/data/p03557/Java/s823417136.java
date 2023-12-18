import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Collections;
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
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int nparts = in.nextInt();
            ArrayList<Part> parts = new ArrayList<>();
            for (int i = 0; i < nparts; i++) {
                parts.add(new Part('a', in.nextInt()));
            }
            for (int i = 0; i < nparts; i++) {
                parts.add(new Part('b', in.nextInt()));
            }
            for (int i = 0; i < nparts; i++) {
                parts.add(new Part('c', in.nextInt()));
            }
            Collections.sort(parts, (o1, o2) -> {
                int cmp = -Integer.compare(o1.size, o2.size);
                if (cmp == 0) {
                    return Character.compare(o1.type, o2.type);
                }
                return cmp;
            });
            int nbparts = nparts, naparts = nparts;
            for (Part part : parts) {
                if (part.type == 'b') {
                    nbparts--;
                } else if (part.type == 'a') {
                    naparts--;
                }
                if (part.type == 'c') {
                    part.ngreater = nbparts;
                } else if (part.type == 'b') {
                    part.ngreater = naparts;
                }
            }
            long ans = 0;
            long cTotCount = 0;
            for (Part part : parts) {
                if (part.type == 'c') {
                    cTotCount++;
                } else if (part.type == 'b') {
                    ans += cTotCount * part.ngreater;
                }
            }
            out.println(ans);
        }

        class Part {
            public char type;
            public int size;
            public int ngreater;

            public Part(char type, int size) {
                this.type = type;
                this.size = size;
            }

        }

    }

    static class InputReader {
        final InputStream is;
        final byte[] buffer = new byte[1024];
        int curCharIdx;
        int nChars;

        public InputReader(InputStream is) {
            this.is = is;
        }

        public int read() {
            if (curCharIdx >= nChars) {
                try {
                    curCharIdx = 0;
                    nChars = is.read(buffer);
                    if (nChars == -1) {
                        return -1;
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return buffer[curCharIdx++];
        }

        public int nextInt() {
            int sign = 1;
            int c = skipDelims();
            if (c == '-') {
                sign = -1;
                c = read();
                if (isDelim(c)) {
                    throw new RuntimeException("Incorrect format");
                }
            }
            int val = 0;
            while (c != -1 && !isDelim(c)) {
                if (!isDigit(c)) {
                    throw new RuntimeException("Incorrect format");
                }
                val = 10 * val + (c - '0');
                c = read();
            }
            return val * sign;
        }

        private final int skipDelims() {
            int c = read();
            while (isDelim(c)) {
                c = read();
            }
            return c;
        }

        private static boolean isDelim(final int c) {
            return c == ' ' ||
                   c == '\n' ||
                   c == '\t' ||
                   c == '\r' ||
                   c == '\f';
        }

        private static boolean isDigit(final int c) {
            return '0' <= c && c <= '9';
        }

    }
}


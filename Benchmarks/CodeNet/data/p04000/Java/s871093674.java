import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.HashSet;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author gaidash
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DSnukesColoring solver = new DSnukesColoring();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSnukesColoring {
        private int sizeI;
        private int sizeJ;
        private HashSet<Pos> black = new HashSet<>();

        private int getBlackCount(Pos from) {
            int count = 0;
            for (int i = from.i; i <= from.i + 2; i++) {
                for (int j = from.j; j <= from.j + 2; j++) {
                    if (black.contains(new Pos(i, j))) {
                        count++;
                    }
                }
            }
            return count;
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            sizeI = in.nextInt();
            sizeJ = in.nextInt();
            int n = in.nextInt();
            Pos[] pos = new Pos[n];
            for (int i = 0; i < n; i++) {
                Pos p = new Pos(in.nextInt(), in.nextInt());
                pos[i] = p;
                black.add(p);
            }
            Arrays.sort(pos);

            HashSet<Pos> checked = new HashSet<>();
            int[] ret = new int[10];
            for (Pos p : pos) {
                int curI = p.i;
                int curJ = p.j;
                for (int di = -2; di <= 0; di++) {
                    for (int dj = -2; dj <= 0; dj++) {
                        Pos upperLeft = new Pos(curI + di, curJ + dj);
                        if (upperLeft.canUpperLeft() && !checked.contains(upperLeft)) {
                            checked.add(upperLeft);
                            ret[getBlackCount(upperLeft)]++;
                        }
                    }
                }
            }
            int atLeastOneBlack = 0;
            for (int num : ret) {
                atLeastOneBlack += num;
            }
            long zeroCount = ((long) sizeI - 2) * (sizeJ - 2) - atLeastOneBlack;

            out.println(zeroCount);
            for (int i = 1; i <= 9; i++) {
                out.println(ret[i]);
            }
        }

        private class Pos implements Comparable<Pos> {
            private int i;
            private int j;

            private Pos(int i, int j) {
                this.i = i;
                this.j = j;
            }

            private boolean canUpperLeft() {
                return i >= 1 && i + 2 <= sizeI && j >= 1 && j + 2 <= sizeJ;
            }

            public String toString() {
                return "(" + i + " " + j + ")";
            }

            public int hashCode() {
                return Long.hashCode((long) i * 31 + j);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null) {
                    return false;
                }
                if (getClass() != obj.getClass()) {
                    return false;
                }
                Pos p = (Pos) obj;
                return i == p.i && j == p.j;
            }

            public int compareTo(Pos p) {
                if (i == p.i) {
                    return Integer.compare(j, p.j);
                }
                return Integer.compare(i, p.i);
            }

        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

        public void println(long i) {
            writer.println(i);
        }

        public void println(int i) {
            writer.println(i);
        }

    }
}


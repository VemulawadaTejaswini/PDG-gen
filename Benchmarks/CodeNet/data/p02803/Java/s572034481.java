import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.AbstractCollection;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
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
        DMazeMaster solver = new DMazeMaster();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMazeMaster {
        private final int UNDEF = -1;
        private int sizeI;
        private int sizeJ;
        private char[][] a;

        private int bfs(Point start, Point target) {
            int[][] dist = new int[sizeI][sizeJ];
            for (int i = 0; i < sizeI; i++) {
                for (int j = 0; j < sizeJ; j++) {
                    dist[i][j] = UNDEF;
                }
            }
            dist[start.i][start.j] = 0;
            LinkedList<Point> q = new LinkedList<>();
            q.add(start);
            while (!q.isEmpty()) {
                Point cur = q.pollLast();
                int curDist = dist[cur.i][cur.j];
                if (target.i == cur.i && target.j == cur.j) {
                    return curDist;
                }
                for (int di = -1; di <= 1; di++) {
                    for (int dj = -1; dj <= 1; dj++) {
                        if (di * di + dj * dj == 1) {
                            int ni = cur.i + di;
                            int nj = cur.j + dj;
                            if (ni >= 0 && ni < sizeI && nj >= 0 && nj < sizeJ && a[ni][nj] == '.' && dist[ni][nj] == UNDEF) {
                                dist[ni][nj] = 1 + curDist;
                                q.addFirst(new Point(ni, nj));
                            }
                        }
                    }
                }
            }
            throw new Error();
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            sizeI = in.nextInt();
            sizeJ = in.nextInt();
            a = new char[sizeI][sizeJ];
            for (int i = 0; i < sizeI; i++) {
                for (int j = 0; j < sizeJ; j++) {
                    a[i][j] = in.nextCharacter();
                }
            }

            ArrayList<Point> points = new ArrayList<>();
            for (int i = 0; i < sizeI; i++) {
                for (int j = 0; j < sizeJ; j++) {
                    if (a[i][j] == '.') {
                        points.add(new Point(i, j));
                    }
                }
            }
            int ret = Integer.MIN_VALUE;
            for (int i = 0; i < points.size(); i++) {
                for (int j = i + 1; j < points.size(); j++) {
                    ret = Math.max(ret, bfs(points.get(i), points.get(j)));
                }
            }
            out.println(ret);
        }

        private class Point {
            private int i;
            private int j;

            private Point(int i, int j) {
                this.i = i;
                this.j = j;
            }

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

        public void println(int i) {
            writer.println(i);
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

        public char nextCharacter() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            return (char) c;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}


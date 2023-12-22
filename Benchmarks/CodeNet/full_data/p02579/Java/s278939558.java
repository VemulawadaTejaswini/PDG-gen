import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Objects;
import java.util.AbstractCollection;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author New User
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DWizardInMaze solver = new DWizardInMaze();
        solver.solve(1, in, out);
        out.close();
    }

    static class DWizardInMaze {
        public void solve(int testNumber, InputReader c, OutputWriter w) {
            int n = c.readInt(), m = c.readInt();
            int sx = c.readInt() - 1, sy = c.readInt() - 1, dx = c.readInt() - 1, dy = c.readInt() - 1;
            char[][] mat = new char[n][];
            for (int i = 0; i < n; i++) {
                mat[i] = c.readString().toCharArray();
            }

            PriorityQueue<Pair<Integer, Pair<Integer, Integer>>> q = new PriorityQueue<>();
            q.add(new Pair<>(0, new Pair<>(sx, sy)));

            HashSet<Pair<Integer, Integer>> exp = new HashSet<>();
            int[][] vis = new int[n][m];
            for (int i = 0; i < n; i++) {
                Arrays.fill(vis[i], -1);
            }
            vis[sx][sy] = 0;
            int[] ddx = {0, 0, 1, -1}, ddy = {1, -1, 0, 0};
            while (!q.isEmpty()) {
                Pair<Integer, Pair<Integer, Integer>> qq = q.poll();
//    		tr(qq);
                if (exp.contains(new Pair<>(qq.second.first, qq.second.second))) {
                    continue;
                }
                exp.add(new Pair<>(qq.second.first, qq.second.second));
                if (qq.second.first == dx && qq.second.second == dy) {
                    w.printLine(qq.first);
                    return;
                }
                int x = qq.second.first, y = qq.second.second;
                for (int i = 0; i < 4; i++) {
                    int xx = qq.second.first + ddx[i], yy = qq.second.second + ddy[i];
                    if (xx >= 0 && xx < n && yy >= 0 && yy < m && mat[xx][yy] != '#') {
                        if (vis[xx][yy] == -1 || vis[xx][yy] > qq.first) {
                            vis[xx][yy] = qq.first;
                            q.add(new Pair<>(qq.first, new Pair<>(xx, yy)));
                        }
                    }
                }
                for (int xx = x - 2; xx <= x + 2; xx++) {
                    for (int yy = y - 2; yy <= y + 2; yy++) {
                        if (xx == x && yy == y) {
                            continue;
                        }
                        if (xx >= 0 && xx < n && yy >= 0 && yy < m && mat[xx][yy] != '#') {
                            if (vis[xx][yy] == -1 || vis[xx][yy] > qq.first + 1) {
                                vis[xx][yy] = qq.first + 1;
                                q.add(new Pair<>(qq.first + 1, new Pair<>(xx, yy)));
                            }
                        }
                    }
                }
//    		tr(q);
            }

            w.printLine("-1");


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

        public int readInt() {
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

        public String readString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                if (Character.isValidCodePoint(c)) {
                    res.appendCodePoint(c);
                }
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
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

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void printLine(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
        }

        public void printLine(int i) {
            writer.println(i);
        }

    }

    static class Pair<U, V> implements Comparable<Pair<U, V>> {
        public final U first;
        public final V second;

        public Pair(U first, V second) {
            this.first = first;
            this.second = second;
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return first.equals(pair.first) &&
                    second.equals(pair.second);
        }

        public int hashCode() {
            return Objects.hash(first, second);
        }

        public String toString() {
            return "(" + first + "," + second + ")";
        }

        public int compareTo(Pair<U, V> o) {
            int value = ((Comparable<U>) first).compareTo(o.first);
            if (value != 0) {
                return value;
            }
            return ((Comparable<V>) second).compareTo(o.second);
        }

    }
}


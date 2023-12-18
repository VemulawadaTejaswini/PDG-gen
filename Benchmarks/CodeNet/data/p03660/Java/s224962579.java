import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author David Wu
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        private HashMap<Integer, Vertex> tree = new HashMap<>();
        private int n;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            n = in.readInt();
            for (int i = 1; i <= n; i++) {
                tree.put(i, new Vertex(i));
            }
            for (int i = 0; i < n - 1; i++) {
                int a = in.readInt(), b = in.readInt();
                if (tree.containsKey(a) && tree.containsKey(b)) {
                    tree.get(a).addNeighbour(b);
                    tree.get(b).addNeighbour(a);
                }
            }
            tree.get(1).color = 'B';
            tree.get(n).color = 'W';
            while (true) {
                if (player1() == -1) {
                    out.printLine("Snuke");
                    return;
                }
                if (player2() == -1) {
                    out.printLine("Fennec");
                    return;
                }
            }

        }

        int player1() {
            int maxFreeNeighboursID = Integer.MIN_VALUE;
            int maxFreeNeighbours = 0;
            int t = 0;
            int p = 0;
            for (int i = 1; i <= n; i++) {
                int temp = 0;
                if (tree.get(i).color == 'B') {
                    for (int k : tree.get(i).getNeighbours()) {
                        if (tree.get(k).color == ' ') {
                            t = k;
                            p++;
                            for (int j : tree.get(k).getNeighbours()) {
                                if (tree.get(j).color == ' ') {
                                    temp++;
                                }
                            }
                            if (temp > maxFreeNeighbours) {
                                maxFreeNeighbours = temp;
                                maxFreeNeighboursID = k;
                            }
                        }
                    }
                }
            }
            if (maxFreeNeighbours == 0) {
                if (p == 0) {
                    return -1;
                } else {
                    tree.get(t).color = 'B';
                }
            } else {
                tree.get(maxFreeNeighboursID).color = 'B';
            }
            return 0;
        }

        int player2() {
            int maxFreeNeighboursID = Integer.MIN_VALUE;
            int maxFreeNeighbours = 0;
            int t = 0;
            int p = 0;
            for (int i = 1; i <= n; i++) {
                int temp = 0;
                if (tree.get(i).color == 'W') {
                    for (int k : tree.get(i).getNeighbours()) {
                        if (tree.get(k).color == ' ') {
                            t = k;
                            p++;
                            for (int j : tree.get(k).getNeighbours()) {
                                if (tree.get(j).color == ' ') {
                                    temp++;
                                }
                            }
                            if (temp > maxFreeNeighbours) {
                                maxFreeNeighbours = temp;
                                maxFreeNeighboursID = k;
                            }
                        }
                    }
                }
            }
            if (maxFreeNeighbours == 0) {
                if (p == 0) {
                    return -1;
                } else {
                    tree.get(t).color = 'W';
                }
            } else {
                tree.get(maxFreeNeighboursID).color = 'W';
            }
            return 0;
        }

        class Vertex {
            int id;
            char color = ' ';
            public ArrayList<Integer> Neighbours = new ArrayList<>();

            public Vertex(int id) {
                this.id = id;
            }

            public void addNeighbour(Integer id) {
                Neighbours.add(id);
            }

            public ArrayList<Integer> getNeighbours() {
                return Neighbours;
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

    }
}


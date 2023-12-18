import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Stack;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.NoSuchElementException;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author ogiekako
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScanner in = new MyScanner(inputStream);
        MyPrintWriter out = new MyPrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, MyScanner in, MyPrintWriter out) {
            int h = in.nextInt(), w = in.nextInt();
            char[][] map = new char[h][w];
            for (int i = 0; i < h; i++) {
                map[i] = in.next().toCharArray();
            }
            boolean[][] grid = new boolean[h - 1][w];
            for (int i = 0; i < h - 1; i++) {
                for (int j = 0; j < w - 1; j++) {
                    grid[i][j] = (map[i][j] != map[i][j + 1]) == (map[i + 1][j] != map[i + 1][j + 1]);
                }
            }
            int res = Math.max(h, w);
            for (MaxRectangle.Rectangle r : MaxRectangle.maximalRectangles(grid)) {
                res = Math.max(res, (r.h + 1) * (r.w + 1));
            }
            out.println(res);
        }

    }

    static class MaxRectangle {
        public static List<MaxRectangle.Rectangle> maximalRectangles(int[] histogram) {
            histogram = Arrays.copyOf(histogram, histogram.length + 1);

            Stack<MaxRectangle.E> S = new Stack<>();
            List<MaxRectangle.Rectangle> res = new ArrayList<>();

            for (int i = 0; i < histogram.length; i++) {
                MaxRectangle.E e = new MaxRectangle.E();
                e.height = histogram[i];
                e.pos = i;
                if (S.isEmpty()) {
                    S.push(e);
                } else {
                    if (S.peek().height < e.height) {
                        S.push(e);
                    } else if (S.peek().height > e.height) {
                        int target = i;
                        while (!S.empty() && S.peek().height >= e.height) {
                            MaxRectangle.E pre = S.pop();
                            MaxRectangle.Rectangle r = new MaxRectangle.Rectangle(pre.height, i - pre.pos);
                            res.add(r);
                            target = pre.pos;
                        }
                        e.pos = target;
                        S.push(e);
                    }
                }
            }
            return res;
        }

        public static List<MaxRectangle.Rectangle> maximalRectangles(boolean[][] grid) {
            if (grid.length == 0) return Collections.emptyList();
            int[] histogram = new int[grid[0].length];
            List<MaxRectangle.Rectangle> res = new ArrayList<>();
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    histogram[j] = grid[i][j] ? histogram[j] + 1 : 0;
                }
                res.addAll(maximalRectangles(histogram));
            }
            return res;
        }

        public static class Rectangle {
            public final int h;
            public final int w;

            public Rectangle(int h, int w) {
                this.h = h;
                this.w = w;
            }

        }

        private static class E {
            int height;
            int pos;

        }

    }

    static class MyPrintWriter {
        PrintWriter out;

        public MyPrintWriter(OutputStream outputStream) {
            out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public MyPrintWriter(Writer writer) {
            out = new PrintWriter(writer);
        }

        public void println(int a) {
            out.println(a);
        }

        public void close() {
            out.close();
        }

    }

    static class MyScanner {
        private final InputStream in;
        private static final int BUFSIZE = 65536;
        int bufLen;
        int bufPtr;
        byte[] buf = new byte[BUFSIZE];
        private char[] strBuf = new char[BUFSIZE];

        public MyScanner(InputStream in) {
            this.in = in;
        }

        public int read() {
            if (bufLen == -1)
                throw new InputMismatchException();
            if (bufPtr >= bufLen) {
                bufPtr = 0;
                try {
                    bufLen = in.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (bufLen <= 0)
                    return -1;
            }
            return buf[bufPtr++];
        }

        public String next() {
            int strLen = 0;
            int c;
            do {
                c = read();
                if (c == -1) throw new NoSuchElementException();
            } while (Character.isWhitespace(c));
            do {
                if (strLen + 1 >= strBuf.length) {
                    char[] tmp = new char[strBuf.length * 2];
                    System.arraycopy(strBuf, 0, tmp, 0, strBuf.length);
                    strBuf = tmp;
                }
                strBuf[strLen++] = (char) c;
                c = read();
            } while (c != -1 && !Character.isWhitespace(c));
            return new String(strBuf, 0, strLen);
        }

        public int nextInt() {
            int c = read();
            if (c == -1) throw new NoSuchElementException();
            while (c != '-' && (c < '0' || '9' < c)) {
                c = read();
                if (c == -1) throw new NoSuchElementException();
            }
            if (c == '-') return -nextInt();
            int res = 0;
            do {
                res *= 10;
                res += c - '0';
                c = read();
            } while ('0' <= c && c <= '9');
            return res;
        }

    }
}


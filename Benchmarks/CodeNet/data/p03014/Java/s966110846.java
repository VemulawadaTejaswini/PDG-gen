import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();

            TaskD.Floor[][] field = new TaskD.Floor[w][h];


            for (int y = 0; y < h; y++) {
                String s = in.next();

                TaskD.Score cs = new TaskD.Score();
                boolean po = false;
                for (int x = 0; x < w; x++) {
                    field[x][y] = new TaskD.Floor();
                    field[x][y].setC(s.charAt(x));
                    if (field[x][y].getC() == '#' || po)
                        cs = new TaskD.Score();
                    cs.s++;
                    field[x][y].setSx(cs);
                    po = field[x][y].getC() == '#';
                }
            }

            for (int x = 0; x < w; x++) {
                TaskD.Score cs = new TaskD.Score();
                boolean po = false;
                for (int y = 0; y < h; y++) {
                    if (field[x][y].getC() == '#' || po)
                        cs = new TaskD.Score();
                    cs.s++;
                    field[x][y].setSy(cs);
                    po = field[x][y].getC() == '#';
                }
            }

            int ans = 0;
            for (int y = 0; y < h; y++) {
                for (int x = 0; x < w; x++) {
                    ans = Math.max(field[x][y].getSum() - 1, ans);
                }
            }
            out.println(ans);
        }

        static class Score {
            int s = 0;

        }

        static class Floor {
            TaskD.Score sx;
            TaskD.Score sy;
            char c;

            public void setC(char c) {
                this.c = c;
            }

            public char getC() {
                return c;
            }

            public void setSx(TaskD.Score sx) {
                this.sx = sx;
            }

            public void setSy(TaskD.Score sy) {
                this.sy = sy;
            }

            public int getSum() {
                return sx.s + sy.s;
            }

        }

    }

    static class FastScanner {
        private InputStream in;
        private byte[] buffer = new byte[1024];
        private int bufPointer;
        private int bufLength;

        public FastScanner(InputStream in) {
            this.in = in;
            this.bufPointer = 0;
            this.bufLength = 0;
        }

        private int readByte() {
            if (bufPointer >= bufLength) {
                if (bufLength == -1)
                    throw new InputMismatchException();

                bufPointer = 0;
                try {
                    bufLength = in.read(buffer);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (bufLength <= 0)
                    return -1;
            }
            return buffer[bufPointer++];
        }

        private static boolean isPrintableChar(int c) {
            return c >= 33 && c <= 126;
        }

        private static boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next() {
            StringBuilder sb = new StringBuilder();

            int b = readByte();
            while (!isPrintableChar(b))
                b = readByte();

            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }

            return sb.toString();
        }

        public int nextInt() {
            int n = 0;

            int b = readByte();
            while (isSpaceChar(b))
                b = readByte();

            boolean minus = (b == '-');
            if (minus)
                b = readByte();

            while (b >= '0' && b <= '9') {
                n *= 10;
                n += b - '0';
                b = readByte();
            }

            if (!isSpaceChar(b))
                throw new NumberFormatException();

            return minus ? -n : n;
        }

    }
}


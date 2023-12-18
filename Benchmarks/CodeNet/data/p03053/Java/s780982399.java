import java.io.*;
import java.util.*;

class Main {
    static int n, m;
    static char[][] matrix;
    static boolean[][] visited;
    static class MyObj {
        private int x, y;
        MyObj(int x, int y) {
            this.x = x; this.y = y;
        }
    }
    static int[] xdir = {0, 0, 1, -1};
    static int[] ydir = {1, -1, 0, 0};
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter w = new PrintWriter(System.out);
        n = in.nextInt();
        m = in.nextInt();
        matrix = new char[n][m];
        visited = new boolean[n][m];
        int ans = 0;
        Queue<MyObj> queue = new LinkedList<>();
        for (int i=0; i<n; i++) {
            String s = in.nextString();
            for (int j=0; j<m; j++) {
                matrix[i][j] = s.charAt(j);
                if (matrix[i][j] == '#') {
                    queue.add(new MyObj(i, j));
                    visited[i][j] = true;
                }
            }
        }
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean found = false;
            for (int i=0; i<size; i++) {
                MyObj o = queue.poll();
                for (int j=0; j<4; j++) {
                    int x = o.x + xdir[j];
                    int y = o.y + ydir[j];
                    if (isValid(x, y)) {
                        found = true;
                        queue.add(new MyObj(x, y));
                        visited[x][y] = true;
                    }
                }
            }
            if (found) {
                ans += 1;
            }
        }
        w.println(ans);
        w.close();
    }
    static boolean isValid(int i, int j) {
        return i>=0 && i<n && j>=0 && j<m && matrix[i][j] == '.' && !visited[i][j];
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

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
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

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
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
	
        public String nextString() {
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

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

}
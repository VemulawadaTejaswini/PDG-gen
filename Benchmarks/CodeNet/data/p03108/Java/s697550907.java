import java.io.*;
import java.util.*;

class Main {
    static int[] size, parent;
    static long pairs;
    public static void main(String[] args) {
        PrintWriter w = new PrintWriter(System.out);
        InputReader in = new InputReader(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        parent = new int[n+1];
        size = new int[n+1];
        for (int i=0; i<=n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
        MyObj[] arr = new MyObj[m];
        for (int i=0; i<m; i++) {
            arr[i] = new MyObj(in.nextInt(), in.nextInt());
        }
        List<Long> result = new ArrayList<>();
        result.add(((long)n * (n-1)) / 2);
        pairs = result.get(0);
        for (int i=m-1; i>0; i--) {
            union(arr[i].a, arr[i].b);
            result.add(pairs);
        }
        Collections.reverse(result);
        for (long l : result) {
            w.println(l);
        }
        w.close();
    }
    static int find(int a) {
        if (parent[a] == a) return a;
        return parent[a] = find(parent[a]);
    }
    static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a != b) {
            if (size[a] < size[b]) {
                a ^= b; b ^= a; a ^= b;
            }
            pairs -= ((long)size[a] * size[b]);
            size[a] += size[b];
            parent[b] = a;
        }
    }
    static class MyObj {
        int a, b;
        MyObj(int a, int b) {
            this.a = a; this.b = b;
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
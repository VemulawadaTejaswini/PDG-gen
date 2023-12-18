import java.util.*;
import java.io.*;

public class Main {
    static int n, m;
    static List<Integer>[] graph;
    static int[] distance;
    static int maxDepth;
    static int[] inDegree;
    public static void main(String[] args) throws IOException {
        PrintWriter w = new PrintWriter(System.out);
        InputReader in = new InputReader(System.in);
        n = in.nextInt();
        m = in.nextInt();
        graph = new ArrayList[n+1];
        distance = new int[n+1];
        inDegree = new int[n+1];
        Arrays.setAll(graph, i -> new ArrayList<>());
        for (int i=0; i<m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            graph[a].add(b);
            inDegree[b]++;
        }
        for (int i=1; i<=n; i++) {
                for (int v : graph[i]) {
                    if (distance[v] < 1 + distance[i]) {
                        distance[v] = 1 + distance[i];
                    }
                }
        }
        int maxDist = 0;
        int ans = 0;
        w.println(Arrays.toString(distance));
        for (int i : distance) maxDist = Math.max(maxDist, i);
        for (int i=1; i<=n; i++) {
            if (inDegree[i] == 0) {
                maxDepth = 0;
                dfs(i, 0);
                ans = Math.max(ans, distance[i] + maxDepth);
            }
        }
        w.println(ans);
        w.close();
    }
    static void dfs(int u, int depth) {
        maxDepth = Math.max(depth, maxDepth);
        for (int v : graph[u]) {
            dfs(v, depth+1);
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
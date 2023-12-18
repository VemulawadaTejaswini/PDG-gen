import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.HashSet;
import java.util.AbstractCollection;
import java.util.Queue;
import java.util.LinkedList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Ribhav
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BGraphPartition solver = new BGraphPartition();
        solver.solve(1, in, out);
        out.close();
    }

    static class BGraphPartition {
        public void solve(int testNumber, FastReader s, PrintWriter out) {
            int n = s.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                String str = s.nextString();
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(str.charAt(j) + "");
                }

            }

            int ans = -1;
            for (int i = 0; i < n; i++) {
                ans = Math.max(bfs(i, arr, new boolean[n]), ans);
            }
            out.println(ans);
        }

        private int bfs(int src, int[][] arr, boolean[] visited) {
            Queue<Integer> q = new LinkedList<>();
            q.add(src);
            q.add(null);
            visited[src] = true;
            HashSet<Integer> prevSet = new HashSet<>();
            HashSet<Integer> currSet = new HashSet<>();
            currSet.add(src);
            HashSet<Integer> nextSet = new HashSet<>();
            int count = 1;
            while (!q.isEmpty()) {

                Integer curr = q.poll();
                if (curr == null) {
                    prevSet.clear();
                    prevSet.addAll(currSet);
                    currSet.clear();
                    currSet.addAll(nextSet);
                    nextSet.clear();
                    q.add(null);
                    curr = q.poll();
                    if (curr == null) {
                        break;
                    }
                    count++;
                }

                for (int i = 0; i < arr.length; i++) {
                    if (arr[curr][i] == 1) {
                        if (!visited[i]) {
                            visited[i] = true;
                            q.add(i);
                            nextSet.add(i);
                        } else if (visited[i] && prevSet.contains(i)) {
                            visited[i] = true;
                        } else if (visited[i] && nextSet.contains(i)) {
                            visited[i] = true;
                        } else {
                            return -1;
                        }
                    }
                }

                currSet.add(curr);

            }
            return count;
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
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

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}


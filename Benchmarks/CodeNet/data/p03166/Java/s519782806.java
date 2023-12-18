import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class Main {

    static int[] nodes;
    static boolean[] visited;

    public static void main(String[] args) {
        InputReader ir = new InputReader(System.in);

        int N = ir.nextInt();
        int M = ir.nextInt();

        nodes = new int[N+1];
        Arrays.fill(nodes, -1);

        visited = new boolean[N+1];

        ArrayList<Integer>[] edges = new ArrayList[N+1];

        for(int i=0; i<=N; i++) {
            edges[i] = new ArrayList<>();
        }

        for(int i = 0; i < M; i++) {
            int s = ir.nextInt();
            int t = ir.nextInt();

            edges[s].add(t);
        }

       for(int i=1; i<=N; i++) {
            if(!visited[i]) {
                dfs(i, edges);
            }
       }
        int max = nodes[1];

        for(int i=2; i<nodes.length; i++) {
            max = Math.max(max, nodes[i]);
        }

        System.out.println(max);
    }

    static void dfs(int s, ArrayList<Integer>[] edges) {
            visited[s] = true;
            List<Integer> sEdges = edges[s];

            for(int i=0; i<sEdges.size(); i++) {
                int neighbor = sEdges.get(i);
                if(!visited[neighbor] && nodes[neighbor] == -1) {
                    dfs(neighbor, edges);
                }

                nodes[s] = Math.max(nodes[s], nodes[neighbor]);
            }

            nodes[s]++;
    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[8192];
        private int curChar, snumChars;
        private SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int snext() {
            if (snumChars == -1)
                throw new InputMismatchException();
            if (curChar >= snumChars) {
                curChar = 0;
                try {
                    snumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (snumChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = snext();
            while (isSpaceChar(c))
                c = snext();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = snext();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = snext();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public long nextLong() {
            int c = snext();
            while (isSpaceChar(c))
                c = snext();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = snext();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = snext();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public int[] nextIntArray(int n) {
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public String readString() {
            int c = snext();
            while (isSpaceChar(c))
                c = snext();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = snext();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }
}
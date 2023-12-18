import java.io.*;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        SimpleScanner scanner = new SimpleScanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int n = scanner.nextInt();
        HashMap<Integer, HashSet<Integer>> xMap = new HashMap<>();
        HashMap<Integer, HashSet<Integer>> yMap = new HashMap<>();
        int[][] point = new int[n][2];
        for (int i = 0; i < n; ++i) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            point[i][0] = x;
            point[i][1] = y;
            xMap.putIfAbsent(x, new HashSet<>());
            xMap.get(x).add(i);
            yMap.putIfAbsent(y, new HashSet<>());
            yMap.get(y).add(i);
        }
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);
        long ans = 0;
        for (int i = 0; i < n; ++i) {
            if (!visited[i]) {
                HashSet<Integer> diffX = new HashSet<>();
                HashSet<Integer> diffY = new HashSet<>();
                dfs(i, point, visited, xMap, yMap, diffX, diffY);
                ans += diffX.size() * diffY.size();
            }
        }
        writer.println(ans - n);

        writer.close();
    }

    private static void dfs(int u, int[][] point, boolean[] visited, HashMap<Integer, HashSet<Integer>> xMap, HashMap<Integer, HashSet<Integer>> yMap, HashSet<Integer> diffX, HashSet<Integer> diffY) {
        visited[u] = true;
        if (diffX.add(point[u][0]))
            for (int v : xMap.get(point[u][0]))
                dfs(v, point, visited, xMap, yMap, diffX, diffY);
        if (diffY.add(point[u][1]))
            for (int v : yMap.get(point[u][1]))
                dfs(v, point, visited, xMap, yMap, diffX, diffY);
    }

    private static class SimpleScanner {

        private static final int BUFFER_SIZE = 10240;

        private Readable in;
        private CharBuffer buffer;
        private boolean eof;

        SimpleScanner(InputStream in) {
            this.in = new BufferedReader(new InputStreamReader(in));
            buffer = CharBuffer.allocate(BUFFER_SIZE);
            buffer.limit(0);
            eof = false;
        }


        private char read() {
            if (!buffer.hasRemaining()) {
                buffer.clear();
                int n;
                try {
                    n = in.read(buffer);
                } catch (IOException e) {
                    n = -1;
                }
                if (n <= 0) {
                    eof = true;
                    return '\0';
                }
                buffer.flip();
            }
            return buffer.get();
        }

        void checkEof() {
            if (eof)
                throw new NoSuchElementException();
        }

        char nextChar() {
            checkEof();
            char b = read();
            checkEof();
            return b;
        }

        String next() {
            char b;
            do {
                b = read();
                checkEof();
            } while (Character.isWhitespace(b));
            StringBuilder sb = new StringBuilder();
            do {
                sb.append(b);
                b = read();
            } while (!eof && !Character.isWhitespace(b));
            return sb.toString();
        }

        int nextInt() {
            return Integer.valueOf(next());
        }

        long nextLong() {
            return Long.valueOf(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}
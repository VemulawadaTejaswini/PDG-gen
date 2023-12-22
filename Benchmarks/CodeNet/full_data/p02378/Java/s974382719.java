import java.io.*;
import java.util.*;

public class Main implements Runnable{
    private boolean[][] graph;
    private int X;
    private int Y;
    public static void main(String[] args) throws Exception {
        new Thread(null, new Main(), "bridge", 16 * 1024 * 1024).start();
    }

    @Override
    public void run() {
        try {
            solve();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void solve() throws Exception{
        FastScanner scanner = new FastScanner(System.in);

        X = scanner.nextInt();
        Y = scanner.nextInt();
        int E = scanner.nextInt();

        if(X == 0 || Y == 0 || E == 0){
            System.out.println("0");
            return;
        }

        graph = new boolean[X][Y];

        for(int i = 0; i < E; ++i){
            int u = scanner.nextInt();
            int v = scanner.nextInt();

            graph[u][v] = true;
        }

        System.out.println(maxBPM());
    }

    private int maxBPM(){
        int[] match = new int[Y];
        Arrays.fill(match, -1);

        int result = 0;
        for(int u = 0; u < X; ++u){
            if(existPath(u, new boolean[Y], match)){
                ++result;
            }
        }

        return result;
    }

    private boolean existPath(int u, boolean[] visited, int[] match){
        for(int v = 0; v < Y; ++v){
            if(graph[u][v] && !visited[v]){
                visited[v] = true;
                if(match[v] < 0 || existPath(match[v], visited, match)){
                    match[v] = u;
                    return true;
                }
            }
        }

        return false;
    }

    static class FastScanner {
        private InputStream in;
        private final byte[] buffer = new byte[1024 * 8];
        private int ptr = 0;
        private int buflen = 0;

        public FastScanner(InputStream in){
            this.in = in;
        }

        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        private void skipUnprintable() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
        }

        public boolean hasNext() {
            skipUnprintable();
            return hasNextByte();
        }

        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}
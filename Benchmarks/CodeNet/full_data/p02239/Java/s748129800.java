import java.util.ArrayDeque;
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

 class FS {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

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
        return hasNextByte() ? buffer[ptr++] : -1;
    }

    private boolean isPrintableChar(int c) {
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

    public int nextInt() {
        return (int) nextLong();
    }

    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
}
public class Main {
    static int[][] graph;
    static int[] d;
    static ArrayDeque<Integer> queue = new ArrayDeque<>();

    public static void main(String[] args) {
        FS fs = new FS();
        int n = fs.nextInt();
        graph = new int[n][];
        d = new int[n + 1];
        for (int i = 0; i < n; i++) {
            int id = fs.nextInt();
            int degree = fs.nextInt();
            graph[id - 1] = new int[degree];
            for (int j = 0; j < degree; j++) {
                graph[id - 1][j] = fs.nextInt();
            }
        }
        bfs(1);
        for (int i = 2; i <= n; i++) {
            if (d[i] == 0) {
                d[i] = -1;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(i).append(" ").append(d[i]).append("\n");
        }
        System.out.print(sb);
    }

    private static void bfs(int i) {
        queue.push(i);
        while (!queue.isEmpty()) {
            Integer m = queue.pollLast();
            for (int j = 0; j <graph[m-1].length; j++) {
                if (d[graph[m-1][j]]==0&&graph[m-1][j]!=1){
                    queue.push(graph[m-1][j]);
                    d[graph[m-1][j]]=d[m]+1;
                }
            }
        }
    }
}

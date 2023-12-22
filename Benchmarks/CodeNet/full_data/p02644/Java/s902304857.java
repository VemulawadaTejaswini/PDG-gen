import java.util.*;
import java.io.*;

public class Main {

    private final static int[][] dirs = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};
    private final static int P = 21, INF = (int)1e8;
    private int H, W, K;
    private char[][] A;

    public Main(FastScanner in, PrintWriter out) {
        H = in.nextInt();
        W = in.nextInt();
        K = in.nextInt();

        int[] st = new int[]{in.nextInt() - 1, in.nextInt() - 1};
        int[] target = new int[]{in.nextInt() - 1, in.nextInt() - 1};

        A = new char[H][W];
        for (int i = 0; i < H; i++) {
            A[i] = in.next().toCharArray();
        }

        int[][][] distTo = new int[4][H][W];
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < H; j++)
                Arrays.fill(distTo[i][j], INF);

        PriorityQueue<Edge> q= new PriorityQueue<>();
        for (int i = 0; i < 4; i++) {
            distTo[i][st[0]][st[1]] = 0;
        }
        q.add(new Edge(st[0], st[1], 0, -1));

        while (!q.isEmpty()) {
            Edge cur = q.remove();
            if (cur.y == target[0] && cur.x == target[1]) {
                out.println((cur.dist + K - 1) / K);
                return;
            }

            for (int i = 0; i < 4; i++) {
                int ny = cur.y + dirs[i][0];
                int nx = cur.x + dirs[i][1];

                if (!valid(ny, nx))
                    continue;

                int prevDist = distTo[i][ny][nx];

                int newDist;
                if (i == cur.dir)
                    newDist = cur.dist + 1;
                else
                    newDist = ((cur.dist + K - 1) / K) * K + 1;

                if (newDist < prevDist) {
                    distTo[i][ny][nx] = newDist;
                    q.add(new Edge(ny, nx, newDist, i));
                }
            }
        }
        out.println(-1);
    }

    private boolean valid(int y, int x) {
        return y >= 0 && y < H && x >= 0 && x < W && A[y][x] == '.';
    }

    private static class Edge implements Comparable<Edge> {
        int y;
        int x;
        int dist;
        int dir;

        Edge(int y, int x, int dist, int dir) {
            this.y = y;
            this.x = x;
            this.dist = dist;
            this.dir = dir;
        }

        public int compareTo(Edge other) {
            return Integer.compare(dist, other.dist);
        }
    }

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        // Scanner in = new Scanner(
                // new BufferedReader(new InputStreamReader(System.in)));
        FastScanner in = new FastScanner(System.in);

        Main sol = new Main(in, out);

        out.close();
    }
}


class FastScanner{
    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;

    public FastScanner(InputStream stream)
    {
        this.stream = stream;
    }

    int read()
    {
        if (numChars == -1)
            throw new InputMismatchException();
        if (curChar >= numChars){
            curChar = 0;
            try{
                numChars = stream.read(buf);
            } catch (IOException e) {
                throw new InputMismatchException();
            }
            if (numChars <= 0)
                return -1;
        }
        return buf[curChar++];
    }

    boolean isSpaceChar(int c)
    {
        return c==' '||c=='\n'||c=='\r'||c=='\t'||c==-1;
    }

    boolean isEndline(int c)
    {
        return c=='\n'||c=='\r'||c==-1;
    }

    int nextInt()
    {
        return Integer.parseInt(next());
    }

    long nextLong()
    {
        return Long.parseLong(next());
    }

    double nextDouble()
    {
        return Double.parseDouble(next());
    }

    String next(){
        int c = read();
        while (isSpaceChar(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do{
            res.appendCodePoint(c);
            c = read();
        }while(!isSpaceChar(c));
        return res.toString();
    }

    String nextLine(){
        int c = read();
        while (isEndline(c))
            c = read();
        StringBuilder res = new StringBuilder();
        do{
            res.appendCodePoint(c);
            c = read();
        }while(!isEndline(c));
        return res.toString();
    }
}

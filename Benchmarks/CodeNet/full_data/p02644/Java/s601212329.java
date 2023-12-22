import java.util.*;
import java.io.*;

public class Main {

    private final static int[][] dirs = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};
    private final static int P = 20;

    public Main(FastScanner in, PrintWriter out) {
        int H = in.nextInt();
        int W = in.nextInt();
        int K = in.nextInt();

        int[] st = new int[]{in.nextInt() - 1, in.nextInt() - 1};
        int[] target = new int[]{in.nextInt() - 1, in.nextInt() - 1};

        char[][] A = new char[H][W];
        for (int i = 0; i < H; i++) {
            A[i] = in.next().toCharArray();
        }

        Set<Integer> seen = new HashSet<>();
        PriorityQueue<int[]> q= new PriorityQueue<>(
                Comparator.comparingInt(e -> (e[0] + K - 1) / K));
        for (int i = 0; i < 4; i++) {
            int loc = st[0] * W + st[1];
            seen.add((i << P) | loc);
            q.add(new int[]{0, i, loc});
        }

        while (!q.isEmpty()) {
            int[] cur = q.remove();
            int curDist = cur[0];
            int d = cur[1];
            int y = cur[2] / W, x = cur[2] % W;
            if (y == target[0] && x == target[1]) {
                out.println((curDist + K - 1) / K);
                return;
            }
            int ny = y + dirs[d][0], nx = x + dirs[d][1];
            if (ny >= 0 && ny < H && nx >= 0 && nx < W&& A[ny][nx] == '.') {
                int state = (d << P) | (ny * W + nx);
                if (!seen.contains(state)) {
                    seen.add(state);
                    q.add(new int[]{curDist + 1, d, ny * W + nx});
                }
            }

            for (int i = 0; i < 4; i++) {
                if (i == d) continue;
                int state = (i << P) | cur[2];
                if (!seen.contains(state)) {
                    seen.add(state);
                    q.add(new int[]{(curDist + K - 1) / K * K, i, cur[2]});
                }
            }
        }
        out.println(-1);
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

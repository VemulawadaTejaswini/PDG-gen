import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter __out = new PrintWriter(new OutputStreamWriter(System.out));
    static int Y,X;
    static char [][]grid;

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        Y = fs.nextInt();
        X = fs.nextInt();
        int sy = fs.nextInt(), sx = fs.nextInt(), ey = fs.nextInt(), ex = fs.nextInt();
        sy--;
        sx--;
        ey--;
        ex--;
        grid = new char[Y][X];
        for (int y = 0; y < Y; y++) {
            char [] row = fs.next().toCharArray();
            for (int x = 0; x < X; x++) {
                grid[y][x] = row[x];
            }
        }
        Deque<Integer> Qx = new ArrayDeque<Integer>(), Qy = new ArrayDeque<Integer>();
        Qx.offer(sx);
        Qy.offer(sy);
        int [] dx = {1,-1,0,0};
        int [] dy = {0,0,-1,1};
        int [][] dist = new int [Y][X];
        for (int[] row : dist) {
            Arrays.fill(row,Integer.MAX_VALUE);
        }
        dist[sy][sx] = 0;
        while (!Qx.isEmpty()) {
            int cx = Qx.poll();
            int cy = Qy.poll();
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i], ny = cy + dy[i];
                if (legal(ny, nx) && dist[ny][nx] > dist[cy][cx]) {
                    dist[ny][nx] = dist[cy][cx];
                    Qx.offerFirst(nx);
                    Qy.offerFirst(ny);
                }
            }
            for (int x = -2; x <= 2; x++) {
                for (int y = -2; y <= 2; y++) {
                    int nx = cx + x, ny = cy + y;
                    if (legal(ny, nx) && dist[ny][nx] > dist[cy][cx] + 1) {
                        dist[ny][nx] = dist[cy][cx] + 1;
                        Qx.offer(nx);
                        Qy.offer(ny);
                    }
                }
            }
        }
        if (dist[ey][ex] != Integer.MAX_VALUE) System.out.println(dist[ey][ex]);
        else System.out.println(-1);


    }
    static boolean  legal(int y, int x) {
        if (x < 0 || x >= X || y < 0 || y >= Y || grid[y][x] == '#') return false;
        return true;
    }

    static void prln ( char[] s){
        __out.println(new String(s));
    }
    static final Random random = new Random();

    static void ruffleSort(int[] a) {
        int n = a.length;//shuffle, then sort
        for (int i = 0; i < n; i++) {
            int oi = random.nextInt(n), temp = a[oi];
            a[oi] = a[i];
            a[i] = temp;
        }
        Arrays.sort(a);
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }


}
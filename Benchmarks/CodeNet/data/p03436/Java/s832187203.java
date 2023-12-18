import java.util.*;
import java.io.*;
 
public class Main {
    static boolean[][] used;
    static int[] ans;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] map = new char[h][w];
        boolean[][] arrived = new boolean[h][w];
        int sharp = 0;
        for(int i = 0; i < h; i++){
            map[i] = sc.next().toCharArray();
            for(char c : map[i]){
                if(c == '#'){
                    sharp++;
                }
            }
        }
        arrived[0][0] = true;
        Deque<Point> q = new ArrayDeque<Point>();
        q.add(new Point(0,0,1));
        int[] mx = {-1,0,0,1};
        int[] my = {0,-1,1,0};
        while(q.size() > 0){
            Point p = q.poll();
            for(int i = 0; i < 4; i++){
                int nx = p.x + mx[i];
                int ny = p.y + my[i];
                if(nx == w-1 && ny == h-1){
                    System.out.println(h*w-sharp-p.cnt-1);
                    return;
                }
                if(0 <= nx && nx < w && 0 <= ny && ny < h && map[ny][nx] != '#' && !arrived[ny][nx]){
                    q.add(new Point(nx,ny,p.cnt+1));
                    arrived[ny][nx] = true;
                }
            }
        }
        System.out.println(-1);
    }
}

class Point{
    int x, y, cnt;
    public Point(int x, int y, int cnt){
        this.x = x;
        this.y = y;
        this.cnt = cnt;
    }
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;
    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken("\n");
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

    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    } 
}

import java.util.*;
import java.io.*;
 
public class Main {
    static int[] mx = {-1,0,0,1};
    static int[] my = {0,-1,1,0};
    static char[] cnt = "123456789".toCharArray();
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int bcnt = 0;
        char[][] map = new char[h][w];
        for(int i = 0; i < h; i++){
            map[i] = sc.next().toCharArray();
            int j = 0;
            for(char c : map[i]){
                if(c == '#'){
                    bcnt++;
                }
                j++;
            }
        }
        sc.close();
        if(map[0][0] == '#' || map[h-1][w-1] == '#'){
            System.out.println(-1);
            return;
        }
        Deque<Point> q = new ArrayDeque<>();
        boolean[][] arrived = new boolean[h][w];
        q.add(new Point(0,0,1));
        arrived[0][0] = true;
        while(q.size() > 0){
            Point p = q.poll();
            int y = p.y;
            int x = p.x;
            if(y == h-1 && x == w-1){
                System.out.println((h*w)-p.cnt-bcnt);
                return;
            }
            for(int j = 0 ; j < 4; j++){
                int nx = x + mx[j];
                int ny = y + my[j];
                if(check(ny,nx,h,w) && map[ny][nx] != '#' && !arrived[ny][nx]){
                    arrived[ny][nx] = true;
                    q.add(new Point(ny,nx,p.cnt+1));
                }
            }
        }
        System.out.println(-1);
    }
    
    public static boolean check(int y, int x, int h, int w){
        return (y >= 0 && y < h && x >= 0 && x < w);
    }
}

class Point{
    int x,y,cnt;
    public Point(int y, int x, int cnt){
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
    
    public void close() throws Exception{
        this.reader.close();
        return;
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

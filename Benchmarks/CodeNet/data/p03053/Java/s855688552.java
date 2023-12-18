import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int[] mx = {-1,0,0,1};
        int[] my = {0,-1,1,0};
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] map = new char[h][w];
        boolean[][] checked = new boolean[h][w];
        int cnt = h*w;
        int ans = 0;
        Queue<Point> q = new ArrayDeque<Point>();
        for(int i = 0; i < h; i++){
            char[] tmp = sc.next().toCharArray();
            int j = 0;
            for(char c : tmp){
                if(c == '#'){
                    q.add(new Point(0,i,j));
                    checked[i][j] = true;
                }
                j++;
            }
            map[i] = tmp;
        }
        StringBuilder sb = new StringBuilder();
        while(q.size() > 0){
            Point p = q.poll();
            checked[p.y][p.x] = true;
            for(int i = 0; i < 4; i++){
                int ny = p.y+my[i];
                int nx = p.x+mx[i];
                if(check(ny, nx, h, w, checked)){
                    q.add(new Point(p.cnt+1,ny,nx));
                }
            }
            ans = p.cnt;
        }
        System.out.println(ans);
    }
    
    public static boolean check(int y, int x, int h, int w, boolean[][] checked){
        return (y >= 0 && y < h && x >= 0 && x < w && !checked[y][x]);
    }
}

class Point{
    int cnt,x,y;
    public Point(int cnt, int y, int x){
        this.cnt = cnt;
        this.x = x;
        this.y = y;
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
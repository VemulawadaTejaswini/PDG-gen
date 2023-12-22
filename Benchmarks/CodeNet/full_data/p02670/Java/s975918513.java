import java.util.*;
import java.io.*;
 
public class Main {
    static int[] mx = {1,0,0,-1};
    static int[] my = {0,1,-1,0};
    static boolean[][] checked;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int[][] step = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                step[i][j] = Math.min(i,Math.min(j,Math.min(n-1-i,n-1-j)));
            }
        }
        long ans = 0;
        boolean[][] removed = new boolean[n][n];
        Deque<Point> q = new ArrayDeque<Point>();
        for(int i = 0; i < n*n; i++){
            checked = new boolean[n][n];
            int now = sc.nextInt()-1;
            int h = now/n;
            int w = now%n;
            ans += step[h][w];
            checked[h][w] = true;
            removed[h][w] = true;
            q.add(new Point(h,w,step[h][w]));
            while(q.size() > 0){
                Point p = q.poll();
                /*
                if(step[p.h][p.w] > p.cnt){
                    step[p.h][p.w] = Math.min(step[p.h][p.w],p.cnt);
                    
                    for(int j = 0; j < 4; j++){
                        int nx = p.w+mx[j];
                        int ny = p.h+my[j];
                        if(check(ny,nx,n) && !checked[ny][nx]){
                            checked[ny][nx] = true;
                            int nextCnt = removed[p.h][p.w] ? p.cnt : p.cnt++;
                            q.add(new Point(ny,nx,nextCnt));
                        }
                    }
                    
                }
                */
                step[p.h][p.w] = Math.min(step[p.h][p.w],p.cnt);
                int cnt = removed[p.h][p.w] ? p.cnt : p.cnt+1;
                for(int j = 0; j < 4; j++){
                    int nx = p.w+mx[j];
                    int ny = p.h+my[j];
                    if(check(ny,nx,n) && step[ny][nx] > p.cnt){
                        //checked[ny][nx] = true;
                        q.add(new Point(ny,nx,cnt));
                    }
                }
            }
            /*
            System.out.println(h + " "+ w);
            for(int k = 0; k < n; k++){
                for(int j = 0; j < n; j++){
                   System.out.print(step[k][j] + " ");
                }
                System.out.println();
            }
            System.out.println(ans);
            */
        }
        System.out.println(ans);
    }
    
    public static boolean check(int y, int x, int n){
        return (0 <= y && y < n && 0 <= x && x < n);
    }
}

class Point{
    int h,w,cnt;
    public Point(int h, int w, int c){
        this.h = h;
        this.w = w;
        this.cnt = c;
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

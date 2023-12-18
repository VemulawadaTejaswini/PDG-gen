import java.util.*;
import java.io.*;
 
public class Main {
    static boolean[][] used;
    static int[] ans;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        ArrayList<Point> li = new ArrayList<Point>();
        for(int i = 0; i < n; i++){
            li.add(new Point(sc.nextLong(),sc.nextLong()));
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j) continue;
                Point p1 = li.get(i);
                Point p2 = li.get(j);
                long dx = p1.x-p2.x;
                long dy = p1.y-p2.y;
                int tmp = 0;
                for(int k = 0; k < n; k++){
                    for(int l = 0; l < n; l++){
                        if(k == l) continue;
                        Point p3 = li.get(k);
                        Point p4 = li.get(l);
                        if(p3.x-p4.x == dx && p3.y-p4.y == dy){
                            tmp++;
                        }
                    }
                }
                ans = Math.max(ans,tmp);
            }
        }
        System.out.println(n-ans);
    }
}

class Point{
    long x, y;
    public Point(long x, long y){
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

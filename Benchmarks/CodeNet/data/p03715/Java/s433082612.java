import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        long h = sc.nextInt();
        long w = sc.nextInt();
        long ans = Math.min(h,w);
        if(h % 3 == 0 || w % 3 == 0){
            System.out.println(0);
            return;
        }
        for(int i = 1; i <= h/2; i++){
            long first = i*w;
            long max = Math.max((long)Math.ceil(w/2d)*(h-i),first);
            long min = Math.min((long)Math.floor(w/2d)*(h-i),first);
            ans = Math.min(ans,max-min);
        }
        for(int i = 1; i <= w/2; i++){
            long first = i*h;
            long max = Math.max((long)Math.ceil(h/2d)*(w-i),first);
            long min = Math.min((long)Math.floor(h/2d)*(w-i),first);
            ans = Math.min(ans,max-min);
        }
        System.out.println(ans);
    }
}

class Point{
    double x,y;
    public Point(double x, double y){
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

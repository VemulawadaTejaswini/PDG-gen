import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        ArrayList<Dish> li = new ArrayList<>();
        int[][] dpi = new int[n+1][t+1];
        int[][] dpj = new int[n+1][t+1];
        for(int i = 0; i < n; i++){
            int ai = sc.nextInt();
            int bi = sc.nextInt();
            for(int j = ai; j < t; j++){
                dpi[i+1][j] = dpi[i][j];
                if(j >= ai){
                    dpi[i+1][j] = Math.max(dpi[i+1][j],dpi[i+1][j-ai]+bi);
                }
            }
            li.add(new Dish(ai,bi));
        }
        for(int i = n-1; i >= 0; i--){
            int ai = li.get(i).a;
            int bi = li.get(i).b;
            for(int j = 0; j < t; j++){
                dpj[i][j] = dpj[i+1][j];
                if(j >= ai){
                    dpj[i][j] = Math.max(dpj[i][j],dpj[i+1][j-ai]+bi);
                }
            }
        }
        int max = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < t; j++){
                //System.out.println(i +" " + j + " " + dpi[i][j] + " " + dpj[i+1][t-1-j]);
                max = Math.max(max,dpi[i][j] + dpj[i+1][t-1-j] + li.get(i).b);
            }
        }
        System.out.println(max);
    }
}

class Dish{
    int a,b;
    public Dish(int a, int b){
        this.a = a;
        this.b = b;
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

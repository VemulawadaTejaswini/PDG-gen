import java.util.*;
import java.io.*;
 
 
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] al = new int[n];
        int[] bl = new int[n];
        for(int i = 0; i < n; i++){
            al[i] = sc.nextInt();
            bl[i] = sc.nextInt();
        }
        int[][] dpi = new int[n+2][t+1];
        int[][] dpj = new int[n+2][t+1];
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < t; j++){
                dpi[i][j] = dpi[i-1][j];
			    if (j - al[i-1] >= 0) dpi[i][j] = Math.max(dpi[i][j], dpi[i-1][j-al[i-1]]+bl[i-1]);
            }
        }
        for(int i = n; i >= 1; i--){
            for(int j = 0; j < t; j++){
                dpj[i][j] = dpj[i+1][j];
			    if (j - al[i-1] >= 0) dpj[i][j] = Math.max(dpj[i][j], dpj[i+1][j-al[i-1]]+bl[i-1]);
            }
        }
        int max = Math.max(dpi[n][t-1], dpj[1][t-1]);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < t; j++){
                max = Math.max(max,dpi[i][j] + dpj[i+2][t-1-j] + bl[i]);
            }
        }
        System.out.println(max);
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

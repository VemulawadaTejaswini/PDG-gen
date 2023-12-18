import java.util.*;
import java.io.*;
 
public class Main {
    static boolean[][] used;
    static int[] ans;
    public static void main(String[] args) throws Exception {
        long mod = (long)Math.pow(10,9)+7;
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int kk = sc.nextInt();
        long[][] amida = new long[h+1][w];
        amida[0][0] = 1;
        for(int i = 1; i <= h; i++){
            for(int j = 0; j < (1 << (w-1)); j++){
                boolean flag = true;
                for(int k = 0; k < w-2; k++){
                    if((j >> k)%2 == 1 && (j >> (k+1))%2 == 1){
                        flag = false;
                        break;
                    }
                }
                if(!flag) continue;
                for(int k = 0; k < w; k++){
                    if(k == 0){
                        if((j >> k)%2 == 1){
                            amida[i][k] += amida[i-1][k+1];
                        }else{
                            amida[i][k] += amida[i-1][k];
                        }
                    }else if(k == w-1){
                        if((j >> (k-1))%2 == 1){
                            amida[i][k] += amida[i-1][k-1];
                        }else{
                            amida[i][k] += amida[i-1][k];
                        }
                    }else{
                        if((j >> k)%2 == 1){
                            amida[i][k] += amida[i-1][k+1];
                        }else if((j >> (k-1))%2 == 1){
                            amida[i][k] += amida[i-1][k-1];
                        }else{
                            amida[i][k] += amida[i-1][k];
                        }
                    }
                    amida[i][k] %= mod;
                }
            }
        }
        System.out.println(amida[h][kk-1]);
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



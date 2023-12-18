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
        char[][] map = new char[h][w];
        long[][] left = new long[h][w];
        long[][] right = new long[h][w];
        long[][] up = new long[h][w];
        long[][] down = new long[h][w];
        for(int i = 0; i < h; i++){
            map[i] = sc.next().toCharArray();
        }
        for(int i = 0; i < h; i++){
            int cnt = 0;
            for(int j = 0; j < w; j++){
                if(map[i][j] == '#'){
                    cnt = 0;
                }else{
                    cnt++;
                    left[i][j] = cnt;
                }
            }
        }
        for(int i = 0; i < h; i++){
            int cnt = 0;
            for(int j = w-1; j >= 0; j--){
                if(map[i][j] == '#'){
                    cnt = 0;
                }else{
                    cnt++;
                    right[i][j] = cnt;
                }
            }
        }
        for(int i = 0; i < w; i++){
            int cnt = 0;
            for(int j = 0; j < h; j++){
                if(map[j][i] == '#'){
                    cnt = 0;
                }else{
                    cnt++;
                    up[j][i] = cnt;
                }
            }
        }
        for(int i = 0; i < w; i++){
            int cnt = 0;
            for(int j = h-1; j >= 0; j--){
                if(map[j][i] == '#'){
                    cnt = 0;
                }else{
                    cnt++;
                    down[j][i] = cnt;
                }
            }
        }
        long ans = 0;
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                ans = Math.max(ans,left[i][j]+right[i][j]+up[i][j]+down[i][j]-3);
            }
        }
        System.out.println(ans);
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
import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        int[][] white = new int[h][w];
        for(int i = 0; i < h; i++){
            char[] choco = sc.next().toCharArray();
            int j = 0;
            int jw = 0;
            for(char c : choco){
                white[i][j] = c-'0'+jw;
                if(i != 0){
                    white[i][j] += white[i-1][j];
                }
                if(c == '1'){
                    jw++;
                }
                j++;
            }
        }
        //printArr(white,h,w);
        int ans = 0;
        int now = white[h-1][w-1];
        if(k >= now){
            System.out.println(0);
            return;
        }
        while(k <= now){
            now = now/2+now%2;
            ans++;
        }
        System.out.println(ans);
    }
    
    public static void printArr(int[][] arr, int h, int w){
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return;
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
    
    public String[] nextArray(int n) {
        String[] a = new String[n];
        for (int i = 0; i < n; i++)
            a[i] = next();
        return a;
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

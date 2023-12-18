import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(h == 1){
            for(int i = 0; i < a; i++){
                System.out.print('1');
            }
            for(int i = a; i < w; i++){
                System.out.print('0');
            }
            System.out.println();
            return;
        }else if(w == 1){
            for(int i = 0; i < b; i++){
                System.out.println('1');
            }
            for(int i = b; i < w; i++){
                System.out.println('0');
            }
            return;
        }else{
            for(int i = 0; i < a; i++){
                for(int j = 0; j < b; j++){
                    System.out.print('0');
                }
                for(int j = b; j < w; j++){
                    System.out.print('1');
                }
                System.out.println();
            }
            for(int i = a; i < h; i++){
                for(int j = 0; j < b; j++){
                    System.out.print('1');
                }
                for(int j = b; j < w; j++){
                    System.out.print('0');
                }
                System.out.println();
            }
        }
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
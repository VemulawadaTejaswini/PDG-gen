import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        long[] a = sc.nextLongArray(n);
        long min = a[0];
        long max = a[0];
        long ans = 1000;
        for(int i = 0; i < n-1; i++){
            if(a[i] > a[i+1]){
                if(min < max){
                    ans += (max-min)*(ans/min);
                    //System.out.println(ans);
                    max = a[i+1];
                    min = a[i+1];
                }
            }else{
                max = a[i+1];
            }
        }
        /*
        for(long v : a){
            if(max < v){
                max = v;    
            }
            if(min > v){
                ans += Math.max(0,(max-min)*ans/min);
                min = v;
            }
        }
        pw.println(ans+Math.max(0,(max-min)*ans/min));
        */
        pw.println(ans + (max-min)*(ans/min));
        pw.flush();
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

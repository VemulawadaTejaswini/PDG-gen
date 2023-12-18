import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int q = sc.nextInt();
        long[] s = new long[a];
        long[] t = new long[b];
        for(int i = 0; i < a; i++){
            s[i] = sc.nextLong();
        }
        for(int i = 0; i < b; i++){
            t[i] = sc.nextLong();
        }
        for(int i = 0; i < q; i++){
            long x = sc.nextLong();
            int si = beamSearch(x, s);
            int ti = beamSearch(x, t);
            long min = Long.MAX_VALUE;
            for(int j = 0; j < 4; j++){
                int sj = si + j/2;
                int tj = ti + j%2;
                if(sj >= a || tj >= b){
                    continue;
                }
                long maxj = Math.max(Math.abs(s[sj]-x),Math.abs(t[tj]-x));
                long minj = Math.min(Math.abs(s[sj]-x),Math.abs(t[tj]-x));
                if(s[sj] >= x && t[tj] >= x || s[sj] <= x && t[tj] <= x){
                    min = Math.min(min,maxj);
                }else{
                    min = Math.min(min,maxj+minj*2);
                }
            }
            System.out.println(min);
        }
        
    }
    
    public static int beamSearch(long dist, long[] arr){
        if(arr.length == 1){
            return 0;
        }
        int left = 0;
        int right = arr.length;
        while(right - left > 1){
            int mid = (right + left) / 2;
            if(arr[mid] > dist){
                right = mid;
            }else{
                left = mid;
            }
        }
        return left;
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

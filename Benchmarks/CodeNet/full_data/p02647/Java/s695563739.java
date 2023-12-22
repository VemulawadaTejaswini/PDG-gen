import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = sc.nextIntArray(n);
        int[] cum = new int[n+1];
        for(int i = 0; i < n; i++){
            int left = Math.max(0,i-arr[i]);
            int right = Math.min(n,i+arr[i]+1);
            cum[left]++;
            cum[right]--;
        }
        /*
        for(int i = 0; i < n; i++){
            System.out.print(cum[i] + " ");
        }
        System.out.println();
        */
        for(int i = 1; i <= k; i++){
            int[] tmp = new int[n+1];
            int now = 0;
            boolean allN = true;
            for(int j = 0; j < n; j++){
                now += cum[j];
                int left = Math.max(0,j-arr[j]);
                int right = Math.min(n,j+arr[j]+1);
                tmp[left]++;
                tmp[right]--;
                if(now < n){
                    allN = false;
                }
                arr[j] = now;
                /*
                if(k == 2){
                   System.out.println(tmp[j]); 
                }
                */
                
            }
            if(allN){
                StringBuilder sb = new StringBuilder();
                for(int j = 0; j < n; j++){
                    sb.append(n+" ");
                }
                System.out.println(sb.toString());
                return;
            }
            cum = tmp;
        }
        
        /*
        for(int i = 0; i < n; i++){
            System.out.print(cum[i] + " ");
        }
        System.out.println();
        */
        int prt = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            prt += cum[i];
            sb.append(Math.min(prt,n) + " ");
        }
        System.out.println(sb.toString());
    }
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;
    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }
    
    public void close() throws Exception{
        this.reader.close();
        return;
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

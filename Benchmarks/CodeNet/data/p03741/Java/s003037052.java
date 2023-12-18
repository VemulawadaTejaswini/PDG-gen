import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        long[] arr = sc.nextLongArray(n);
        long total = arr[0] > 0 ? arr[0] : 1;
        long ans = arr[0] > 0 ? 0 : 1-arr[0];
        for(int i = 1; i < n; i++){
            if(i % 2 == 0){
                long tmp = Math.max(1-total,arr[i]);
                ans += Math.abs(tmp-arr[i]);
                total += tmp;
            }else{
                long tmp = Math.min(-total-1,arr[i]);
                ans += Math.abs(tmp-arr[i]);
                total += tmp;
            }
        }
        total = arr[0] < 0 ? arr[0] : -1;
        long ans2 = arr[0] < 0 ? 0 : 1+arr[0];
        for(int i = 1; i < n; i++){
            if(i % 2 != 0){
                long tmp = Math.max(1-total,arr[i]);
                ans2 += Math.abs(tmp-arr[i]);
                total += tmp;
            }else{
                long tmp = Math.min(-total-1,arr[i]);
                ans2 += Math.abs(tmp-arr[i]);
                total += tmp;
            }
        }
        System.out.println(Math.min(ans,ans2));
        /*
        if(arr[0] >= 0){
            total = -1;
            ans2 = Math.abs(-1-arr[0]);
            for(int i = 1; i < n; i++){
                if(i % 2 == 0){
                    int tmp = Math.max(1-total,arr[i]);
                    ans2 += Math.abs(tmp-arr[i]);
                    total += tmp;
                }else{
                    int tmp = Math.min(-total-1,arr[i]);
                    ans2 += Math.abs(tmp-arr[i]);
                    total += tmp;
                }
            }
        }else{
            total = 1;
            ans2 = Math.abs(1-arr[0]);
            for(int i = 1; i < n; i++){
                if(i % 2 == 0){
                    //System.out.println(1-total);
                    int tmp = Math.min(1-total,arr[i]);
                    ans2 += Math.abs(tmp-arr[i]);
                    total += tmp;
                }else{
                    System.out.println(Math.abs(-total-1));
                    int tmp = Math.max(Math.abs(-total-1),arr[i]);
                    ans2 += Math.abs(tmp-arr[i]);
                    total += tmp;
                }
                System.out.println(total);
            }
        }
        System.out.println(Math.min(ans,ans2));
        */
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

import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        long mod = (long)Math.pow(10,9)+7;
        FastScanner sc = new FastScanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long ans = 0;
        if(k == 0){
            for(long i = k+1; i <= n; i++){
                long tmp = n/i*(i-k);
                if(n % i >= k){
                    tmp += (n%i)-k;
                }
                //System.out.println(tmp);
                ans += tmp;
            }
            System.out.println(ans);
        }else{
            for(long i = k+1; i <= n; i++){
                long tmp = n/i*(i-k);
                if(n % i >= k){
                    tmp += (n%i)-k+1;
                }
                //System.out.println(tmp);
                ans += tmp;
            }
            System.out.println(ans);
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

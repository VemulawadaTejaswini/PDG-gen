import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        long mod = (long)Math.pow(10,9)+7;
        FastScanner sc = new FastScanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        if(n == k){
            System.out.println(1);
            for(int i = 1; i < k; i++){
                System.out.println(0);
            }
            return;
        }
        long ans = 0;
        for(int i = 1; i <= k; i++){
            System.out.println(nCk(n-k+1,(long)i,mod)%mod * nCk(i,k-i,mod)% mod);
        }
    }
    
    public static long nCk(long n,long k,long M) {
        long ret = 1;
        long min = Math.min(k, n-k);
        for(long i=1;i<=min;i++) {
            ret = (ret * pow(i,M-2,M)) % M;
        }
        for(long i=n-min+1;i<=n;i++) {
            ret = (ret * i) % M;
        }
        return ret;
    }

    public static long pow(long a,long b,long M) {
        long ret = 1;
        long tmp = a;
        while(b>0) {
            if((b&1)==1){
                ret = (ret * tmp) % M;
            }
            tmp = (tmp * tmp) % M;
            b = b>>1;
        }
        return ret;
    }
    
    static class FastScanner {
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
}

import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        long mod = 998244353L;
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[k];
        int[] b = new int[k];
        for(int i = 0; i < k; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        long[] dp = new long[n+1];
        dp[0] = 1;
        for(int i = 0; i < n; i++){
            dp[i] %= mod;
            for(int j = 0; j < k; j++){
                int left = Math.min(n,i+a[j]);
                int right = Math.min(n,i+b[j]+1);
                dp[left] %= mod;
                dp[left] += dp[i];
                dp[left] %= mod;
                dp[right] %= mod;
                dp[right] -= dp[i];
                dp[right] %= mod;
            }
            if(i != 0){
                dp[i+1] %= mod;
                dp[i+1] += dp[i];
                dp[i+1] %= mod;
            }
        }
        /*
        for(int i = 0; i < n; i++){
            pw.print(dp[i] + " ");
        }
        pw.println();
        */
        while(dp[n-1] < 0){
            dp[n-1] += mod;
        }
        pw.println(dp[n-1]);
        pw.flush();
    }

    static class GeekInteger {
        public static void save_sort(int[] array) {
            shuffle(array);
            Arrays.sort(array);
        }
 
        public static int[] shuffle(int[] array) {
            int n = array.length;
            Random random = new Random();
            for (int i = 0, j; i < n; i++) {
                j = i + random.nextInt(n - i);
                int randomElement = array[j];
                array[j] = array[i];
                array[i] = randomElement;
            }
            return array;
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

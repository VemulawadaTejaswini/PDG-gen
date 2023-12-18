import java.util.*;
import java.io.*;
 
public class Main {
    static boolean[][] used;
    static int[] ans;
    public static void main(String[] args) throws Exception {
        long mod = 998244353;
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] a = sc.nextIntArray(n);
        long[][][] dp = new long[n+1][s+1][3];
        dp[0][0][0] = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= s; j++){
                dp[i+1][j][0] += dp[i][j][0];
                dp[i+1][j][0] %= mod;
                dp[i+1][j][1] += (dp[i][j][0] + dp[i][j][1]) % mod;
                dp[i+1][j][1] %= mod;
                dp[i+1][j][2] += (dp[i][j][0] + dp[i][j][1] + dp[i][j][2]) % mod;
                dp[i+1][j][2] %= mod;
                if(j + a[i] <= s){
                    dp[i+1][j+a[i]][1] += (dp[i][j][0] + dp[i][j][1]) % mod;
                    dp[i+1][j+a[i]][1] %= mod;
                    dp[i+1][j+a[i]][2] += (dp[i][j][0] + dp[i][j][1]) % mod;
                    dp[i+1][j+a[i]][2] %= mod;
                }
            }
        }
        System.out.println(dp[n][s][2]%mod);
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
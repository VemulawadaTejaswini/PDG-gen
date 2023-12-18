import java.io.*;
import java.util.*;

public class Main {

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public float nextFloat() {
            return Float.parseFloat(next());
        }

    }

    static InputReader r = new InputReader(System.in);
    static PrintWriter pw = new PrintWriter(System.out);

    /** CHECKLIST:
     * LIMITS (DOES BRUTE FORCE WORK?)
     * CHECK ALL PARAMETERS
     * INT VS LONG
     */
    public static void main(String[] args) {
        int n = r.nextInt(); // number of items
        int w = r.nextInt(); // max capacity
        long[] weights = new long[n+1];
        long[] values = new long[n+1];
        for(int i = 1; i <= n; i++){
            weights[i] = r.nextLong();
            values[i] = r.nextLong();
        }
        long[][] dp = new long[n+1][w+1];
        for(int i = 1; i <= n; i++){ // using only the first i items
            for(int j = 0; j <= w; j++){ // max weight j
                if(weights[i] > j){
                    dp[i][j] = dp[i-1][j];
                } else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][(int)(j-weights[i])] + values[i]);
                }
            }
        }
        long max = 0;
        for(int j = 0; j <= w; j++){
            max = Math.max(max, dp[n][j]);
        }
        pw.println(max);

        pw.close();
    }
}

/**
                _        _                 _                                                
               | |      | |               | |                                               
   ___ ___   __| | ___  | |__  _   _    __| | __ _ _ __ _ __ ___ _ __     _   _  __ _  ___  
  / __/ _ \ / _` |/ _ \ | '_ \| | | |  / _` |/ _` | '__| '__/ _ \ '_ \   | | | |/ _` |/ _ \ 
 | (_| (_) | (_| |  __/ | |_) | |_| | | (_| | (_| | |  | | |  __/ | | |  | |_| | (_| | (_) |
  \___\___/ \__,_|\___| |_.__/ \__, |  \__,_|\__,_|_|  |_|  \___|_| |_|   \__, |\__,_|\___/ 
                                __/ |                               ______ __/ |            
                               |___/                               |______|___/             
 */
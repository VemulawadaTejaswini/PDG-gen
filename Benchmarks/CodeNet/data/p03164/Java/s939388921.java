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
        int[] weights = new int[n+1];
        int[] values = new int[n+1];
        int[] dp = new int[w+1];
        for(int i = 1; i <= n; i++){
            weights[i] = r.nextInt();
            values[i] = r.nextInt();
        }
        for(int i = 1; i <= n; i++){
            for(int j = w; j >= 0; j--){
                if(weights[i] > j){
                    //do nothing
                } else{
                    dp[j] = Math.max(dp[j], dp[j-weights[i]] + values[i]);
                }
            }
        }
        /**
        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= w; j++){
                if(weights[i] > j){
                    current[j] = previous[j];
                } else{
                    current[j] = Math.max(previous[j], previous[j-weights[i]] + values[i]);
                }
            }
            for(int j = 0; j <= w; j++){
                previous[j] = current[j];
            }
        }
        */
        long max = 0;
        for(int j = 0; j <= w; j++){
            max = Math.max(max, dp[j]);
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
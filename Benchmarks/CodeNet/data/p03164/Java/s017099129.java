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
        int[] weights = new int[n];
        int[] values = new int[n];
        for(int i = 0; i < n; i++){
            weights[i] = r.nextInt();
            values[i] = r.nextInt();
        }
        int sum = 0;
        for(int x : values){
            sum += x;
        }
        int[] dp = new int[sum+1]; // dp[i] - the minimum total weight of items with total value exactly i
        Arrays.fill(dp, Integer.MAX_VALUE / 2);
        dp[0] = 0;
        for(int i = 0; i < n; i++){ // i is item
            for(int j = sum - values[i]; j >= 0; j--){ // j is value already
                dp[j + values[i]] = Math.min(dp[j + values[i]], dp[j] + weights[i]);
            }
        }
        int answer = 0;
        for(int i = 0; i <= sum; i++){
            if(dp[i] <= w){
                answer = Math.max(answer, i);
            }
        }
        pw.println(answer);
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
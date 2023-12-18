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
        int n = r.nextInt();
        int[][] points = new int[n][3];
        int[][] dp = new int[n][3];
        for(int i = 0; i < n; i++){
            points[i][0] = r.nextInt();
            points[i][1] = r.nextInt();
            points[i][2] = r.nextInt();
        }
        dp[0][0] = points[0][0];
        dp[0][1] = points[0][1];
        dp[0][2] = points[0][2];
        for(int i = 1; i < n; i++){
            dp[i][0] = points[i][0] + Math.max(dp[i-1][1], dp[i-1][2]);
            dp[i][1] = points[i][1] + Math.max(dp[i-1][0], dp[i-1][2]);
            dp[i][2] = points[i][2] + Math.max(dp[i-1][0], dp[i-1][1]);
        }
        pw.println(Math.max(Math.max(dp[n-1][0], dp[n-1][1]), dp[n-1][2]));
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
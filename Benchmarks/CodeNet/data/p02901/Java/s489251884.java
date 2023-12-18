import java.io.*;
import java.util.*;

public class Main {

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null; }
        String next() { while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try { tokenizer = new StringTokenizer(reader.readLine()); } 
                catch (IOException e) { throw new RuntimeException(e);} }
            return tokenizer.nextToken(); }
        public int nextInt() { return Integer.parseInt(next()); }
        public long nextLong() { return Long.parseLong(next()); }
        public double nextDouble() { return Double.parseDouble(next()); }
    }

    static InputReader r = new InputReader(System.in);
    static PrintWriter pw = new PrintWriter(System.out);
    static int INF = (int)1e9+7;
    public static void main(String[] args) {
        
        int n = r.nextInt();
        int m = r.nextInt();
        int[] keys = new int[m];
        int[] prices = new int[m];
        for(int i = 0; i < m; i++){ // inputting the keys
            prices[i] = r.nextInt();
            int b = r.nextInt();
            for(int j = 0; j < b; j++){
                keys[i] |= 1 << r.nextInt() - 1;
            }
        }
        int[] dp = new int[1 << n];
        Arrays.fill(dp, INF);
        dp[0] = 0;
        for(int i = 0; i < 1 << n; i++){
            if(dp[i] < INF){
                for(int k = 0; k < m; k++){
                    dp[i | keys[k]] = Math.min(dp[i | keys[k]], dp[i] + prices[k]);
                }
            }
        }
        if(dp[(1 << n) - 1] >= INF){
            pw.println(-1);
        } else {
            pw.println(dp[(1 << n) - 1]);
        }

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
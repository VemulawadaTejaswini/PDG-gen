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

    static final int REEEEEEEEEEE = (int)1E9+7;
    public static void main(String[] args) {
        
        int rows = r.nextInt();
        int cols = r.nextInt();
        char[][] grid = new char[rows+1][cols+1];
        long[][] dp = new long[rows+1][cols+1];
        for(int i = 1; i <= rows; i++){
            String s = r.next();
            for(int j = 1; j <= cols; j++){
                grid[i][j] = s.charAt(j-1);
            }
        }
        int r = rows;
        int c = cols;
        for(r = rows; r >= 1; r--){
            if(grid[r][cols] == '#') break;
            else dp[r][cols] = 1;
        }
        for(c = cols; c >= 1; c--){
            if(grid[rows][c] == '#') break;
            else dp[rows][c] = 1;
        }
        for(r = rows-1; r >= 1; r--){
            for(c = cols-1; c>= 1; c--){
                if(grid[r][c] == '#'){
                    dp[r][c] = 0;
                } else {
                    dp[r][c] = dp[r+1][c] + dp[r][c+1];
                    dp[r][c] %= REEEEEEEEEEE;
                }
            }
        }
        pw.println(dp[1][1]);

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
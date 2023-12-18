import java.io.*;
import java.util.*;
public class Main {
    private static void solver(InputReader sc, PrintWriter out) throws Exception {
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] arr = new char[n][m];
        for(int i=0; i<n; i++){
            String  s = sc.next();
            arr[i] = s.toCharArray();
        }
        long[][] dp = new long[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(i-1 >= 0 && j-1 >= 0){
                    dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1]);
                }
                else if(i-1>=0){
                    dp[i][j] = dp[i-1][j];
                }else if(j-1 >=0){
                    dp[i][j] = dp[i][j-1];
                }
                dp[i][j] += arr[i][j] == '#' ? 1 : 0;
            }
        }
        out.println(dp[n-1][m-1]);
    }
    private static long gcd(long a, long b){
        if(b==0) return a;
        return  gcd(b, a%b);
    }
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        solver(in,out);
        out.close();
    }
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;
        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }
        public String next() {
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
        public double nextDouble(){
            return Double.parseDouble(next());
        }
    }
}
class Pair{
    int x,y;
    Pair(int x, int y){
        this.x = x;this.y = y;
    }
}
import java.io.*;
import java.util.*;
public class Main {
    private static void solver(InputReader sc, PrintWriter out) {
        int row = sc.nextInt();
        int col = sc.nextInt();
        char arr[][] = new char[row][col];
        long dp[][] = new long[row][col];
        dp[0][0] = 1;
        for(int i=0; i<row; i++){
            String s = sc.next();
            arr[i] = s.toCharArray();
        }
        int mod = (int)1e9+7;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(arr[i][j] == '#' || i==0  && j==0) continue;
                if(i-1 < 0) dp[i][j] = dp[i][j-1];
                else if(j-1 < 0) dp[i][j] = dp[i-1][j];
                else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                    dp[i][j] %=mod;
                }
            }
        }
        out.println(dp[row-1][col-1]);

    }
    public static long lcm(long x, long y){
        return x / gcd(x,y) * y;
    }
    public static long gcd(long a, long b){
        if(b==0) return a;
        else return gcd(b, a%b);
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
class Pair {
    int x,y;
    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return x == pair.x &&
                y == pair.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
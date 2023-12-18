import java.io.*;
import java.util.*;
import static java.lang.Math.min;
import static java.lang.Math.max;
public class Main {
    private static void solver(InputReader sc, PrintWriter out) throws Exception {
            int n = sc.nextInt();
            long dp[] = new long[3];
            long arr[] = new long[3];
            for(int i=0; i<n; i++){
                for(int j=0; j<3; j++) arr[j] = sc.nextLong();
                long dp1[] = new long[3];
                for(int j=0; j<3; j++){
                    long max=0;
                    for(int k=0; k<3; k++){
                        if(j!=k) {
                            if (dp[k] > max) max = dp[k];
                        }
                    }
                    dp1[j] = max + arr[j];
                }
                dp = dp1;
            }
            out.println(max(dp[0],max(dp[1],dp[2])));
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
class Pair implements Comparable<Pair>{
    long x,y;
    Pair(long x, long y){
        this.x = x;
        this.y = y;
    }
    public int compareTo(Pair p){
        return (int)(this.x - p.x);
    }

}
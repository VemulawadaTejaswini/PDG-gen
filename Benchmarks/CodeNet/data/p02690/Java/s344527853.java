import java.io.*;
import java.util.*;

public class Main {
    private static void solver(InputReader sc, PrintWriter out) throws Exception {
        long x = sc.nextLong();
        for(int i=-1000; i<=1000; i++){
            for(int j=-1000; j<=1000; j++){
              long A = (long)Math.pow(i,5);
              long B = (long)Math.pow(j,5);
              if((A-B)==x){
                  out.println(i+" "+j);
                  return;
              }
            }
        }
    }
    private static int gcd (int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd (b, a % b);
    }
    private static long helper(long x){
        long ans = (x * (x-1))/2;
        return ans;
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
        public int[] readIntArray(int n){
            int arr[] = new int[n];
            for(int i=0;i<n;i++) arr[i] = nextInt();
            return arr;
        }
    }
}
class Pair{
    long x;
    long y;
    Pair(long x, long y){
        this.x  =x ;
        this.y =y;
    }
}

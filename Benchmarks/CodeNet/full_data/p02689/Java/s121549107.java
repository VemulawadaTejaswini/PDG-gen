import java.io.*;
import java.util.*;

public class Main {

    private static void solver(InputReader sc, PrintWriter out) throws Exception {
          int n = sc.nextInt();
          int m = sc.nextInt();
          int arr[] = new int[n];
          boolean good[] = new boolean[n];
          Arrays.fill(good,true);
          for(int i=0;i <n; i++) arr[i] = sc.nextInt();
          for(int i=0; i<m; i++){
              int x = sc.nextInt()-1;
              int y = sc.nextInt()-1;
              if(arr[x] <= arr[y]) {
                  good[x] = false;
              }
              if(arr[y] <= arr[x])
                  good[y] = false;
          }
          int count=0;
          for(boolean xx : good){
              if(xx)
                  count++;
          }
          out.println(count);
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

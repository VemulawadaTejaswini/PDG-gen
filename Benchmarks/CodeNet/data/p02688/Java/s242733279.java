import java.io.*;
import java.util.*;

public class Main {

    private static void solver(InputReader sc, PrintWriter out) throws Exception {
          int n = sc.nextInt();
          int k = sc.nextInt();
          int arr[] = new int[n];
          for(int i=0; i<k; i++){
              int x = sc.nextInt();
                for(int z=0; z<x; z++){
                    int y = sc.nextInt()-1;
                    arr[y]++;
                }
          }
          int count=0;
          for(int xx: arr){
              if(xx==0)
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

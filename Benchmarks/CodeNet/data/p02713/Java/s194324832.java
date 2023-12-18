import java.io.*;
import java.util.*;

public class Main {
    static Set<Integer> primes = new HashSet<>();
    static{
        for(int i=2; i<=1000; i++){
            if(isprime(i))
                primes.add(i);
        }
    }
    private static void solver(InputReader sc, PrintWriter out) throws Exception {
       int k = sc.nextInt();
       long ans =0;
       for(int i=1;i<=k;i++){
           for(int j=1;j<=k;j++){
               for(int c=1; c<=k ;c++){
                  ans += gcd(i,j,c);
               }
           }
       }
       out.println(ans);
    }
    private static boolean isprime(int x){
        if(x==2)
            return true;
        int sqs = (int)Math.sqrt(x);
        for(int i=2; i<=sqs; i++){
            if(x%i==0)
                return false;
        }
        return true;
    }

    private static int gcd (int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd (b, a % b);
    }
    private static int gcd (int a, int b, int c) {
      int gcd1 = gcd(a,b);
      return gcd(gcd1,c);
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
class Pair {
    int x;
    long y;

    Pair(int x, long y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        Pair pair = (Pair) o;
        return this.x < pair.x && this.y==pair.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
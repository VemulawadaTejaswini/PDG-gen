import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
   /* static Set<Integer> primes = new HashSet<>();
    static Set<Pair> ans = new HashSet<>();
    static int max = (int)Math.sqrt(1000000000);
    static {
        boolean prime[] = new boolean[max+1];
        Arrays.fill(prime,true);
        for(int p=2; p*p <= max; p++){
            if(prime[p]){
                for(int i=p*p; i<=max; i+=p)
                    prime[i] = false;
            }
        }
        for(int i=2;i<=max;i++)
        {
            if(prime[i])
                primes.add(i);
        }
    }
    static {
            for(int i=2; i<1000000;i++){
                int sq = (int)Math.sqrt(i);
                int count=0,pcount=0;
                for(int j=2;j<=sq;j++){
                    if(i%j==0) {
                        if((i/j) == j) {
                            count++;
                        }else {
                            count += 2;
                            if(primes.contains(i/j))
                                pcount++;
                        }
                        if(primes.contains(j))
                            pcount++;
                    }
                }
                Pair p = new Pair(count,pcount);
                ans.add(p);
            }
    }*/
   static int[] arr = {1,2,3,4,5,6,7,8,9,10};
    private static void solver(InputReader sc, PrintWriter out) throws Exception {
        StringBuilder sb = new StringBuilder(sc.next());
        while(sb.toString().contains("ST")){
            int x = sb.indexOf("ST");
            sb.replace(x,x+2,"");
        }
        out.println(sb.length());
    }

    private static int gcd (int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd (b, a % b);
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
    int y;

    Pair(int x, int y) {
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
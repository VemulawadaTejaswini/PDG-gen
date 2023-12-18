import java.io.*;
import java.util.*;
public class Main{

    private static void solver(InputReader sc, PrintWriter out) throws Exception {
      int n = sc.nextInt();
     int m = sc.nextInt();
     out.println(n<=m ? "unsafe" : "safe" );

    }
    private static int gcd(int a, int b){
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
    public static void main(String[] args) throws Exception {
        // long start =  System.nanoTime();
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
class Pair  implements  Comparable<Pair>{
    int x;
    int y;
    int z;

    Pair(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
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
        return Objects.hash(x, y, z);
    }

    @Override
    public int compareTo(Pair o) {
        return this.x-o.x;
    }
}
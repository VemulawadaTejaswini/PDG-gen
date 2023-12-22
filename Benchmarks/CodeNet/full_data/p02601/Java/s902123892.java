import java.io.*;
import java.util.*;

public class Main {


    private static void solver(InputReader sc, PrintWriter out) throws Exception {
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       int k = sc.nextInt();
       int count=0;
       while(b <= a && count < k){
            b *= 2;
            count++;
       }
       while(c <= b && count < k){
           c *= 2;
           count++;
       }
       if(b > a && c > b){
           out.println("Yes");
       }else out.println("No");
    }

    private static int lcm(int a, int b) {

        return (a * b) / gcd(a, b);
    }

    private static int gcd(int a, int b) {

        if (b == 0)
            return a;

        return gcd(b, a % b);
    }

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        solver(in, out);
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

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}

class Pair {
    int x, y;

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

class Tuple implements Comparable<Tuple> {
    int x, y, z;

    public Tuple(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int compareTo(Tuple t) {
        if (this.z == t.z) {
            if (this.y == t.y) {
                return t.x - this.x;
            } else return t.y - this.y;
        } else
            return this.z - t.z;
    }


}
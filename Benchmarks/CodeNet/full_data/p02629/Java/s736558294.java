import java.io.*;
import java.util.*;
import static java.lang.Math.min;
import static java.lang.Math.max;
public class Main {

    private static void solver(InputReader sc, PrintWriter out) throws Exception {
          long n = sc.nextLong();
          String ans = "";
          String arr[] = {"a","b","c","d","e","f","g","h", "i", "j", "k", "l", "m",
          "n", "o", "p", "q", "r", "s","t","u","v","w","x","y","z"};
          //out.println(arr.length);
          while(n > 0){
              long mod = n%26;mod--;
              if(mod < 0) {
                  mod = 25; n= n/26;
                  n--;
              }else n = n/26;
              ans += (arr[(int) mod]);
          }
          for(int i=ans.length()-1; i>=0; i--) out.print(ans.charAt(i));
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
    int x,y;
    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int compareTo(Pair p){
        return (int)(this.x - p.x);
    }
}
class Tuple{
    String s;
    int x, y;

    public Tuple(String s, int x, int y) {
        this.s = s;
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple tuple = (Tuple) o;
        return x == tuple.x &&
                y == tuple.y &&
                s.equals(tuple.s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(s, x, y);
    }
}

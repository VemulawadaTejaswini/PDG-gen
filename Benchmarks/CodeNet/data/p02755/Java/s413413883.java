import java.io.*;
import java.util.*;
public class Main {
    private static void solver(InputReader sc, PrintWriter out) throws Exception {
        double tax1 = 0.08,tax2=0.10;
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double ans1 = a/tax1;
        double ans2 = b/tax2;
        long check1 =(long) (tax1*ans1);
        long check2 = (long)(tax2*ans1);
        if(check1==(long)a && check2==(long)b){
            out.println((long)ans1); return;
        }
        long check3 = (long)(tax1*ans2);
        long check4  = (long)(tax2*ans2);
        if(check3==(long)a && check4==(long)b){
            out.println((long)ans2); return;
        }
        out.println(-1);
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
       this.x = x;this.y = y;
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
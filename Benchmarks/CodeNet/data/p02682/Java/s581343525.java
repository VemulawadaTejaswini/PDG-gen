import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }

    static class Task {
        public void solve(InputReader in, PrintWriter out) {
           long a  = in.nextLong();
           long b = in.nextLong();
           long c = in.nextLong();
           long k = in.nextLong();
            long resultSum = 0;
           if(k > 0){
               if(k > a){
                   resultSum += a;
                   k -= a;
               }
               else{
                   resultSum += k;
                   k = 0;
               }
           }
           if(k > 0){
               k -= (k  > b)? b : k;
           }

           if(k > 0){
            if(k > c){
                resultSum -= c;
                k -= c;
            }
            else{
                resultSum -= k;
                k = 0;
            }
           }
           out.println(resultSum);
        }

        
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

        public long nextLong(){
          return Long.parseLong(next());
        }

    }
}


import java.io.*;
import java.util.*;
 

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Unstoppable solver = new Unstoppable();
	//	int t=in.nextInt();
	//	while(t-->0)
        solver.solve(in, out);
        out.close();
    }
 
    static class Unstoppable {
        public void solve(InputReader in, PrintWriter out) {
          int n=in.nextInt();
          long ans=(n/500)*1000;
          n=n%500;
          ans+=(n/5)*5;
          out.println(ans);
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
        public long nextLong(){
            return Long.parseLong(next());
        }
        public int nextInt() {
            return Integer.parseInt(next());
        }
 
    }
}
 
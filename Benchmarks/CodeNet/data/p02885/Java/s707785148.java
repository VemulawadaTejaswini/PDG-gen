import java.io.*;
import java.util.*;
 
/**
 * Only By Abhi_Valani
 */
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
          //from here...
		  //int[] a = readArray(in, n);
		  int n=in.nextInt();
		  int m=in.nextInt();
		  if(2*m >= n) out.println("0");
		  else out.println(n-2*m);
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
 
    }
}
 
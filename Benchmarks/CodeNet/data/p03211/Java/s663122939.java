import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static class Task {
        public void solve(InputReader in, PrintWriter out) {
        	int a = in.nextInt();
        	int currentNum = a%1000;
        	a /= 1000;
        	int minDiff = Math.abs(currentNum-753);
        	
        	while(a > 0) {
        		int newDigit = a%10;
        		currentNum /= 10;
        		currentNum += newDigit*100;
        		
        		int currentDiff = Math.abs(currentNum-753);
        		if(currentDiff < minDiff)
        			minDiff = currentDiff;
        		
        		a /= 10;
        	}
        	out.println(minDiff);
        }
    }
	
    public static void main(String argds[]) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
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
    }	
}
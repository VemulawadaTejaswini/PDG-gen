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
        	int n = in.nextInt();
        	if(n==1) {
        		out.println(in.nextInt());
        		return;
        	}
        	int ans = 0;
        	int prev = in.nextInt();
        	for(int i=1; i<n; i++) {
        		int curr = in.nextInt();
        		if(prev > curr)
        			ans+=prev-curr;
        		if(i==n-1)
        			ans+=curr;
        		prev = curr;
        	}
        	out.println(ans);
        }
        
        public void solve_again(InputReader in, PrintWriter out) {
        	int n = in.nextInt();
        	int curr = in.nextInt();
        	int ans = curr;
        	for(int i=1; i<n; i++) {
        		int next = in.nextInt();
        		if(next > curr)
        			ans+=next-curr;
        		curr = next;
        	}
        	out.println(ans);
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
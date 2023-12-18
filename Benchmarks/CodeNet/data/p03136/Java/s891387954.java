import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	static class Task {
        public void solve(InputReader in, PrintWriter out) {
        	int n = in.nextInt();
        	ArrayList<Integer> nums = new ArrayList<Integer>();
        	for(int i=0; i<n; i++) {
        		nums.add(in.nextInt());
        	}
        	int max = Collections.max(nums);
        	int sum = 0;
        	for(int i=0; i<n; i++) {
        		sum += nums.get(i);
        	}
        	Boolean ans = sum-max > max ? true : false;
        	if(ans)
        		out.println("Yes");
        	else
        		out.println("No");
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
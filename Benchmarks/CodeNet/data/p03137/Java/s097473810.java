import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static class Task {
        public void solve(InputReader in, PrintWriter out) {
        	int n = in.nextInt();
        	int m = in.nextInt();
        	int[] nums = new int[m];
        	for(int i=0; i<m; i++) {
        		nums[i] = in.nextInt();
        	}
        	Arrays.sort(nums);
        	int[] diffs = new int[m-1];
        	for(int i=0; i<m-1; i++) {
        		diffs[i] = Math.abs(nums[i+1] - nums[i]);
        	}
        	Arrays.sort(diffs);
        	int ans = 0;
        	int i=0;
        	while(m-i>n) {
        		ans += diffs[i];
        		i++;
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
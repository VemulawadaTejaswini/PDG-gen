
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }
    
    static class Task {
    	public void solve(int TestNumber, InputReader in, PrintWriter out) {
    		int n = in.nextInt();
    		int m = in.nextInt();
    		boolean[] has = new boolean[n];
    		int[] cnt = new int[n];
    		has[0] = true;
    		for(int i = 0; i < n; ++i) {
    			cnt[i] = 1;
    		}
    		int a, b;
    		for(int i = 0; i < m; ++i) {
    			a = in.nextInt() - 1;
    			b = in.nextInt() - 1;
    			if(has[a]) {
    				has[b] = true;
    			}
    			cnt[a]--;
    			cnt[b]++;
    			if(cnt[a] == 0)has[a] = false;
    		}
    		int ans = 0;
    		for(int i = 0; i < n; i++) {
    			if(has[i])ans++;
    		}
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
        public int nextInt() {
            return Integer.parseInt(next());
        }
 
    }
}

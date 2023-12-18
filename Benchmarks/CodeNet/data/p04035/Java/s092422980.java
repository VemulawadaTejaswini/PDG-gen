
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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
    		int[] a = new int[n];
    		for(int i = 0; i < n; ++i) {
    			a[i] = in.nextInt();
    		}
    		List<Integer> ans = new ArrayList<Integer>();
    		boolean ok = false;
    		int lf = 0;
    		int rg = 0;
    		for(int i = 0; i < n - 1; ++i) {
    			if(a[i] + a[i + 1] >= m){
    				ok = true;
    				ans.add(i);
    				lf = i;
    				rg = i + 1;
    				break;
    			}
    		}
    		if(!ok)out.println("Impossible");
    		else { 
    			while(lf > 0) {
    				ans.add(lf - 1);
    				--lf;
    			}
    			while(rg < n - 1) {
    				ans.add(rg);
    				++rg;
    			}
    			out.println("Possible");
    			for(int i = 0; i < ans.size(); ++i) {
    				out.println(ans.get(i) + 1);
    			}
    		}
    		
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

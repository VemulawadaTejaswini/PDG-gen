    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStream;
    import java.io.InputStreamReader;
    import java.io.OutputStream;
    import java.io.PrintWriter;
    import java.util.StringTokenizer;
     
    /**
     * Built using CHelper plug-in Actual solution is at the top
     */
    public class Main {
     
    	public static void main(String[] args) {
     
    		InputStream inputStream = System.in;
    		OutputStream outputStream = System.out;
    		InputReader in = new InputReader(inputStream);
    		PrintWriter out = new PrintWriter(outputStream);
    		Solution solver = new Solution();
    		solver.solve(in, out);
    		out.close();
    	}
     
    	static class Solution {
    		
    		public void solve(InputReader in, PrintWriter out) {
     
    			int a = in.nextInt();
    			int b = in.nextInt();
    			int c = a + b;
    			int goats = 3;
    			if (a % goats == 0 || c % goats == 0 || c % goats == 0) {
    				out.println("Possible");
    			} else {
    				out.println("Impossible");
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
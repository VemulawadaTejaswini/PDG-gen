//AtCoder Beginner Contest 164 Task D
import java.io.*;
import java.util.*;

public class ac164d {
	static class InputReader{
		BufferedReader reader;
		StringTokenizer tokenizer;
		
		public InputReader(InputStream stream) {
			reader = new BufferedReader (new InputStreamReader(stream), 32768);
			tokenizer = null;
		}
		
		String next() {
			while(tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				}catch(IOException e) {
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
		
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		
	}
	

	static InputReader r = new InputReader(System.in);
	static PrintWriter pw = new PrintWriter(System.out);
	
	public static void main (String[] args) {
		
		//CODE GOES HERE
		
		String s = r.next();
		int n = s.length();
		int[] pre = new int[n+1];
		pre[n] = 0;
		int ten = 1;
		for(int i=n-1; i>=0; i--) {
			pre[i] = (pre[i+1] + ten*(int)(s.charAt(i)-48))%2019;
			ten = (ten*10)%2019;
		}
		
		int[] dis = new int[2019];
		
		for(int i=0; i<=n; i++) {
			dis[pre[i]]++;
		}
		
		long out = 0;
		
		for(int i=0; i<2019; i++) {
			out = out + (dis[i]*(dis[i]-1))/2;
		}
		
		pw.println(out);
		
		for(int i=0; i<2019; i++) {
			
		}
		
		pw.close();
		
	}
	
}

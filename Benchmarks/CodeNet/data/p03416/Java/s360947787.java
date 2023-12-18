import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args) throws Exception {
		FastScanner sc = new FastScanner();
		int a = sc.nextInt();
		int cnt= 0;
		int b = sc.nextInt();
		for(int i=a; i <= b; i++) {
			String s = ""+i;
			String rev = new StringBuffer(s).reverse().toString();
			if(rev.equals(s)) ++cnt;
		}
		System.out.println(cnt);
	}
	static class FastScanner {
		public BufferedReader reader;
		public StringTokenizer tokenizer;
 
		public FastScanner() {
			reader = new BufferedReader(new InputStreamReader(System.in), 32768);
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
 
		public double nextDouble() {
			return Double.parseDouble(next());
		}
 
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
 
	}
}
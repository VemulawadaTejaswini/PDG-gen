// Java implementation of the approach 
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main { 
	

	public static class FastReader {
		BufferedReader br;
		StringTokenizer root;
		
 
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
 
		String next() {
			while (root == null || !root.hasMoreTokens()) {
				try {
					root = new StringTokenizer(br.readLine());
				} catch (Exception addd) {
					addd.printStackTrace();
				}
			}
			return root.nextToken();
		}
 
		int nextInt() {
			return Integer.parseInt(next());
		}
 
		double nextDouble() {
			return Double.parseDouble(next());
		}
 
		long nextLong() {
			return Long.parseLong(next());
		}
 
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception addd) {
				addd.printStackTrace();
			}
			return str;
		}
	}
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	public static FastReader sc = new FastReader();
	public static void main(String[] args) throws IOException {
		
		int n = sc.nextInt()%10;
		if(n == 2 || n == 5 || n == 7 || n == 9 || n == 4) out.print("hon");
		else if(n == 0 || n == 1 || n == 6 || n == 8) out.print("pon");
		else out.print("bon");
	   
		out.close();
		
	}
	


}

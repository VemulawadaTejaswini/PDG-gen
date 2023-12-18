import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		PrintWriter out= new PrintWriter(System.out);
		int n= in.nextInt();
		long res=0;
		for (int i = 0; i < n; i++) {
			int l= in.nextInt();
			int r= in.nextInt();
			res+= r-l+1;
		}
		System.out.println(res);
		
		
		
	}
	static class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner(InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
			st = new StringTokenizer("");
		}

		public String next() throws IOException {
			if (!st.hasMoreTokens()) {
				st = new StringTokenizer(br.readLine());
				return next();
			}
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
		public double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static ArrayList<String> s = new ArrayList<String>();
	public static void main(String[] args) throws IOException {
		FastScanner in = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int a= in.nextInt();
		int b= in.nextInt();
		int c= in.nextInt();
		int d= in.nextInt();
		int [] on= new int[110];
		for (int i = a; i < b; i++) {
			on[i]++;
		}
		for (int i = c; i < d; i++) {
			on[i]++;
		}
		int res=0;
		for (int i = 0; i < on.length; i++) {
			if(on[i]==2) res++;
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

		public double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
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

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
	}
}


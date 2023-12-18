import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	public static ArrayList<String> s = new ArrayList<String>();
	public static void main(String[] args) throws IOException {
		FastScanner in = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n= in.nextInt();
		int [] a= new int[n];
		int [] f= new int[(int) (1e5+10)];
		int numneg=0;
		for (int i = 0; i < a.length; i++) {
			a[i]= in.nextInt();
			f[a[i]]++;
			f[a[i]+1]++;
			if(a[i]==0) numneg++;
			else f[a[i]-1]++;
		}
		int res= numneg;
		for (int i = 0; i < f.length; i++) {
			res= Math.max(res, f[i]);
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


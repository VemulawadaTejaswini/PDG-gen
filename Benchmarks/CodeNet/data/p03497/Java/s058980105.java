import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		FastScanner in= new FastScanner(System.in);
		PrintWriter out= new PrintWriter(System.out);
		
		int n= in.nextInt();
		int k= in.nextInt();
		
		int [] a= new int[n];
		int [] f= new int[(int) 3e5];
		
		for (int i = 0; i < a.length; i++) {
			a[i]= in.nextInt();
			f[a[i]]++;
		}
		Arrays.sort(f);
		int d=0;
		for (int i = 0; i < f.length; i++) {
			if(f[i]!=0) d++;
		}
		int res=0;
		for (int i = 0; i < f.length; i++) {
			if(d<=k) {
				break;
			}
			if(f[i]!=0) {
				res+= f[i];
				d--;
			}
		}
		System.out.println(res);
	}
	static class p{
		int x;
		int y;
		public p(int a, int b) {
			x=a;
			y=b;
		}
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
/*
4 6
1 1 1
1 3 1
4 2 1
4 3 1
2 4 1
2 3 1
*/
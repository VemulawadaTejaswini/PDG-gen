import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+1];
		a[0] = 0;
		for(int i=1; i<n+1; i++) {
			a[i] = sc.nextInt();
		}
		int sum =0;
		for(int i=0; i<=n; i++) {
			sum += cost(i, next(i, n), a);
		}
		for(int i=1; i<=n; i++) {
			int x = cost(prev(i, n), i,a);
			int y = cost(i, next(i, n), a);
			int z = cost(prev(i, n), next(i, n), a);
			System.out.println(sum-x-y+z);
		}
	}
	
	static int next(int i, int n) {
		if(i==n) return 0;
		return i+1;
	}
	
	static int prev(int i, int n) {
		if(i==0) return n;
		return i-1;
	}
	
	static int cost(int f, int t, int[] a) {
		return Math.abs(a[f]-a[t]);
	}

	static class MyScanner
	{
		BufferedReader br;
		StringTokenizer st;
		public MyScanner(InputStream s)
		{
			br=new BufferedReader(new InputStreamReader(s));
		}
		public String nextLine() throws IOException
		{
			return br.readLine();
		}
		public String next() throws IOException
		{
			while(st==null || !st.hasMoreTokens())
				st=new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public int nextInt() throws IOException
		{
			return Integer.parseInt(next());
			
		}
		public double nextDouble() throws IOException
		{
			return Double.parseDouble(next());
		}
		public boolean ready() throws IOException
		{
			return br.ready();
		}
		public long nextLong() throws IOException
		{
			return Long.parseLong(next());
		}
	}
}
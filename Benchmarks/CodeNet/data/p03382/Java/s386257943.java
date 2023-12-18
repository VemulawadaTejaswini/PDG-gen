import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for(int i=0; i<n; i++) a[i] = sc.nextInt();
		Arrays.sort(a);
		long max = a[n-1];
		int l = 0;
		int r = n-1;
		while(Math.abs(l-r)>1) {
			int mid = (l+r)/2;
			if(max>2*a[mid]+1) {
				l = mid;
			} else {
				r = mid;
			}
		}
		if(l+1<n-1) {
			if(Math.abs(max-2*a[l]-1)<Math.abs(max-2*a[l+1]-1)) {
				System.out.println(max + " " + a[l]);	
			} else {
				System.out.println(max + " " + a[l+1]);
			}
		} else {
			System.out.println(max + " " + a[l]);	
		}
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

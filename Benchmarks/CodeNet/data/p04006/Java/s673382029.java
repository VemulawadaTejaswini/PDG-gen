import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main{

	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner(System.in);
		int n;
		long x;
		n = sc.nextInt();
		x = sc.nextLong();
		long[] a = new long[n];
		for(int i=0; i<n; i++) a[i] = sc.nextLong();
		long[] b = a.clone();
		long ans=Long.MAX_VALUE;
		for(int k=0; k<n; k++) {
			long acc=0;
			long xk = ((long)x)*k;
			for(int i=0; i<n; i++) {
				b[i]=Math.min(b[i], a[(i-k+n)%n]);
				acc+=b[i];
			}
			ans=Math.min(ans, acc+xk);
		}
		System.out.println(ans);
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner(System.in);
		int[] a = new int[3];
		a[0] = sc.nextInt(); a[1] = sc.nextInt(); a[2] = sc.nextInt();
		Arrays.sort(a);
		if(a[0]==a[1]&&a[1]==a[2]) {
			System.out.println(0);
		} else {
			int d =(2*a[2]-a[1]-a[0]); 
			if(d%2==0) {
				System.out.println(d/2);
			} else {
				int d2 = (2*(a[2]+1)-a[1]-a[0]-1);
				System.out.println(d2/2+1);
			}
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

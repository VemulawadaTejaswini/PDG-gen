import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner(System.in);
		int n  =sc.nextInt();
		long[]a = new long[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextLong();
		}
		long[]acc = new long[n];
		acc[0] = a[0];
		for(int i=1; i<n; i++) {
			acc[i] = acc[i-1]+a[i];
		}
		HashMap<Long, Long> m = new HashMap<>();
		m.put(0L, 1L);
		for(int i=0; i<n; i++) {
			if(m.containsKey(acc[i])) {
				m.put(acc[i], m.get(acc[i])+1);
			} else {
				m.put(acc[i], 1L);
			}
		}
		long ans = 0;
		for(Map.Entry<Long, Long> e : m.entrySet()) {
			long num = e.getValue();
			ans += (num-1)*num/2;
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

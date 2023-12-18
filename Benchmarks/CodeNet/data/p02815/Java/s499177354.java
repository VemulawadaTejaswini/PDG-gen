import java.io.*;
import java.util.*;

public class  gym{
	static long mod=(long)1e9+7;
	public static void main(String[] args) throws Exception{
		MScanner sc=new MScanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		int n=sc.nextInt();
		long[]power2=new long[n+1];
		power2[0]=1;
		for(int i=1;i<=n;i++)power2[i]=(power2[i-1]*2)%mod;
		Long[]in=sc.takearrlobj(n);
		Arrays.sort(in);
		long ans=0;
		for(int i=0;i<n;i++) {
			int after=n-i-1,before=i;;
			long inc=(power2[before]*power2[before])%mod;
			inc=(inc*power2[after+1])%mod;
			long inc2=power2[after];
			long inc3=after-1<0?0:(after*power2[after-1])%mod;
			long mul=(inc2+inc3)%mod;
			inc=(inc*mul)%mod;
			inc=(inc*in[i])%mod;
			ans=(ans+inc)%mod;
		}
		pw.println(ans);
		pw.flush();
	}
	static class MScanner {
		StringTokenizer st;
		BufferedReader br;
		public MScanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}
 
		public MScanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}
 
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public int[] takearr(int n) throws IOException {
	        int[]in=new int[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        return in;
		}
		public long[] takearrl(int n) throws IOException {
	        long[]in=new long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        return in;
		}
		public Integer[] takearrobj(int n) throws IOException {
	        Integer[]in=new Integer[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        return in;
		}
		public Long[] takearrlobj(int n) throws IOException {
	        Long[]in=new Long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        return in;
		}
		public String nextLine() throws IOException {
			return br.readLine();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
 
		public char nextChar() throws IOException {
			return next().charAt(0);
		}
 
		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public boolean ready() throws IOException {
			return br.ready();
		}
 
		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}
import java.io.*;
import java.util.*;

public class  gym{
	static long gcd(long a,long b) {
		return b==0?a:gcd(b,a%b);
	}
	static long lcm(long a,long b) {
		return (a/gcd(a,b))*b;
	}
	public static void main(String[] args) throws Exception{
		MScanner sc=new MScanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		int n=sc.nextInt(),m=sc.nextInt();
		int cnt2=0;
		int[]in=new int[n];
		for(int i=0;i<n;i++) {
			int x=sc.nextInt()/2;
			in[i]=x;
			int cnt=0;
			while(x%2==0) {
				x/=2;
				cnt++;
			}
			if(i==0)cnt2=cnt;
			else {
				if(cnt2!=cnt) {
					pw.println(0);
					pw.flush();
					return;
				}
			}
		}
		long lcm=1;
		for(int i=0;i<n;i++) {
			lcm=lcm(in[i],lcm);
			if(lcm>m) {
				pw.println(0);
				pw.flush();
				return;
			}
		}
		long cnt=m/lcm;
		pw.println((cnt+1)/2);
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
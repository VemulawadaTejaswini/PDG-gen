import java.io.*;
import java.util.*;
public class Main {
	static int[] d , c;
	public static void main(String[] args) throws Exception {
		MScanner sc=new MScanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		int h=sc.nextInt(),n=sc.nextInt();
		d=new int[n];
		c=new int[n];
		for(int i=0;i<n;i++) {
			d[i]=sc.nextInt();
			c[i]=sc.nextInt();
			
		}
		int[]costs=new int[h+1];
		Arrays.fill(costs, 1000000000);
		for(int i=0;i<=h;i++) {
			for(int j=0;j<n;j++) {
				costs[i]=Math.min(costs[i], c[j]*((i+d[j]-1)/d[j]));
				
				
			}
		}
		if(costs[h]!=1000000000) {
			pw.println(costs[h]);
			pw.flush();
			return;
		}
		int []memo=new int[h+1];
		Arrays.fill(memo, 1000000000);
		memo[0]=0;
		for(int he=1;he<=h;he++) {
			for(int j=1;j<=h;j++) {
				if(he-j<=0) {
					memo[he]=Math.min(memo[he], costs[j]);
				}
				else {
					memo[he]=Math.min(memo[he], costs[j]+memo[he-j]);
				}
			}
		}
		pw.println(memo[h]);
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

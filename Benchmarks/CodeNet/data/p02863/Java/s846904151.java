import java.io.*;
import java.util.*;

public class Main {
	static int[] memo[];
	static int n,T;
	static pair[]in;
	static int dp(int i,int t) {
		if(i>=n || t>=T)return 0;
		if(memo[i][t]!=-1)return memo[i][t];
		return memo[i][t]=Math.max(dp(i+1,t),dp(i+1,t+in[i].time)+in[i].hap);
	}
	static class pair implements Comparable<pair>{
		int time;int hap;
		pair(int x,int y){
			time=x;hap=y;
		}
		@Override
		public int compareTo(pair o) {
			return time-o.time;
		}
		 
		public boolean equals(pair o) {
			if(this.compareTo(o)==0)return true;
			return false;
		}
	}
	public static void main(String[] args) throws Exception {
		MScanner sc=new MScanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		n=sc.nextInt();
		T=sc.nextInt();
		in=new pair[n];
		for(int i=0;i<n;i++) {
			in[i]=new pair(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(in);
		memo=new int[n][T];
		for(int[]i:memo)Arrays.fill(i, -1);
		pw.println(dp(0,0));
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

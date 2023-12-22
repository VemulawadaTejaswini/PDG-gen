import java.io.*;
import java.util.*;

public class Main{
	static int[][][]memo;
	static int n,mod=(int)1e9+7;
	static int dp(int i,int nine,int zero) {
		if(i==n)return nine==1 && zero==1?1:0;
		if(memo[i][nine][zero]!=-1)return memo[i][nine][zero];
		int ans=(int)((dp(i+1, nine, zero)*8l)%mod);
		ans=(ans+dp(i+1, 1, zero))%mod;
		ans=(ans+dp(i+1, nine, 1))%mod;
		return memo[i][nine][zero]=ans;
	}
	static void main() throws Exception{
		n=sc.nextInt();
		memo=new int[n][2][2];
		for(int i=n-1;i>=0;i--) {
			for(int j=0;j<2;j++) {
				for(int k=0;k<2;k++) {
					memo[i][j][k]=-1;
				}
			}
		}
		for(int i=n-1;i>=0;i--) {
			for(int j=0;j<2;j++) {
				for(int k=0;k<2;k++) {
					dp(i, j, k);
				}
			}
		}
		pw.println(dp(0, 0, 0));
	}
	public static void main(String[] args) throws Exception{
		sc=new MScanner(System.in);
		pw = new PrintWriter(System.out);
		int tc=1;
//		tc=sc.nextInt();
		while(tc-->0)
			main();
		pw.flush();
	}
	static PrintWriter pw;
	static MScanner  sc;
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
		public int[] intArr(int n) throws IOException {
	        int[]in=new int[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        return in;
		}
		public long[] longArr(int n) throws IOException {
	        long[]in=new long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        return in;
		}
		public int[] intSortedArr(int n) throws IOException {
	        int[]in=new int[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        shuffle(in);
	        Arrays.sort(in);
	        return in;
		}
		public long[] longSortedArr(int n) throws IOException {
	        long[]in=new long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        shuffle(in);
	        Arrays.sort(in);
	        return in;
		}
		public Integer[] IntegerArr(int n) throws IOException {
	        Integer[]in=new Integer[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        return in;
		}
		public Long[] LongArr(int n) throws IOException {
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
 
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public boolean ready() throws IOException {
			return br.ready();
		}
 
		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
	static void shuffle(int[]in) {
		for(int i=0;i<in.length;i++) {
			int idx=(int)(Math.random()*(i+1));
			int tmp=in[i];
			in[i]=in[idx];
			in[idx]=tmp;
		}
	}
	static void shuffle(long[]in) {
		for(int i=0;i<in.length;i++) {
			int idx=(int)(Math.random()*(i+1));
			long tmp=in[i];
			in[i]=in[idx];
			in[idx]=tmp;
		}
	}
}
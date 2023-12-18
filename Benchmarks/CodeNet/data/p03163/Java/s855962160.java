import java.io.*;
import java.util.*;

public class Main {
	static int N;
	static int W;
	static int[] w;
	static int[] v;
	static long [][]dp;
	public static long dp(int i,int ww) {
		if(ww<0)return -(int)1e9;
		if(i==N)return 0;
		if(dp[i][ww]!=-1)return dp[i][ww];
		long take=v[i]+dp(i+1,ww-w[i]);
		long leave=dp(i+1,ww);
		return dp[i][ww]=Math.max(take, leave);
	}
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		N=sc.nextInt();
		W=sc.nextInt();
		w=new int[N];
		v=new int[N];
		for(int i=0;i<N;i++) {
			w[i]=sc.nextInt();
			v[i]=sc.nextInt();
		}
		dp=new long[N+1][W+1];
		for(long []x:dp) {
			Arrays.fill(x,-1);
		}
		
		pw.println(dp(0,W));
		pw.close();
	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public Scanner(String file) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public boolean ready() throws IOException {
			return br.ready();
		}
		public int[] nextArr(int n) throws IOException{
			int arr[]=new int[n];
			for(int i=0;i<n;i++)arr[i]=nextInt();
			return arr;
		}

	}
}
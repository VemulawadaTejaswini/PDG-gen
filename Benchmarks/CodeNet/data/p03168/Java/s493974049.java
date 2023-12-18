//package ;
import java.io.*;
import java.util.*;

public class Main {
	static double dp(int i,int take)
	{
		if(i==n)
			return (i-take > take) ?-1e9*1d:1;
		
		if(dp[i][take]!=-1)
			return dp[i][take];
		
		double takes=a[i]*dp(i+1,take+1);
		double leave=(1-a[i])*dp(i+1,take);
		if(leave > 0)
			takes+=leave;
		return dp[i][take]=takes;
	}
	static int n;
	static double[] a,dp[];
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter pw = new PrintWriter(System.out);
		n=sc.nextInt();
		a=sc.nextDoubleArray(n);
		dp=new double[n][n];
		for(int i=0;i<n;i++)
			Arrays.fill(dp[i], -1);
		System.out.println(dp(0,0));
		pw.close();
	}

	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		Scanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() throws IOException {
			while (st == null || !st.hasMoreTokens()) {
				st = new StringTokenizer(br.readLine());
			}
			return st.nextToken();
		}

		int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		String nextLine() throws IOException {
			return br.readLine();
		}

		boolean hasnext() throws IOException {
			return br.ready();
		}

		public int[] nextIntArray(int n) throws IOException {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public Integer[] nextIntegerArray(int n) throws IOException {
			Integer[] a = new Integer[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		char[] nextCharArray() throws IOException {
			return br.readLine().toCharArray();
		}

		public double[] nextDoubleArray(int n) throws IOException {
			double[] ans = new double[n];
			for (int i = 0; i < n; i++)
				ans[i] = nextDouble();
			return ans;
		}

	}
}

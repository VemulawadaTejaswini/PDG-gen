//package AtCoder;
import java.io.*;
import java.util.*;

public class Main {
	static int n,W,v[];
	static long w[],dp[][];
	static long dp(int i,int val)
	{
		if(val <= 0)
			return 0;
		
		if(i==n)
			return (int)1e18;
		
		if(dp[i][val]!=-1)
			return dp[i][val];
		
		long take=w[i]+dp(i+1,val-v[i]);
		long leave=dp(i+1,val);

		return dp[i][val]=Math.min(take, leave);
	}
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter pw = new PrintWriter(System.out);
		n=sc.nextInt();W=sc.nextInt();
		v=new int[n];// 0 for weight 1 for value
		w=new long[n];// 0 for weight 1 for value
		dp=new long[n][100001];
		for(int i=0;i<n;i++)
		{
			w[i]=sc.nextLong();
			v[i]=sc.nextInt();
			Arrays.fill(dp[i], -1);
		}
		for(int i=0;i<100001;i++)
			dp(0, i);
		
		for(int i=100000;i>=0;i--)
			if(dp[0][i]<=W && dp[0][i]>=0 )
			{
				System.out.println(i);
				break;
			}
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

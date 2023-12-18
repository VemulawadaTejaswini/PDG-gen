//package AtCoder;
import java.io.*;
import java.util.*;

public class Main {
	static int dp(int i)
	{
		if(dp[i]!=-1)
			return dp[i];
		
		int ans=0;
		for(int x:adjLists[i])
			ans=Math.max(dp(x)+1, ans);
		
		return dp[i]=ans;
	}
	static int n,m,dp[];
	static ArrayList<Integer>[]adjLists;
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter pw = new PrintWriter(System.out);
		n=sc.nextInt();m=sc.nextInt();
		adjLists=new ArrayList[n];
		dp=new int[n];
		for(int i=0;i<n;i++)
		{
			adjLists[i]=new ArrayList<>();
			dp[i]=-1;
		}
		while(m-->0)
			adjLists[sc.nextInt()-1].add(sc.nextInt()-1);
		int ans=0;
		for(int i=0;i<n;i++)
			ans=Math.max(ans, dp(i));
		System.out.println(ans);
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

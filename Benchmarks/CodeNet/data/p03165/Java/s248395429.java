//package AtCoder;
import java.io.*;
import java.util.*;

public class Main {
	static char[]s,t;
	static int dp[][];
	static int dp(int i,int j)
	{
		if(i == s.length || j == t.length)
			return 0;
		
		if(dp[i][j]!=-1)
			return dp[i][j];
		
		int take=-1;
		for(int k=j;k<t.length;k++)
			if(s[i]==t[k])
			{
				take=k;
				break;
			}
		if(take!=-1)
			take=1+dp(i+1,take+1);
		else 
			take=0;
		int leave = dp(i+1,j);
		return dp[i][j] = Math.max(leave, take);
	}
	static int dp(int i,int j,String s1)
	{
		if(i == s.length || j == t.length)
		{
			System.out.println(s1);
			return 0;
		}
		
		if(dp[i][j]!=-1)
			return dp[i][j];
		
		int take=-1;
		for(int k=j;k<t.length;k++)
			if(s[i]==t[k])
			{
				take=k;
				break;
			}
		if(take!=-1)
			take=1+dp(i+1,take+1,s1+s[i]);
		else 
			take=0;
		int leave = dp(i+1,j,s1);
		return dp[i][j] = Math.max(leave, take);
	}
	static void print(int i,int j)
	{
		if(i == s.length || j == t.length)
			return ;
		int ans=dp(i,j);
		int take=-1;
		int k;
		for(k=j;k<t.length;k++)
			if(s[i] == t[k])
			{
				take=k;
				break;
			}
		if(take!=-1)
			take=1+dp(i+1,k+1);

		if(take == ans )
		{
			sb.append(s[i]);
			print(i+1,k+1);
		}
		else
			print(i+1,j);
	}
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter pw = new PrintWriter(System.out);
		s=sc.nextCharArray();
		t=sc.nextCharArray();
		dp=new int[s.length][t.length];
		for(int i=0;i<s.length;i++)
			Arrays.fill(dp[i], -1);
		
		dp(0,0);
		print(0,0);
		System.out.println(sb);
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

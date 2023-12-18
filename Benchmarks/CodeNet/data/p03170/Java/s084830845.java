import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static class FastReader
	{
		BufferedReader br;
		StringTokenizer st;

		public FastReader()
		{
			br = new BufferedReader(new
					InputStreamReader(System.in));
		}

		String next()
		{
			while (st == null || !st.hasMoreElements())
			{
				try
				{
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException  e)
				{
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt()
		{
			return Integer.parseInt(next());
		}

		long nextLong()
		{
			return Long.parseLong(next());
		}

		double nextDouble()
		{
			return Double.parseDouble(next());
		}

		String nextLine()
		{
			String str = "";
			try
			{
				str = br.readLine();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			return str;
		}
	}
	public static boolean yikes(int a, int b, int c, int d) {
		if (a<0 || b<0 || c<0 || d<0) {
			return true; 
		}
		return false; 
	}
	public static boolean solve(int K) {
		if (K<0) {
			return true; 
		}
		else if (vis[K]) {
			return dp[K]; 
		}
		else {
			for (int i=0; i<a.length; i++) {
				if (!solve(K-a[i])) {
					vis[K] = true; 
					return dp[K] = true; 
				}
			}
			vis[K] = true; 
			return dp[K] = false; 
		}
	}
	public static int[] a; 
	public static boolean[] dp, vis; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader sc = new FastReader();
		int N = sc.nextInt(), K = sc.nextInt();
		a = new int[N]; 
		for (int i=0; i<N; i++) {
			a[i] = sc.nextInt();
		}
		dp = new boolean[K+10]; 
		vis = new boolean[K+10]; 
		if (solve(K)) {
			System.out.println("First");
		}
		else {
			System.out.println("Second");
		}
	}

}

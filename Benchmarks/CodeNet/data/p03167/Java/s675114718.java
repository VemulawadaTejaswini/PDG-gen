import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
	public static int H, W; 
	public static char[][] map; 
	public static long[][] dp; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader sc = new FastReader(); 
		H = sc.nextInt(); W = sc.nextInt();
		map = new char[H+10][W+10];
		dp = new long[H+10][W+10]; 
		for (int i=0; i<=H; i++) {
			Arrays.fill(dp[i], -1);
		}
		for (int i=0; i<H; i++) {
			map[i] = sc.next().toCharArray(); 
		}
		System.out.println(rc(0, 0)%1000000007);
	}
	public static long rc(int r, int c) {
		if (!isValid(r, c) || map[r][c]=='#') {
			return 0; 
		}
		if (dp[r][c]!=-1) {
			return dp[r][c]; 
		}
		else if (r==H-1 && c==W-1){
			return 1; 
		}
		else {
			
			return dp[r][c] = rc(r+1, c) + rc(r, c+1); 
		}

	}
	public static boolean isValid(int r, int c) {
		if (r>=0 && r<H && c>=0 && c<W) {
			return true; 
		}
		return false; 
	}

}

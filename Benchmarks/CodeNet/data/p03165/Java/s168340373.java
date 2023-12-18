import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
	public static String str1, str2; 
	public static String[][] dp; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader sc = new FastReader();
		str1 = sc.next(); str2 = sc.next(); 
		dp = new String[str1.length()+10][str2.length()+10];
		for (int i=0; i<=str1.length(); i++) {
			for (int j=0; j<=str2.length(); j++) {
				if (i==0 || j==0) {
					dp[i][j] = ""; 
				}
				else {
					if (str1.charAt(i-1)==str2.charAt(j-1)) {
						dp[i][j] = dp[i-1][j-1] + str1.charAt(i-1); 
					}
					else {
						dp[i][j] = dp[i-1][j].length() > dp[i][j-1].length() ? dp[i-1][j] : dp[i][j-1]; 
 					}
				}
			}
		}
		System.out.println(dp[str1.length()][str2.length()].length()==0 ? " " : dp[str1.length()][str2.length()]);
	}
	//	public static String rc(int index1, int index2) {
	//		//		System.out.println(index1 +" "+index2);
	//		if (memo[index1][index2]!=null) {
	//			return memo[index1][index2]; 
	//		}
	//		else if (index1==0 || index2==0) {
	//			return memo[index1][index2]= ""; 
	//		}
	//
	//		else if (str1.charAt(index1-1)==str2.charAt(index2-1)) {
	//			return memo[index1][index2] = rc(index1-1, index2-1) + str1.charAt(index1-1); 
	//		}
	//
	//		return memo[index1][index2] = rc(index1-1, index2).length()> rc(index1, index2-1).length() ? 
	//				rc(index1-1, index2) : rc(index1, index2-1)	;
	//
	//	}

}

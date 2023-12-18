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
	public static String A, B; 
	public static int[][] memo; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader sc = new FastReader();
		A = sc.next(); B = sc.next(); 
		memo = new int[A.length()+1][B.length()+1]; 

		for (int i=0; i<=A.length(); i++) {
			Arrays.fill(memo[i], -1);
		}
		longest(A.length(), B.length());
//		System.out.println(memo[A.length()][B.length()]);
		int index = memo[A.length()][B.length()]; 
		int temp = index; 

		char[] lcs = new char[index+1]; 
		int i = A.length(), j = B.length(); 
		while (i > 0 && j > 0) { 
			if (A.charAt(i-1) == B.charAt(j-1)) { 
				lcs[index-1] = A.charAt(i-1);  
				i--;  
				j--;  
				index--;      
			} 

			else if (memo[i-1][j] > memo[i][j-1]) {
				i--; 
			}
			else {
				j--; 
			}
		} 
		for(int k=0;k<=temp;k++) {
			System.out.print(lcs[k]); 
		}
	}

	//	public static void backtrack(int index1, int index2) {
	//		if (index1==0 || index2==0) {
	//			return; 
	//		}
	//		if (memo[index1][index2]==memo[index1-1][index2]) {
	//			backtrack(index1-1, index2); 
	//		}
	//		else if (memo[index1][index2]==memo[index1][index2-1]) {
	//			backtrack(index1, index2-1); 
	//		}
	//		else {
	//			System.out.print(A.charAt(index1));
	//			backtrack(index1-1, index2-1); 
	//		}
	//	}
	public static int longest(int index1, int index2) {
		if (memo[index1][index2]!=-1) {
			return memo[index1][index2]; 
		}
		else if (index1==0 || index2==0) {
			return memo[index1][index2]= 0; 

		}
		else if (A.charAt(index1-1)==B.charAt(index2-1)) {
			return memo[index1][index2] = 1+ longest(index1-1, index2-1); 
		}
		else {
			return memo[index1][index2] = Math.max(longest(index1-1, index2), longest(index1, index2-1));
		}
	}

}
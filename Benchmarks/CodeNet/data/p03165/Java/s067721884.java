
import java.io.*; 
import java.util.*;

class Main
{ 
	static char []  X , Y;
	static String solve(int m, int n) 
	{ 
		int[][] dp = new int[m+1][n+1]; 


		for (int i=1; i<=m; i++) { 
			for (int j=1; j<=n; j++) { 
				if (X[i-1] == Y[j-1]) 
					dp[i][j] = dp[i-1][j-1] + 1; 
				else
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]); 
			} 
		} 


		int index = dp[m][n]; 
		int temp = index; 


		char[] lcs = new char[index+1]; 
		lcs[index] = '\u0000'; 

		int i = m; 
		int j = n; 
		StringBuilder sb = new StringBuilder();
		while (dp[i][j] > 0) 
		{ 

			if (X[i-1] == Y[j-1]) 
			{ 
	
				sb.append(X[i-1]);
				
				i--; 
				j--; 
				index--;	 
			} 


			else if (dp[i-1][j] > dp[i][j-1]) 
				i--; 
			else
				j--; 
		} 
//
//		for(int k=0;k<temp;k++) 
//			sb.append(lcs[k]);
		return sb.reverse().toString();
	} 
	
	public static void main (String[] args) throws IOException 
	{ 
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		 X = sc.next().toCharArray();
		 Y = sc.next().toCharArray();
		int m = X.length; 
		int n = Y.length; 
		String s = solve(m,n);
		pw.println(s);
		pw.close();
	} 
	
} 
class Scanner {
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
	public int[] nextIntArr(int length) throws IOException{
		int[] arr = new int[length];
		for(int i = 0 ; i < length ; i++)
			arr[i] = Integer.parseInt(next());
		return arr;
	}
	public boolean ready() throws IOException {
		return br.ready();
	}
 }



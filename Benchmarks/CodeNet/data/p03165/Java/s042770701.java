
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		out=new PrintWriter (new BufferedOutputStream(System.out));
		FastReader s=new FastReader();
		String first=s.next();
		String second=s.next();
		int[][] dp=new int[first.length()+1][second.length()+1];
		for(int i=1;i<=first.length();i++) {
			for(int j=1;j<=second.length();j++) {
				if(first.charAt(i-1)==second.charAt(j-1)) {
					dp[i][j]=1+dp[i-1][j-1];
				}else {
					dp[i][j]=Integer.max(dp[i-1][j],dp[i][j-1]);
				}
			}
		}
		StringBuilder ans=new StringBuilder();
		for(int i=first.length(),j=second.length();i>=1 && j>=1 ;i--,j--) {
			if(dp[i][j]==dp[i-1][j]) {
				j++;
			}else if(dp[i][j]==dp[i][j-1]) {
				i++;
			}else if(dp[i][j]==1+dp[i-1][j-1]) {
				ans.append(first.charAt(i-1));
			}
		}
		out.println(reverse(ans.toString()));
		out.close();
	}	

	public static String reverse(String str) {
		StringBuilder ans=new StringBuilder();
		for(int i=str.length()-1;i>=0;i--) {
			ans.append(str.charAt(i));
		}
		return ans.toString();
	}
	
	public static PrintWriter out;
	
	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;
		//it reads the data about the specified point and divide the data about it ,it is quite fast
		//than using direct 

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());//converts string to integer
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return str;
		}
	}
	
}

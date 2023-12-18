import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		long mod=(long)1e9+7;
		int n = sc.nextInt(),m=sc.nextInt();
		char arr[][]=new char[n][m];
		for(int i=0;i<n;i++) arr[i]=sc.next().toCharArray();
		long [][]dp=new long [n][m];
		dp[0][0]=1L;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr[i][j]=='#')arr[i][j]=0;
				else {
					if(i==0&&j!=0)dp[i][j]=dp[i][j-1];
					else if(i!=0&&j==0)dp[i][j]=dp[i-1][j];
					else if(i==0&&j==0)continue;
					else dp[i][j]=(dp[i-1][j]%mod+dp[i][j-1]%mod)%mod;
				}
			}
		}
		pw.println(dp[n-1][m-1]);
		pw.close();		
	}

	static class Scanner {
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

		public boolean ready() throws IOException {
			return br.ready();
		}
		public int[] nextArr(int n) throws IOException{
			int arr[]=new int[n];
			for(int i=0;i<n;i++)arr[i]=nextInt();
			return arr;
		}

	}
}

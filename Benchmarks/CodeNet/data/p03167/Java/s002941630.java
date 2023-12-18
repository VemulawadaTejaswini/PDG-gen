
import java.io.*;
import java.util.*;

public class Main{

	static int MOD=(int)1e9+7;
	static PrintWriter out=new PrintWriter(System.out);;
	static int [][]memo;
	static int n,m;
	static char [][]grid;
	static boolean valid(int i,int j) {
		return i>=0 && i<n && j>=0 && j<m && grid[i][j]=='.';
	}
	static int dp(int i,int j) {
		if(!valid(i,j))
			return 0;
		if(i==n-1 && j==m-1)
			return 1;
		if(memo[i][j]!=-1)
			return memo[i][j];
		int ans=dp(i+1,j)+dp(i,j+1);
		if(ans>=MOD)
			ans-=MOD;
		return memo[i][j]=ans;
		
	}
	
		
		
	
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner();
		
		n=sc.nextInt();
		m=sc.nextInt();
		grid=new char[n][m];
		memo=new int [n][m];
		for(int i=0;i<n;i++)
			grid[i]=sc.next().toCharArray();
		for(int []a:memo)
			Arrays.fill(a, -1);
		out.println(dp(0,0));
		
		out.close();

	}
	static class Scanner
	{
		BufferedReader br;
		StringTokenizer st;
		Scanner(){
			br=new BufferedReader(new InputStreamReader(System.in));
		}
		Scanner(String fileName) throws FileNotFoundException{
			br=new BufferedReader(new FileReader(fileName));
		}
		String next() throws IOException {
			while(st==null || !st.hasMoreTokens())
				st=new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		String nextLine() throws IOException {
			return br.readLine();
		}
		int nextInt() throws IOException{
			return Integer.parseInt(next());
		}
		long nextLong()  throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}
		double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}
	}
}

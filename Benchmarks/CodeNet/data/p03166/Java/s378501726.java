
import java.io.*;
import java.util.*;

public class Main{

	static ArrayList<Integer> []adj;
	static int []dp;
	static int dp(int u) {
		if(dp[u]!=-1)
			return dp[u];
		int ans=0;
		for(int v:adj[u])
			ans=Math.max(ans, 1+dp(v));
		return dp[u]=ans;
		
	}
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner();
		PrintWriter out=new PrintWriter(System.out);
		int n=sc.nextInt(),m=sc.nextInt();
		adj=new ArrayList[n];
		dp=new int [n];
		for(int i=0;i<n;i++) {
			dp[i]=-1;
			adj[i]=new ArrayList<>();
		}
		while(m-->0) {
			int u=sc.nextInt()-1,v=sc.nextInt()-1;
			adj[u].add(v);
		}
		int ans=0;
		for(int i=0;i<n;i++)
			ans=Math.max(ans, dp(i));
		out.println(ans);
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

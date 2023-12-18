
import java.io.*;
import java.util.*;

public class Main{

	static int MOD=(int)1e9+7;
	static PrintWriter out=new PrintWriter(System.out);;
	static long [][]memo;
	static int n;
	static int [][]a;
	
	static long dp(int idx,int t) {
		if(idx==n)
			return 0;
		if(memo[t][idx]!=-1)
			return memo[t][idx];
		long ans=0;
		for(int t2=0;t2<3;t2++)
			if(t2!=t)
				ans=Math.max(ans, dp(idx+1,t2)+a[t2][idx]);
		return memo[t][idx]=ans;
		
	}
	
		
		
	
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner();
		
		n=sc.nextInt();
		a=new int [3][n];
		memo=new long [5][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<3;j++)
				a[j][i]=sc.nextInt();
			
		}
		for(long []a:memo)
			Arrays.fill(a, -1);
		out.println(dp(0,3));
		
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

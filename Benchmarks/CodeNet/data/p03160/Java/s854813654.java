
import java.io.*;
import java.util.*;

public class Main{
	static int INF=(int)1e9;

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner();
		PrintWriter out=new PrintWriter(System.out);
		int n=sc.nextInt();
		int []h=new int [n];
		for(int i=0;i<n;i++)
			h[i]=sc.nextInt();
		int K=2;
		int []dp=new int [n];
		Arrays.fill(dp, INF);
		dp[n-1]=0;
		for(int i=n-2;i>=0;i--) {
			for(int j=1;j<=K && i+j<n;j++) {
				
				dp[i]=Math.min(dp[i], dp[i+j]+Math.abs(h[i]-h[i+j]));
				}
//			out.println(dp[i]);
		}
		
		out.println(dp[0]);
		
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

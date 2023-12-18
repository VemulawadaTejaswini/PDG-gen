import java.io.*;
import java.util.*;

public class Main {

	static long INF=(long)1e18;;
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		int n=sc.nextInt(),W=sc.nextInt();
		long [][]dp=new long [n+1][100001]; // dp[i][v] = min w such that I can get value v from items of weight w after consider the first i items
		for(long []x:dp)
			Arrays.fill(x, INF);
		dp[0][0]=0;
		for(int i=1;i<=n;i++) {
			int w=sc.nextInt(),v=sc.nextInt();
			for(int oldVal=0;oldVal<dp[0].length;oldVal++)
				if(dp[i-1][oldVal]!=INF)
				{
					dp[i][oldVal]=Math.min(dp[i][oldVal],dp[i-1][oldVal]); //leave
					int newVal=oldVal+v;
					
					dp[i][newVal]=Math.min(dp[i][newVal], dp[i-1][oldVal]+w); // take
				}
			
			
		}
		int ans=0;
		for(int v=0;v<dp[0].length;v++)
			if(dp[n][v]<=W)
				ans=v;
		out.println(ans);
		out.close();

	}

	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		Scanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		Scanner(String fileName) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(fileName));
		}

		String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		String nextLine() throws IOException {
			return br.readLine();
		}

		int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}

	}
}

import java.io.*;
import java.util.*;

public class Main{

	
	static int MOD=(int)1e9+7;
	
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner();
		PrintWriter out=new PrintWriter(System.out);
		int n=sc.nextInt(),W=sc.nextInt();
		int []w=new int [n],v=new int [n];
		
		for(int i=0;i<n;i++) {
			w[i]=sc.nextInt();
			v[i]=sc.nextInt();
			
		}
		int N=10005;
		int []dp=new int [N];
		Arrays.fill(dp, W+10);
		dp[0]=0;
		for(int idx=0;idx<n;idx++) {
			for(int value=N-v[idx]-1;value>=0;value--) {
				dp[value+v[idx]]=Math.min(dp[value+v[idx]], dp[value]+w[idx]);
			}
		}
		int ans=0;
		for(int value=0;value<N;value++)
			if(dp[value]<=W)
				ans=value;
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

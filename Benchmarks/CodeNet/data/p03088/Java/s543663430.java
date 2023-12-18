import java.io.*;
import java.util.*;

public class Main{

	static int [][][][]memo;
	static int MOD=(int)1e9+7,n;
	
	static boolean ok(int x1,int x2,int x3,int x4) {
		if(x1==0 && x2==1 && x3==2)
			return false;
		if(x2==0 && x3==1 && x4==2)
			return false;
		return true;
	}
	static int dp(int idx,int x1,int x2,int x3) {
		if(idx==n)
			return 1;
		if(memo[x1][x2][x3][idx]!=0)
			return memo[x1][x2][x3][idx];
		int ans=0;
		for(int nxt=0;nxt<=3;nxt++) {
			if(!ok(x1,x2,x3,nxt))
				continue;
			if(!ok(x1,x2,nxt,x3))
				continue;
			if(!ok(x1,x3,x2,nxt))
				continue;
			if(!ok(x2,x1,x3,nxt))
				continue;
			ans+=dp(idx+1, x2, x3, nxt);
			ans%=MOD;
		}
		return memo[x1][x2][x3][idx]=ans;
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner();
		PrintWriter out=new PrintWriter(System.out);
		n=sc.nextInt();
		memo=new int [5][5][5][n];
		out.println(dp(0, 4, 4,4));
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

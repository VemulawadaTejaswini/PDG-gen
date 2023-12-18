import java.io.*;
import java.util.*;

public class  Main{
	static int mod=(int)1e9+7;
	static char[]s;
	static long[][]memo;
	static long dp(int i,int small) {
		if(i==s.length)return 1;
		if(memo[i][small]!=-1)return memo[i][small];
		if(small==0) {
			if(s[i]=='0') {
				return memo[i][small]=dp(i+1,0);
			}
			return memo[i][small]=(2*dp(i+1,0)+dp(i+1,1))%mod;
		}
		return memo[i][small]=(2*dp(i+1,1)+dp(i+1,1))%mod;
	}
    public static void main(String[] args) throws Exception{
        //MScanner sc = new MScanner("chess.in");
        MScanner sc = new MScanner(System.in);
        PrintWriter pw=new PrintWriter(System.out);
        s=sc.nextLine().toCharArray();
        memo=new long[s.length][2];
        for(long[]i:memo)Arrays.fill(i,-1);
        pw.println(dp(0,0));
        pw.flush();
    }
    static class MScanner {
		StringTokenizer st;
		BufferedReader br;
 
		public MScanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}
 
		public MScanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}
 
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
 
		public String nextLine() throws IOException {
			return br.readLine();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
 
		public char nextChar() throws IOException {
			return next().charAt(0);
		}
 
		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public boolean ready() throws IOException {
			return br.ready();
		}
 
		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}
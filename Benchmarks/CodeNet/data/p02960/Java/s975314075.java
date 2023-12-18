import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;
 
public class Main {
	static long[][]memo;
	static int n;
	static long mod=(long)1e9+7;
	static long dp(int i,int num) {
		if(i<0) {
			if(num==5)return 1;
			return 0;
		}
		if(memo[i][num]!=-1)return memo[i][num];
		int po=pow[n-i-1];
		if(in[i]=='?') {
			long ans=0;
			for(int j=0;j<=9;j++) {
				ans=(ans+dp(i-1,(num+j*po)%13))%mod;
			}
			return memo[i][num]=ans;
		}
		int x=(in[i]-'0');
		//System.out.println(x+" "+po+" "+in[i]);
		return memo[i][num]=dp(i-1,(num+x*po)%13)%mod;
	}
	static int[]pow;
	static char[]in;
	public static void main(String[] args) throws IOException {
		MScanner sc = new MScanner(System.in);
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(System.out);
		pow=new int[100001];
		int base=1;pow[0]=1;
		for(int i=1;i<pow.length;i++) {
			pow[i]=(pow[i-1]*10)%13;
		}
		in=sc.nextLine().toCharArray();
		n=in.length;
		memo=new long[n][13];
		for(long i[]:memo)Arrays.fill(i,-1);
		pw.println(dp(n-1,0));
		pw.close();
		pw.flush();
 
	}
	static int gcd(int a, int b) {

		if (b == 0)
			return a;
		return gcd(b, a % b);
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
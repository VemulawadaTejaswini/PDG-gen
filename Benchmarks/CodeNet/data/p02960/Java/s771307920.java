import java.io.*;
import java.util.*;

public class Main {

	static int []powMod,memo[];
	static int getMod(int mod,int add,int pow) {
		long x=add*1L*powMod[pow]%13;
		return (int) ((x+mod)%13);
	}
	static int MOD=(int)1e9+7;
	static char[]s;
	static int dp(int idx,int mod,int pow) {
		if(idx==s.length)
			return mod==5?1:0;
		if(memo[mod][idx]!=-1)
			return memo[mod][idx];
		long ans=0;
		if(s[idx]!='?')
			ans=dp(idx+1,getMod(mod, s[idx]-'0',pow),pow-1);
		else
			for(int add=0;add<10;add++) {
				ans+=dp(idx+1,getMod(mod, add,pow),pow-1);
				ans%=MOD;
			}
		return memo[mod][idx]=(int)ans;
	}
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		s=sc.next().toCharArray();
		long x=1;
		powMod=new int [s.length+5];
		powMod[0]=1;
		for(int i=1;i<powMod.length;i++) {
			x=x*10L%13;
			powMod[i]=(int)x;
		}
		memo=new int [13][s.length];
		for(int []a:memo)
			Arrays.fill(a, -1);
		out.println(dp(0, 0,s.length-1));
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

		boolean ready() throws IOException {
			return br.ready();
		}

	}

}
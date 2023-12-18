import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static Scanner sc;
	static PrintWriter out;
	static char grid[][];
	static int h,w;
	static int memo[][];
	static final int uncal = -1,mod = 1_000_000_009;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		h = sc.nextInt();
		w = sc.nextInt();
		grid = new char[h][w];
		memo = new int[h][w];
		clear();
		for (int i = 0; i < h; i++) {
			grid[i] = sc.nextLine().toCharArray();
		}
		out.println(dp(0, 0));
		out.flush();
		out.close();
	}
	static void clear() {
		for(int[]a:memo){
			Arrays.fill(a, uncal);
		}
	}
	static int dp(int i,int j) {
		if(i+1 == h && j+1 == w) return 1;
		if(memo[i][j] != uncal)
			return memo[i][j];
		int right = 0,down =0;
		if(j+1<w && grid[i][j+1]=='.')
			right = dp(i, j+1);
		if(i+1<h && grid[i+1][j]=='.')
			down = dp(i+1, j);
		return memo[i][j] = add(right, down);
	}
	static int add(int a,int b) {
		int c = a+b;
		if(c>=mod)
			c%=mod;
		return c;
	}
	static class Scanner{
		BufferedReader br;
		StringTokenizer st;
		public Scanner(InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
		}
		private String next() throws Exception{
			while(st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public int nextInt() throws Exception{
			return Integer.parseInt(next());
		}
		public long nextLong() throws Exception{
			return Long.parseLong(next());
		}
		public double nextDouble() throws Exception{
			return Double.parseDouble(next());
		}
		public String nextLine() throws Exception {
			return br.readLine();
		}

	}
}

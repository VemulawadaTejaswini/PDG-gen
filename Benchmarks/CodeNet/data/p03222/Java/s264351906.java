import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}
	
	long dp[][];
	
	long[] fib;
	
	long mod = 1000000007;
			  

	public void solve() throws IOException {
		
		FastScanner fs = new FastScanner();
		int h = fs.nextInt();
		int w = fs.nextInt();
		int k = fs.nextInt();
		
		dp = new long[h+1][w];
		fib = new long[10];
		dp[0][0] = 1;
		for(int i = 1; i < w; i++) {
			dp[0][i] = 0;
		}
		
		for(int i = 1; i <= h; i++) {
			for(int j = 0; j < w-1; j++) {
				// j -> j+1(j+1 -> j)の個数を数える.
				int left = Math.max(0, j - 1);
				int right = Math.max(0, w- (j+1) - 2);
				
				long numOfEdge = fib(left+1) * fib(right+1);
//				System.out.println(numOfEdge);
				
				dp[i][j+1] = (dp[i][j+1] + (dp[i-1][j] * numOfEdge)) % mod;
				dp[i][j] = (dp[i][j] + (dp[i-1][j+1] * numOfEdge)) % mod;
			}
			for(int j = 0; j < w; j++) {
				// j->j+1, j -> j-1に棒がないパターン
				int left = Math.max(0, j-1);
				int right = Math.max(0, w-1-j-1);
				
				long numOfEdge = fib(left+1) * fib(right+1);
				dp[i][j] = (dp[i][j] + (dp[i-1][j]*numOfEdge)) % mod;
			}
		}
//		System.out.println(Arrays.toString(fib));
		System.out.println(dp[h][k-1]);
	}
	
	long fib(int n) {
		if(fib[n] > 0) {
			return fib[n];
		}
		if(n == 0) {
			fib[0] = 1;
			return 1;
		}
		
		if(n == 1) {
			fib[1] = 1;
			return 1;
		}
		
		fib[n] = fib(n-1)+fib(n-2);
		return fib[n];
	}
	
	

	

	public class FastScanner {

		BufferedReader reader;
		private StringTokenizer st;

		public FastScanner() {
			st = null;
			reader = new BufferedReader(new InputStreamReader(System.in));
		}

		public String next() throws IOException {
			if (st == null || !st.hasMoreElements()) {
				st = new StringTokenizer(reader.readLine());
			}
			return st.nextToken();
		}

		public String nextLine() throws IOException {
			st = null;
			String readLine = null;
			readLine = reader.readLine();
			return readLine;
		}

		public int nextInt() throws NumberFormatException, IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		public int[] nextIntArr(int n) throws NumberFormatException, IOException {
			int[] retArr = new int[n];
			for (int i = 0; i < n; i++) {
				retArr[i] = nextInt();
			}
			return retArr;
		}

		public long[] nextLongArr(int n) throws NumberFormatException, IOException {
			long[] retArr = new long[n];
			for (int i = 0; i < n; i++) {
				retArr[i] = nextLong();
			}
			return retArr;
		}

		public void close() throws IOException {
			reader.close();
		}
	}


}

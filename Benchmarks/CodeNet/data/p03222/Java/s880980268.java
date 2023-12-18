import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	
	long mod = 1_000_000_007;

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		
		int h = fs.nextInt();
		int w = fs.nextInt();
		int k = fs.nextInt();
		
		if(w == 1) {
			System.out.println(1);
			return;
		}
		
		long[][] dp = new long[h+1][w];
		dp[0][0] = 1;
		
		for(int i = 1; i <= h; i++) {
			
			for(int j = 0; j < pow(2,w-1); j++) {
				
				int[] yokosen = new int[w-1];
				for(int l = 0; l < w-1; l++) {
					int bit = 1 << l;
					if((j & bit) > 0) {
						yokosen[l] = 1;
					}
				}
				
				boolean valid = true;
				for(int l = 1; l < w-1; l++) {
					if(yokosen[l-1] == 1 && yokosen[l] == 1) {
						valid = false;
						break;
					}
				}
				
				if(!valid) {
					continue;
				}
				
				
				for(int l = 0; l < w-1;l++) {
					if(yokosen[l] == 1) {
						dp[i][l] = (dp[i][l] + dp[i-1][l+1])%mod;
						dp[i][l+1] = (dp[i][l+1] + dp[i-1][l])%mod;
					}else {
						
						
						if(l == 0) {
							dp[i][l] = (dp[i][l] + dp[i-1][l])% mod;
						}
						if(l == w-2) {
							dp[i][l+1] = (dp[i][l+1] + dp[i-1][l+1])%mod;
						}
						if(l != 0 && yokosen[l-1] == 0){
							dp[i][l] = (dp[i][l] + dp[i-1][l])% mod;
						}
					}
				}
			}
		}
		
		System.out.println(dp[h][k-1]);
	}

	
	public int pow(int base, int n) {
		int retVal = 1;
		while (n > 0) {
			if ((n & 1) == 1) {
				retVal *= base;
			}
			n >>= 1;
			base *= base;
		}
		return retVal;
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

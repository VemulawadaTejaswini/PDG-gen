import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		
		int n = fs.nextInt();
		
		int[] aArr = fs.nextIntArr(n);
		
		Status[][] dp = new Status[n+1][2];
		
		dp[0][0] = new Status(0, 1000);
		dp[0][1] = null;
		for(int i = 1; i <= n; i++) {
			
			int nowKabuka = aArr[i-1];
			// 売る判定
			int maxKane = 0;
			for(int j = 0; j < i; j++) {
				if(dp[j][1] != null) {
					if(dp[j][1].kabu * nowKabuka + dp[j][1].kane > maxKane) {
						maxKane = dp[j][1].kabu * nowKabuka + dp[j][1].kane;
					}
				}
			}
			if(maxKane > 0) {
				dp[i][0] = new Status(0, maxKane);
			}else {
				dp[i][0] = null;
			}
			
			// 買う判定
			maxKane = 0;
			for(int j = 0; j < i; j++) {
				if(dp[j][0] != null) {
					if(dp[j][0].kane > maxKane) {
						maxKane = dp[j][0].kane;
					}
				}
			}
			if(maxKane > 0) {
				int buyKabu = maxKane/nowKabuka;
				int rest = maxKane - buyKabu * nowKabuka;
				dp[i][1] = new Status(buyKabu,rest);
			}else {
				dp[i][1] = null;
			}
		}
		
		
		int ans = 0;
		for(int i = 0; i < n+1; i++) {
			if(dp[i][0] != null) {
				ans = Math.max(ans, dp[i][0].kane);
			}
		}
		
		System.out.println(ans);
	}

	class Status {
		int kabu;
		int kane;
		
		Status(int kabu, int kane){
			this.kabu = kabu;
			this.kane = kane;
		}
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

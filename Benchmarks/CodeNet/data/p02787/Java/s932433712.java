import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	int inf = 1_000_000_007;

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		
		int h = fs.nextInt();
		int n = fs.nextInt();
		
		int[] dp = new int[h+1];
		
		for(int i = 1; i <= h; i++) {
			dp[i] = inf;
		}
		Magic[] magicArr = new Magic[n];
		for(int i = 0; i < n; i++) {
			int atk = fs.nextInt();
			int cost = fs.nextInt();
			magicArr[i] = new Magic(atk,cost);
		}
		
		for(int i = 1; i <= h; i++) {
			for(Magic magic : magicArr) {
				int atk = magic.atk;
				int cost = magic.cost;
				
				if(atk > i) {
					dp[i] = Math.min(cost, dp[i]);
				}else {
					dp[i] = Math.min(cost + dp[i-atk], dp[i]);
				}
			}
		}
		
		System.out.println(dp[h]);
	}
	
	class Magic {
		int atk;
		int cost;
		
		Magic(int atk, int cost){
			this.atk = atk;
			this.cost = cost;
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

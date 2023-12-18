import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		int n = fs.nextInt();
		int m = fs.nextInt();
		
		HashMap<Integer, Integer> modMMap = new HashMap<>();
		long ans = 0;
		long cumulative = 0;
		for(int i = 1; i <= n; i++) {
			long nextLong = fs.nextLong();
			cumulative = cumulative + nextLong;
			int modM = (int)(cumulative%m);
			
//			System.out.println(modM);
			
			if(modM == 0) {
				ans++;
			}
			
//			int zeroSum = (m - modM)%m;
			if(modMMap.containsKey(modM)) {
				ans += modMMap.get(modM);
			}
			
			if(modMMap.containsKey(modM)) {
				int numOfModM = modMMap.get(modM);
				modMMap.put(modM, numOfModM+1);
			}else {
				modMMap.put(modM, 1);
			}
		}
		
//		System.out.println(modMMap);
		
		System.out.println(ans);
		
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

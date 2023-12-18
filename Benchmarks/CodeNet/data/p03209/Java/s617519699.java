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
		long x = fs.nextLong();
		
		long[] heightArr = new long[51];
		long[] pArr = new long[51];
		long[] bArr = new long[51];
		
		heightArr[0] = 1;
		pArr[0] = 1;
		
		for(int i = 1; i < 51; i++) {
			heightArr[i] = 3 + 2 * heightArr[i-1];
			pArr[i] = 1 + 2 * pArr[i-1];
			bArr[i] = 2 + 2 * bArr[i-1];
		}
		
		
		int nowIndex = n;
		long eatenP = 0;
		while(x > 0) {
			
			if(x < heightArr[nowIndex]) {
				// panを食う
				x--;
				nowIndex--;
			}else if(x > heightArr[nowIndex]) {
				
				x -= heightArr[nowIndex];
				// 間のpatyも食う
				x--;
				eatenP += pArr[nowIndex];
				eatenP++;
			}else if(x == heightArr[nowIndex]) {
				x = 0;
				eatenP += pArr[nowIndex];
			}
		}
		
		System.out.println(eatenP);
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

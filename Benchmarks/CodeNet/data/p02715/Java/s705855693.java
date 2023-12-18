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
		int n = fs.nextInt();
		int k = fs.nextInt();
		
		long[] numGcdArr = new long[k+1];
		
		for(int i = k ; i >= 1; i--) {
			long numOfI = k/i;
			long gcdINum = pow(numOfI, (long)n);
			
			int mulIGcdBase = 2;
			while(i * mulIGcdBase <= k) {
				gcdINum = calcMod(gcdINum + calcMod((-1)*numGcdArr[i * mulIGcdBase]));
				mulIGcdBase++;
			}
			numGcdArr[i] = gcdINum;
		}
		
		long ans = 0;
		for(int i = 1; i <= k; i++) {
			ans = calcMod(ans + i*numGcdArr[i]);
		}
		
		System.out.println(ans);
	}
	
	long pow(long base, long n) {
		long retVal = 1;
		while(n > 0) {
			if((n&1) == 1) {
				retVal *= base;
			}
			n >>= 1;
			base *= base;
			base = base % mod;
			retVal = retVal % mod;
		}
		return retVal;
	}

	long calcMod(long base) {
		if(base >= 0) {
			return base % mod;
		}else {
			while(base < 0) {
				base += mod;
			}
			return base;
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

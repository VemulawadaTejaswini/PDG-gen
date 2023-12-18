import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}
	
	long[] hamburgerHeightArr;
	long[] pattyHeightArr;

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		int n = fs.nextInt();
		long x = fs.nextLong();
		
		hamburgerHeightArr = new long[n+1];
		pattyHeightArr = new long[n+1];
		hamburgerHeightArr[0] = 1;
		pattyHeightArr[0] = 1;
		for(int i = 1; i < n+1; i++){
			hamburgerHeightArr[i] = 3 + 2*hamburgerHeightArr[i-1];
			pattyHeightArr[i] = 1+ 2* pattyHeightArr[i-1];
		}
		
		System.out.println(calcPattyNum(n,x));
	}
	
	
	long calcPattyNum(int hamburgerHeight, long x){
		
		if(hamburgerHeight == 0){
			if(x == 0){
				return 0;
			}else{
				return 1;
			}
		}
		
		if(x == 1){
			return 0;
		}
		
		if(x <= hamburgerHeightArr[hamburgerHeight-1]+1){
			return calcPattyNum(hamburgerHeight-1, x-1);
		}
		
//		if(x == hamburgerHeightArr[hamburgerHeight-1]+1){
//			return pattyHeightArr[hamburgerHeight-1];
//		}
		
		if(x == hamburgerHeightArr[hamburgerHeight-1]+2){
			return pattyHeightArr[hamburgerHeight-1]+1;
		}
		
		if(x <= hamburgerHeightArr[hamburgerHeight] - 1){
			return pattyHeightArr[hamburgerHeight-1] + 1 + calcPattyNum(hamburgerHeight-1 , x-2-hamburgerHeightArr[hamburgerHeight-1]); 
		}
		
		return pattyHeightArr[hamburgerHeight];
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

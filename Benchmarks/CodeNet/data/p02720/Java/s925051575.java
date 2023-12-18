import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	int[] oneDigitArr = {1,2,3,4,5,6,7,8,9};
	
	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		int k = fs.nextInt();
		if(k <= 9){
			System.out.println(oneDigitArr[k-1]);
			return;
		}
		
		TreeSet<Long> lunlunTree = new TreeSet<>();
		for(int i = 0; i < 9; i++){
			lunlunTree.add(new Long(oneDigitArr[i]));
		}
		
		
		int lunlunSize = 9;
		
		while(lunlunSize < k){
			
			long firstElm = lunlunTree.first();
			lunlunTree.remove(firstElm);
			
			long firstDigit = firstElm % 10;
			
			if(firstDigit > 0){
				lunlunTree.add(firstElm*10+firstDigit - 1);
				lunlunSize++;
				if(lunlunSize == k){
					break;
				}
			}
			
			lunlunTree.add(firstElm*10+firstDigit);
			lunlunSize++;
			if(lunlunSize == k){
				break;
			}
			
			if(firstDigit < 9){
				lunlunTree.add(firstElm*10+firstDigit+1);
				lunlunSize++;
				if(lunlunSize == k){
					break;
				}
			}
		}
		System.out.println(lunlunTree.last());
		
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

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
		int h = fs.nextInt();
		int w = fs.nextInt();
		int k = fs.nextInt();
		int[][] regionArr = new int[h][w];
		
		int regionNo = 1;
		for(int i = 0; i < h; i++) {
			String[] cakeArr = fs.nextLine().split("");
			for(int j = 0; j < cakeArr.length; j++) {
				if(cakeArr[j].equals("#")) {
					regionArr[i][j] = regionNo;
					regionNo++;
				}
			}
		}
		
		
		for(int i = 0; i < h; i++) {
			int[] row = regionArr[i];
			int numOfStrawberry = 0;
			for(int j = 0; j < w; j++) {
				if(row[j] > 0) {
					numOfStrawberry++;
					int cum = 1;
					while(j - cum >= 0 && row[j-cum] == 0) {
						row[j-cum] = row[j];
						cum++;
					}
				}
			}
			if(numOfStrawberry > 0 && row[w-1] == 0) {
				int index = w-1;
				while(row[index] == 0) {
					index--;
				}
				int rightVal = row[index];
				for(int j = index+1; j < w; j++) {
					row[j] = rightVal;
				}
			}
		}
		
		for (int i = 0; i < h; i++) {
			boolean hasBelow = false;
			if(regionArr[i][0] == 0) {
				int nextH = i;
				while(nextH < h && regionArr[nextH][0] == 0) {
					nextH++;
				}
				if(nextH < h) {
					int[] nextHArr = regionArr[nextH];
					for(int j = i; j < nextH; j++) {
						int[] nowArr = regionArr[j];
						for(int l = 0; l < w; l++) {
							nowArr[l] = nextHArr[l];
						}
					}
					i = nextH;
					hasBelow = true;
				}
			}
			
			if(!hasBelow) {
				int nextH = i;
				while(regionArr[nextH][0] == 0) {
					nextH--;
				}
				int[] nextHArr = regionArr[nextH];
				for(int j = i; j > nextH; j--) {
					int[] nowArr = regionArr[j];
					for(int l = 0; l < w; l++) {
						nowArr[l] = nextHArr[l];
					}
				}
			}
		}
		
		
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				System.out.print(regionArr[i][j]);
				if(j == w - 1) {
					System.out.print("\n");
				}else {
					System.out.print(" ");
				}
			}
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

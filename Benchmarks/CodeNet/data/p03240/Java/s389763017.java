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
		int[][] pointArr = new int[n][3];
		for(int i = 0; i < n; i++) {
			pointArr[i][0] = fs.nextInt();
			pointArr[i][1] = fs.nextInt();
			pointArr[i][2] = fs.nextInt();
		}
		
		int hCandidate;
		int i ,j;
		
		for(i = 0; i <= 100; i++) {
			for(j = 0; j <= 100; j++) {
				boolean validPoint = true;
				hCandidate = -1;
				for(int k = 0; k < n; k++) {
					int[] pointInfo = pointArr[k];
					if(pointInfo[2] == 0) {
						continue;
					}
					if(hCandidate == -1) {
						hCandidate = pointInfo[2] + Math.abs(i- pointInfo[0]) + Math.abs(j-pointInfo[1]);
					}else {
						if(hCandidate != pointInfo[2] + Math.abs(i- pointInfo[0]) + Math.abs(j-pointInfo[1])) {
							validPoint = false;
							break;
						}
					}
				}
				if(validPoint) {
					System.out.println(i+" "+j+" " +hCandidate);
					return;
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
		
		int[][] map = new int[h][w];
		
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				map[i][j] = fs.nextInt() % 2;
 			}
		}
		
		ArrayList<String> manipList = new ArrayList<>();
		
		int oddsCnt = 0;
		int beforeH = -1;
		int beforeW = -1;
		
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				
				if(map[i][j] % 2 == 1) {
					oddsCnt++;
					if(oddsCnt % 2 == 0) {
						manipList.addAll(makeManipList(beforeH, beforeW, i, j));
					}else {
						beforeH = i;
						beforeW = j;
					}
				}
				
			}
		}
		
		System.out.println(manipList.size());
		for(String str : manipList) {
			System.out.println(str);
		}
	}
	
	ArrayList<String> makeManipList(int beforeH, int beforeW, int afterH, int afterW){
		
		ArrayList<String> retList = new ArrayList<>();
		int nowH = beforeH;
		int nowW = beforeW;
		
		for(; nowH < afterH; nowH++) {
			StringBuffer sb = new StringBuffer();
			sb.append(nowH+1).append(" ").append(nowW+1).append(" ").append(nowH+1+1).append(" ").append(nowW+1);
			retList.add(sb.toString());
		}
		
		for(; nowW < afterW ; nowW++) {
			StringBuffer sb = new StringBuffer();
			sb.append(nowH+1).append(" ").append(nowW+1).append(" ").append(nowH+1).append(" ").append(nowW+1+1);
			retList.add(sb.toString());
		}
		
		return retList;
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

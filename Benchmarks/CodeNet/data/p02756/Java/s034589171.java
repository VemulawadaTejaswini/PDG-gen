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
		String firstStr = fs.nextLine();
		
		StringBuffer frontStr = new StringBuffer();
		StringBuffer tailStr = new StringBuffer();
		
		int inverceCnt=0;
		int q = fs.nextInt();
		
		for(int i = 0; i < q; i++) {
			int queryNum = fs.nextInt();
			if(queryNum == 1) {
				inverceCnt++;
			}else {
				int posNum = fs.nextInt();
				// 前付け
				if((inverceCnt % 2 == 0 && posNum == 1) || (inverceCnt % 2 == 1 && posNum == 2)) {
					frontStr.insert(0, fs.next());
				}else {
					tailStr.append(fs.next());
				}
			}
		}
		
		StringBuffer ans = new StringBuffer();
		ans.append(frontStr).append(firstStr).append(tailStr);
		String ansStr = ans.toString();
		if(inverceCnt % 2 == 0) {
			System.out.println(ansStr);
		}else {
			for(int i = 0; i < ansStr.length(); i++) {
				System.out.print(ansStr.charAt(ansStr.length() - i - 1));
			}
			System.out.print("\n");
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
			if(st == null || !st.hasMoreElements()) {
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
			for(int i = 0; i < n; i++) {
				retArr[i] = nextInt();
			}
			return retArr;
		}
		
		public long[] nextLongArr(int n) throws NumberFormatException, IOException {
			long[] retArr = new long[n];
			for(int i = 0; i < n; i++) {
				retArr[i] = nextLong();
			}
			return retArr;
		}
		
		public void close() throws IOException {
			reader.close();
		}
	}


}

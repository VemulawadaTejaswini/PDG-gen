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
		HashMap<String, Integer> nameStartNum = new HashMap<>();
		nameStartNum.put("M", 0);
		nameStartNum.put("A", 0);
		nameStartNum.put("R", 0);
		nameStartNum.put("C", 0);
		nameStartNum.put("H", 0);
		
		String[] startCharArr = {"M", "A", "R", "C", "H"};
		
		for(int i = 0; i < n; i++) {
			String name = fs.next();
			
			char startChar = name.charAt(0);
			
			if(startChar == 'M') {
				incrementMap("M", nameStartNum);
			}else if(startChar == 'A') {
				incrementMap("A", nameStartNum);
			}else if(startChar == 'R') {
				incrementMap("R", nameStartNum);
			}else if(startChar == 'C') {
				incrementMap("C", nameStartNum);
			}else if(startChar == 'H') {
				incrementMap("H", nameStartNum);
			}
		}
		
		long ans = 0;
		for(int i = 0; i < startCharArr.length; i++) {
			for(int j = i+1; j < startCharArr.length ;j++) {
				for(int k = j+1 ; k < startCharArr.length; k++) {
					
					ans += (long)nameStartNum.get(startCharArr[i]) * (long)nameStartNum.get(startCharArr[j]) * (long)nameStartNum.get(startCharArr[k]);
				}
			}
		}
		
		System.out.println(ans);
		
	}
	
	
	void incrementMap(String key, HashMap<String, Integer> map) {
		int val = map.get(key);
		map.put(key, val+1);
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

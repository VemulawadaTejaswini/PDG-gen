import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	
	HashMap<Integer, Integer> map;
	long sum;

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
	
		map = new HashMap<>();
		sum = 0;
		
		int n = fs.nextInt();
		for(int i = 0; i < n; i++) {
			int a = fs.nextInt();
			incrementMap(a);
		}
		int q = fs.nextInt();
		
		for(int i = 0; i < q; i++) {
			int b = fs.nextInt();
			int c = fs.nextInt();
			replace(b,c);
		}
	}
	
	void incrementMap(int val) {
		if(map.containsKey(val)) {
			int num = map.get(val);
			map.put(val, num+1);
		}else {
			map.put(val, 1);
		}
		sum += val;
	}
	
	void replace(int from, int to) {
		
		if(!map.containsKey(from)){
			System.out.println(sum);
			return;
		}
		
		int fromNum = map.get(from);
		map.remove(from);
		if(map.containsKey(to)) {
			int toNum = map.get(to);
			map.put(to, fromNum+toNum);
		}else {
			map.put(to, fromNum);
		}
		
		
		sum -= (long)from * (long)fromNum;
		sum += (long)to * (long)fromNum;
		
		System.out.println(sum);
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

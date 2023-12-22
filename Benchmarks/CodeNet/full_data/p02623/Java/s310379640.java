import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		
		int n = fs.nextInt();
		int m = fs.nextInt();
		long k = fs.nextLong();
		
		TreeSet<Long> aSet = new TreeSet<>();
		TreeSet<Long> bSet = new TreeSet<>();
		
		HashMap<Long, Integer> aIndex = new HashMap<>();
		HashMap<Long, Integer> bIndex = new HashMap<>();
		
		for(int i = 0; i < n; i++) {
			long last;
			if(i == 0) {
				last = fs.nextLong();
			}else {
				last = aSet.last() + fs.nextLong();
			}
			
			aSet.add(last);
			aIndex.put(last, i);
		}
		
		for(int i = 0; i < m; i++) {
			long last;
			if(i == 0) {
				last = fs.nextLong();
			}else {
				last = bSet.last() + fs.nextLong();
			}
			
			bSet.add(last);
			bIndex.put(last, i);
		}
		
		int ans = 0;
		for(Long aVal : aSet) {
			if(aVal > k) {
				continue;
			}
			
			long rest = k - aVal;
			Long bFloor = bSet.floor(rest);
			
			if(bFloor == null) {
				ans = Math.max(ans, aIndex.get(aVal)+1);
			}else {
				ans = Math.max(ans, aIndex.get(aVal)+1+bIndex.get(bFloor)+1);
			}
		}
		
		
		Long aFloor = aSet.floor(k);
		if(aFloor != null) {
			ans = Math.max(ans, aIndex.get(aFloor)+1);
		}
		
		Long bFloor = bSet.floor(k);
		if(bFloor != null) {
			ans = Math.max(ans, bIndex.get(bFloor)+1);
		}
		
		System.out.println(ans);
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

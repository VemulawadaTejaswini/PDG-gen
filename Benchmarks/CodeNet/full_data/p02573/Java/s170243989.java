import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		int n = fs.nextInt();
		int m = fs.nextInt();
		
		ArrayList<Set<Integer>> setList = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			setList.add(new HashSet<>());
			setList.get(i).add(i);
		}
		
		for(int i = 0; i < m; i++) {
			int a = fs.nextInt()-1;
			int b = fs.nextInt()-1;
			
			Set<Integer> aSet = setList.get(a);
			Set<Integer> bSet = setList.get(b);
			
			Set<Integer> smallSet;
			Set<Integer> bigSet;
			
			if(aSet.size() < bSet.size()) {
				bigSet = bSet;
				smallSet = aSet;
			}else {
				bigSet = aSet;
				smallSet = bSet;
			}
			
			bigSet.addAll(smallSet);
			for(Integer human : smallSet) {
				setList.set(human.intValue(), bigSet);
			}
		}
		
		int biggestSetSize = 0;
		for(int i = 0; i < n; i++) {
			biggestSetSize = Math.max(setList.get(i).size(), biggestSetSize);
		}
		
		System.out.println(biggestSetSize);
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

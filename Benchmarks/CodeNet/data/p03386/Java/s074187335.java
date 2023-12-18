import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		
		int a = fs.nextInt();
		int b = fs.nextInt();
		int k = fs.nextInt();
		
		HashSet<Integer> left = new HashSet<>();
		for(int i = 0; i < k; i++) {
			if(a + i > b) {
				break;
			}
			
			left.add(a+i);
		}
		
		HashSet<Integer> right = new HashSet<>();
		for(int i = 0; i < k; i++) {
			if(b - i < a) {
				break;
			}
			
			right.add(b - i);
		}
		
		
		HashSet<Integer> all = new HashSet<>();
		all.addAll(left);
		all.addAll(right);
		
		ArrayList<Integer> list = new ArrayList<>(all);
		list.sort(Comparator.comparing(Integer::intValue));
		
		for(Integer val : list) {
			System.out.println(val);
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

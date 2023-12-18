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
		
		String s = fs.next();
		
		for(int i = 0; i < s.length()/2 ; i++) {
			if(s.charAt(i) != s.charAt(s.length() - i -1)) {
				System.out.println("No");
				return;
			}
		}
		
		for(int i = 0; i < ((s.length() - 1)/2)/2 ; i++) {
			if(s.charAt(i) != s.charAt((s.length() - 1)/2 - i - 1)) {
				System.out.println("No");
				return;
			}
		}
		
		for(int i = (s.length()+3)/2 - 1; i < s.length(); i++) {
			if(s.charAt(i) != s.charAt(s.length() - (i - ((s.length()+3)/2 - 1))-1)) {
				System.out.println("No");
				return;
			}
		}
		
		
		System.out.println("Yes");
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	
	int RED = 0;
	int WHITE = 1;

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		
		int n = fs.nextInt();
		int[] stoneArr = new int[n];
		
		String s = fs.next();
		TreeSet<Integer> redIndex = new TreeSet<>();
		TreeSet<Integer> whiteIndex = new TreeSet<>();
		for(int i = 0; i < n; i++) {
			if(s.charAt(i) == 'R') {
				stoneArr[i] = RED;
				redIndex.add(i);
			}else {
				stoneArr[i] = WHITE;
				whiteIndex.add(i);
			}
		}
		
		int ans = 0;
		
		if(whiteIndex.isEmpty() || redIndex.isEmpty()) {
			System.out.println(0);
			return;
		}
		
		while(whiteIndex.first() > redIndex.last()) {
			
			int whiteLeft =  whiteIndex.first();
			int redRight = redIndex.last();
			
			whiteIndex.remove(whiteLeft);
			redIndex.remove(redRight);
			
			whiteIndex.add(redRight);
			redIndex.add(whiteLeft);
			
			ans++;
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

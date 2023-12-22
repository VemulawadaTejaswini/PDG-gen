import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	int n;
	int m;
	ArrayList<Pair> pairList;
	
	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		n = fs.nextInt();
		m = fs.nextInt();
		int q = fs.nextInt();
		
		pairList = new ArrayList<>();
		for(int i = 0; i < q ; i++) {
			int a = fs.nextInt()-1;
			int b = fs.nextInt()-1;
			int c = fs.nextInt();
			int d = fs.nextInt();
			pairList.add(new Pair(a,b,c,d));
		}
		
		int[] mArr = new int[n];
		mArr[0] = 1;
		System.out.println(dfs(1, mArr));
		
		
	}
	
	
	int dfs(int depth, int[] mArr){
		
		if(depth == n) {
			int score = 0;
			for(Pair pair : pairList) {
				if(mArr[pair.b] - mArr[pair.a] == pair.c) {
					score += pair.d;
				}
			}
			return score;
		}
		
		int beforeVal = mArr[depth-1];
		int max = 0;
		
		for(int i = beforeVal; i <= m; i++) {
			mArr[depth] = i;
			max = Math.max(max, dfs(depth+1,mArr));
		}
		
		return max;
	}
	
	class Pair{
		int a;
		int b;
		int c;
		int d;
		
		Pair(int a, int b, int c, int d) {
			this.a = a;
			this.b = b;
			this.c = c;
			this.d = d;
		}
		
		int getB() {
			return b;
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

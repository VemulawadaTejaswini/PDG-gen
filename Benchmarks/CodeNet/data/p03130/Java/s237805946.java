import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		
		int [][] path = new int[4][4];
		
		for(int i = 0; i < 3; i++) {
			int a = fs.nextInt()-1;
			int b = fs.nextInt()-1;
			
			path[a][b] = 1;
			path[b][a] = 1;
		}
		
		for(int i = 0; i < 4; i++) {
			if(canStartHere(path, i)) {
				System.out.println("YES");
				return;
			}
		}
		
		System.out.println("NO");
	}
	
	boolean canStartHere(int[][] path, int start) {
		int[] visited = new int[4];
		visited[start] = 1;
		
		ArrayDeque<Integer> town = new ArrayDeque<>();
		for(int i = 0; i < 4; i++) {
			if(path[start][i] == 1) {
				town.add(i);
			}
		}
		
		if(town.size() >= 2) {
			return false;
		}
		
		while(!town.isEmpty()) {
			int nextTown = town.poll();
			visited[nextTown] = 1;
			
			for(int i = 0; i < 4; i++) {
				if(path[i][nextTown] == 1 && visited[i] == 0) {
					town.add(i);
				}
			}
			
			if(town.size() >= 2) {
				return false;
			}
		}
		
		for(int i = 0; i < 4; i++) {
			if(visited[i] == 0) {
				return false;
			}
		}
		return true;
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

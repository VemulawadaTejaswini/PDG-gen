import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		int h = fs.nextInt();
		int w = fs.nextInt();
		int[][] board = new int[h][w];
		
		for(int i = 0; i < h; i++) {
			String[] row = fs.next().split("");
			for(int j = 0; j < w; j++) {
				if(row[j].equals(".")) {
					board[i][j] = 1;
				}else {
					board[i][j] = 0;
				}
			}
		}
		
		long ans = 0;
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w;j++) {
				if(board[i][j] != -1) {
					ArrayList<Integer> pointSet = new ArrayList<>();
					makeReachableNodeSet(i, j, board, h, w, pointSet);
					
					if(pointSet.size() > 1) {
						long white =  pointSet.stream().filter(val -> val.intValue() == 1).count();
						long black = pointSet.size() - white;
						ans += black*white;
					}
				}
			}
		}
		System.out.println(ans);
	}
	
	public void makeReachableNodeSet(int i, int j, int[][] graph, int h, int w, ArrayList<Integer> pointList) {
		
		int hereVal = graph[i][j];
		
		if(hereVal == -1) {
			return;
		}
		
		pointList.add(hereVal);
		graph[i][j] = -1;
		
		if(i > 0) {
			if(graph[i-1][j] >= 0 && hereVal != graph[i-1][j]) {
				makeReachableNodeSet(i-1, j, graph, h, w, pointList);
			}
		}
		
		if(i < h - 1) {
			if(graph[i+1][j] >= 0 && hereVal != graph[i+1][j]) {
				makeReachableNodeSet(i+1, j, graph,h,w, pointList);
			}
		}
		
		if(j > 0) {
			if(graph[i][j-1] >= 0 && hereVal != graph[i][j-1]) {
				makeReachableNodeSet(i, j -1, graph, h,w, pointList);
			}
		}
		
		if(j < w - 1) {
			if(graph[i][j + 1] >= 0 && hereVal != graph[i][j+1]) {
				makeReachableNodeSet(i, j+1, graph, h,w, pointList);
			}
		}
	}

//	class Point{
//		int color;
//		int x;
//		int y;
//		
//		Point(int color, int x, int y){
//			this.color = color;
//			this.x = x;
//			this.y = y;
//		}
//	}

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

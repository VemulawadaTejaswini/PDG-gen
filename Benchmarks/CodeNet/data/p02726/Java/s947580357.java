import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		Main mainObj = new Main();
		mainObj.solve();
	}
	
	public void solve() throws IOException{
		FastScanner fs = new FastScanner();
		int n = fs.nextInt();
		int x = fs.nextInt()-1;
		int y = fs.nextInt()-1;
		
		int inf = n + 1;
		
		int[][] graph = new int[n][n];
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(i == j){
					graph[i][j] = 0;
					continue;
				}
				if(Math.abs(i-j) == 1){
					graph[i][j] = 1;
					continue;
				}
				if((i == x && j == y) || (i == y && j == x)){
					graph[i][j] = 1;
					continue;
				}
				graph[i][j] = inf;
			}
		}
		
		for(int k = 0; k < n; k++){
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
				}
			}
		}
		
		int[] distArr = new int[n];
		
		for(int i = 0; i < n; i++){
			for(int j = i; j < n; j++){
				distArr[graph[i][j]]++;
			}
		}
		
		for(int i = 1; i < n; i++){
			System.out.println(distArr[i]);
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
			if(st == null || !st.hasMoreElements()) {
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
			for(int i = 0; i < n; i++) {
				retArr[i] = nextInt();
			}
			return retArr;
		}
		
		public long[] nextLongArr(int n) throws NumberFormatException, IOException {
			long[] retArr = new long[n];
			for(int i = 0; i < n; i++) {
				retArr[i] = nextLong();
			}
			return retArr;
		}
		
		public void close() throws IOException {
			reader.close();
		}
	}
}

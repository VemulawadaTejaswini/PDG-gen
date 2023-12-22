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
		int n = fs.nextInt();
		int m = fs.nextInt();
		
		ArrayList<Observatory> observatoryList = new ArrayList<>();
		Observatory[] observatoryArr = new Observatory[n];
		
		for(int i = 0; i < n; i++) {
			Observatory observatory = new Observatory(i, fs.nextInt());
			observatoryArr[i] = observatory;
			observatoryList.add(observatory);
		}
		
		for(int i = 0; i < m; i++) {
			int start = fs.nextInt()-1;
			int end = fs.nextInt()-1;
			observatoryList.get(start).addConnected(end);
			observatoryList.get(end).addConnected(start);
		}
		
		int[] liveObservatoryArr = new int[n];
		
		Comparator<Observatory> observatoryComparator = Comparator.comparing(Observatory::getHeight).reversed();
		observatoryList.sort(observatoryComparator);
		
		for(int i = 0; i < n; i++) {
			Observatory observatory = observatoryList.get(i);
			
			if(liveObservatoryArr[observatory.id] == 1) {
				continue;
			}
			
			for(Integer id : observatory.connectedSet){
				Observatory other = observatoryArr[id];
				if(observatory.getHeight() > other.getHeight()) {
					liveObservatoryArr[id] = 1;
				}else {
					liveObservatoryArr[observatory.id] = 1;
					break;
				}
			}
		}
		
		
		int ans = 0;
		for(int i = 0; i < n; i++) {
			if(liveObservatoryArr[i] == 0) {
				ans++;
			}
		}
		
		System.out.println(ans);
	}
	
	class Observatory{
		int id;
		int height;
		HashSet<Integer> connectedSet;
		
		Observatory(int id, int height) {
			this.id = id;
			this.height = height;
			connectedSet = new HashSet<>();
		}
		
		void addConnected(int i) {
			connectedSet.add(i);
		}
		
		int getHeight() {
			return height;
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

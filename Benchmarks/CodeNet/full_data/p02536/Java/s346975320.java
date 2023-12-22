import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
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
		
		City[] cityArr = new City[n];
		int[] groupArr = new int[n];
		
		for(int i = 0; i < n; i++) {
			cityArr[i] = new City(i);
		}
		
		for(int i = 0; i < m; i++) {
			int a = fs.nextInt() - 1;
			int b = fs.nextInt() - 1;
			
			cityArr[a].addLoad(b);
			cityArr[b].addLoad(a);
		}
		
		int groupNum = 0;
		for(int i = 0; i < n; i++) {
			if (groupArr[i] != 0) {
				continue;
			}
			
			if(cityArr[i].load.isEmpty()) {
				continue;
			}
			
			groupNum++;
			
			groupArr[i] = groupNum;
			
			ArrayDeque<Integer> queue = new ArrayDeque<>();
			queue.addAll(cityArr[i].load);
			while(!queue.isEmpty()) {
				int cityId = queue.poll();
				if(groupArr[cityId] != 0) {
					continue;
				}
				
				groupArr[cityId] = groupNum;
				queue.addAll(cityArr[cityId].load);
			}
		}
		for(int i = 0; i < n; i++) {
			if(groupArr[i] == 0) {
				groupNum++;
			}
		}
		System.out.println(groupNum-1);
	}
	
	class City {
		int id;
		HashSet<Integer> load;
		
		City(int id){
			this.id = id;
			this.load = new HashSet<>();
		}
		
		void addLoad(int id) {
			load.add(id);
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

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

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		int n = fs.nextInt();
		int t = fs.nextInt();
		ArrayList<Meshi> meshiList = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int time = fs.nextInt();
			int umasa = fs.nextInt();
			
			meshiList.add(new Meshi(umasa,time));
		}
		Comparator<Meshi> meshiComparator = Comparator.comparing(Meshi::getTime);
		meshiList.sort(meshiComparator);
		int cumulative = 0;
		int[] manzokuArr = new int[100000];
		for(int i = 0; i < n; i++) {
			Meshi meshi = meshiList.get(i);
			for(int j = Math.min(cumulative, t-1); j >= 1 ; j--) {
				if(manzokuArr[j] > 0) {
//					System.out.println(j);
					manzokuArr[j+meshi.time] = Math.max(manzokuArr[j+meshi.time], manzokuArr[j] +meshi.umasa);
				}
			}
			manzokuArr[meshi.time] = Math.max(manzokuArr[meshi.time], meshi.umasa);
			cumulative = Math.min(t-1, cumulative+meshi.time);
		}
		
		int ans = 0;
		for(int i = 0; i < 100000;i++) {
			ans = Math.max(ans, manzokuArr[i]);
		}
		System.out.println(ans);
	}

	class Meshi {
		int umasa;
		int time;
		Meshi(int umasa, int time){
			this.umasa = umasa;
			this.time = time;
		}
		int getTime() {
			return time;
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

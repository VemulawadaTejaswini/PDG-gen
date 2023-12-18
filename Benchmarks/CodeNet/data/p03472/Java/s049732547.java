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
		long h = fs.nextLong();
		
		ArrayList<Katana> katanaList = new ArrayList<>();
		
		long maxSwingDmg = 0;
		
		for(int i = 0; i < n; i++) {
			long swingDmg = fs.nextLong();
			long throwDmg = fs.nextLong();
			
			maxSwingDmg = Math.max(swingDmg, maxSwingDmg);
			katanaList.add(new Katana(i, swingDmg, throwDmg));
		}
		
		Comparator<Katana> katanaComparator = Comparator.comparing(Katana::getThrowDmg).reversed();
		katanaList.sort(katanaComparator);
		
		int lastIndex = 0;
		for(int i = 0; i < n; i++) {
			Katana katana = katanaList.get(i);
			if(katana.throwDmg > maxSwingDmg) {
				lastIndex++;
			}else {
				break;
			}
		}
		
		int ans = 0;
		long totalDmg = 0;
		for(int i = 0 ; i < lastIndex; i++) {
			Katana katana = katanaList.get(i);
			totalDmg += katana.throwDmg;
			ans++;
			if(totalDmg >= h) {
				break;
			}
		}
		
		if(totalDmg < h) {
			long hitPoint = h - totalDmg;
			if(hitPoint % maxSwingDmg == 0) {
				ans += hitPoint / maxSwingDmg ;
			}else {
				ans += hitPoint / maxSwingDmg + 1;
			}
		}
		
		System.out.println(ans);
	}
	
	class Katana{
		int id;
		long swingDmg;
		long throwDmg;
		
		Katana(int id, long swingDmg, long throwDmg){
			this.id = id;
			this.swingDmg = swingDmg;
			this.throwDmg = throwDmg;
		}
		
		long getThrowDmg() {
			return throwDmg;
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	
	ArrayList<Long> sunukeList;
	
	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		sunukeList = new ArrayList<>();
		long k = fs.nextInt();
		
		for(int i = 1; i < 100; i++) {
			check(i);
		}
		
		long a = 0;
		long b = 1;
		while(a < 1_000_000_000_000L) {
			
			for(int i = 100; i < 1000; i++) {
				check(i*b + a);
			}
			
			a = a*10 + 9;
			b *= 10;
		}
		
		for(int i = 0; i < k; i++) {
			System.out.println(sunukeList.get(i));
		}
	}
	
	public void check(long i) {
		
		long is = s(i);
		
		while(true) {
			
			if(sunukeList.isEmpty()) {
				break;
			}
			
			long lastVal = sunukeList.get(sunukeList.size()-1);
			long lastValS = s(lastVal);
			
			if(is * lastVal > i * lastValS) {
				sunukeList.remove(sunukeList.size()-1);
			}else {
				break;
			}
		}
		
		sunukeList.add(i);
	}
	
	public long s(long i) {
		long retVal = 0;
		while(i > 0) {
			retVal += i % 10;
			i /= 10;
		}
		return retVal;
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

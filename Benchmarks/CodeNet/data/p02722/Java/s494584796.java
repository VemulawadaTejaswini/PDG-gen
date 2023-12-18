import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		long n = fs.nextLong();
		
		long ans = 0;
		long sub1 = n - 1;
		
		ArrayList<Long> yakusuuList = yakusuu(sub1);
		ans+=yakusuuList.size();
		yakusuuList = yakusuu(n);
		for(Long longVal : yakusuuList){
			long nCopy = n;
			while(nCopy % longVal == 0){
				nCopy = nCopy / longVal;
			}
			
			if(nCopy % longVal == 1){
				ans++;
			}
		}
		System.out.println(ans+2);
	}
	
	ArrayList<Long> yakusuu(long n){
		ArrayList<Long> ret = new ArrayList<>();
		for(long i = 2; i*i <= n; i++){
			if(n % i == 0){
				ret.add(new Long(i));
				ret.add(new Long(n/i));
			}
		}
		return ret;
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

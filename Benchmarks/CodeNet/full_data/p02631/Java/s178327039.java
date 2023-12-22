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
		int n = fs.nextInt();
		Sunuke[] sunukeArr = new Sunuke[n];
		
		for(int i = 0; i < n; i++) {
			int a = fs.nextInt();
			sunukeArr[i] = new Sunuke(a);
		}
		
		
		for(int i = 30; i >= 0; i--) {
			ArrayList<Sunuke> oneSunuke = new ArrayList<>();
			ArrayList<Sunuke> zeroSunuke = new ArrayList<>();
			
			for(Sunuke sunuke : sunukeArr) {
				long bit = sunuke.getNBit(i);
				if(bit == 1L) {
					oneSunuke.add(sunuke);
				}else {
					zeroSunuke.add(sunuke);
				}
			}
			
			if(oneSunuke.size() % 2 == 0 || oneSunuke.size() == n) {
				for(Sunuke sunuke : oneSunuke) {
					sunuke.setOneBit(i);
				}
				continue;
			}
			if(oneSunuke.size() % 2 == 1) {
				for(Sunuke sunuke : zeroSunuke) {
					sunuke.setOneBit(i);
				}
				continue;
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(sunukeArr[i].calcVal());
			if(i < n-1) {
				System.out.print(" ");
			}
		}
		
		System.out.print("\n");
	}

	class Sunuke {
		long a;
		int[] bitArr;
		
		Sunuke(long a){
			this.a = a;
			this.bitArr = new int[31];
		}
		
		long getNBit(int n) {
			return (a >> n) & 1L;
		}
		
		void setOneBit(int n ) {
			bitArr[n] = 1;
		}
		
		long calcVal() {
			long retVal = 0;
			for(int i = 30; i >= 0; i--) {
				retVal = (retVal << 1);
				if(bitArr[i] == 1) {
					retVal++;
				}
			}
			return retVal;
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

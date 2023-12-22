import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		int a = fs.nextInt();
		int b = fs.nextInt();
		int h = fs.nextInt();
		int m = fs.nextInt();
		
		
		double w_a = 30 * (h+ (double)m/60);
		double w_b = 6 * m;
		
		double x_a = (double) a * Math.sin(Math.toRadians(w_a));
		double y_a = (double) a * Math.cos(Math.toRadians(w_a));
		
		double x_b = (double) b * Math.sin(Math.toRadians(w_b));
		double y_b = (double) b * Math.cos(Math.toRadians(w_b));
		
		//System.out.println(String.format("%f,%f", x_a, y_a));
		//System.out.println(String.format("%f,%f", x_b, y_b));
		
		double x_diff = x_a - x_b;
		double y_diff = y_a - y_b;
		
		System.out.println(Math.sqrt(x_diff * x_diff + y_diff * y_diff));
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

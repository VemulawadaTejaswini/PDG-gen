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
		int n = fs.nextInt();
		int a = fs.nextInt();
		int b = fs.nextInt();
		
		int[] hitPointArr = new int[n];
		int maxHitPoint = 0;
		for(int i = 0; i < n ; i++) {
			int hitPoint = fs.nextInt();
			hitPointArr[i] =hitPoint;
			maxHitPoint = Math.max(maxHitPoint, hitPoint);
		}
		
		int left = 0;
		int right = maxHitPoint / b + 1;
		int minVal = 1001001001;
		
		while(left <= right) {
			int mid = (left + right) / 2;
			if(canBeatAllMonster(mid, a,b, hitPointArr)) {
				minVal = Math.min(minVal, mid);
				right = mid - 1;
			}else {
				left = mid + 1;
			}
		}
		
		System.out.println(minVal);
	}

	boolean canBeatAllMonster(int time, int a, int b, int[] hitPointArr) {
		
		int restTime = time;
		
		for(int i = 0; i < hitPointArr.length; i++) {
			int hitPoint = hitPointArr[i];
			hitPoint -= b*time;
			if(hitPoint > 0) {
				if(hitPoint % (a-b) == 0) {
					restTime -= (hitPoint / (a-b));
				}else {
					restTime -= (hitPoint / (a-b)  + 1);
				}
			}
			if(restTime < 0) {
				return false;
			}
		}
		return true;
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		int n = fs.nextInt();
		int c = fs.nextInt();
		int k = fs.nextInt();
		
		int[] arrivalTimeArr = fs.nextIntArr(n);
		Arrays.sort(arrivalTimeArr);
		
		int ans = 0;
		ArrayDeque<Integer> passengerQue = new ArrayDeque<>();
		for(int i = 0; i < n; i++) {
			int arrivalTime = arrivalTimeArr[i];
			if(!passengerQue.isEmpty()) {
				int nextAngerTime = passengerQue.peek();
				while(nextAngerTime < arrivalTime) {
					ans++;
					busArrive(passengerQue, c);
					if(passengerQue.isEmpty()) {
						nextAngerTime = 1001001001;
					}else {
						nextAngerTime = passengerQue.peek();
					}
				}
			}
			passengerQue.add(new Integer(arrivalTime + k));
		}
		
		while(!passengerQue.isEmpty()) {
			ans++;
			busArrive(passengerQue, c);
		}
		
		System.out.println(ans);
	}
	
	public void busArrive(ArrayDeque<Integer> passengerQue, int c) {
		for(int i = 0; i < c; i++) {
			if(passengerQue.isEmpty()) {
				break;
			}
//			System.out.print(passengerQue.poll()+",");
		}
//		System.out.print("\n");
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

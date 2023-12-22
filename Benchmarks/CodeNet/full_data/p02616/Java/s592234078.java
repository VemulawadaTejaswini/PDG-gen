import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	
	long mod = 1_000_000_007;

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		
		int n = fs.nextInt();
		int k = fs.nextInt();
		int[] aArr = fs.nextIntArr(n);
		
		ArrayList<Integer> mulList = new ArrayList<>();
		Arrays.sort(aArr);
		
		
		if(n == k) {
			for(int i = 0; i < n; i++) {
				mulList.add(aArr[i]);
			}
			System.out.println(mulVal(mulList));
			return;
		}
		
		
		int minusNum = 0;
		int plusNum = 0;
		int zeroNum = 0;
		
		for(int i = 0 ; i < n; i++) {
			if(aArr[i] < 0) {
				minusNum++;
			}else if(aArr[i] > 0) {
				plusNum++;
			}else {
				zeroNum++;
			}
		}
		
		if(k > minusNum + plusNum) {
			System.out.println(0);
			return;
		}
		
		if(k <= plusNum) {
			
			for(int i = n - k; i < n; i++) {
				mulList.add(aArr[i]);
			}
			
			for(int i = 1; i < minusNum; i += 2) {
				int zero = mulList.get(0);
				int one = mulList.get(1);
				
				if(zero < 0 || one < 0) {
					break;
				}
				
				int minusZero = aArr[i-1];
				int minusOne = aArr[i];
				
				if((long)zero * one < (long)Math.abs(minusZero) * (long)Math.abs(minusOne)) {
					mulList.remove(1);
					mulList.remove(0);
					mulList.add(minusZero);
					mulList.add(minusOne);
				}
			}
			System.out.println(mulVal(mulList));
			return;
		}
		
		
		
		int minMinus = k - plusNum;
		int restMinus = minusNum - minMinus;
		
		if(minMinus % 2 == 0 || (minMinus % 2 == 1 &&  restMinus > 0 && plusNum > 0)) {
			// 正できる
			int minusEnd = minMinus-1;
			int plusStart = n - plusNum;
			if(minMinus % 2 != 0) {
				minusEnd++;
				plusStart++;
			}
			
			for(int i = plusStart; i < n; i++) {
				mulList.add(aArr[i]);
			}
			for(int i = 0; i <= minusEnd; i++) {
				mulList.add(aArr[i]);
			}
			
			for(int i = minusEnd+2; i < minusNum ; i += 2) {
				int zero = mulList.get(0);
				int one = mulList.get(1);
				
				if(zero < 0 || one < 0) {
					break;
				}
				
				int minusZero = aArr[i-1];
				int minusOne = aArr[i];
				
				if((long)zero * one < (long)Math.abs(minusZero) * (long)Math.abs(minusOne)) {
					mulList.remove(1);
					mulList.remove(0);
					mulList.add(minusZero);
					mulList.add(minusOne);
				}
			}
			
			System.out.println(mulVal(mulList));
		}else {
			
			// 正にできない
			if(zeroNum > 0) {
				System.out.println(0);
				return;
			}
			
			ArrayList<Integer> aList = new ArrayList<>();
			for(int i = 0; i < n; i++) {
				aList.add(aArr[i]);
			}
			
			Comparator<Integer> intComparator = (val1, val2) -> Math.abs(val1) - Math.abs(val2);
			aList.sort(intComparator);
			
			for(int i = 0; i < k; i++) {
				mulList.add(aList.get(i));
			}
			
			System.out.println(mulVal(mulList));
		}
	}

	int mulVal(ArrayList<Integer> mulVal) {
//		System.out.println(mulVal);
		long ans = 1;
		for(Integer val : mulVal) {
			if(val < 0) {
				ans = (ans * (val+mod))%mod;
			}else {
				ans = (ans * val) % mod;
			}
		}
		
		return (int)ans;
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

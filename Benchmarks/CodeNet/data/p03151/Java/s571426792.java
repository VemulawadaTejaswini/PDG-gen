import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		
		int n = fs.nextInt();
		int[] aArr = new int[n];
		int[] bArr = new int[n];
		
		long aSum = 0;
		for(int i = 0; i < n; i++) {
			int a = fs.nextInt();
			aSum += a;
			aArr[i] = a;
		}
		
		long bSum = 0;
		for(int i = 0; i < n; i++) {
			int b = fs.nextInt();
			bSum += b;
			bArr[i] = b;
		}
		
		if(bSum > aSum) {
			System.out.println(-1);
			return;
		}
		
		
		ArrayList<Integer> diffPlusList = new ArrayList<>();
		ArrayList<Integer> diffMinusList = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			
			int diff = aArr[i] - bArr[i];
			
			if(diff > 0) {
				diffPlusList.add(diff);
			}else if(diff < 0) {
				diffMinusList.add(diff);
			}
		}
		
		long minusDiffSum = 0;
		for(Integer minusDiff : diffMinusList) {
			minusDiffSum += minusDiff;
		}
		
		diffPlusList.sort((val1,val2) -> val2 - val1);
		int sumNum = 0;
		while(minusDiffSum < 0) {
			minusDiffSum += diffPlusList.get(sumNum++);
		}
		
		System.out.println(diffPlusList.size() - sumNum);
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
		int[] aArr = fs.nextIntArr(n);
		Arrays.sort(aArr);
//		System.out.println(Arrays.toString(aArr));
		
		ArrayList<String> tejunList = new ArrayList<>();
		
		long ans = 0;
		
		// 全部負の数
		if(aArr[aArr.length - 1] < 0) {
			long leftVal = aArr[n-1];
			for(int i =0; i < aArr.length - 1; i++) {
				tejunList.add(leftVal+" "+aArr[i]);
//				System.out.print(leftVal);
//				System.out.print(" ");
//				System.out.print(aArr[i]);
//				System.out.print("\n");
				leftVal -= aArr[i];
			}
			ans = leftVal;
		// 全部正の場合
		}else if(aArr[0] >= 0) {
			long leftVal = aArr[0];
			for(int i =1; i < aArr.length - 1; i++) {
				tejunList.add(leftVal+" "+aArr[i]);
//				System.out.print(leftVal);
//				System.out.print(" ");
//				System.out.print(aArr[i]);
//				System.out.print("\n");
				leftVal -= aArr[i];
			}
			tejunList.add(aArr[n-1]+" "+leftVal);
//			System.out.print(aArr[n-1]);
//			System.out.print(" ");
//			System.out.print(leftVal);
//			System.out.print("\n");
			
			ans = aArr[n-1] - leftVal;
		// 負と正が混じっている場合
		}else {
			int index = 1;
			while(aArr[index] < 0) {
				tejunList.add(aArr[n-1]+" "+aArr[index]);
//				System.out.print(aArr[n-1]);
//				System.out.print(" ");
//				System.out.print(aArr[index]);
//				System.out.print("\n");
				aArr[n-1] -= aArr[index];
				index++;
			}
			for(int i = index;i < n-1; i++) {
				tejunList.add(aArr[0]+" "+aArr[i]);
//				System.out.print(aArr[0]);
//				System.out.print(" ");
//				System.out.print(aArr[i]);
//				System.out.print("\n");
				aArr[0] -= aArr[i];
			}
			tejunList.add(aArr[n-1]+ " "+ aArr[0]);
//			System.out.print(aArr[n-1]);
//			System.out.print(" ");
//			System.out.print(aArr[0]);
//			System.out.print("\n");
			ans = aArr[n-1] - aArr[0];
		}
		
		System.out.println(ans);
		for(String str : tejunList) {
			System.out.println(str);
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

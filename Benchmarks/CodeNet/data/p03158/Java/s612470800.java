import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}

	public void solve() throws IOException {
		FastScanner fs = new FastScanner();
		
		int n = fs.nextInt();
		int q = fs.nextInt();
		
		long[] cumulative = new long[n];
		long[] evenCumulative = new long[n];
		
		ArrayList<Integer> valList = new ArrayList<>();
		HashMap<Integer, Integer> indexMap = new HashMap<>();
		for(int i = 0; i < n ;i ++) {
			int nextVal = fs.nextInt();
			valList.add(nextVal);
			indexMap.put(nextVal, i);
		}
		int[] xArr = fs.nextIntArr(q);
		
		cumulative[0] = valList.get(0);
		cumulative[1] = cumulative[0] + valList.get(1);
		evenCumulative[1] = valList.get(1);
		for(int i = 2; i < n ; i++) {
			cumulative[i] = cumulative[i - 1] + valList.get(i);
			if(i % 2 == 1) {
				evenCumulative[i] = evenCumulative[i-2] + valList.get(i);
			}else {
				evenCumulative[i] = evenCumulative[i - 1];
			}
		}
		
		TreeSet<Integer> treeSet = new TreeSet<>(valList);
		
		for(int x : xArr) {
			
			Integer ceil = treeSet.ceiling(x);
			Integer floor = treeSet.floor(x);
			
			int nearestIndex = 0;
			if(ceil == null) {
				nearestIndex = n - 1;
			}else if(floor == null){
				nearestIndex = 0;
			}else if(Math.abs(x - ceil) < Math.abs(x - floor)) {
				// ceilの方が近い場合
				nearestIndex = indexMap.get(ceil);
			}else {
				// floorの方が近い場合
				nearestIndex = indexMap.get(floor);
			}
			
			if(nearestIndex == n - 1) {
				if(n % 2 == 1) {
					System.out.println(cumulative[n-1] - evenCumulative[n-1]);
				}else {
					System.out.println(evenCumulative[n-1]);
				}
				continue;
			}
			
			//　高橋くんの開始indexを探索
			
//			int nearestVal = valList.get(nearestIndex);
			int takahashiStartIndex = n - 1;
			int left = nearestIndex + 1;
			int right = n-1;
			while(right - left > 1) {
				
				int mid = (left + right) / 2;
//				int midVal = valList.get(mid);
//				System.out.println(String.format("%d,%d,%d", left, right, mid));
				
//				int diffAoki = Math.abs(x - midVal);
				
//				System.out.println(nearestVal- diffAoki);
//				Integer otherSideVal = treeSet.floor(x - diffAoki);
//				int otherSideIndex = 0;
//				if(otherSideVal != null) {
//					otherSideIndex = indexMap.get(otherSideVal);
//				}
//				
//				int aokiRank = (nearestIndex - otherSideIndex) + (mid - nearestIndex) + 1;
//				int takahashiRank = n - mid;
				
				int cnt = valList.size() - mid;
				int leftIndex = mid - cnt + 1;
				if(leftIndex < 0 || x - valList.get(leftIndex) > valList.get(mid) - x) {
//				if(aokiRank < takahashiRank || mid - (n-mid) < 0) {
					left = mid;
				}else {
					right = mid;
				}
			}
			
			takahashiStartIndex = right;
//			System.out.println(takahashiStartIndex);
//			if(takahashiStartIndex < n / 2) {
//				takahashiStartIndex = n / 2;
//			}
			
			int aokiStartIndex = 0;
			if(takahashiStartIndex != n/2) {
				aokiStartIndex = n - (n -  takahashiStartIndex) * 2;
			}
//			System.out.println(aokiStartIndex);
//			if(takahashiStartIndex != n / 2) {
//				int numOfTakahashi = n - takahashiStartIndex;
//				int upper = takahashiStartIndex - nearestIndex;
//				if(upper < numOfTakahashi) {
//					int diff = numOfTakahashi - upper;
//					aokiStartIndex = nearestIndex - diff;
//				}else {
//					aokiStartIndex = nearestIndex;
//				}
//			}
//			System.out.println(takahashiStartIndex);
			if(aokiStartIndex == 0) {
				System.out.println(cumulative[n-1] - cumulative[takahashiStartIndex - 1]);
			}else {
				if(n % 2 == 0) {
					System.out.println(cumulative[n-1] - cumulative[takahashiStartIndex - 1]
							+ evenCumulative[aokiStartIndex - 1]);
				}else {
					System.out.println(cumulative[n-1] - cumulative[takahashiStartIndex - 1]
							+ cumulative[aokiStartIndex - 1] - evenCumulative[aokiStartIndex - 1]);
				}
			}
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

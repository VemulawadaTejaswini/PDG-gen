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
		String s = fs.next();
		
		ArrayList<Integer> rList = new ArrayList<>();
		ArrayList<Integer> gList = new ArrayList<>();
		ArrayList<Integer> bList = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			char character = s.charAt(i);
			if(character == 'R') {
				rList.add(i);
			}else if(character == 'G') {
				gList.add(i);
			}else {
				bList.add(i);
			}
		}
		
		long sum = 0;
		sum += calc(rList, gList, bList, s, 'B');
		sum += calc(gList, rList, bList, s, 'B');
		sum += calc(gList, bList, rList, s, 'R');
		sum += calc(bList, gList, rList, s, 'R');
		sum += calc(rList, bList, gList, s, 'G');
		sum += calc(bList, rList, gList, s, 'G');
		System.out.println(sum);
	}
	
	public long calc(ArrayList<Integer> first, ArrayList<Integer> second, ArrayList<Integer> third, String s, char judgeChar) {
		long sum = 0;
		
		for(int i = 0; i < first.size(); i++) {
			int rIndex = first.get(i);
			
			int gFirstIndex = bisectSearch(second, rIndex);
			if(gFirstIndex == second.size()) {
				continue;
			}
			for(int j = gFirstIndex; j < second.size(); j++) {
				int gIndex = second.get(j);
				int bIndex = bisectSearch(third, gIndex);
				if(bIndex == third.size()) {
					continue;
				}
				if(gIndex+(gIndex-rIndex) < s.length() && s.charAt(gIndex+(gIndex-rIndex)) == judgeChar) {
					sum--;
				}
				sum +=  third.size() - bIndex;
			}
		}
		return sum;
	}
	
	
	public int bisectSearch(ArrayList<Integer> intList, int query) {
		int left = 0;
		int right = intList.size();
		
		while(left < right) {
			int mid = (left + right)/2;
			int value = intList.get(mid);
			if(value < query) {
				left = mid + 1;
			}else{
				right = mid - 1;
			}
		}
		
		if(right < 0) {
			return 0;
		}
		
		if(right == intList.size()) {
			return right;
		}
		
		if(intList.get(right) <= query) {
			return right+1;
		}else {
			return right;
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

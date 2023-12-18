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
		
		String a = fs.next();
		String b = fs.next();
		String c = fs.next();
		
//		System.out.println(String.format("%d,%d,%d,%d,%d,%d", abStart, baStart, bcStart, cbStart, acStart, caStart));
		
		System.out.println(Math.min(getLen(a,b,c), Math.min(getLen(a,c,b), Math.min(getLen(b,a,c), Math.min(getLen(b,c,a), Math.min(getLen(c,a,b), getLen(c,b,a)))))));
	}
	
	int getStart(String a, String b) {
		int start = 0;
		int bPos = 0;
		for(int i = 0; i < a.length(); i++) {
			char aAt = a.charAt(i);
			char bAt = b.charAt(bPos);
			
			if(aAt == bAt || aAt == '?' || bAt == '?') {
				bPos++;
				if(bPos == b.length()) {
					return start;
				}
			}else {
				if(bPos != 0) {
					char startB = b.charAt(0);
					if(aAt == startB || startB == '?') {
						start = i;
						bPos = 1;
						continue;
					}
				}
				start = i+1;
				bPos = 0;
			}
		}
		return start;
	}
	
	int getLen(String a, String b, String c) {
		// a and b
		String nextStr = getNextString(a,b);
		
		String nextSecond = getNextString(nextStr,c);
//		System.out.println(nextStr);
//		System.out.println(nextSecond);
		return nextSecond.length();
	}
	
	String getNextString(String a, String b) {
		
		int abStart = getStart(a,b);
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < abStart; i++) {
			sb.append(a.charAt(i));
		}
		
		for(int i = 0; i < b.length(); i++){
			if(sb.length() < a.length()) {
				char aAt = a.charAt(sb.length());
				char bAt = b.charAt(i);
				
				if(aAt == '?' || bAt == '?') {
					sb.append('?');
				}else {
					sb.append(bAt);
				}
			}else {
				sb.append(b.charAt(i));
			}
		}
		
		for(int i = sb.length(); i < a.length(); i++) {
			sb.append(a.charAt(i));
		}
		
		return sb.toString();
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

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
		
		int abStart = getStart(a,b);
		int baStart = getStart(b,a);
		int bcStart = getStart(b,c);
		int cbStart = getStart(c,b);
		int acStart = getStart(a,c);
		int caStart = getStart(c,a);
		
//		System.out.println(String.format("%d,%d,%d,%d,%d,%d", abStart, baStart, bcStart, cbStart, acStart, caStart));
		
		int allSize = a.length()+b.length()+c.length();
		System.out.println(Math.min(allSize -  (a.length()- abStart) - (b.length() - bcStart),
				Math.min(allSize - (a.length() - acStart) - (c.length() - cbStart),
						Math.min(allSize - (b.length() - baStart) - (a.length() - acStart), 
								Math.min(allSize - (b.length() - bcStart) - (c.length() - caStart), 
										Math.min(allSize - (c.length() - caStart) - (a.length() - abStart),
												allSize - (c.length() - cbStart) - (b.length() - baStart)))))));
	}
	
	int getStart(String a, String b) {
		int start = 0;
		int bPos = 0;
		for(int i = 0; i < a.length(); i++) {
			char aAt = a.charAt(i);
			char bAt = b.charAt(bPos);
			
			if(aAt == bAt || aAt == '?' || bAt == '?') {
				bPos++;
				if(bPos == b.length() && i < a.length() - 1) {
					start = i+1;
					bPos = 0;
				}
			}else {
				if(bPos != 0) {
					char startB = b.charAt(0);
					if(aAt == startB || startB == '?') {
						start = i;
						bPos = 2;
						continue;
					}
				}
				start = i+1;
				bPos = 0;
			}
		}
		return start;
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

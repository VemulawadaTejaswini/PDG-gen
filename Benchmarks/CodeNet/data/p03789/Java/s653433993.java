import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	
	Input in;
	PrintWriter out;
	
	final static int INF = (int) 1e9;
	final static int MOD = (int) 1e9 + 7;
	final static long LINF = (long) 1e18;
	final static double PI = (double) Math.acos(-1.0);
	final static double EPS = (double) 1e-9;
	
	void solve() {
		BigInteger A = new BigInteger(in.nextString());
		int ans = 0;
		while (A.compareTo(BigInteger.ZERO) > 0) {
			ans++;
			String S = A.toString();
			String T = "";
			for (int i = 0; i < S.length() - 1; i++) {
				if (S.charAt(i) > S.charAt(i + 1)) {
					for (int j = i; j >= 0; j--) {
						if (j == 0 || S.charAt(j - 1) < S.charAt(j)) {
							for (int k = 0; k < j; k++) {
								T += S.charAt(k);
							}
							T += S.charAt(j) - '0' - 1;
							for (int k = j + 1; k < S.length(); k++) {
								T += 9;
							}
							break;
						}
					}
					break;
				}
			}
			if (T.equals("")) T = S;
			BigInteger B = new BigInteger(T);
			A = A.subtract(B);
		}
		out.println(ans);
	}
	
	public static void main(String[] args) {
		(new Main()).run();
	}
	
	public void run() {
		in = new Input();
		try {
			out = new PrintWriter(System.out);
			//out = new PrintWriter(new FileWriter("a.out"));
		}
		catch (Exception ex) {
		}
		long stime = System.currentTimeMillis();
		//int test = in.nextInt(); while (test-- > 0)
		solve();
		//if (System.getProperty("ONLINE_JUDGE") == null) {
		//	out.println("\nTime elapsed: " + (System.currentTimeMillis() - stime) + "ms");
		//}
		out.close();
	}
	
	public class Input {
		private StringTokenizer token = null;
		private BufferedReader in;
		public Input() {
			try {
				if (System.getProperty("ONLINE_JUDGE") == null) {
					in = new BufferedReader(new InputStreamReader(System.in));
					//in = new BufferedReader(new FileReader("in.txt"));
				}
				else {
					in = new BufferedReader(new InputStreamReader(System.in));
				}
			}
			catch (Exception ex) {
			}
		}
		public int nextInt() {
			return Integer.parseInt(nextString());
		}
		public long nextLong() {
			return Long.parseLong(nextString());
		}
		public double nextDouble() {
			return Double.parseDouble(nextString());
		}
		String nextString() {
			try {
				while (token == null || !token.hasMoreTokens()) {
					token = new StringTokenizer(in.readLine());
				}
			}
			catch (IOException e) {
			}
			return token.nextToken();
		}
	}
}
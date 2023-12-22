import java.io.*;
import java.util.*;
public class Main {
	static BufferedReader br;
	static PrintWriter pw;
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		solve();
		exitImmediately();
	}

	public static void solve() throws IOException {
		int n = Integer.parseInt(br.readLine());
		HashMap<State, Integer> dp = new HashMap<State, Integer>();
		while(n-- > 0) {
			long x = (long)(1000000000 * readDouble());
			int t = -9;
			int f = -9;
			while(x%2==0) {
				x /= 2;
				t++;
			}
			while(x%5==0) {
				x /= 5;
				f++;
			}
			State key = new State(t, f);
			dp.put(key, dp.getOrDefault(key, 0) + 1);
		}
		long ret = 0;
		for(State a: dp.keySet()) {
			for(State b: dp.keySet()) {
				if(a.equals(b)) {
					if(a.a >= 0 && a.b >= 0) {
						long inc = dp.get(a);
						ret += inc*(inc-1)/2;
					}
					break;
				}
				else {
					if(a.a+b.a >= 0 && a.b+b.b >= 0) {
						ret += dp.get(a) * (long) dp.get(b);
					}
				}
			}
		}
		pw.println(ret);
	}

	static class State {
		public int a, b;

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + a;
			result = prime * result + b;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			State other = (State) obj;
			if (a != other.a)
				return false;
			if (b != other.b)
				return false;
			return true;
		}

		public State(int a, int b) {
			super();
			this.a = a;
			this.b = b;
		}
		
	}
	
	public static void exitImmediately() {
		pw.close();
		System.exit(0);
	}
	public static int readInt() throws IOException {
		return Integer.parseInt(readToken());
	}
	public static long readLong() throws IOException {
		return Long.parseLong(readToken());
	}
	public static double readDouble() throws IOException {
		return Double.parseDouble(readToken());
	}
	public static String readLine() throws IOException {
		String s = br.readLine();
		if(s == null) exitImmediately();
		st = null;
		return s;
	}
	public static String readToken() throws IOException {
		while(st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(readLine().trim());
		}
		return st.nextToken();
	}
}

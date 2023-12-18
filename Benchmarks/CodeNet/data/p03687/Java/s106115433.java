import java.io.*;
import java.util.*;

public class Main {

	void submit() {
		String s = nextToken();
		int ret = Integer.MAX_VALUE;
		for (char c = 'a'; c <= 'z'; c++) {
			ret = Math.min(ret, go(s, c));
		}
//		go(s, 'v');
		out.println(ret);
	}
	
	int go(String s, char c) {
		outer: for (int ans = 0; ans < s.length() - 1; ans++) {
			for (int j = 0; j < s.length() - ans; j++) {
				boolean good = false;
				for (int k = j; k <= j + ans; k++) {
					good |= s.charAt(k) == c;
				}
				if (!good) {
					continue outer;
				}
			}
			return ans;
		}
		return Integer.MAX_VALUE;
	}

	void preCalc() {

	}

	void stress() {

	}

	void test() {

	}

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		preCalc();
		submit();
		//stress();
		//test();
		out.close();
	}

	static final Random rng = new Random();

	static int rand(int l, int r) {
		return l + rng.nextInt(r - l + 1);
	}

	public static void main(String[] args) throws IOException {
		new Main();
	}

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;

	String nextToken() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return st.nextToken();
	}

	String nextString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	int nextInt() {
		return Integer.parseInt(nextToken());
	}

	long nextLong() {
		return Long.parseLong(nextToken());
	}

	double nextDouble() {
		return Double.parseDouble(nextToken());
	}
}

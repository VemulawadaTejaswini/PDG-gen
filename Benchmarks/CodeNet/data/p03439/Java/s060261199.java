import java.io.*;
import java.util.*;

public class Main {

	void submit() {
		int n = nextInt();
		int l = 0;
		out.println(l);
		out.flush();
		String sl = nextToken();
		if (sl.equals("Vacant")) {
			return;
		}
		
		int r = n - 1;
		out.println(r);
		out.flush();
		String sr = nextToken();
		if (sr.equals("Vacant")) {
			return;
		}
		
		while (true) {
			int m = (l + r) >> 1;
			out.println(m);
			out.flush();
			String sm = nextToken();
			if (sm.equals("Vacant")) {
				return;
			}
			if ((m % 2 == l % 2) != (sl.equals(sm))) {
				r = m;
				sr = sm;
			} else {
				l = m;
				sl = sm;
			}
		}
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
		// stress();
		// test();
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

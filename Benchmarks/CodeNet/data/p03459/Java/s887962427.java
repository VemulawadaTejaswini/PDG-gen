import java.io.*;
import java.util.*;

public class Main {

	void submit() {
		int n = nextInt();
		int[] ts = new int[n + 1];
		int[] xs = new int[n + 1];
		int[] ys = new int[n + 1];
		
		for (int i = 1; i <= n; i++) {
			ts[i] = nextInt();
			xs[i] = nextInt();
			ys[i] = nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			int d1 = Math.abs(xs[i + 1] - xs[i]) + Math.abs(ys[i + 1] - ys[i]);
			int d2 = ts[i + 1] - ts[i];
			if (d1 <= d2 && d1 % 2 == d2 % 2) {
				
			} else{
				out.println("No");
				return;
			}
		}
		
		out.println("Yes");
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

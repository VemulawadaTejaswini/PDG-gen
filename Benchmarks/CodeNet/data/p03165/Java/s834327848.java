import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Built using CHelper plug-in Actual solution is at the top
 */
//public class Main {
//	public static void main(String[] args) {
//		InputReader in = new InputReader(System.in);
//		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)), true);
//		TaskB solver = new TaskB();
//		solver.(1, in, out);
//		out.flush();
//		out.close();
//	}
//}

class Pair<A, B> {
	A first;
	B second;

	Pair(A first, B second) {
		this.first = first;
		this.second = second;
	}

}

class Main {
	private static final int NEITHER = 0;
	private static final int UP = 1;
	private static final int LEFT = 2;
	private static final int UP_AND_LEFT = 3;

	public static String LCSAlgorithm(String a, String b) {
		int n = a.length();
		int m = b.length();
		int S[][] = new int[n + 1][m + 1];
		int R[][] = new int[n + 1][m + 1];
		int ii, jj;

		// It is important to use <=, not <. The next two for-loops are initialization
		for (ii = 0; ii <= n; ++ii) {
			S[ii][0] = 0;
			R[ii][0] = UP;
		}
		for (jj = 0; jj <= m; ++jj) {
			S[0][jj] = 0;
			R[0][jj] = LEFT;
		}

		// This is the main dynamic programming loop that computes the score and
		// backtracking arrays.
		for (ii = 1; ii <= n; ++ii) {
			for (jj = 1; jj <= m; ++jj) {

				if (a.charAt(ii - 1) == b.charAt(jj - 1)) {
					S[ii][jj] = S[ii - 1][jj - 1] + 1;
					R[ii][jj] = UP_AND_LEFT;
				}

				else {
					S[ii][jj] = S[ii - 1][jj - 1] + 0;
					R[ii][jj] = NEITHER;
				}

				if (S[ii - 1][jj] >= S[ii][jj]) {
					S[ii][jj] = S[ii - 1][jj];
					R[ii][jj] = UP;
				}

				if (S[ii][jj - 1] >= S[ii][jj]) {
					S[ii][jj] = S[ii][jj - 1];
					R[ii][jj] = LEFT;
				}
			}
		}

		// The length of the longest substring is S[n][m]
		ii = n;
		jj = m;
		int pos = S[ii][jj] - 1;
		char lcs[] = new char[pos + 1];

		// Trace the backtracking matrix.
		while (ii > 0 || jj > 0) {
			if (R[ii][jj] == UP_AND_LEFT) {
				ii--;
				jj--;
				lcs[pos--] = a.charAt(ii);
			}

			else if (R[ii][jj] == UP) {
				ii--;
			}

			else if (R[ii][jj] == LEFT) {
				jj--;
			}
		}

		return new String(lcs);
	}

	public static void main(String args[]) {
		try {
			Scanner s = new Scanner(System.in);
			String a = s.nextLine();
			String b = s.nextLine();
			String ans = LCSAlgorithm(a, b);
			System.out.println(ans);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	boolean FirstRow_Col(Pair<Integer, Integer> pair) {
		return pair.first == 0 || pair.second == 0;
	}

	int __gcd(int a, int b) {
		if (b == 0)
			return a;
		return __gcd(b, a % b);

	}

	public int getInt(int num) {
		int ret = -1;
		switch (num) {
		case 0:
			ret = 6;
			break;
		case 1:
			ret = 2;
			break;
		case 2:
			ret = 5;
			break;
		case 3:
			ret = 5;
			break;
		case 4:
			ret = 4;
			break;
		case 5:
			ret = 5;
			break;
		case 6:
			ret = 6;
			break;
		case 7:
			ret = 3;
			break;
		case 8:
			ret = 7;
			break;
		case 9:
			ret = 6;
			break;
		}
		return ret;
	}

	public int isPow(long num) {
		int count = 0;
		while (num > 0) {
			num /= 2;
			count++;
		}
		return count;
	}
}

class InputReader {
	BufferedReader br;
	StringTokenizer st;

	public InputReader(InputStream in) {
		br = new BufferedReader(new InputStreamReader(in));
		st = null;
	}

	public String next() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return st.nextToken();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}

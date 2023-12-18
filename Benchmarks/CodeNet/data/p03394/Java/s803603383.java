import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;
import static java.util.Arrays.fill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Random;
import java.util.StringTokenizer;

public class Main {

	static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	static void solve() throws Exception {
		int n = scanInt();
		int nums[] = new int[20000];
		for (int i = 0, cur = 1; i < 20000; i++) {
			do {
				++cur;
			} while (cur % 2 != 0 && cur % 3 != 0);
			nums[i] = cur;
		}
		Random rng = new Random(42);
		boolean have[] = new boolean[30001];
		while (true) {
			fill(have, false);
			int sum = 0;
			boolean have2 = false, have3 = false;
			for (int i = 0; i < n - 1; i++) {
				int j = i + rng.nextInt(20000 - i);
				int t = nums[i];
				nums[i] = nums[j];
				nums[j] = t;
				sum += nums[i];
				if (nums[i] % 2 != 0) {
					have2 = true;
				}
				if (nums[i] % 3 != 0) {
					have3 = true;
				}
				have[nums[i]] = true;
			}
			if (!have2 || !have3) {
				continue;
			}
			for (int i = 1; i <= 30000; i++) {
				if (!have[i] && (sum + i) % 6 == 0 && gcd(sum, i) != 1) {
					for (int j = 0; j < n - 1; j++) {
						out.print(nums[j] + " ");
					}
					out.print(i);
					return;
				}
			}
		}
	}

	static int scanInt() throws IOException {
		return parseInt(scanString());
	}

	static long scanLong() throws IOException {
		return parseLong(scanString());
	}

	static String scanString() throws IOException {
		while (tok == null || !tok.hasMoreTokens()) {
			tok = new StringTokenizer(in.readLine());
		}
		return tok.nextToken();
	}

	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer tok;

	public static void main(String[] args) {
		try {
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(System.out);
			solve();
			in.close();
			out.close();
		} catch (Throwable e) {
			e.printStackTrace();
			exit(1);
		}
	}
}
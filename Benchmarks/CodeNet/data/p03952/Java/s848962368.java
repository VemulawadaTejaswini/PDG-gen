import java.io.*;
import java.util.*;

public class Main {

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;
	boolean eof;

	static boolean nextPermutation(int[] a) {
		int n = a.length;
		int ptr = n - 2;
		while (ptr >= 0 && a[ptr] > a[ptr + 1]) {
			ptr--;
		}
		if (ptr < 0) {
			return false;
		}

		for (int i = ptr + 1, j = n - 1; i < j; i++, j--) {
			int tmp = a[i];
			a[i] = a[j];
			a[j] = tmp;
		}

		for (int i = ptr + 1;; i++) {
			if (a[ptr] < a[i]) {
				int tmp = a[ptr];
				a[ptr] = a[i];
				a[i] = tmp;
				return true;
			}
		}
	}

	int[] solve(int n, int x) {

		if (x == 1 || x == 2 * n - 1) {
			return null;
		}

		if (n == 2) {
			return new int[] { 1, 2, 3 };
		}

		int[] a = new int[2 * n - 1];
		int mid = n - 1;
		
		int delta = x == 2 * n - 2 ? -1 : 1;

		boolean[] used = new boolean[2 * n + 2];

		a[mid] = x;
		a[mid - 1] = x + delta;
		a[mid + 1] = x - delta;
		a[mid + 2] = x + 2 * delta;

		used[x] = used[x + delta] = used[x - delta] = used[x + 2 * delta] = true;

		int ptr = 1;
		for (int i = 0; i < mid - 1; i++) {
			while (used[ptr]) {
				ptr++;
			}
			a[i] = ptr;
			used[ptr] = true;
		}

		for (int i = mid + 3; i < 2 * n - 1; i++) {
			while (used[ptr]) {
				ptr++;
			}
			a[i] = ptr;
			used[ptr] = true;
		}

		return a;
	}

	int median(int a, int b, int c) {
		int[] tmp = { a, b, c };
		Arrays.sort(tmp);
		return tmp[1];
	}

	int go(int[] a) {
		while (a.length > 1) {
			int[] b = new int[a.length - 2];
			for (int i = 0; i < b.length; i++) {
				b[i] = median(a[i], a[i + 1], a[i + 2]);
			}
			a = b;
		}
		return a[0];
	}

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);

//		for (int n = 2; n <= 10; n++) {
//			for (int x = 2; x < 2 * n - 1; x++) {
//				int[] a = solve(n, x);
//				if (go(a) != x) {
//					throw new AssertionError(n + " " + x);
//				}
//			}
//		}
		
		int n = nextInt();
		int x = nextInt();

		int[] a = solve(n, x);
		if (a == null) {
			out.println("No");
		} else {
			out.println("Yes");
			for (int y : a) {
				out.println(y);
			}
		}
		out.close();
	}

	public static void main(String[] args) throws IOException {
		new Main();
	}

	String nextToken() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (Exception e) {
				eof = true;
				return null;
			}
		}
		return st.nextToken();
	}

	String nextString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			eof = true;
			return null;
		}
	}

	int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	long nextLong() throws IOException {
		return Long.parseLong(nextToken());
	}

	double nextDouble() throws IOException {
		return Double.parseDouble(nextToken());
	}
}
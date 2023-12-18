import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		char[] w = sc.next().toCharArray();
		int N = w.length;
		if (N > 4000) return;
		if (all(w, 0, N - 1)) {
			System.out.println(N);
			System.out.println(1);
			return;
		}
		for (int i = 2; i <= N / 2; ++i) {
			if (N % i != 0) continue;
			boolean ok = true;
			OUT: for (int j = 0; j < N / i; ++j) {
				for (int k = 0; k < i; ++k) {
					if (w[j * i + k] != w[k]) {
						ok = false;
						break OUT;
					}
				}
			}
			if (ok) {
				System.out.println(2);
				int count = 0;
				for (int j = 1; j <= N - 1; ++j) {
					if (!rep(w, 0, j) && !rep(w, j, N)) ++count;
				}
//				int count = (i - 1) * (N / i);
//				if (N / i == 2) ++count;
//				for (int j = 1; j <= i - 1; ++j) {
//					if (rep(w, 0, j)) --count;
//					if (rep(w, j, i)) --count;
//				}
				System.out.println(count);
				return;
			}
		}

		System.out.println(1);
		System.out.println(1);
	}

	static boolean all(char[] str, int l, int r) {
		for (int i = l + 1; i <= r; ++i) {
			if (str[i] != str[l]) return false;
		}
		return true;
	}

	static boolean rep(char[] str, int l, int r) {
		if (r - l <= 1) return false;
		for (int i = 1; i <= (r - l) / 2; ++i) {
			if ((r - l) % i != 0) continue;
			boolean ok = true;
			OUT: for (int j = 0; j < (r - l) / i; ++j) {
				for (int k = 0; k < i; ++k) {
					if (str[l + k] != str[l + j * i + k]) {
						ok = false;
						break OUT;
					}
				}
			}
			if (ok) {
				return true;
			}
		}
		return false;
	}

}

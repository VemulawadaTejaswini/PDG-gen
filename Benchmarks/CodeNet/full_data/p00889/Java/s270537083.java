import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N, Q;
	static int[][] key = new int[512][512];
	static int[][] val = new int[512][512];

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		int[] A = new int[100000];
		while (true) {
			N = Integer.parseInt(sc.next());
			if (N == 0) break;
			int S = Integer.parseInt(sc.next());
			int W = Integer.parseInt(sc.next());
			Q = Integer.parseInt(sc.next());
			int g = S;
			for (int i = 0; i < N; ++i) {
				A[i] = (g / 7) % 10;
				g = (g / 2) ^ (W * (g % 2));
			}
			sb.append(solve(A) + "\n");
		}
		System.out.print(sb);
	}

	static long solve(int[] A) {
		long ans = 0;
		if (Q == 2 || Q == 5) {
			int nonzero = 0;
			for (int i = 0; i < N; ++i) {
				if (A[i] != 0) ++nonzero;
				if (A[i] % Q == 0) {
					ans += nonzero;
				}
			}
			return ans;
		}
		for (int i = 0; i < key.length; ++i) {
			for (int j = 0; val[i][j] != 0; ++j) {
				val[i][j] = 0;
			}
		}

		long sum = 0;
		long base = 1;
		for (int i = 0; i < N; ++i) {
			sum += A[N - 1 - i] * base;
			while (sum >= Q) {
				sum -= Q;
			}
			base *= 10;
			while (base >= Q) {
				base -= Q;
			}
			int c = 0;
			int k = (int) (sum & 511);
			for (int j = 0;; ++j) {
				if (val[k][j] == 0) {
					key[k][j] = (int) sum;
					val[k][j] = 1;
					break;
				}
				if (key[k][j] == (int) sum) {
					c = val[k][j];
					val[k][j]++;
					break;
				}
			}
			if (A[N - 1 - i] != 0) {
				ans += c;
				if (sum == 0) ans++;
			}
		}
		return ans;
	}
}
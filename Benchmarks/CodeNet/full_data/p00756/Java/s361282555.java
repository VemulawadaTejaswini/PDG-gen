import java.util.BitSet;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N, ans;
	static int[] X = new int[24];
	static int[] Y = new int[24];
	static int[] R = new int[24];
	static int[] C = new int[24];
	static int[] mask = new int[24];
	static BitSet visited;

	public static void main(String[] args) {
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			for (int i = 0; i < N; ++i) {
				X[i] = sc.nextInt();
				Y[i] = sc.nextInt();
				R[i] = sc.nextInt();
				C[i] = sc.nextInt();
			}
			visited = new BitSet(1 << N);
			System.out.println(solve());
		}
	}

	static int solve() {
		ans = 0;
		for (int i = 0; i < N; ++i) {
			mask[i] = 0;
			for (int j = 0; j < i; ++j) {
				if (cover(i, j)) mask[i] |= (1 << j);
			}
		}
		dfs((1 << N) - 1);
		return ans;
	}

	static void dfs(int rest) {
		if (visited.get(rest)) return;
		ans = Math.max(ans, N - Integer.bitCount(rest));
		for (int i = 0; i < N; ++i) {
			if ((rest & (1 << i)) == 0) continue;
			if ((rest & mask[i]) != 0) continue;
			for (int j = i + 1; j < N; ++j) {
				if (C[i] != C[j]) continue;
				if ((rest & (1 << j)) == 0) continue;
				if ((rest & mask[j]) != 0) continue;
				dfs(rest - (1 << i) - (1 << j));
			}
		}
		visited.set(rest);
	}

	static boolean cover(int i, int j) {
		return (X[j] - X[i]) * (X[j] - X[i]) + (Y[j] - Y[i]) * (Y[j] - Y[i]) < (R[i] + R[j]) * (R[i] + R[j]);
	}

}
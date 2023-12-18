import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static long MOD = 1_000_000_007;

	public static void main(String[] args) {
		int N = sc.nextInt();
		ArrayList<ArrayList<Integer>> g = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			g.add(new ArrayList<>());
		}
		for (int i = 0; i < N - 1; i++) {
			int X = sc.nextInt() - 1;
			int Y = sc.nextInt() - 1;
			g.get(X).add(Y);
			g.get(Y).add(X);
		}
		int[] parent = new int[N];
		Arrays.fill(parent, -1);
		parent[0] = 0;
		int[] order = new int[N];
		for (int i = 0, pos = 1; i < N; i++) {
			int cur = order[i];
			for (int child : g.get(cur)) {
				if (parent[child] != -1) continue;
				order[pos++] = child;
				parent[child] = cur;
			}
		}
		parent[0] = -1;
		long[] white = new long[N];
		long[] black = new long[N];
		for (int i = N - 1; i >= 0; i--) {
			int cur = order[i];
			white[cur] = black[cur] = 1;
			for (int child : g.get(cur)) {
				if (child == parent[cur]) continue;
				white[cur] *= white[child] + black[child];
				white[cur] %= MOD;
				black[cur] *= white[child];
				black[cur] %= MOD;
			}
		}
		System.out.println((white[0] + black[0]) % MOD);
	}
}
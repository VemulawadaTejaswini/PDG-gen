import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static long M;

	public static void main(String[] args) {
		int N = sc.nextInt();
		M = sc.nextInt();
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
		for (int i = 1; i < N; i++) {
			g.get(order[i]).remove((Integer) parent[order[i]]);
		}
		long[] count = new long[N];
		for (int i = N - 1; i >= 0; i--) {
			int cur = order[i];
			count[cur] = 1;
			for (int child : g.get(cur)) {
				count[cur] *= count[child] + 1;
				count[cur] %= M;
			}
		}
		long[] pcount = new long[N];
		pcount[0] = 0;
		final int BLOCK_SIZE = 256;
		for (int i = 0; i < N; i++) {
			int cur = order[i];
			ArrayList<Integer> children = g.get(cur);
			if (children.size() < BLOCK_SIZE) {
				for (int j = 0; j < children.size(); j++) {
					long mul = pcount[cur] + 1;
					for (int k = 0; k < children.size(); k++) {
						if (j == k) continue;
						mul *= count[children.get(k)] + 1;
						mul %= M;
					}
					pcount[children.get(j)] = mul;
				}
			} else {
				long[] block = new long[(children.size() + BLOCK_SIZE - 1) / BLOCK_SIZE];
				Arrays.fill(block, 1);
				for (int j = 0; j < children.size(); j++) {
					block[j / BLOCK_SIZE] *= count[children.get(j)] + 1;
					block[j / BLOCK_SIZE] %= M;
				}
				for (int j = 0; j < children.size(); j++) {
					long mul = pcount[cur] + 1;
					for (int k = 0; k < block.length; k++) {
						if (k != j / BLOCK_SIZE) {
							mul *= block[k];
							mul %= M;
						}
					}
					for (int k = j / BLOCK_SIZE * BLOCK_SIZE; k < children.size() && k < (j / BLOCK_SIZE + 1) * BLOCK_SIZE; k++) {
						if (j == k) continue;
						mul *= count[children.get(k)] + 1;
						mul %= M;
					}
					pcount[children.get(j)] = mul;
				}
			}
		}

		long[] ans = new long[N];
		for (int i = 0; i < N; i++) {
			ans[order[i]] = count[order[i]] * (pcount[order[i]] + 1) % M;
		}
		PrintWriter writer = new PrintWriter(System.out);
		for (int i = 0; i < N; i++) {
			writer.println(ans[i]);
		}
		writer.flush();
	}
}
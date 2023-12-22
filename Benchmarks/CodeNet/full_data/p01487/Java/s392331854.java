import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int V, E;

	public static void main(String[] args) {
		V = sc.nextInt();
		E = sc.nextInt();
		System.out.println(solve());
	}

	static long solve() {
		ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < V; ++i) {
			g.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < E; ++i) {
			int A = Integer.parseInt(sc.next()) - 1;
			int B = Integer.parseInt(sc.next()) - 1;
			g.get(A).add(B);
			g.get(B).add(A);
		}
		int[] color = new int[V];
		Arrays.fill(color, -1);
		long ans = 0;
		int black = 0;
		int white = 0;
		for (int i = 0; i < V; ++i) {
			if (color[i] != -1) continue;
			long[] count = { 0, 0 };
			int t = 0;
			int road = 0;
			ArrayList<Integer> cur = new ArrayList<Integer>();
			cur.add(i);
			while (!cur.isEmpty()) {
				count[t] += cur.size();
				ArrayList<Integer> next = new ArrayList<Integer>();
				for (int p : cur) {
					road += g.get(p).size();
					for (int n : g.get(p)) {
						if (color[n] != -1) {
							if (color[n] == t) return -1;
							continue;
						}
						color[n] = 1 - t;
						next.add(n);
					}
				}
				cur = next;
				t = 1 - t;
			}
			ans += count[0] * count[1] - road;
			long max = Math.max(count[0], count[1]);
			long min = Math.min(count[0], count[1]);
			ans += max * black + min * white;
			black += max;
			white += min;
		}
		return ans;
	}

}
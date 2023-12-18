import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int q = scanner.nextInt();
		List<Integer>[] adjacencyLists = new List[n];
		for (int i = 0; i < n; i++) {
			adjacencyLists[i] = new ArrayList<Integer>();
		}
		for (int i = 0, a, b; i < n - 1; i++) {
			a = scanner.nextInt() - 1;
			b = scanner.nextInt() - 1;
			adjacencyLists[a].add(b);
			adjacencyLists[b].add(a);
		}

		int[] counter = new int[n];
		for (int i = 0; i < q; i++) {
			counter[scanner.nextInt() - 1] += scanner.nextInt();
		}

		boolean[] discovered = new boolean[n];
		discovered[0] = true;
		int[] sum = new int[n];
		sum[0] = counter[0];
		dfs(adjacencyLists, 0, discovered, counter, sum);

		for (int i = 0; i < n; i++) {
			System.out.print(sum[i] + (i < n - 1 ? " " : "\n"));
		}
	}

	static void dfs(List<Integer>[] g, int v, boolean[] discovered, int[] counter, int[] sum) {
		for (int next : g[v]) {
			if (discovered[next])
				continue;
			discovered[next] = true;
			sum[next] = sum[v] + counter[next];
			dfs(g, next, discovered, counter, sum);
		}
	}

}
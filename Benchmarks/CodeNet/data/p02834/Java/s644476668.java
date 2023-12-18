import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int u = scanner.nextInt() - 1;
		int v = scanner.nextInt() - 1;
		List<Integer>[] adjacencyList = new List[n];
		for (int i = 0; i < n; i++) {
			adjacencyList[i] = new ArrayList<Integer>();
		}
		for (int i = 0, a, b; i < n - 1; i++) {
			a = scanner.nextInt() - 1;
			b = scanner.nextInt() - 1;
			adjacencyList[a].add(b);
			adjacencyList[b].add(a);
		}
		int[] takahashi = new int[n];
		int[] aoki = new int[n];
		for (int i = 0; i < n; i++) {
			takahashi[i] = -1;
			aoki[i] = -1;
		}
		takahashi[u] = 0;
		aoki[v] = 0;
		dfs(adjacencyList, u, takahashi);
		dfs(adjacencyList, v, aoki);
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (takahashi[i] < aoki[i] && max < aoki[i] - 1)
				max = aoki[i] - 1;
		}
		System.out.println(max);
	}

	static void dfs(List<Integer>[] g, int v, int[] distance) {
		for (int nv : g[v]) {
			if (distance[nv] < 0) {
				distance[nv] = distance[v] + 1;
				dfs(g, nv, distance);
			}
		}
	}

}

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final int N = scanner.nextInt();
		final int M = scanner.nextInt();
		final int K = scanner.nextInt();

		List<Integer>[] friendLists = new ArrayList[N];
		List<Integer>[] brockLists = new ArrayList[N];
		for (int i = 0; i < N; i++) {
			friendLists[i] = new ArrayList<Integer>();
			brockLists[i] = new ArrayList<Integer>();
		}

		int A, B;
		for (int i = 0; i < M; i++) {
			A = scanner.nextInt() - 1;
			B = scanner.nextInt() - 1;
			friendLists[A].add(B);
			friendLists[B].add(A);
		}
		for (int i = 0; i < K; i++) {
			A = scanner.nextInt() - 1;
			B = scanner.nextInt() - 1;
			brockLists[A].add(B);
			brockLists[B].add(A);
		}

		int[] result = new int[N];
		boolean[] visited = new boolean[N];

		Set<Integer> group;

		for (int i = 0; i < N; i++) {
			if (!visited[i]) {
				group = new HashSet<Integer>();
				DFS(friendLists, i, visited, group);
				for (Integer j : group) {
					result[j] += group.size() - friendLists[j].size() - 1;
					for (Integer k : group) {
						if (j < k && brockLists[j].contains(k)) {
							result[j]--;
							result[k]--;
						}
					}
				}
			}
		}

		for (int i : result) {
			System.out.print(i + " ");
		}

	}

	static void DFS(List<Integer>[] graph, int vertex, boolean[] visited, Set<Integer> reachable) {
		if (!visited[vertex]) {
			visited[vertex] = true;
			reachable.add(vertex);
			graph[vertex].forEach(neighbor -> DFS(graph, neighbor, visited, reachable));
		}
	}

}

package abc.n157.d;

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
		List<Integer>[] blockLists = new ArrayList[N];
		for (int i = 0; i < N; i++) {
			friendLists[i] = new ArrayList<Integer>();
			blockLists[i] = new ArrayList<Integer>();
		}
		int[] result = new int[N];

		int A, B;
		for (int i = 0; i < M; i++) {
			A = scanner.nextInt() - 1;
			B = scanner.nextInt() - 1;
			friendLists[A].add(B);
			friendLists[B].add(A);
			result[A]--;
			result[B]--;
		}
		for (int i = 0; i < K; i++) {
			A = scanner.nextInt() - 1;
			B = scanner.nextInt() - 1;
			blockLists[A].add(B);
			blockLists[B].add(A);
		}

		boolean[] visited = new boolean[N];

		Set<Integer> group = new HashSet<Integer>();

		int groupCount = -1;
		int[] root = new int[N];

		for (int i = 0; i < N; i++) {
			if (!visited[i]) {
				groupCount++;
				group.clear();
				DFS(friendLists, i, visited, group);
				for (int j : group) {
					root[j] = groupCount;
					result[j] += group.size() - 1;
					//result[j] = group.size() - friendLists[j].size() - 1;
				}
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j : blockLists[i]) {
				if (i < j && root[i] == root[j]) {
					result[i]--;
					result[j]--;
				}
			}
		}

		for (int i : result) {
			System.out.print(i + " ");
		}
	}

	static void DFS(List<Integer>[] graph, int vertex, boolean[] visited, Set<Integer> reachable) {
		visited[vertex] = true;
		reachable.add(vertex);
		graph[vertex].forEach(neighbor -> {
			if (!visited[neighbor]) {
				DFS(graph, neighbor, visited, reachable);
			}
		});
	}

}

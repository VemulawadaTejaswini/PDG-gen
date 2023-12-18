import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int n;
	static ArrayList<ArrayList<Integer>> arr;
	static boolean[] visited;

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			arr.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < n - 1; i++) {
			int from = sc.nextInt() - 1;
			int to = sc.nextInt() - 1;
			arr.get(from).add(to);
			arr.get(to).add(from);
		}
		visited = new boolean[n];
		int Fennec = dfs(0, n - 1);
		visited = new boolean[n];
		int Snuke = dfs(n - 1, 0);
		System.out.println(Fennec >= Snuke ? "Fennec" : "Snuke");
	}

	static int dfs(int start, int end) {
		visited[start] = true;
		if (start == end) {
			return 0;
		}
		int cost = 1;
		ArrayList<Integer> Edges = arr.get(start);
		for (int i = 0; i < Edges.size(); i++) {
			int to = Edges.get(i);
			if (!visited[to]) {
				cost += dfs(to, end);
			}
		}
		return cost;
	}
}
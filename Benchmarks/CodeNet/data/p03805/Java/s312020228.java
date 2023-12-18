import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();

		graph = new boolean[n][n];
		used = new ArrayList<>();
		varsize = n;
		for (int i = 0; i < m; i++) {
			graph[scanner.nextInt() - 1][scanner.nextInt() - 1] = true;
		}

		dfs(0, used);

		System.out.println(cnt);

	}

	static boolean graph[][];
	static List<Integer> used;
	static int cnt = 0;
	static int varsize;

	private static void dfs(int i, List<Integer> used) {
		if (used.contains(i)) {
			return;
		} else {
			used.add(i);
			if (used.size() == varsize) {
				cnt++;
			}
		}

		for (int j = 0; j < graph.length; j++) {
			if (graph[i][j] || graph[j][i]) {
				dfs(j, new ArrayList<>(used));
			}
		}
	}

}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

public class Main {
	static int n;
	static int m;

	static int ans = 0;

	static boolean used[];

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		m = Integer.parseInt(str[1]);

		ArrayList<ArrayList<Integer>> edge = new ArrayList<>();
		used = new boolean[n];

		for (int i = 0; i < n; i++) {
			edge.add(new ArrayList<>());
		}

		for (int i = 0; i < m; i++) {
			str = br.readLine().split(" ");

			int a = Integer.parseInt(str[0]) - 1;
			int b = Integer.parseInt(str[1]) - 1;
			edge.get(a).add(b);
			edge.get(b).add(a);
		}

		for (int i = 0; i < n; i++) {
			dfs(edge, i, i, 0);
		}
		System.out.println(ans);
	}

	static void dfs(ArrayList<ArrayList<Integer>> edge, int s, int now, int add) {
		if (add == 3) {
			if (edge.get(now).indexOf(s) == -1 && now != s) {
				edge.get(now).add(s);
				edge.get(s).add(now);
				ans++;
				return;
			} else {
				return;
			}
		}

		for (int i = 0; i < edge.get(now).size(); i++) {
			int next = edge.get(now).get(i);
			if (!used[next]) {
				used[next] = true;
				dfs(edge, s, next, add + 1);
				used[next] = false;
			}
		}
	}
}
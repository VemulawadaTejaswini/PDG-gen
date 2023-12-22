
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	static int[] color;
	static int n;

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		n = in.nextInt();
		int m = in.nextInt();
		color = new int[n];

		List<List<Integer>> g = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			g.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < m; i++) {
			int v1 = in.nextInt();
			int v2 = in.nextInt();

			g.get(v1).add(v2);
			g.get(v2).add(v1);
		}

		assignColor(g);

//		for (int i = 0; i < g.size(); i++) {
//			System.out.println(i + " " + g.get(i));
//		}
		int q = in.nextInt();
		for (int i = 0; i < q; i++) {
			int s = in.nextInt();
			int t = in.nextInt();
			if (color[s] == color[t]) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
	private static void assignColor(List<List<Integer>> list) {
		Arrays.fill(color, -1);
		int id = 1;
		for (int i = 0; i < n; i++) {
			if (color[i] == -1) {
				dfs(list, i, id++);
			}
		}
	}

	public static void dfs(List<List<Integer>> list, int from, int id) {
		Stack<Integer> stack = new Stack<Integer>();

		stack.push(from);
		color[from] = id;

		while (!stack.isEmpty()) {
			from = stack.peek();
			boolean isConnect = false;
			for (int to : list.get(from)) {
				if (color[to] != -1) {
					continue;
				}
				isConnect = true;
				stack.push(to);
				color[to] = id;
				break;
			}
			if (!isConnect) {
				stack.pop();
			}
		}

	}

}



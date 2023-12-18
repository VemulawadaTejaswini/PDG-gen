import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();

		// int[] : { num, to }
		List<List<int[]>> tree = new ArrayList<>();
		for (int i = 0; i <= N; i++) {
			tree.add(new ArrayList<>());
		}

		for (int i = 0; i < N - 1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			tree.get(a).add(new int[] { i, b });
			tree.get(b).add(new int[] { i, a });

		}
		sc.close();

		int root = -1;
		for (int i = 0; i <= N; i++) {
			if (tree.get(i).size() == 1) {
				root = i;
				break;
			}
		}

		int[] color = new int[N - 1];

		color[tree.get(root).get(0)[0]] = 1;

		// int[] : { node, from, usedColor }
		Queue<int[]> que = new ArrayDeque<int[]>();

		que.add(new int[] { tree.get(root).get(0)[1], root, 1 });

		while (!que.isEmpty()) {
			int[] a = que.poll();
			int node = a[0];
			int from = a[1];
			int usedColor = a[2];

			int c = 1;
			for (int[] edge : tree.get(node)) {
				if (edge[1] == from) {
					continue;
				}
				if (c == usedColor) {
					c++;
				}
				color[edge[0]] = c;

				que.add(new int[] { edge[1], node, c });

				c++;
			}

		}

		int K = max(color);
		out.println(K);
		for (int c : color) {
			out.println(c);
		}

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	@SuppressWarnings("unused")
	private int max(int[] arr) {
		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException(Arrays.toString(arr));
		}

		int candidate = arr[0];
		for (int i = 1; i < arr.length; i++) {
			candidate = candidate > arr[i] ? candidate : arr[i];
		}
		return candidate;
	}
}

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		List<Integer>[] graph = new List[n];
		for (int i = 0; i < n; i++) {
			graph[i] = new ArrayList<Integer>();
		}

		for (int i = 0, a, b; i < n - 1; i++) {
			a = scanner.nextInt() - 1;
			b = scanner.nextInt() - 1;
			graph[a].add(b);
			graph[b].add(a);
		}

		int[] distance = new int[n];
		for (int i = 1; i < n; i++) {
			distance[i] = -1;
		}
		Queue<Integer> queue = new ArrayDeque<Integer>();
		queue.add(0);

		int v;
		while (!queue.isEmpty()) {
			v = queue.remove();
			for (int nv : graph[v]) {
				if (distance[nv] < 0) {
					distance[nv] = distance[v] + 1;
					queue.add(nv);
				}
			}
		}

		int[] number = { 1, 2, 3 };

		for (int i = 0; i < n; i++) {
			if (number[distance[i] % 2] <= n) {
				System.out.print(number[distance[i] % 2]);
				number[distance[i] % 2] += 3;
			} else {
				System.out.print(number[2]);
				number[2] += 3;
			}
			System.out.print(i == n - 1 ? "\n" : " ");
		}
	}

}

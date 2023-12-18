import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class P {
	int offset;
	int counter = 0;
	List<P> links = new ArrayList<>();
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] line = sc.nextLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int Q = Integer.parseInt(line[1]);

		P[] tree = new P[N];
		for (int i = 0; i < N; i++) {
			tree[i] = new P();
		}

		for (int i = 0; i < N - 1; i++) {
			line = sc.nextLine().split(" ");
			int a = Integer.parseInt(line[0]);
			int b = Integer.parseInt(line[1]);
			tree[a - 1].links.add(tree[b - 1]);
			tree[b - 1].links.add(tree[a - 1]);
		}

		for (int i = 0; i < Q; i++) {
			line = sc.nextLine().split(" ");
			int p = Integer.parseInt(line[0]);
			int x = Integer.parseInt(line[1]);
			tree[p - 1].offset += x;
		}

		dfs(null, tree[0], 0);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append(tree[i].counter).append(" ");
		}
		System.out.println(sb.toString());
	}

	static void dfs(P parent, P node, int sum) {
		sum += node.offset;
		node.counter = sum;
		for (P n : node.links) {
			if (n != parent) {
				dfs(node, n, sum);
			}
		}
	}
}
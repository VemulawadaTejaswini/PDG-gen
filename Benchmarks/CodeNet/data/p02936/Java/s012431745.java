import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Node {
	int idx;
	int cnt;
	List<Node> next = new ArrayList<>();

	Node(int idx) {
		this.idx = idx;
		this.cnt = 0;
	}

	public Node(int idx, Node node) {
		this.idx = idx;
		this.addNextNode(node);
	}

	void addNextNode(Node node) {
		this.next.add(node);
	}

	void addCnt(int cnt) {
		this.cnt += cnt;

		for (Node nextNode : this.next)
			nextNode.addCnt(cnt);
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] line = sc.nextLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int Q = Integer.parseInt(line[1]);

		Node[] tree = new Node[N + 1];

		for (int i = 1; i <= N - 1; i++) {
			line = sc.nextLine().split(" ");
			int a = Integer.parseInt(line[0]);
			int b = Integer.parseInt(line[1]);
			if (tree[a] == null && tree[b] == null) {
				tree[b] = new Node(b);
				tree[a] = new Node(a, tree[b]);
			}
			else if (tree[a] == null && tree[b] != null) {
				tree[a] = new Node(a, tree[b]);
			}
			else if (tree[a] != null && tree[b] == null) {
				tree[b] = new Node(b);
				tree[a].addNextNode(tree[b]);
			}
			else {
				tree[a].addNextNode(tree[b]);
			}
		}

		for (int i = 0; i < Q; i++) {
			line = sc.nextLine().split(" ");
			int p = Integer.parseInt(line[0]);
			int x = Integer.parseInt(line[1]);
			tree[p].addCnt(x);
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= N; i++) {
			sb.append(tree[i].cnt + " ");
		}
		System.out.print(sb.toString());
	}
}
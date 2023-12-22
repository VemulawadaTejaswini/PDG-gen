import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int L = sc.nextInt();
		Node[] nodes = new Node[N + 2];
		for (int i = 0; i < N; ++i) {
			nodes[i + 1] = new Node(L - sc.nextInt());
		}
		nodes[0] = nodes[N + 1] = new Node(0);
		Node root = new Node(0);
		for (int i = 1; i <= N; ++i) {
			boolean left = nodes[i - 1].v > nodes[i].v;
			if (left) {
				nodes[i - 1].child.add(nodes[i]);
			}
			boolean right = nodes[i + 1].v > nodes[i].v;
			if (right) {
				nodes[i + 1].child.add(nodes[i]);
			}
			if (!left && !right) {
				root.child.add(nodes[i]);
			}
		}
		Stack<Frame> stack = new Stack<Frame>();
		stack.push(new Frame(root, 0));
		int ret = 0;
		while (!stack.isEmpty()) {
			Frame f = stack.pop();
			if (f.i != 0) {
				f.t = Math.max(f.t, ret);
			}
			if (f.i == f.n.child.size()) {
				ret = f.t + f.n.v;
				continue;
			}
			stack.add(new Frame(f.n, f.i + 1));
			stack.add(new Frame(f.n.child.get(f.i), 0));
		}
		System.out.println(ret);
	}

	static class Frame {
		Node n;
		int i;
		int t = 0;

		Frame(Node n, int i) {
			this.n = n;
			this.i = i;
		}
	}

	static class Node {

		int v;
		ArrayList<Node> child = new ArrayList<Node>();

		Node(int v) {
			this.v = v;
		}

	}

}
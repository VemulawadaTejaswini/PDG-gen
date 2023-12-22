/**
 * Hierarchical Democracy
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {

			Tree tree = new Tree();
			Deque<Node> stack = new ArrayDeque<Node>();
			String num = "";

			line = br.readLine();
			for (char c : line.toCharArray()) {
				switch (c) {
					case '[':
						Node node = new Node();
						if (!stack.isEmpty()) {
							node.parent = stack.peek();
							stack.peek().children.add(node);
						}
						stack.push(node);
						break;
					case ']':
						if (num.length() > 0) {
							stack.peek().nums.add(parseInt(num));
							num = "";
						}
						if (stack.size() != 1) {
							stack.pop();
						} else {
							tree.root = stack.pop();
						}
						break;
					default:
						num += c;
						break;
				}
			}
			System.out.println(tree.solve());
		}
	} //end main
}

class Tree {
	Node root;

	int solve() {
		Deque<Node> stack = new ArrayDeque<Node>();
		stack.push(root);
		while (!stack.isEmpty()) {
			Node node = stack.pop();
			if (node.children.isEmpty()) {
				node.min = node.nums.get(0) / 2 + 1;
				continue;
			}
			//
			if (node.min == Node.NIL) {
				node.min = 0;
				stack.push(node);
				for (Node child : node.children) {
					stack.push(child);
				}
			} else {
				for (Node child : node.children) {
					node.nums.add(child.min);
				}
				Collections.sort(node.nums);
				for (int i = 0; i < node.nums.size() / 2 + 1; i++) {
					node.min += node.nums.get(i);
				}
			}
		}
		return root.min;
	}
}

class Node {
	static final int NIL = -1;
	Node parent;
	List<Node> children = new ArrayList<Node>();
	List<Integer> nums = new ArrayList<Integer>();
	int min = NIL;
}
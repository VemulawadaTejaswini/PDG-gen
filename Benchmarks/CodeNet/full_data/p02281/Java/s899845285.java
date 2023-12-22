package alds1.ALDS1_7_C.Tree_Walk_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	class Node {
		int p = -1, l, r;
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	public void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		Node[] nodes = new Node[n];
		for (int i = 0; i < n; i++) nodes[i] = new Node();
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int id = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			nodes[id].l = l;
			nodes[id].r = r;
			if (l != -1) nodes[l].p = id;
			if (r != -1) nodes[r].p = id;
		}
		reader.close();

		int rootId = -1;
		for (int i = 0; i < n; i++) {
			if (nodes[i].p == -1) {
				rootId = i;
				break;
			}
		}
		System.out.println("Preorder");
//		preOrder(nodes, rootId);
//		System.out.println();
		preOrderItr(nodes, rootId);
		System.out.println();
		
		System.out.println("Inorder");
//		inOrder(nodes, rootId);
//		System.out.println();
		inOrderItr(nodes, rootId);
		System.out.println();
		
		System.out.println("Postorder");
//		postOrder(nodes, rootId);
//		System.out.println();
		postOrderItr(nodes, rootId);
		System.out.println();
	}

	private void preOrder(Node[] nodes, int u) {
		if (u == -1) return;
		System.out.print(" " + u);
		preOrder(nodes, nodes[u].l);
		preOrder(nodes, nodes[u].r);		
	}

	private void preOrderItr(Node[] nodes, int u) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(u);
		while (!stack.isEmpty()) {
			int id = stack.pop();
			System.out.print(" " + id);
			if (nodes[id].r != -1) stack.push(nodes[id].r);
			if (nodes[id].l != -1) stack.push(nodes[id].l);
		}
	}
	
	private void inOrder(Node[] nodes, int u) {
		if (u == -1) return;
		inOrder(nodes, nodes[u].l);
		System.out.print(" " + u);
		inOrder(nodes, nodes[u].r);
	}

	private void inOrderItr(Node[] nodes, int rootId) {
		Stack<Integer> stack = new Stack<Integer>();
		Set<Integer> visited = new HashSet<Integer>();
		stack.push(rootId);		
		while (!stack.isEmpty()) {
			int id = stack.pop();
			if (nodes[id].r != -1) stack.push(nodes[id].r);
			if (nodes[id].l == -1 || visited.contains(nodes[id].l)) {
				if (!visited.contains(id)) {
					System.out.print(" " + id);
					visited.add(id);
				}
			} else {
				stack.push(id);
			}
			if (nodes[id].l != -1) stack.push(nodes[id].l);
		}
	}
	
	private void postOrder(Node[] nodes, int u) {
		if (u == -1) return;
		postOrder(nodes, nodes[u].l);
		postOrder(nodes, nodes[u].r);
		System.out.print(" " + u);
	}
	
	private void postOrderItr(Node[] nodes, int rootId) {
		Stack<Integer> stack = new Stack<Integer>();
		Set<Integer> visited = new HashSet<Integer>();
		stack.push(rootId);		
		while (!stack.isEmpty()) {
			int id = stack.pop();
			if (nodes[id].l == -1 || visited.contains(nodes[id].l)) {
				if (!visited.contains(id)) {
					System.out.print(" " + id);
					visited.add(id);
				}
			} else {
				stack.push(id);
			}
			if (nodes[id].r != -1) stack.push(nodes[id].r);
			if (nodes[id].l != -1) stack.push(nodes[id].l);
		}
	}	
}
 

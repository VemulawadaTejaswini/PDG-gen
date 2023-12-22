import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	static class Node {
		int id, parentId, left, right;
		boolean visited;
		public Node(int id) {
			this.id = id;
			parentId = left = right = -1;
			visited = false;
		}
		public String toString() {
			return String.format("%d", id);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		Node[] nodes = new Node[n];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int id = Integer.parseInt(st.nextToken());
			int left = Integer.parseInt(st.nextToken());
			int right = Integer.parseInt(st.nextToken());
			if (nodes[id] == null) {
				nodes[id] = new Node(id);
			}
			nodes[id].left = left;
			nodes[id].right = right;
			if (left != -1) {
				if (nodes[left] == null) {
					nodes[left] = new Node(left);
				}
				nodes[left].parentId = id;
			}
			if (right != -1) {
				if (nodes[right] == null) {
					nodes[right] = new Node(right);
				}
				nodes[right].parentId = id;
			}
		}
		
		System.out.println("Preorder");
		preOrder(nodes);
		System.out.println("Inorder");
		inOrder(nodes);
		resetVisited(nodes);
		System.out.println("Postorder");
		postOrder(nodes);		
	}

	private static void resetVisited(Node[] nodes) {
		for (int i = 0; i < nodes.length; i++) {
			nodes[i].visited = false;
		}
	}
	
	private static void preOrder(Node[] nodes) {
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < nodes.length; i++) {
			if (nodes[i].parentId == -1) {
				stack.push(nodes[i].id);
				break;
			}
		}
		while (!stack.isEmpty()) {
			Node node = nodes[stack.pop()];
			System.out.print(" " + node.id);
			if (node.right != -1) {
				stack.push(node.right);
			}
			if (node.left != -1) {
				stack.push(node.left);
			}
		}
		System.out.println("");
	}

	private static void inOrder(Node[] nodes) {
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < nodes.length; i++) {
			if (nodes[i].parentId == -1) {
				stack.push(nodes[i].id);
				break;
			}
		}
		while (!stack.isEmpty()) {
			Node node = nodes[stack.pop()];
			if (node.right != -1 && !nodes[node.right].visited) {
				stack.push(node.right);
			}
			if (node.left == -1 || nodes[node.left].visited) {
				if (!node.visited) {
					System.out.print(" " + node.id);
					node.visited = true;
				}
			} else {
				stack.push(node.id);
			}
			if (node.left != -1 && !nodes[node.left].visited) {
				stack.push(node.left);
			}
		}
		System.out.println("");
	}

	private static void postOrder(Node[] nodes) {
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < nodes.length; i++) {
			if (nodes[i].parentId == -1) {
				stack.push(nodes[i].id);
				break;
			}
		}
		while (!stack.isEmpty()) {
			Node node = nodes[stack.pop()];
			if (node.left == -1 || nodes[node.left].visited) {
				System.out.print(" " + node.id);
				node.visited = true;
			} else {
				stack.push(node.id);
			}
			if (node.right != -1 && !nodes[node.right].visited) {
				stack.push(node.right);
			}
			if (node.left != -1 && !nodes[node.left].visited) {
				stack.push(node.left);
			}
		}
		System.out.println("");
	}
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;
import java.util.Stack;

public class Main {

	private class TreeNode<T> {
		T value;
		TreeNode<T> left;
		TreeNode<T> right;
		TreeNode<T> parent;
		public TreeNode(T value) {
			this.value = value;
			left = right = null;
		}
		public String toString() {			
			if (value == null) {
				return "null";
			} 
			return value.toString();
		}
	}

	private class NodeData {
		int id, left, right;
		public NodeData(int id, int left, int right) {
			this.id = id;
			this.left = left;
			this.right = right;
		}
	}

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		NodeData[] data = new NodeData[n];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int id = Integer.parseInt(st.nextToken());
			int left = Integer.parseInt(st.nextToken());
			int right = Integer.parseInt(st.nextToken());
			data[i] = new NodeData(id, left, right);
		}
		reader.close();
		
		Map<Integer, TreeNode<Integer>> map = new HashMap<Integer, TreeNode<Integer>>();
		for (int i = 0; i < n; i++) {
			TreeNode<Integer> current = map.get(data[i].id);
			if (current == null) {
				current = new TreeNode<Integer>(data[i].id);
				map.put(data[i].id, current);
			}
			if (data[i].left != -1) {
				TreeNode<Integer> left = map.get(data[i].left);
				if (left == null) {
					left = new TreeNode<Integer>(data[i].left);
					map.put(data[i].left, left);
				}
				current.left = left;
				left.parent = current;
			}
			if (data[i].right != -1) {
				TreeNode<Integer> right = map.get(data[i].right);
				if (right == null) {
					right = new TreeNode<Integer>(data[i].right);
					map.put(data[i].right, right);
				}
				current.right = right;
				right.parent = current;
			}
		}		

		TreeNode<Integer> rootNode = null;
		for (int i = 0; i < n; i++) {
			if (map.get(data[i].id).parent == null) {
				rootNode = map.get(data[i].id);
				break;
			}
		}

		System.out.println("Preorder");
		preOrder(rootNode);
		System.out.println("Inorder");
		inOrder(rootNode);
		System.out.println("Postorder");		
		postOrder(rootNode);
	}

	private void preOrder(TreeNode<Integer> rootNode) {
		Stack<TreeNode<Integer>> stack = new Stack<TreeNode<Integer>>();
		stack.push(rootNode);
		while (!stack.isEmpty()) {
			TreeNode<Integer> current = stack.pop();
			System.out.print(" " + current);
			if (current.right != null)
				stack.push(current.right);
			if (current.left != null)
				stack.push(current.left);
		}
		System.out.println("");
	}
	
	private void inOrder(TreeNode<Integer> rootNode) {
		Stack<TreeNode<Integer>> stack = new Stack<TreeNode<Integer>>();
		TreeNode<Integer> current = rootNode;
		while (current != null || !stack.isEmpty()) {
			if (current != null) {
				stack.push(current);
				current = current.left;
			} else {
				current = stack.pop();
				System.out.print(" " + current);
				current = current.right;
			}
		}
		System.out.println("");
	}
	
	private void postOrder(TreeNode<Integer> rootNode) {
		Stack<TreeNode<Integer>> stack = new Stack<TreeNode<Integer>>();
		TreeNode<Integer> current = rootNode;
		TreeNode<Integer> lastVisited = null;
		while (current != null || !stack.isEmpty()) {
			if (current != null) {
				stack.push(current);
				current = current.left;
			} else {
				TreeNode<Integer> peekNode = stack.peek();
				if (peekNode.right != null && peekNode.right != lastVisited) {
					current = peekNode.right;
				} else {
					System.out.print(" " + peekNode);
					lastVisited = stack.pop();
				}
			}
		}
		System.out.println("");
	}
}

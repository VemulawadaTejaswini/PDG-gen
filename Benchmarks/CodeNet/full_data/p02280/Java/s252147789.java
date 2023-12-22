import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static class Node {
		int id, parentId, left, right, sibling, depth, height;
		public Node(int id) {
			this.id = id;
			this.parentId = -1;
			this.left = -1;
			this.right = -1;
			this.sibling = -1;
			this.depth = -1;
			this.height = -1;
		}
		public String getType() {
			if (parentId == -1) {
				return "root";
			} else if (left == -1 && right == -1) {
				return "leaf";
			}
			return "internal node";
		}
		public int getDegree() {
			if (left == -1 && right == -1) {
				return 0;
			} else if (left != -1 && right != -1) {
				return 2;
			}
			return 1;
		}
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("node " + id + ": ");
			sb.append("parent = " + parentId + ", ");
			sb.append("sibling = " + sibling + ", ");
			sb.append("degree = " + getDegree() + ", ");
			sb.append("depth = " + depth + ", ");
			sb.append("height = " + height + ", ");
			sb.append(getType());
			return sb.toString();			
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
			if (left == -1 && right == -1) {
				nodes[id].height = 0;
			}
			
			if (left != -1) {
				if (nodes[left] == null) {
					nodes[left] = new Node(left);
				}
				nodes[left].parentId = id;
				nodes[left].sibling = right;
			}
			if (right != -1 ) {
				if (nodes[right] == null) {
					nodes[right] = new Node(right);
				}
				nodes[right].parentId = id;
				nodes[right].sibling = left;
			}
		}
		
		calcDepth(nodes);
		calcHeight(nodes);
		
		for (Node node : nodes) {
			System.out.println(node);
		}
	}

	private static void calcDepth(Node[] nodes) {
		int rootId = -1;
		for (int i = 0; i < nodes.length; i++) {
			if (nodes[i].parentId == -1) {
				rootId = nodes[i].id;
				nodes[i].depth = 0;
				break;
			}
		}
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(rootId);		
		while (!queue.isEmpty()) {
			int id = queue.poll();
			int depth = nodes[id].depth;
			if (nodes[id].left != -1) {
				nodes[nodes[id].left].depth = depth + 1;
				queue.add(nodes[id].left);
			}
			if (nodes[id].right != -1) {
				nodes[nodes[id].right].depth = depth + 1;
				queue.add(nodes[id].right);
			}
		}
	}
	
	private static void calcHeight(Node[] nodes) {
		Queue<Integer> queue = new LinkedList<Integer>();
		for (int i = 0; i < nodes.length; i++) {
			if (nodes[i].height == 0) {
				queue.add(nodes[i].id);
			}
		}
		while (!queue.isEmpty()) {
			int id = queue.poll();
			int height = nodes[id].height;
			if (nodes[id].parentId != -1) {
				int parentId = nodes[id].parentId;
				nodes[parentId].height = Math.max(nodes[parentId].height, height + 1);
				queue.add(nodes[id].parentId);
			}
		}	
	}
}

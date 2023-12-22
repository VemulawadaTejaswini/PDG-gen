import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static class Node {
		int id, parentId, left, right, sibling, depth, height;
		public Node(int id, int parentId, int sibling) {
			this.id = id;
			this.parentId = parentId;
			this.left = -1;
			this.right = -1;
			this.sibling = sibling;
			this.depth = 0;
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
			sb.append("parent = " + parentId + ",");
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
				nodes[id] = new Node(id, -1, -1);
			}
			nodes[id].left = left;
			nodes[id].right = right;
			if (left == -1 && left == -1) {
				nodes[id].height = 0;
			}
			if (nodes[id].parentId != -1) {
				nodes[id].depth = nodes[nodes[id].parentId].depth + 1;
			}
			
			if (left != -1 && nodes[left] == null) {
				nodes[left] = new Node(left, id, right);
				nodes[left].depth = nodes[id].depth + 1;
			}
			if (right != -1 && nodes[right] == null) {
				nodes[right] = new Node(right, id, left);
				nodes[right].depth = nodes[id].depth + 1;
			}
		}
		
		for (int i = n - 1; i >= 0; i--) {
			if (nodes[i].height != -1 && nodes[i].parentId != -1) {
				nodes[nodes[i].parentId].height = Math.max(nodes[nodes[i].parentId].height, nodes[i].height + 1);
			}
		}
		
		for (Node node : nodes) {
			System.out.println(node);
		}
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static class Node {
		int id;
		int parentId;
		int depth;
		int[] children;
		public Node(int id, int parentId) {
			this.id = id;
			this.parentId = parentId;
			this.children = null;
			this.depth = 0;
		}
		public void setChildlen(int[] childlen) {
			this.children = childlen;
		}
		public void setParentId(int parentId) {
			this.parentId = parentId;
		}
		public void setDepth(int depth) {
			this.depth = depth;
		}
		private String getType() {
			if (depth == 0) {
				return "root";
			}
			if (children == null || children.length == 0) {
				return "leaf";
			}
			return "internal node";
		}		
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("node " + id + ": ");
			sb.append("parent = " + parentId + ", ");
			sb.append("depth = " + depth + ", ");
			sb.append(getType() + ", ");
			sb.append(Arrays.toString(children));
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
			if (nodes[id] == null) {
				nodes[id] = new Node(id, -1);
			}
			
			int m = Integer.parseInt(st.nextToken());
			int[] children = new int[m];
			for (int j = 0; j < m; j++) {
				int childId = Integer.parseInt(st.nextToken());
				children[j] = childId;
				if (nodes[childId] == null) {
					nodes[childId] = new Node(childId, id);
				} else {
					nodes[childId].setParentId(id);
				}
				nodes[childId].setDepth(nodes[id].depth + 1);
			}
			nodes[id].setChildlen(children);
		}
		
		for (Node node : nodes) {
			System.out.println(node);
		}
	}
}


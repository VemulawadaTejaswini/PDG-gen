import java.util.Scanner;

public class Main {
	final boolean DEBUG = false;

	class Node {
		Node p;
		Node[] child;
		int id, depth;
		
		Node(int id, int k, int[] c, Node p) {
			if (DEBUG)
				System.out.println("make root:" + id);
			this.id = id;
			this.p = p;
			this.depth = (p == null ? 0 : p.depth + 1);
			this.setNode(k, c);
		}
		Node(int id, Node p) {
			this.id = id;
			this.p = p;
			this.depth = p.depth + 1;
		}
		
		Node getNode(int id) {
			if (this.id == id)
				return this;
			if (this.child == null)
				return null;

			for (int i = 0; i < this.child.length; i++) {
				Node node = this.child[i].getNode(id);
				if (node != null)
					return node;
			}
			return null;
		}

		void setNode(int k, int[] c) {
			if (DEBUG) {
				System.out.println("set id: " + id);
			}
			this.child = new Node[k];
			for (int i = 0; i < k; i++) {
				System.out.println(c[i]);
				child[i] = new Node(c[i], this);
				if (DEBUG)
					System.out.println("make child:" + c[i]);
			}
		}
		
		public String toString() {
			String parent = "parent = " + (this.p == null ? -1 : this.p.id);
			String depth  = "depth = " + this.depth;
			String type   = this.p == null         ? "root" :
							this.child.length != 0 ? "internal node" :
													 "leaf";
			String c = "[";
			for (int i = 0; i < this.child.length; i++)
				c += this.child[i].id + (i != this.child.length - 1 ? ", " : "");
			c += "]";

			return parent + ", " + depth + ", " + type + ", " + c;
		}
	}
	
	void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Node node = null;
		for (int i = 0; i < n; i++) {
			int id = scan.nextInt();
			int k = scan.nextInt();
			int[] c = new int[k];
			for (int j = 0; j < k; j++)
				c[j] = scan.nextInt();
			if (i == 0)
				node = new Node(id, k, c, null);
			else
				node.getNode(id).setNode(k, c);
		}
		for (int i = 0; i < n; i++)
			System.out.println("node " + i + ": " + node.getNode(i).toString());
	}

	public static void main(String[] args) {
		new Main().run();
	}
}


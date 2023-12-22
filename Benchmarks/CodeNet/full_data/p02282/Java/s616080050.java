import java.util.Scanner;

public class Main {
	final boolean DEBUG = false;
	static class Node {
		private static boolean isFirstPrint = false;

		int id;
		Node l, r;
		Node(int id) {
			this.id = id;
		}

		void printPostOrder() {
			isFirstPrint = true;
			this.postorder();
		}
		void postorder() {
			if (this.l != null)
				this.l.postorder();
			if (this.r != null)
				this.r.postorder();
			System.out.print((isFirstPrint ? "" : " ") + this.id);
			isFirstPrint = false;
		}
	}
	Node[] nodes;
	int[] preIds, inIds;
	int preIndex, inIndex;

	void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		nodes = new Node[n + 1];
		preIds = new int[n];
		inIds = new int[n];
		preIndex = inIndex = 0;

		for (int i = 1; i <= n; i++)
			nodes[i] = new Node(i);
		for (int i = 0; i < n; i++)
			preIds[i] = scan.nextInt();
		for (int i = 0; i < n; i++)
			inIds[i] = scan.nextInt();

		int rootId = preIds[0];
		nodes[rootId] = makeTree(preIds);

		nodes[rootId].printPostOrder();
		System.out.println();
	}

	Node makeTree(int[] ids) {
		if (ids.length == 1)
			return nodes[ids[0]];
		int rootId = preIds[preIndex++];
		int[] lIds = null, rIds = null;
		int lidx = 0, ridx = 0;
		for (int i = 0; i < ids.length; i++) {
			if (rootId != inIds[i])
				continue;
			lidx = i;
			ridx = ids.length - i - 1;
			lIds = new int[lidx];
			rIds = new int[ridx];
			for (int j = 0; j < lidx; j++)
				lIds[j] = inIds[j];
			for (int j = 0; j < ridx; j++)
				rIds[j] = inIds[i + j + 1];
		}
		if (DEBUG) {
			System.out.println("rootId: " + rootId);
		}
		nodes[rootId].l = makeTree(lIds);
		nodes[rootId].r = makeTree(rIds);
		return nodes[rootId];
	}

	public static void main(String[] args) {
		new Main().run();
	}
}


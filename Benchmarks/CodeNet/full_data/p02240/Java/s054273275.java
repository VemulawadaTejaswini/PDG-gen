import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		int n = ReadIntMan.readint();
		int m = ReadIntMan.readint();

		Node[] v = new Node[n];
		for (int i=0; i < n; i++) {
			v[i] = new Node();
		}

		for (int i=0; i < m; i++) {
			int s = ReadIntMan.readint();
			int t = ReadIntMan.readint();

			v[s].friends.add(t);
			v[t].friends.add(s);
		}

		for (int id=0; id < n; id++) {
			decompose(v, id, id);
		}

		StringBuilder ans = new StringBuilder();

		int q = ReadIntMan.readint();
		for (int i=0; i < q; i++) {
			int s = ReadIntMan.readint();
			int t = ReadIntMan.readint();

			if (v[s].label == v[t].label) ans.append("yes\n");
			else ans.append("no\n");
		}

		System.out.print(ans);
	}

	public static void decompose(Node[] u,int id, int label) {
		if (u[id].label != -1) return;
		u[id].label = label;

		for (int f: u[id].friends) {
			decompose(u, f, label);
		}
	}

	public static class Node {
		int label;

		LinkedList<Integer> friends;

		public Node() {
			this.label = -1;
			this.friends = new LinkedList<>();
		}
	}

	public static class ReadIntMan {
		public static int readint() throws Exception {
			int c = System.in.read();

			while (spaceorenter(c)) {
				c = System.in.read();
			}

			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = System.in.read();
			}

			int n = 0;
			while (! spaceorenter(c)) {
				n = 10*n;
				n = n + c - '0';
				c = System.in.read();
			}

			return sgn * n;
		}

		private static boolean spaceorenter(int c) {
			return c == ' ' || c == '\n' || c == '\r';
		}
	}
}
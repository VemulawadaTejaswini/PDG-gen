public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		int n = ReadIntMan.readint();
		int m = ReadIntMan.readint();

		Node[] v = new Node[n];
		for (int i=0; i < n; i++) {
			v[i] = new Node(i);
		}

		for (int i=0; i < m; i++) {
			int s = ReadIntMan.readint();
			int t = ReadIntMan.readint();

			if (v[s].label == v[t].label) continue;

			Node temp = v[t];
			do {
				temp.label = v[s].label;
				temp = temp.next;
			} while (temp != v[t]);

			Node vsnext = v[s].next;
			Node vtnext = v[t].next;

			v[s].next = vtnext;
			v[t].next = vsnext;
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

	public static class Node {
		int label;

		Node next;

		public Node(int label) {
			this.label = label;
			this.next = this;
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
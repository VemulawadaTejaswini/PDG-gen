import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		for (; solver.hasNext();) {
			solver.readBody(in.readLine());
		}
		solver.solve();
	}
}

class Solver {
	int N;
	int Q;
	int cnt;

	public void init() {
		N = 0;
		Q = 0;
		cnt = 0;
		Nodes = new ArrayList<Node>();
	}

	public void readHead(String str) {
		String[] strArr = str.split("\\s+");
		N = Integer.parseInt(strArr[0]);
		Q = Integer.parseInt(strArr[1]);
		// System.out.println(N);
		for (int i = 0; i <= N; i++)
			Nodes.add(new Node(i));
	}

	public boolean hasNext() {
		return cnt < N + Q - 1;
	}

	public void readBody(String str) {
		// System.out.println(str);
		String[] strArr = str.split("\\s+");
		if (cnt < N - 1) {
			int a = Integer.parseInt(strArr[0]);
			int b = Integer.parseInt(strArr[1]);
			Nodes.get(a).addChild(Nodes.get(b));
		} else if (cnt < N + Q - 1) {
			int p = Integer.parseInt(strArr[0]);
			int x = Integer.parseInt(strArr[1]);
			Nodes.get(p).add(x);
		}
		cnt++;
	}

	private class Node {
		int Idx;
		HashSet<Node> Child;
		long Cnt;

		public Node(int idx) {
			super();
			Idx = idx;
			Child = new HashSet<Node>();
			Cnt = 0;
		}

		@Override
		public String toString() {
			String str = "Node [Idx=" + Idx + " Child";
			for (Node n : Child)
				str = str + " " + n.Idx;
			str = str + "]";
			return str;
		}

		public void addChild(Node n) {
			Child.add(n);
		}

		public void add(long x) {
			Cnt += x;
		}

		public void addCascade(long x) {
			Cnt += x;
			for (Node n : Child)
				n.addCascade(Cnt);
		}
	}

	ArrayList<Node> Nodes;

	public void solve() {
		Nodes.get(1).addCascade(0);
		String sep = "";
		for (int i = 1; i <= N; i++) {
			System.out.print(sep + Nodes.get(i).Cnt);
			sep = " ";
		}
		System.out.println();
	}
}

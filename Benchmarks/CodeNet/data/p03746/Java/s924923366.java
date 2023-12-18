import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

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
	Vertex[] Vertexes;

	class Vertex {
		int Idx;
		ArrayList<Integer> Link;

		Vertex(int i) {
			Idx = i;
			Link = new ArrayList<Integer>();
		}

		void AddLink(int v) {
			Link.add(v);
		}
	}

	int N;
	int M;
	int cnt;

	public void init() {
		N = 0;
		M = 0;
		cnt = 0;
	}

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		N = Integer.parseInt(strArr[0]);
		M = Integer.parseInt(strArr[1]);
		// System.out.println(N);
		Vertexes = new Vertex[N + 1];
		for (int i = 1; i <= N; i++) {
			Vertexes[i] = new Vertex(i);
		}
	}

	public boolean hasNext() {
		return cnt < M;
	}

	int Head;
	int Tail;

	public void readBody(String str) {
		String[] strArr = str.split(" ");
		int a = Integer.parseInt(strArr[0]);
		int b = Integer.parseInt(strArr[1]);
		Vertexes[a].AddLink(b);
		Vertexes[b].AddLink(a);
		Head = a;
		Tail = b;
		cnt++;
	}

	public void solve() {
		// for (int i = 1; i <= N; i++) {
		// System.out.println(Vertexes[i].Idx);
		// for (int l : Vertexes[i].Link)
		// System.out.print(" " + l);
		// System.out.println();
		// }
		ArrayList<Integer> path = new ArrayList<Integer>();
		path.add(Head);
		path.add(Tail);

		for (boolean criteria = true; criteria;) {
			criteria = false;
			for (int l : Vertexes[Head].Link) {
				if (!path.contains(l)) {
					Head = l;
					path.add(0, l);
					criteria = true;
					break;
				}
			}
			if (!criteria) {
				for (int l : Vertexes[Tail].Link) {
					if (!path.contains(l)) {
						Tail = l;
						path.add(l);
						criteria = true;
						break;
					}
				}
			}
		}

		System.out.println(path.size());
		String sep = "";
		for (int p : path) {
			System.out.print(sep + p);
			if ("".equals(sep))
				sep = " ";
		}
		System.out.println();
	}

}

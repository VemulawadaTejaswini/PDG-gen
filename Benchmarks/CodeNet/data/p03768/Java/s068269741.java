import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readNM(in.readLine());
		for (; solver.hasNextLink();)
			solver.readLink(in.readLine());
		solver.readQ(in.readLine());
		for (; solver.hasNextPaint();)
			solver.readPaint(in.readLine());
		solver.solve();
	}
}

class Solver {

	Vertex[] Vertexes;

	class Vertex {
		int Idx;
		int Color;
		ArrayList<Integer> Link;

		Vertex(int i) {
			Idx = i;
			Color = 0;
			Link = new ArrayList<Integer>();
		}

		void AddLink(int v) {
			Link.add(v);
		}

		void Paint(int d, int c, int from) {
			// System.out.println(Idx + " " + d + " " + c + " " + from);
			Color = c;
			if (d > 0) {
				for (int next : Link) {
					if (next != from) {
						Vertexes[next].Paint(d - 1, c, Idx);
					}
				}
			}
		}
	}

	int N;
	int M;
	int Q;
	int cntM;
	int cntQ;

	public void init() {
		N = 0;
		M = 0;
		Q = 0;
		cntM = 0;
		cntQ = 0;
	}

	public void readNM(String str) {
		String[] strArr = str.split(" ");
		N = Integer.parseInt(strArr[0]);
		M = Integer.parseInt(strArr[1]);
		Vertexes = new Vertex[N + 1];
		for (int i = 1; i <= N; i++)
			Vertexes[i] = new Vertex(i);
	}

	public boolean hasNextLink() {
		return cntM < M;
	}

	public void readLink(String str) {
		String[] strArr = str.split(" ");
		int a = Integer.parseInt(strArr[0]);
		int b = Integer.parseInt(strArr[1]);
		Vertexes[a].AddLink(b);
		Vertexes[b].AddLink(a);
		cntM++;
	}

	public void readQ(String str) {
		Q = Integer.parseInt(str);
	}

	public boolean hasNextPaint() {
		return cntQ < Q;
	}

	public void readPaint(String str) {
		String[] strArr = str.split(" ");
		int v = Integer.parseInt(strArr[0]);
		int d = Integer.parseInt(strArr[1]);
		int c = Integer.parseInt(strArr[2]);
		Vertexes[v].Paint(d, c, -1);
		cntQ++;
	}

	public void solve() {
		for (int i = 1; i <= N; i++)
			System.out.println(Vertexes[i].Color);
	}
}

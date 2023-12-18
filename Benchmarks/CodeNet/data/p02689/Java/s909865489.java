import java.util.*;
import java.util.ArrayList;

public class Main {

	public static class SparseGraph {
		private int n, m;
		private boolean directed;
		private ArrayList<ArrayList<Integer>> g;

		SparseGraph(int n, boolean directed) {
			this.n = n;
			this.m = 0;
			this.g = new ArrayList<>();
			this.directed = directed;
			for (int i = 0; i < n; i++) {
				g.add(i, new ArrayList<>());
			}
		}

		private void checkOutOfRange(int v) {
			if (v > n || v < 0) {
				throw new IllegalArgumentException("v is out of range");
			}
		}

		public int V() {
			return this.n;
		}

		public int E() {
			return this.m;
		}

		public void addEdge(int v, int w) {
			this.checkOutOfRange(v);
			this.checkOutOfRange(w);

			if (this.hasEdge(v, w)) {
				return;
			}
			g.get(v).add(w);
			if (v != w && !directed) {
				g.get(w).add(v);
			}
			m++;
		}

		public boolean hasEdge(int v, int w) {
			this.checkOutOfRange(v);
			this.checkOutOfRange(w);
			return g.get(v).contains(w);
		}

		public List<Integer> adj(int v) {
			this.checkOutOfRange(v);
			return g.get(v);
		}
	}

	private static List<Long> getStrings(Scanner sc, int num) {
		List<Long> stringList = new ArrayList<>();
		while(num>0) {
			long nextInt = sc.nextLong();
			stringList.add(nextInt);
			num--;
		}
		return stringList;
	}

	private static List<Ab> getEdge(Scanner sc, int num) {
		List<Ab> stringList = new ArrayList<>();
		while(num>0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			stringList.add(new Ab(a ,b));
			num--;
		}
		return stringList;
	}

	private static class Ab{
		private int a;
		private int b;

		public Ab(int a, int b) {
			this.a = a;
			this.b = b;
		}

		public int getA() {
			return a;
		}

		public void setA(int a) {
			this.a = a;
		}

		public int getB() {
			return b;
		}

		public void setB(int b) {
			this.b = b;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<Long> hs = getStrings(sc, n);
		List<Ab> abs = getEdge(sc, m);
		SparseGraph sparseGraph = new SparseGraph(n+1, false);
		for (int i = 0; i < abs.size(); i++) {
			sparseGraph.addEdge(abs.get(i).a, abs.get(i).b);
		}
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			List<Integer> list = sparseGraph.adj(i);
			if (list.isEmpty()) {
				sum++;
				continue;
			} else {
				long height = hs.get(i-1);
				boolean flag = false;
				for (int j = 0; j < list.size(); j++) {
					if (hs.get(list.get(j)-1) >= height) {
						flag = true;
						break;
					}
				}
				if (!flag) {
					sum++;
				}

			}
		}
		System.out.println(sum);
	}

}

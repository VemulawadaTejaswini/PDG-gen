import java.util.*;
import java.util.ArrayList;

public class Main {

	public static class SparseGraph {
		private int n, m;
		private boolean directed;
		private ArrayList<ArrayList<Weight>> g;

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

		public void addEdge(int v, Weight weight) {
			if (this.hasEdge(v, weight)) {
				return;
			}
			g.get(v).add(weight);
			if (!directed) {
				int b = weight.getB();
				g.get(b).add(new Weight(b, v, (-1)*weight.getWeight()));
			}
			m++;
		}

		public boolean hasEdge(int v, Weight weight) {
			return g.get(v).contains(weight);
		}

		public List<Weight> adj(int v) {
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

	private static class Weight{
		private int a;
		private int b;
		private long weight;

		public Weight(int a, int b, long weight) {
			this.a = a;
			this.b = b;
			this.weight = weight;
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

		public long getWeight() {
			return weight;
		}

		public void setWeight(long weight) {
			this.weight = weight;
		}
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
			int aindex = abs.get(i).a;
			int bindex = abs.get(i).b;
			sparseGraph.addEdge(abs.get(i).a, new Weight(aindex, bindex, hs.get(bindex-1)- hs.get(aindex-1)));
		}
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			List<Weight> list = sparseGraph.adj(i);
			if (list.isEmpty()) {
				sum++;
				continue;
			} else {
				boolean flag = false;
				for (int j = 0; j < list.size(); j++) {
					if (list.get(j).getWeight() >= 0) {
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

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		List<Node> list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new Node(i));
		}
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			int s = Integer.parseInt(sa[0]) - 1;
			int t = Integer.parseInt(sa[1]) - 1;
			list.get(s).list.add(new Hen(t));
		}
		br.close();

		for (int i = n - 2; i >= 0; i--) {
			Node node = list.get(i);
			double sum = 0;
			for (Hen h : node.list) {
				Node next = list.get(h.v);
				h.c = next.exp + 1;
				sum += h.c;
			}
			node.exp = sum / node.list.size();
		}
		double ans = list.get(0).exp;

		for (int i = 0; i < n - 1; i++) {
			Collections.sort(list.get(i).list);
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = n - 2; j >= 0; j--) {
				Node node = list.get(j);
				int start = 0;
				if (node.v == i) {
					if (node.list.size() <= 1) {
						continue;
					}
					start++;
				}
				double sum = 0;
				for (int k = start; k < node.list.size(); k++) {
					Hen h = node.list.get(k);
					Node next = list.get(h.v);
					h.c = next.exp + 1;
					sum += h.c;
				}
				node.exp = sum / (node.list.size() - start);
			}
			ans = Math.min(ans, list.get(0).exp);
		}
		System.out.println(ans);
	}

	static class Hen implements Comparable<Hen> {
		int v;
		double c;

		public Hen(int v) {
			this.v = v;
		}
		public int compareTo(Hen o) {
			return Double.compare(o.c, c);
		}
	}

	static class Node {
		int v;
		double exp;
		List<Hen> list = new ArrayList<>();

		public Node(int v) {
			this.v = v;
		}
	}
}

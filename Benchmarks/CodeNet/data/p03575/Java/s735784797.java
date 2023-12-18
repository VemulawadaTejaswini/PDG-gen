import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static class Edge {
		int e1, e2;
		public Edge (int e1, int e2) {
			this.e1 = e1;
			this.e2 = e2;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		Edge[] c = new Edge[m];
		int ans = 0;
		for (int i = 0; i < m; i++)
			c[i] = new Edge(Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
		for (int i = 0; i < m; i++) {
			Edge[] d = new Edge[m - 1];
			for (int j = 0; j < i; j++)
				d[j] = c[j];
			for (int j = i; j < m - 1; j++)
				d[j] = c[j + 1];
			ans += search(n, d);
		}
		System.out.println(ans);
	}

	public static int search(int n, Edge[] d) {
		int[] already = new int[n + 1];
		Deque<Integer> p = new ArrayDeque<Integer>();
		already[d[0].e1] = 1;
		p.push(d[0].e1);
		int count = 1;
		while(!p.isEmpty()) {
			int here = p.pop();
			for (int i = 0; i < d.length; i++) {
				if (d[i].e1 == here && already[d[i].e2] != 1) {
					already[d[i].e2] = 1;
					p.push(d[i].e2);
					count++;
				}
				else if (d[i].e2 == here && already[d[i].e1] != 1) {
					already[d[i].e1] = 1;
					p.push(d[i].e1);
					count++;
				}
			}
		}
		if (count == n)
			return 0;
		else
			return 1;
	}
}
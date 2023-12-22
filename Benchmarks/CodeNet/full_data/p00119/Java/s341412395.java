
import static java.util.Arrays.deepToString;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	public void run() {
		for (;sc.hasNext();) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			V[] vs = new V[n];
			for (int i = 0; i < vs.length; i++) {
				vs[i] = new V();
				vs[i].id = i + 1;
			}
			for (int i = 0; i < m; i++) {
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				vs[a].add(vs[b]);
				vs[b].indeg++;
			}

			Queue<V> q = new LinkedList<V>();
			for (V v : vs) {
				if (v.indeg == 0) {
					q.add(v);
				}
			}
			ArrayList<V> ans = new ArrayList<V>();
			while (!q.isEmpty()) {
				V u = q.poll();
				ans.add(u);
				for (V v : u) {
					v.indeg--;
					if (v.indeg == 0) q.add(v);
				}
			}
			for (V v : ans) {
				System.out.println(v.id);
			}
		}
	}
	
	static class V extends ArrayList<V> {
		int id;
		int indeg;
	}
	
}
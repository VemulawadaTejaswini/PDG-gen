import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = Integer.parseInt(sc.next());
		int E = Integer.parseInt(sc.next());
		int[] cnt = new int[V];
		ArrayList<ArrayList<Integer>> edge = new ArrayList<ArrayList<Integer>>();
		for (int i=0;i<V;i++) {
			ArrayList<Integer> add = new ArrayList<Integer>();
			edge.add(add);
		}
		for (int i=0;i<E;i++) {
			int s = Integer.parseInt(sc.next());
			int t = Integer.parseInt(sc.next());
			edge.get(s).add(t);
			cnt[t]++;
		}

		ArrayList<Integer> ans = new ArrayList<Integer>();
		ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
		for (int i=0;i<V;i++) {
			if (cnt[i]==0) {
				ans.add(i);
				queue.add(i);
			}
		}

		while (!queue.isEmpty()) {
			Integer rem = queue.remove();
			for (Integer i : edge.get(rem)) {
				cnt[i]--;
				if (cnt[i]==0) {
					ans.add(i);
					queue.add(i);
				}
			}
		}
		for (Integer i : ans) {
			System.out.println(i);
		}
	}
}

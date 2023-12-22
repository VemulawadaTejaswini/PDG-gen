import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		boolean [] not_replay = new boolean[n];
		boolean [] is_replayed = new boolean[n];
		boolean [] visible = new boolean[n];
		int [] parent = new int[n];
		int [] height = new int[n];
		for (int i=0;i<n;i++) {
			int a = s.nextInt();
			if (a == 0) {
				not_replay[i] = true;
				parent[i] = -1;
			} else {
				is_replayed[a - 1] = true;
				parent[i] = a - 1;
			}
		}
		Deque<Integer> que = new ArrayDeque<Integer>();
		boolean[] checked = new boolean[n];
		for (int i=0;i<n;i++) {
			check(i, not_replay, is_replayed, visible, que, height, checked);
		}
		while (!que.isEmpty()) {
			int x = que.poll();
			if (height[x] < k) {
				visible[x] = true;
				int p = parent[x];
				if (p != -1 && !checked[p]) {
					height[p] = height[x] + 1;
					checked[p] = true;
					que.add(p);
				}
			}
		}
		int ans = 0;
		for (int i=0;i<n;i++) {
			if (visible[i]) ans++;
		}
		System.out.println(ans);
	}
	static void check (int x, boolean[] not_replay, boolean[] is_replayed, boolean[] visible, Deque<Integer> que, int[] height, boolean[] checked) {
		if (not_replay[x]) {
			visible[x] = true;
		}
		if (!is_replayed[x]) {
			height[x] = 0;
			checked[x] = true;
			que.push(x);
		}
	}
}



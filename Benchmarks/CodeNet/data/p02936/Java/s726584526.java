import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int Q = scan.nextInt();
		int a, b, p, x;

		HashMap<Integer, Set<Integer>> map = new HashMap<>();
		for (int i = 0; i < N - 1; i++) {
			a = scan.nextInt();
			b = scan.nextInt();
			if (!map.containsKey(a)) {
				Set set = new HashSet<>();
				map.put(a, set);
			}
			map.get(a).add(b);

			if (!map.containsKey(b)) {
				Set set = new HashSet<>();
				map.put(b, set);
			}
			map.get(b).add(a);
		}
		int[] score = new int[N];
		for (int i = 0; i < Q; i++) {
			p = scan.nextInt();
			x = scan.nextInt();
			score[p - 1] += x;
		}

//		ArrayDeque<Integer> que = new ArrayDeque();
		Queue<Integer> que = new LinkedList<>();
		que.offer(1);
		boolean[] visited = new boolean[N];

		while (!que.isEmpty()) {
			int tgt = que.poll();
			Set<Integer> tgtSet = map.get(tgt);
			visited[tgt - 1] = true;
			for (Integer next : tgtSet) {
				if (!visited[next - 1]) {
					score[next - 1] += score[tgt - 1];
					que.offer(next);
				}
			}
		}

		// 結果の出力
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append(score[i]).append(" ");
		}
		System.out.println(sb);
	}
}
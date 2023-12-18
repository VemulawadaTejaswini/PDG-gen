import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static int N, Q;
	static int a, b, p, x;
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		N = scan.nextInt();
		Q = scan.nextInt();
		Map<Integer, Set<Integer>> map = new HashMap<>();
		int[] scores = new int[N];

		for (int i = 0; i < N - 1; i++) {
			a = scan.nextInt();
			b = scan.nextInt();

			// 上位の設定
			setMap(map, a);
			setMap(map, b);
		}
		setValues(scores);

		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		boolean[] visited = new boolean[N];
		while (!queue.isEmpty()) {
			int before = queue.poll();
			Set<Integer> tgtSet = map.get(before);
			visited[before - 1] = true;
			for (Integer next : tgtSet) {
				if (!visited[next - 1]) {
					scores[next - 1] += scores[before - 1];
				}
			}
		}

		// 結果の出力
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append(scores[i] + " ");
		}
		System.out.print(sb);
	}

	public static void setMap(Map<Integer, Set<Integer>> map, int add) {
		Set<Integer> tmpSet = map.get(add);
		if (tmpSet == null) {
			tmpSet = new HashSet<>();
			tmpSet.add(add);
			map.put(add, tmpSet);
		}
	}
	public static void setValues(int[] scores) {
		// カウンターの値を設定
		for (int i = 0; i < Q; i++) {
			p = scan.nextInt();
			x = scan.nextInt();
			scores[p] += x;
		}
	}
}

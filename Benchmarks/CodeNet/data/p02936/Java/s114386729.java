import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int Q = Integer.parseInt(sc.next());
		int[] a = new int[N-1];
		int[] b = new int[N-1];
		int[] p = new int[Q];
		int[] x = new int[Q];
		int idx;

		// 親-子リストのマップ
		HashMap<Integer, ArrayList<Integer>> pMap = new HashMap<Integer, ArrayList<Integer>>();
		// 値のマップ
		int[] value = new int[N+1];
		int[] counter = new int[N+1];

		ArrayList<Integer> childs;
		for (idx = 0; idx < N-1; idx++) {
			a[idx] = Integer.parseInt(sc.next());
			b[idx] = Integer.parseInt(sc.next());

			childs = pMap.get(a[idx]);
			if (childs == null) {
				childs = new ArrayList<Integer>();
				pMap.put(a[idx], childs);
			}
			childs.add(b[idx]);
		}
		for (idx = 0; idx < Q; idx++) {
			p[idx] = Integer.parseInt(sc.next());
			x[idx] = Integer.parseInt(sc.next());
			counter[p[idx]] += x[idx];
		}

		// 処理するノード、親の1をスタート
		LinkedList<Integer> nodes = new LinkedList<Integer>();
		nodes.add(1);

		int node;
		while(!nodes.isEmpty()) {
			node = nodes.remove(0);
			// 自身のカウンター足す
			value[node] += counter[node];
			// 子を取得
			childs = pMap.get(node);
			if (childs != null) {
				// 子に親の合計を足す
				for (int ch : childs) {
					value[ch] += value[node];
				}
				// 子をノードに入れる
				nodes.addAll(pMap.get(node));
			}
		}

		for (idx = 1; idx < N+1; idx++) {
			System.out.print(value[idx] + " ");
		}

	}

}

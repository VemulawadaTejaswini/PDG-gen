import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		long K = Long.parseLong(sc.next());
		int[] A = new int[N];
		int idx;
		for (idx = 0; idx < N; idx++) {
			A[idx] = Integer.parseInt(sc.next());
		}

		List<Integer> s = new ArrayList<Integer>();
		List<Integer> s2 = null;
		HashSet<Integer> exists = new HashSet<Integer>();

		// sの状態保持
		List<List<Integer>> ss = new ArrayList<List<Integer>>();
		List<Integer> s_c = new ArrayList<Integer>();

		long kIdx = 0;
		int nIdx = 0;

		for (kIdx = 0; kIdx < K; kIdx++) {
			for (nIdx = 0; nIdx < N; nIdx++) {
				if (exists.contains(A[nIdx])) {
					// 配列に存在する
					// 存在する場所以降を削除
					s2 = s.subList(s.indexOf(A[nIdx]), s.size());
					for (int del : s2) {
						exists.remove(del);
					}
					// 存在する場所より前を残す
					s = s.subList(0, s.indexOf(A[nIdx]));
				} else {
					// 配列に存在しない
					s.add(A[nIdx]);
					exists.add(A[nIdx]);
				}
			}
			// ここで空になったら
			if (s.isEmpty()) {
				// kIdx + 1 で1周なので、Kをそれで割った余りの状態が答え
				// 余り0なら空のままでよい
				if (K % (kIdx + 1) != 0) {
					s = ss.get((int) (K % (kIdx + 1) - 1));
				}
				break;
			} else {
				// 状態保持(ディープコピー)
				s_c = new ArrayList<Integer>();
				for (int o : s) {
					s_c.add(o);
				}
				ss.add(s_c);
			}
		}


		// output
		boolean init = true;
		for (int a : s) {
			if (init) {
				init = false;
			} else {
				System.out.print(" ");
			}
			System.out.print(a);
		}
		System.out.println();

	}

}

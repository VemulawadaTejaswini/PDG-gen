import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int N = sc.nextInt();
		Map<Integer, Integer> A = new HashMap<>();
		long sum = 0;
		for (int i = 0; i < N; i++) {
			int Ai = sc.nextInt();
			if (A.containsKey(Ai)) {
				A.put(Ai, A.get(Ai) + 1);
			} else {
				A.put(Ai, 1);
			}
			sum += Ai;
		}
		int Q = sc.nextInt();

		// 結果の出力
		for (int i = 0; i < Q; i++) {
			int Bi = sc.nextInt();
			int Ci = sc.nextInt();
			if (A.containsKey(Bi)) {
				int count = A.get(Bi);
				sum = sum - (Bi * count) + (Ci * count);
				System.out.println(sum);
				A.remove(Bi);
				if (A.containsKey(Ci)) {
					A.put(Ci, A.get(Ci) + count);
				} else {
					A.put(Ci, count);
				}
			} else {
				System.out.println(sum);
			}
		}

		sc.close();
	}
}

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		char[] S = sc.next().toCharArray();
		sc.close();

		List<Integer> list = new ArrayList<Integer>();
		int cnt = 0;
		int prev = S[0];

		// 連続している回数を数える
		for (int i = 0; i < N; i++) {
			if (S[i] == prev) {
				cnt++;
			} else {
				if (prev == '0') {
					prev = '1';
				} else {
					prev = '0';
				}
				// 値の追加
				list.add(cnt);
				cnt = 1;
			}
		}
		// for last
		list.add(cnt);

		// 最初と最後が0なら、listに0を足しておく
		if (S[0] == '0') {
			list.add(0, 0);
		}
		if (S[N - 1] == '0') {
			list.add(0);
		}

		int max = 0;
		int score = 0;
		int idx = S[0] == '0' ? 1 : 0;
		for (int i = 0; i < list.size(); i++) {
			// 最初の2K+1回はただ足し算
			if (i < 2 * K + 1) {
				score += list.get(i);
			} else {
				if (i % 2 != 0) {
					int minus = list.get(idx) + list.get(idx + 1);
					int plus = list.get(i) + list.get(i + 1);
					score = score - minus + plus;
					idx += 2;
				}
			}
			max = Math.max(max, score);
		}

		System.out.println(max);
	}
}

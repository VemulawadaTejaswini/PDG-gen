import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solve();
		return;
	}

	private void solve() {
		// 入力
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < 3 * N; i++) {
			a.add(sc.nextInt());
		}
		sc.close();

		// 計算
		Collections.sort(a, Collections.reverseOrder());
		long sum = 0;
		for (int i = 0; i < N; i++) {
			sum += a.get(2 * i + 1);
		}

		// 出力
		System.out.println(sum);

		return;
	}
}

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 値を取得
		int n = sc.nextInt();
		int m = sc.nextInt();
		Map<Integer, int[]> k = new HashMap<Integer, int[]>();
		int[] p = new int[n];
		int ans = 0;

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int[] s = new int[n];
			for (int j = 0; j < a; j++) {
				s[j] = sc.nextInt();
			}
			k.put(i, s);
		}

		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}

		// 全てのパターン
		for (int j = 0; j < Math.pow(2, n); j++) {
			int sum = 0;
			String bi = Integer.toBinaryString(j);
			// それぞれの電球の状態
			for (int i = 0; i < m; i++) {
				int[] list = k.get(i);
				int cnt = 0;
				for (int l = 1; l < list.length; l++) {
					if (bi.length() < list[l] - 2) {
						continue;
					} else if (bi.substring(list[l] - 1, list[l]).equals("1")) {
						cnt++;
					}
				}
				if (cnt % 2 == p[i]) {
					sum++;
				}
			}
			if (sum == m) {
				ans++;
			}
		}

		System.out.println(ans);
		sc.close();

	}
}

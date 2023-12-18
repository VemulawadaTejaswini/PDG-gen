import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		// ポイントの初期化
		Map<Integer, Integer> pointMap = new HashMap<Integer, Integer>();
		for (int i = 1; i <= n; i++) {
			pointMap.put(i, 0);
		}

		int x = 0;
		for (int i = 1; i <= q; i++) {
			x = sc.nextInt();
			pointMap.put(x, pointMap.get(x) + 1);
		}

		// 答えの出力
		for (int i = 1; i <= n; i++) {
			if (k - q + pointMap.get(i) > 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		sc.close();
	}
}

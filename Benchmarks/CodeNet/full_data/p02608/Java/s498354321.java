
import java.util.*;

public class Main {

	public static void main(String[] args) {

		// 入力
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());

		int result[];
		result = new int[10001];

		for (int x = 1; x <= 100; x++) {
			for (int y = 1; y <= 100; y++) {
				for (int z = 1; z <= 100; z++) {
					int p = (x * x) + (y * y) + (z * z);
					if (p <= 10000) {
						p += (x * y) + (y * z) + (z * x);
						if (p <= 10000) {
							result[p]++;
						}
					}
				}
			}
		}

		for (int i = 1; i <= n; i++) {
			System.out.println(result[i]);
		}
	}
}

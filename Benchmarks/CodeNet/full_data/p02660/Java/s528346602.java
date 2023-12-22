
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.next());

		// nを素因数分解する。結果はmapに、素因数と指数のペアで入れていくことにする。
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		// 問題の制約によるとnは最大で 10の12乗 なので、最大の素因数は 10の6乗 程度。
		for (int i = 2; i < 1000000; i++) {
			int j = 0;
			while (true) {
				if (n % i == 0) {
					j++;
					map.put(i, j);
					n /= i;
				} else {
					break;
				}
			}
		}

//		// 素因数分解の結果
//		for (int i = 2; i < 1000000; i++) {
//			if (map.containsKey(i)) {
//				System.out.println(i + " " + map.get(i));
//			}
//		}

		// 結果を求めて出力
		int result = 0;
		for (int i = 2; i < 1000000; i++) {
			if (!map.containsKey(i)) {
				continue;
			}
			int z = map.get(i);
			for (int j = 1; j < 10000; j++) {
				if (j <= z) {
					z -= j;
					result++;
				} else {
					break;
				}
			}
		}

		System.out.println(result);

	}
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 整数の入力
			long a = sc.nextLong();
			long b = sc.nextLong();
			long m = sc.nextLong();
			List<Long> aA = new ArrayList<>();
			long aMin = Long.MAX_VALUE;
			for (long i = 0; i < a; i++) {
				long ai = sc.nextLong();
				aA.add(ai);
				if (aMin > ai) {
					aMin = ai;
				}
			}
			List<Long> bB = new ArrayList<>();
			long bMin = Long.MAX_VALUE;
			for (long i = 0; i < b; i++) {
				long bi = sc.nextLong();
				bB.add(bi);
				if (bMin > bi) {
					bMin = bi;
				}
			}
			List<Integer> xM = new ArrayList<>();
			List<Integer> yM = new ArrayList<>();
			List<Integer> cM = new ArrayList<>();
			for (long i = 0; i < m; i++) {
				xM.add(sc.nextInt());
				yM.add(sc.nextInt());
				cM.add(sc.nextInt());
			}
			long min = aMin + bMin;
			// 整数配列ループ処理
			for (int i = 0; i < m; i++) {
				long cand = aA.get(xM.get(i) - 1) + bB.get(yM.get(i) - 1) - cM.get(i);
				if (min > cand) {
					min = cand;
				}
			}
			System.out.println(min);
		}
	}

	/**
	 * 最小公倍数
	 */
	static long lcm(long a, long b) {
		long temp;
		long c = a;
		c *= b;
		while ((temp = a % b) != 0) {
			a = b;
			b = temp;
		}
		return c / b;
	}

	/**
	 * 最大公約数
	 */
	static long gcd(long a, long b) {
		long temp;
		while ((temp = a % b) != 0) {
			a = b;
			b = temp;
		}
		return b;
	}
}
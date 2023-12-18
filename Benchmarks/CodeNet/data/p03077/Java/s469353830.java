
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	// 人数
	static long numberOfPepole;

	// 電車、バス、飛行機、タクシー、船の最大乗車人数
	static long[] capacities = new long[5];

	static int start = 0; // 人口がいる一番左の都市
	static int end = 0; // 人口がいる一番右の都市

	public static void main(String[] args) {
		input();

		// 各都市の人口(0:都市1 ... 5:都市6)
		long[] populations = new long[6];
		populations[0] = numberOfPepole;
		for (int i = 1; i < populations.length; i++) {
			populations[i] = 0;
		}

		int t = 0;
		while (populations[populations.length - 1] < numberOfPepole) {
			System.out.printf("%6d : %s (%d-%d)\n", t, Arrays.toString(populations), start, end);
			transfer(populations, capacities);
			t++;
		}
		System.out.printf("%6d : %s\n", t, Arrays.toString(populations));
	}

	private static final void input() {
		try (Scanner s = new Scanner(System.in)) {
			numberOfPepole = s.nextLong();
			for (int i = 0; i < capacities.length; i++) {
				capacities[i] = s.nextLong();
			}
		}
	}

	private static void transfer(long[] populations, long[] capacities) {
		for (int i = end + 1; start < i; i--) {
			// 都市 i-1 から 都市 i への移動を考える
			if (i == populations.length) {
				// 一番右の都市は移動しない
				continue;
			}
			long transferPeople;
			if (true) {
				if (populations[i - 1] < capacities[i - 1]) {
					// 人口が容量以下
					transferPeople = populations[i - 1];
				} else {
					transferPeople = capacities[i - 1];
				}
			} else {
				transferPeople = 0;
			}
			populations[i - 1] -= transferPeople;
			populations[i] += transferPeople;
		}
		if (end < populations.length - 1 && populations[end + 1] > 0) {
			end++;
		}
		if (populations[start] == 0) {
			start++;
		}
	}
}

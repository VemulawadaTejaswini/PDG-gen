import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

	int N = 0;

	public static void main(String[] args) {
		Main myself = new Main();
		myself.execute();
	}

	/**
	 * 実処理メソッド
	 */
	public void execute() {

		List<String> lines = readStdin();

		N = Integer.parseInt(lines.get(0).trim());

		int maxProfit = Integer.MIN_VALUE;

		Map<Integer, boolean[]> openMap = new HashMap<>();

		Integer[][] map = new Integer[10][N];

		for (int i = 0; i < N; i++) {

			// その店iが開店している曜日ビットを得る。
			boolean[] openbit = new boolean[10];
			openbit = getSalesDays(lines.get(i + 1));
			openMap.put(i, openbit);

			// その店にあわせることで取得可能な利益の配列
			getProfitsByShop(i, lines.get(1 + N + i), openbit, map);

		}

		// 営業時間帯ごとに、その最大値をえて、合算する
		for (int salesTiming = 0; salesTiming < 10; salesTiming++) {
			Integer[] profitByShop = map[salesTiming];
			int currentMaxProfilt = 0;
			for (int i = 0; i < profitByShop.length; i++) {
				int profit = profitByShop[i];

				if (profit > currentMaxProfilt) {
					currentMaxProfilt = profit;
				}
			}

			maxProfit = maxProfit + currentMaxProfilt;
		}

		// 最大値を出力
		System.out.println(maxProfit);

	}

	/**
	 * @return
	 */
	private static List<String> readStdin() {
		List<String> lines = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8)).lines()
				.collect(Collectors.toList());
		return lines;
	}

	/**
	 * @param linestr
	 * @return
	 */
	private static boolean[] getSalesDays(String linestr) {

		boolean[] result = new boolean[10];
		Scanner sc = new Scanner(linestr);

		for (int i = 0; i < 10; i++) {
			int val = sc.nextInt();
			if (val == 1) {
				result[i] = true;
			} else {
				result[i] = true;
			}
		}

		sc.close();

		return result;
	}

	private static void getProfitsByShop(int shopNum, String linestr, boolean[] openBit, Integer[][] map) {

		// Integer[][]
		// mapは、最初の要素が、0-9までの10個の要素で、それぞれ営業時間を示す。その値で得られるものは、お店の数だけの配列

		Scanner sc = new Scanner(linestr);

		for (int i = 0; i < 10; i++) {
			int val = sc.nextInt();

			Integer[] profit = map[i];

			if (openBit[i]) {
				profit[shopNum] = val;
			} else {
				profit[shopNum] = 0;
			}

		}

		sc.close();
	}

}


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		//		new Main().solveA();
		//		new Main().solveB();
		//		new Main().solveB2();
		//		new Main().solveC();
		//		new Main().solveC2();
		new Main().solveD();
	}

	private void solveA() {

		try (Scanner scanner = new Scanner(System.in)) {
			int lineAB = 0;
			int lineBC = 0;
			lineAB = scanner.nextInt();
			lineBC = scanner.nextInt();

			if (lineBC % lineAB == 0) {
				System.out.println(lineAB + lineBC);
			} else {
				System.out.println(lineBC - lineAB);
			}

			System.out.println("");

		}
	}

	/*
	 * 改良版
	 */
	private void solveB2() {

		try (Scanner scanner = new Scanner(System.in)) {
			int numN = 0;
			int numM = 0;
			numN = scanner.nextInt();
			numM = scanner.nextInt();

			Map<Integer, Integer> wkMap = new HashMap<Integer, Integer>();

			for (int i = 0; i < numN; i++) {

				int numK = scanner.nextInt();
				for (int j = 0; j < numK; j++) {
					int foodNum = scanner.nextInt();
					wkMap.merge(foodNum, 1, (oldV, newV) -> oldV + newV);
				}
			}

			int count = 0;
			for (Integer wkInt : wkMap.values()) {
				if (wkInt == numN) {
					count++;
				}
			}
			System.out.println(count);

		}
	}

	/*
	 * 処理長いけど一応AC
	 */
	private void solveB() {

		try (Scanner scanner = new Scanner(System.in)) {
			int nNin = 0;
			int mSyurui = 0;
			String line1 = scanner.nextLine();
			String[] wkStr1 = line1.split(" ");
			nNin = Integer.parseInt(wkStr1[0]);
			mSyurui = Integer.parseInt(wkStr1[1]);

			List<List<Integer>> wkList = new ArrayList<List<Integer>>();

			for (int i = 0; i < nNin; i++) {
				String wk = scanner.nextLine();
				String[] wkStr = wk.split(" ");
				List<Integer> wkInnerList = new ArrayList<Integer>();
				for (int j = 1; j < wkStr.length; j++) {
					wkInnerList.add(Integer.parseInt(wkStr[j]));
				}
				wkList.add(wkInnerList);
			}

			int result = 0;
			List<Integer> alreadyFinishList = new ArrayList<Integer>();
			for (int i = 0; i < wkList.size(); i++) {
				List<Integer> wkInnerList = wkList.get(i);
				for (int i2 = 0; i2 < wkInnerList.size(); i2++) {
					int syokuNum = wkInnerList.get(i2);
					if (alreadyFinishList.contains(syokuNum)) {
						continue;
					}
					if (isContain(nNin, wkList, i, syokuNum)) {
						result++;
					}
					alreadyFinishList.add(syokuNum);
				}

			}
			System.out.println(result);

		}
	}

	private boolean isContain(int nNin, List<List<Integer>> wkList, int i, int syokuNum) {
		int result = 0;
		for (int j = 0; j < nNin; j++) {
			if (i == j || j >= wkList.size()) {
				continue;
			}

			List<Integer> wkSarchList = wkList.get(j);
			if (wkSarchList.contains(syokuNum)) {
				result++;
			}

		}
		return result == nNin - 1;
	}

	private void solveC() {

		try (Scanner scanner = new Scanner(System.in)) {
			int monsterNum = 0;
			monsterNum = scanner.nextInt();
			long[] monsters = new long[monsterNum];
			for (int i = 0; i < monsterNum; i++) {
				monsters[i] = scanner.nextInt();
			}
			System.out.println(maximuKouyakuNArgs(monsters[0], monsters, 0));

		}
	}

	public long maximuKouyakuNArgs(long currentKouyaku, long[] nums, int start) {
		long res = currentKouyaku;
		if (start < nums.length) {
			res = maximumKouyaku2Args(nums[start], currentKouyaku);
			return maximuKouyakuNArgs(res, nums, start + 1);
		} else {
			return res;
		}
	}

	public long maximumKouyaku2Args(long num1, long num2) {
		try {
			long wkVal1;
			long wkVal2;
			if (num1 < num2) {
				wkVal1 = num2;
				wkVal2 = num1;
			} else {
				wkVal1 = num1;
				wkVal2 = num2;
			}
			long res = wkVal1 % wkVal2;
			if (res != 0) {
				return maximumKouyaku2Args(wkVal2, res);
			} else {
				return wkVal2;
			}

		} catch (Exception e) {
			System.out.println("num1 : " + num1 + " / num2:" + num2);
			e.printStackTrace();
			return -1;
		}

	}

	private Map<Integer, Integer> wkHP = new HashMap<Integer, Integer>();

	private int getMinHP(int[] monsters, int minHP) {
		int resultHP = minHP;
		try {
			if (wkHP.get(minHP) != null) {
				return wkHP.get(minHP);
			}
			for (int i = 0; i < monsters.length; i++) {
				if (i == 0) {
					continue;
				}
				if (monsters[i] % monsters[0] == 0) {
					resultHP = Math.min(monsters[0], resultHP);
				} else {
					resultHP = Math.min(monsters[i] % monsters[0], resultHP);
				}
			}
			if (resultHP > 2) {
				resultHP = getMinHP(monsters, resultHP);
			}
			wkHP.put(minHP, resultHP);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultHP;

	}

	private long getMaxKouyaku(long val1, long[] monsters, int currentI) {
		if (currentI == monsters.length) {
			return val1;
		}
		long res = getMaxKouyaku(val1, monsters[currentI]);
		return getMaxKouyaku(res, monsters, currentI + 1);
	}

	private long getMaxKouyaku(long val1, long val2) {

		long res = 0;
		long wkVal1 = val1;
		long wkVal2 = val2;
		if (val1 < val2) {
			wkVal1 = val2;
			wkVal2 = val1;
		}
		res = wkVal1 % wkVal2;
		if (res != 0) {
			return getMaxKouyaku(wkVal2, res);
		}

		return wkVal2;

	}

	private void solveC2() {

		try (Scanner scanner = new Scanner(System.in)) {
			int monsterNum = 0;
			monsterNum = scanner.nextInt();
			long[] monsters = new long[monsterNum];
			for (int i = 0; i < monsterNum; i++) {
				monsters[i] = scanner.nextInt();
			}
			System.out.println(getMaxKouyaku(monsters[0], monsters, 0));

		}
	}

	private void solveD() {

		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int[] aA = IntStream.range(0, m).map(i -> scanner.nextInt()).toArray();
			final Map<Integer, Integer> CONST_NUM = new HashMap<Integer, Integer>() {
				{
					put(1, 2);
					put(2, 5);
					put(3, 5);
					put(4, 4);
					put(5, 5);
					put(6, 6);
					put(7, 3);
					put(8, 7);
					put(9, 6);
				}
			};
			String[] dp = new String[10009];
			/*
			 * dp[i]の時に、作られている最大の数値
			 * 配るDPで実装
			 */
			//dp[0]の時は、空
			dp[0] = "";
			for (int i = 0; i < 10000; i++) {
				/*
				 * dp[0]のみ初期化しておいて、その後、aA[]に値がないやつは飛ばす
				 * nullという文字列が入ると文字列の最大値判定上困る
				 * null値だったらいいんだけどね。
				 */
				if (dp[i] == null) {
					continue;
				}
				for (int j = 0; j < aA.length; j++) {
					/*
					 * dp[aA[j]の桁を選択した場合のマッチ消費数]
					 * = max(既に格納されている数値 , dp[現在のマッチ消費数]+aA[j]を選択した場合の数値)
					 */
					dp[i + CONST_NUM.get(aA[j])] = max(dp[i + CONST_NUM.get(aA[j])], dp[i] + aA[j]);
				}
			}
			System.out.println(dp[n]);
		}
	}

	private String max(String a, String b) {
		if (a == null) {
			return b;
		} else if (b == null) {
			return a;
		} else if (a.length() < b.length()) {
			return b;
		} else if (a.length() > b.length()) {
			return b;
		} else if (a.length() == b.length()) {
			if (a.compareTo(b) < 0) {
				return b;
			} else {
				return a;
			}
		}
		return a;
	}

}
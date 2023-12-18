
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//		new Main().solveA();
		//		new Main().solveB();
		//		new Main().solveC();
		new Main().solveC2();
		// new Main().solveD();
	}

	private void solveA() {

		try (Scanner scanner = new Scanner(System.in)) {
			String date = "";
			date = scanner.next();
			SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd");
			Date uDate = sdFormat.parse(date);
			Date tDate = sdFormat.parse("2019/04/30");

			int diff = tDate.compareTo(uDate);
			if (diff == 0) {
				System.out.println("Heisei");
			} else if (diff > 0) {
				System.out.println("Heisei");
			} else {
				System.out.println("TBD");
			}

		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	private void solveB() {

		try (Scanner scanner = new Scanner(System.in)) {
			int numN = 0;
			numN = scanner.nextInt();
			BigDecimal[] wkKane = new BigDecimal[numN];
			String[] wkNaiyo = new String[numN];

			BigDecimal[] wkRes = new BigDecimal[numN];
			BigDecimal rate = new BigDecimal("380000.0");
			for (int i = 0; i < numN; i++) {
				wkKane[i] = new BigDecimal(scanner.next());
				wkNaiyo[i] = scanner.next();
				if (wkNaiyo[i].equals("BTC")) {
					wkRes[i] = wkKane[i].multiply(rate);
				} else {
					wkRes[i] = wkKane[i];
				}

			}

			BigDecimal res = BigDecimal.ZERO;
			for (int i = 0; i < wkRes.length; i++) {
				res = res.add(wkRes[i]);
			}

			System.out.println(res.setScale(4, RoundingMode.HALF_UP));

		}
	}

	private void solveC2() {

		try (Scanner scanner = new Scanner(System.in)) {
			int numN = scanner.nextInt();
			int numA = scanner.nextInt();
			int numB = scanner.nextInt();
			int numC = scanner.nextInt();

			int[] wk = new int[numN];

			for (int i = 0; i < wk.length; i++) {
				wk[i] = scanner.nextInt();
			}

			System.out.println(dfsC2(numA, numB, numC, wk, 0, 0, 0, 0));

		}
	}

	private int dfsC2(int numA, int numB, int numC, int[] wk, int currentI, int a, int b, int c) {

		//竹の数を全部カウントし終わったら完了
		if (currentI >= wk.length) {
			/*
			 * a,b,c全部の竹が最低値をクリアすること
			 * -> 0以下の場合は竹を作れていないということでNG
			 *
			 * -30しているのは、竹を0以上にするのに合成のためのMPを加算してしまっているから
			 * -30=-10*3　（aを0以上、bを0以上、cを0以上にするために余分にMPを消費している）
			 */
			if (a > 0 && b > 0 && c > 0) {
				return Math.abs(numA - a) + Math.abs(numB - b) + Math.abs(numC - c) - 30;
			}
			/*
			 * ここに来たということは、竹を正確に合成できなかったということ
			 * -> 長さが0の竹がある
			 * 条件を満たしていないのでとりあえずINF的な値を返す
			 */
			return 999999999;
		}
		//何も合成しない（・・現状の長さでOKとする）
		int val0 = dfsC2(numA, numB, numC, wk, currentI + 1, a, b, c);
		/*
		 * aに竹を接ぐ
		 * +10は竹を接ぐためのMP
		 */

		int val1 = dfsC2(numA, numB, numC, wk, currentI + 1, a + wk[currentI], b, c) + 10;
		/*
		 * bに竹を接ぐ
		 * +10は竹を接ぐためのMP
		 */
		int val2 = dfsC2(numA, numB, numC, wk, currentI + 1, a, b + wk[currentI], c) + 10;
		/*
		 * cに竹を接ぐ
		 * +10は竹を接ぐためのMP
		 */
		int val3 = dfsC2(numA, numB, numC, wk, currentI + 1, a, b, c + wk[currentI]) + 10;

		return Math.min(Math.min(val0, val1), Math.min(val2, val3));
	}

	int numN = 0;
	int numA = 0;
	int numB = 0;
	int numC = 0;
	int[] wk;

	private void solveC() {

		try (Scanner scanner = new Scanner(System.in)) {
			numN = scanner.nextInt();
			numA = scanner.nextInt();
			numB = scanner.nextInt();
			numC = scanner.nextInt();

			wk = new int[numN];

			for (int i = 0; i < wk.length; i++) {
				wk[i] = scanner.nextInt();
			}

			System.out.println(dfsC(0, 0, 0, 0));

		}
	}

	private int dfsC(int currentI, int a, int b, int c) {

		if (currentI == numN) {

			if (a > 0 && b > 0 && c > 0) {
				return Math.abs(a - numA) + Math.abs(b - numB) + Math.abs(c - numC) - 30;
			}
			return 9999999;
		}

		int res0 = dfsC(currentI + 1, a, b, c);
		int res1 = dfsC(currentI + 1, a + wk[currentI], b, c) + 10;
		int res2 = dfsC(currentI + 1, a, b + wk[currentI], c) + 10;
		int res3 = dfsC(currentI + 1, a, b, c + wk[currentI]) + 10;

		return Math.min(Math.min(res0, res1), Math.min(res2, res3));

	}

	private void solveD() {

		try (Scanner scanner = new Scanner(System.in)) {
			int numN = 0;
			int numK = 0;
			int numS = 0;
			numN = scanner.nextInt();

			System.out.println("");

		}
	}
}
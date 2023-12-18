package abc086_a;

import java.util.Scanner;

public class Main {

	/** 処理結果 奇数 */
	static final String ODD = "Odd";
	/** 処理結果 偶数 */
	static final String EVEN = "Even";

	public static void main(String[] args) {
		new Main().execute();
	}

	private void execute() {

		int[] arrInitString = getParameter();

		long resultCalc = arrInitString[0];

		for (int i = 1; i < arrInitString.length; i++) {
			resultCalc *= arrInitString[i];
		}

		if (resultCalc % 2 == 0) {
			// 偶数
			outputAnswer(Main.EVEN);
		} else {
			// 奇数
			outputAnswer(Main.ODD);
		}
	}

	private int[] getParameter() {

		Scanner scan = new Scanner(System.in);

		int ret[] = new int[2];

		for (int i = 0; i < ret.length; i++) {
			ret[i] = scan.nextInt();
		}

		scan.close();

		return ret;
	}

	private void outputAnswer(String answer) {
		System.out.println(answer);
	}
}

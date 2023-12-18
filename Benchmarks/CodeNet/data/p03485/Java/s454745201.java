package atCoder;

import java.util.Scanner;

public class ABC082_Round_Up_The_Mean {

	/**
	 * 2つの正整数a,bが与えられます。
	 * a,bの平均値をxとします。
	 * xの小数点以下を切り上げて得られる整数を出力してください。
	 * @param args
	 */
	public static void Main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double x = (a + b)/2;
		double ans = Math.ceil(x);
		System.out.println((int)ans);
	}

}

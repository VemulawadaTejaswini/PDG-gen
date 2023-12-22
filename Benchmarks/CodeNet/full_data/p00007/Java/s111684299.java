import java.util.Scanner;

public class Main{

	// 借金額：10万円
	public static int LOAN = 100000;

	public static void main(String[] args) {

		// インプット
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		double result = LOAN;

		// 一週間ずつ計算
		for (int i = 0; input > i; i++) {

			// 利子を加える
			result = result * 1.05;

			// 1000で割り、千円以下を切り上げ
			result = Math.ceil(result / 1000);
			// 金額を元に戻す
			result = result * 1000;
		}
		System.out.println((int) result);
	}
}
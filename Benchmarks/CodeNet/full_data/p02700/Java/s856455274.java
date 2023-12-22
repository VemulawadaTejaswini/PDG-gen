import java.util.Scanner;

public class Main {

	public static long CONST = (long) Math.pow(10, 9) + 7L;

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();
		//WK変数

		//演算
		int Takahashi = C / B + (C % B == 0 ? 0 : 1);
		int Aoki = A / D + (A % D == 0 ? 0 : 1);

		//結果出力
		System.out.println(Takahashi <= Aoki ? "Yes" : "No");
	}
}
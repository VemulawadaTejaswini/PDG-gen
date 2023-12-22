import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値取得
		int A = scan.nextInt();
		int B = scan.nextInt();
		int H = scan.nextInt();
		int M = scan.nextInt();

		//WK変数
		double Aspeed = 360.0 / 60 / 12;
		double Bspeed = 360.0 / 60 / 1;

		double Aposition = Aspeed * (H * 60 + M);
		double Bposition = Bspeed * (H * 60 + M);

		//演算
		double result = Math.sqrt(A * A + B * B - 2 * A * B * Math.cos(Math.toRadians(Bposition - Aposition)));

		//結果出力
		System.out.println(result);
	}
}
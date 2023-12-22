import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scannerS = new Scanner(System.in);
		int N = scannerS.nextInt();
		int X = scannerS.nextInt();
		int T = scannerS.nextInt();

		int a = 0;
		int b = N % X;
		int c = N / X;

		if (b == 0) {
			a = (N / X) * T;
		} else if (b != 0) {
			a = (c + 1) * T;
		}

		System.out.println(a);

	}

}
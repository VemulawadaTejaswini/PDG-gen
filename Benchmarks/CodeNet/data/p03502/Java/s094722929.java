import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 入力
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();

		// 計算
		int fx = sum(X);

		// 出力
		if (X % fx == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		return;
	}

	public static int sum(int X) {
		int fx = 0;
		while(X > 0) {
			fx += X % 10;
			X /= 10;
		}
		return fx;
	}
}

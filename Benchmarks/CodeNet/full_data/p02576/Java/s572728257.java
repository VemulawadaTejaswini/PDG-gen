import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int N = sc.nextInt();
		int X = sc.nextInt();
		int T = sc.nextInt();
		
		// 結果の出力
		if (N % X == 0) {
			System.out.println((N / X ) * T);
		}
		else {
			System.out.println(((N / X) + 1) * T);
		}
		
		sc.close();
	}
}

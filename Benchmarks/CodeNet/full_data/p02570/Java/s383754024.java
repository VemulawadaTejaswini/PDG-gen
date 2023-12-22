import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int D = sc.nextInt();
		int T = sc.nextInt();
		int S = sc.nextInt();
		
		// 結果の出力
		if (D % S == 0) {
			if (D / S <= T) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
		else {
			if (D / S <= (T - 1)) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
		
		sc.close();
	}
}

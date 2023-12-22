import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int K = sc.nextInt();
		String S = sc.next();

		// 結果の出力
		if (S.length() <= K) {
			System.out.println(S);
		}
		else {
			System.out.println(S.substring(0, K) + "...");
		}

		sc.close();
	}
}

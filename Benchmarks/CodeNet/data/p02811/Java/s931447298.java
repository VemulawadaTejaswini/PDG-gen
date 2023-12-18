import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int K = sc.nextInt();
		int X = sc.nextInt();
		
		// 結果の出力
		System.out.println((K * 500) >= X ? "Yes" : "No");
		
		sc.close();
	}
}

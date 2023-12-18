import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		String S = sc.next();
		
		// 結果の出力
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < S.length(); i++) {
			sb.append("x");
		}
		System.out.println(sb.toString());
		
		sc.close();
	}
}

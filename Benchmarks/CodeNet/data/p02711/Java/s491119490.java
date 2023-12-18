import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		String N = sc.next();
		
		// 結果の出力
		System.out.println(N.contains("7")? "Yes" : "No");

		sc.close();
	}
}

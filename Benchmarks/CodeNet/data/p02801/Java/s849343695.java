import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		String C = sc.next();
		char c = (char) (C.toCharArray()[0] + 1);

		// 結果の出力
		System.out.println(c);

		sc.close();
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		//組み合わせ判定
		if (S.equals("AAA") || S.equals("BBB")) {
			//一致したとき
			System.out.println("No");

		}
		//一致しないとき
		else {

			System.out.println("Yes");
		}
		sc.close();

	}

}

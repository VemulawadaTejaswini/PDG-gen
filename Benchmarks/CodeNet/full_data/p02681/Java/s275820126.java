import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		String T = scan.next();

		if (T.substring(0, S.length()).equals(S)) {
			System.out.print("Yes");
		} else {
			System.out.print("No");
		}

	}

}

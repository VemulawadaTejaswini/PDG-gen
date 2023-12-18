import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//文字列S
		String S = sc.next();
		//int S = sc.nextInt();

		//すべて'x'に変換する
		S = S.replaceAll(".", "x");

		System.out.println(S);
	}

}

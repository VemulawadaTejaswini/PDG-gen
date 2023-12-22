import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();
		char s = S.charAt(0);

		System.out.println(Character.isUpperCase(s)?"A":"a");

	}

}
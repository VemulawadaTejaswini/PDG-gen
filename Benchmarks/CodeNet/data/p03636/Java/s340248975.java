import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		// 語頭を取り出す
		char a = s.charAt(0);
		// 文字数を取り出す
		int num = s.length() - 2;
		String numStr = String.valueOf(num);
		// 語尾を取り出す
		char b = s.charAt(num + 1);

		System.out.println(a + numStr + b);

	}

}

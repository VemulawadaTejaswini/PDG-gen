import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String a = sc.next();
		String b = sc.next();

		Long al = Long.valueOf(a);
		Long bl = Long.valueOf(b);

		String ans = "";

		if (al > bl) {
			ans = "GREATER";
		} else if (al < bl) {
			ans = "LESS";
		} else {
			ans = "EQUAL";
		}

		System.out.println(ans);
	}

}
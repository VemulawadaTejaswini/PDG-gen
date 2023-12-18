import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//文字列の入力
		String a = sc.next();
		String s = sc.next();
		String c = sc.next();
		//最初の文字の抜き出し(s)
		char a1 = a.charAt(0);
		char s1 = s.charAt(0);
		char c1 = c.charAt(0);
		System.out.println(a1 + s1 + c1);

	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S =scanner.next();
		int count = 0;

		for (int i = 2; i < S.length(); i += 2) {
			//文字列Sも末尾を、2文字ずつ削除
			String s = S.substring(0, S.length()-i);
			//文字列Sをs1とs2に分割
//			String s1 = s.substring(0, s.length() / 2);
//			String s2 = s.substring(s.length() / 2, s.length());

			System.out.println("s1:" + s1);
			System.out.println("s2:" + s2);

			//文字列s1とs2が等しい場合
			if (s1.equals(s2)) {
				count = s.length();
				break;
			}
		}
		System.out.println(count);
	}

}
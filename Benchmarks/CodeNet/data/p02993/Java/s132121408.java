import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ここにコードを挿入
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = null;
		for (int i = 0; i < 3; i++) {
			char a = s.charAt(i);
			char b = s.charAt(i + 1);
			if (a == b) {
				t = "Bad";
			} else {
				t = "Good";
			}
		}
		System.out.println(t);
	}

}

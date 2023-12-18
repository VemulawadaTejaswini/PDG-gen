import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String a = sc.next();
		String b = sc.next();
		String str = "";
		if (a.length() > b.length()) {
			str = "GREATER";
		} else if (a.length() < b.length()) {
			str = "LESS";
		} else {
			boolean t = true;
			for (int i = 0; i < a.length(); i++) {
				if (a.charAt(i) > b.charAt(i)) {
					str = "GREATER";
					t = false;
					break;
				} else if (a.charAt(i) < b.charAt(i)) {
					str = "LESS";
					t = false;
					break;
				}
			}
			if (t) {
				str = "EQUAL";
			}
		}
		System.out.println(str);
	}
}

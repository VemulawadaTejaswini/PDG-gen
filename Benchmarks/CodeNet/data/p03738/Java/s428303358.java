import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String A = sc.next();
		String B = sc.next();
		String ans = "";
		if (A.length() == B.length()) {
			if (A.compareTo(B) == 0) {
				ans = "EQUAL";
			} else if (A.compareTo(B) > 0) {
				ans = "GREATER";
			} else {
				ans = "LESS";
			}
		} else if (A.length() > B.length()) {
			ans = "GREATER";
		} else {
			ans = "LESS";
		}
		System.out.println(ans);
	}
}

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		String str = sc.next();
		int ans = 0;
		for (int i = 0; i < str.length() / 2; ++i) {
			if (!syn(str.charAt(i), str.charAt(str.length() - 1 - i))) {
				++ans;
			}
		}
		if (str.length() % 2 == 1) {
			char center = str.charAt(str.length() / 2);
			if (center == '(' || center == ')') {
				++ans;
			}
		}
		System.out.println(ans);
	}

	static boolean syn(char c1, char c2) {
		if (c1 == 'i' && c2 == 'i') {
			return true;
		}
		if (c1 == 'w' && c2 == 'w') {
			return true;
		}
		if (c1 == '(' && c2 == ')') {
			return true;
		}
		if (c1 == ')' && c2 == '(') {
			return true;
		}
		return false;
	}

}
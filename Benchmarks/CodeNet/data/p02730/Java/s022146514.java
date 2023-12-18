import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		sc.close();
		int N = S.length();
		//回文であるかチェック
		checkPalindrome(S, (N - 1) / 2, 0, N - 1);
		checkPalindrome(S, (N - 1) / 4, 0, (N - 3) / 2);
		checkPalindrome(S, (N - 1) / 4, (N + 1) / 2, N - 1);
		System.out.println("Yes");
	}

	public static void checkPalindrome(String S, int num1, int num2, int num3) {
		for (int i = 0; i < num1; i++) {
			if (S.charAt(num2 + i) != S.charAt(num3 - i)) {
				System.out.println("No");
				System.exit(0);
			}
		}
	}
}
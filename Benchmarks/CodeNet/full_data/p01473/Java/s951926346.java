import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] alpha = new int[26];
		for (int i = 0; i < s.length(); i++) {
			alpha[s.charAt(i) - 97]++;
		}
		int divide = 1;
		for (int i = 0; i < 26; i++) {
			if (alpha[i] % 2 != 0) {
				System.out.println(0);
				return;
			} else if (alpha[i] != 0) {
				for (int j = 2; j <= alpha[i] / 2; j++) {
					divide *= j;
				}
			}
		}

		int ans = 1;
		for (int i = 2; i <= s.length() / 2; i++) {
			ans *= i;
		}
		System.out.println(ans / divide);
		sc.close();
	}
}
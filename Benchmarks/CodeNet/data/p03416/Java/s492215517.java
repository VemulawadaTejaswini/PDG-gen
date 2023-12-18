import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	/** 最大値 */
	private static final int MAX = 100_000;

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int[] count = new int[MAX];
			IntStream.range(1, MAX).forEach(i -> count[i] = count[i - 1] + (isPalindrome(i) ? 1 : 0));
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			System.out.println(count[b] - count[a - 1]);
		}
	}

	/**
	 * 入力数字の10進数表現は回文かどうかを計算
	 * 
	 * @param n 入力数字
	 * @return 入力数字の10進数表現は回文かどうか
	 */
	private static boolean isPalindrome(int n) {
		char[] string = String.valueOf(n).toCharArray();
		for (int i = 0; i < string.length / 2; i++) {
			if (string[0] != string[string.length - 1 - i]) {
				return false;
			}
		}
		return true;
	}
}

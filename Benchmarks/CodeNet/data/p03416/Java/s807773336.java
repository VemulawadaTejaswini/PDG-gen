import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println(Main.calc(s.nextInt(), s.nextInt()));
	}

	public static long calc(int a, int b) {
		return IntStream.rangeClosed(a, b).filter(Main::isPalindromic).count();
	}

	public static boolean isPalindromic(long num) {
		String str = String.valueOf(num);
		for (int i = 0; i <= str.length() - i; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
}
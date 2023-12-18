import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		long k = sc.nextLong();
		if (s.length() == 0) {
			System.out.println(0);
			return;
		}

		int a = 0;
		while (a < s.length() && s.charAt(0) == s.charAt(a)) a++;

		int b = 0;
		while (s.length() - b - 1 >= 0 && s.charAt(s.length() - 1) == s.charAt(s.length() - b - 1)) b++;

		int c = 0;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i - 1) != s.charAt(i)) continue;
			int t = 1;
			while (i < s.length() && s.charAt(i - 1) == s.charAt(i)) {
				i++;
				t++;
			}
			c += t / 2;
		}

		if (s.charAt(0) != s.charAt(s.length() - 1)) {
			System.out.println(k * (long) c);
			return;

		}

		System.out.println((k * (long) c) - (((long) a / 2L) + ((long) b / 2L) - (long) (a + b) / 2L) * (k - 1L));
	}
}

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		String S = String.valueOf(N);
		if (N < 357) {
			System.out.println(0);
			return;
		}
		long ans = 0;
		long foo = 0;
		foo += check("3", N);
		foo += check("5", N);
		foo += check("7", N);
		ans += foo;
		System.out.println(ans);
	}

	public static long check(String num, int max) {
		long tmp = Long.parseLong(num);
		long ret = 0;
		if (tmp <= max) {
			String S = num;
			boolean three = false;
			boolean five = false;
			boolean seven = false;
			for (int i = 0; i < S.length(); i++) {
				if (S.charAt(i) == '3') {
					three = true;
				} else if (S.charAt(i) == '5') {
					five = true;
				} else if (S.charAt(i) == '7') {
					seven = true;
				}
			}
			if (three && five && seven) {
				// System.out.println("o " + tmp);
				ret++;
			} else {
				// System.out.println("x " + tmp);
				// return 0;
			}
		} else {
			// System.out.println("x " + tmp);
			return 0;
		}
		ret += check(num + "3", max);
		ret += check(num + "5", max);
		ret += check(num + "7", max);
		return ret;
	}
}
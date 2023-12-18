import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		System.out.println(cal(a, 0));
	}

	private static int cal(int a, int count) {

		if (a < 6) return count + a;

		int tmp6 = 1;
		int tmp9 = 1;

		while (tmp6 * 6 <= a) tmp6 *= 6;
		while (tmp9 * 9 <= a) tmp9 *= 9;

		return Math.min(cal(a - tmp6, count + 1), cal(a - tmp9, count + 1));
	}
}

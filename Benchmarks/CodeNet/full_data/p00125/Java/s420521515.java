import java.util.Scanner;

public class Main {
	static final int[] md = new int[12];
	static {
		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int day = 0;
		for (int i = 0; i < 12; i++) {
			md[i] = day;
			day += days[i];
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int y1, y2, m1, m2, d1, d2;
		while (true) {
			if ((y1 = in.nextInt()) < 0 || (m1 = in.nextInt()) < 0
					|| (d1 = in.nextInt()) < 0 || (y2 = in.nextInt()) < 0
					|| (m2 = in.nextInt()) < 0 || (d2 = in.nextInt()) < 0) {
				break;
			}
			long from = getL(y1, m1, d1);
			long to = getL(y2, m2, d2);
			System.out.println(to - from);
		}
	}

	private static long getL(int y, int m, int d) {
		long result = 365 * y + md[m - 1] + d;
		if (m > 2 && ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)) {
			result++;
		}
		result += (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;
		return result;
	}
}
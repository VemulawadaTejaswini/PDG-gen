import java.util.Scanner;

public class Tes {
	static final int[] md = new int[12];
	static {
		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int day = 0;
		for (int i = 1; i < 12; i++) {
			md[i] = day;
			day += days[i];
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			int y1 = in.nextInt();
			int m1 = in.nextInt();
			int d1 = in.nextInt();
			int y2 = in.nextInt();
			int m2 = in.nextInt();
			int d2 = in.nextInt();
			if (y1 < 0 || y2 < 0 || m1 < 0 || m2 < 0 || d1 < 0 || d2 < 0) {
				break;
			}
			long from = getL(y1, m1, d1);
			long to = getL(y2, m2, d2);
			System.out.println(to - from);
		}
	}

	private static long getL(int y, int m, int d) {
		long result = 365 * y + md[m - 1] + d;
		if (m > 2 && (y % 400 == 0 || (y % 100 != 0 && y % 4 == 0))) {
			result++;
		}
		result += (y - 1) / 4;
		result -= (y - 1) / 100;
		result += (y - 1) / 400;
		return result;
	}
}
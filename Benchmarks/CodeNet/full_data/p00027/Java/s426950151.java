import java.util.Scanner;

class Main {

	static final int[] monthDay = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30,
			31 };
	static final String[] dayOfTheWeek = { "Wednesday", "Thursday", "Friday",
			"Saturday", "Sunday", "Monday", "Tuesday" };

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			while (sc.hasNextInt()) {
				int month = sc.nextInt();
				int day = sc.nextInt();
				if (month == 0 || day == 0) {
					break;
				}

				System.out.println(getDayOfTheWeek(month, day));

			}
		} finally {
			sc.close();
		}
	}

	public static String getDayOfTheWeek(int m, int d) {

		int sum = 0;
		for (int i = 1; i < m; i++) {
			sum += monthDay[i];
		}
		sum += d;

		return dayOfTheWeek[sum % 7];
	}
}
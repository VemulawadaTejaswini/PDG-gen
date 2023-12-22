import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = null;
		int[] days = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		try {
			sc = new Scanner(System.in);
			while (sc.hasNextInt()) {
				int month = sc.nextInt();
				int day = sc.nextInt();
				int daySum = 0;
				for (int i = 0; i < month - 1; i++)
					daySum += days[i];
				daySum += day;

				switch (daySum % 7) {
				case 0:
					System.out.println("Wednesday");
					break;
				case 1:
					System.out.println("Thursday");
					break;
				case 2:
					System.out.println("Friday");
					break;
				case 3:
					System.out.println("Saturday");
					break;
				case 4:
					System.out.println("Sunday");
					break;
				case 5:
					System.out.println("Monday");
					break;
				case 6:
					System.out.println("Tuesday");
					break;
				default:
					break;
				}
			}
		} finally {
			sc.close();
		}
	}
}
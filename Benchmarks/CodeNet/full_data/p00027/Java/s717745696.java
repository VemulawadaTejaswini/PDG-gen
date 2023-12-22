import java.util.Calendar;
import java.util.Scanner;

public class Main {
	private static final int YEAR = 2004;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while(true) {
			int month = sc.nextInt();
			int day = sc.nextInt();

			if(month == 0) {
				break;
			}
			System.out.println(getWeekName(month - 1, day));
		}

	}

	public static String getWeekName(int month, int day) {
		Calendar cal = Calendar.getInstance();
		cal.set(YEAR, month, day);
		String weekName = "";

		switch(cal.get(Calendar.DAY_OF_WEEK)) {
			case Calendar.SUNDAY:
				weekName = "SUNDAY";
				break;

			case Calendar.MONDAY:
				weekName = "MONDAY";
				break;

			case Calendar.TUESDAY:
				weekName = "TUSEDAY";
				break;

			case Calendar.WEDNESDAY:
				weekName = "WEDNESDAY";
				break;

			case Calendar.THURSDAY:
				weekName = "THURSDAY";
				break;

			case Calendar.FRIDAY:
				weekName = "FRIDAY";
				break;

			case Calendar.SATURDAY:
				weekName = "SATURDAY";
				break;
		}

		return weekName;
	}

}
import java.util.Scanner;

public class CantWaitForHoliday_A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		String[] days = new String[] { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT", };

		for (int i = 0; i < 7; i++) {
			if (s.equals(days[i])) {
				System.out.println(7 - i);
			}
		}
	}

}

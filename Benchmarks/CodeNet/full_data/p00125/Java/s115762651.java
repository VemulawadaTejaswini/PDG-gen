import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int sYear, sMonth, sDay;
		int eYear, eMonth, eDay;
		int totalDay;

		while (true) {
			sYear  = sc.nextInt();
			sMonth = sc.nextInt();
			sDay   = sc.nextInt();
			eYear  = sc.nextInt();
			eMonth = sc.nextInt();
			eDay   = sc.nextInt();
			if (sYear == -1) {
				break;
			}
			totalDay = 0;

			while (true) {
				totalDay++;
				sDay++;
				if (sMonth == 2) {
					if (sYear % 4 == 0 && (sYear % 100 != 0 || sYear % 400 == 0) && sDay == 30) {
						sMonth++;
						sDay = 1;
					} else if (!(sYear % 4 == 0 && (sYear % 100 != 0 || sYear % 400 == 0)) && sDay == 29) {
						sMonth++;
						sDay = 1;
					}
				} else if (sMonth == 12 && sDay == 32) {
					sYear++;
					sMonth = 1;
					sDay = 1;
				} else if ((sMonth == 1 || sMonth == 3 || sMonth == 5 || sMonth == 7 || sMonth == 8 || sMonth == 10) && sDay == 32) {
					sMonth = sMonth + 1;
					sDay = 1;
				} else if ((sMonth == 4 || sMonth == 6 || sMonth == 9 || sMonth == 11) && sDay == 31) {
					sMonth = sMonth + 1;
					sDay = 1;
				}
				if (sYear == eYear && sMonth == eMonth && sDay == eDay) {
					break;
				}
			}
			System.out.println(totalDay);
		}
	}
}
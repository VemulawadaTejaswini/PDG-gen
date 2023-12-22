import java.util.*;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int minYear = sc.nextInt();
		int maxYear = sc.nextInt();

		int dataSetCount = 0;

		while (minYear != 0) {
			int leapYearCount = 0;

			if (dataSetCount > 0) {
				System.out.println("");
			}

			for (int year = minYear;year <= maxYear;++year) {
				if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
					System.out.println(year);
					++leapYearCount;
				}
			}
			if (leapYearCount == 0) {
				System.out.println("NA");
			}

			dataSetCount++;
			minYear = sc.nextInt();
			maxYear = sc.nextInt();
		}
	}
}


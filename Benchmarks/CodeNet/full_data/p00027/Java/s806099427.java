import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int month, day;
		int count;

		month = sc.nextInt();
		while (month != 0) {
			day = sc.nextInt();

			count = 0;
			if ( 2 <= month) count += 31;
			if ( 3 <= month) count += 29;
			if ( 4 <= month) count += 31;
			if ( 5 <= month) count += 30;
			if ( 6 <= month) count += 31;
			if ( 7 <= month) count += 30;
			if ( 8 <= month) count += 31;
			if ( 9 <= month) count += 31;
			if (10 <= month) count += 30;
			if (11 <= month) count += 31;
			if (12 <= month) count += 30;
			count += day;
			
			if (count % 7 == 0) System.out.println("Wednesday");
			if (count % 7 == 1) System.out.println("Thursday");
			if (count % 7 == 2) System.out.println("Friday");
			if (count % 7 == 3) System.out.println("Saturday");
			if (count % 7 == 4) System.out.println("Sunday");
			if (count % 7 == 5) System.out.println("Monday");
			if (count % 7 == 6) System.out.println("Tuesday");
			
			month = sc.nextInt();
		}
	}
}
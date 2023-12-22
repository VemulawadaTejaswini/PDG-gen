import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] days = {-1,30,29,31,30,31,30,31,31,30,31,30,31};
		String[] week = {"Sonday","Monday","Thuesday","Wednesday","Thirsday","Friday","Saturday"};
		while (true) {
			int m = sc.nextInt();
			int d = sc.nextInt();
			if (m == 0 && d == 0) break;
			int sum = 0;
			for (int i = 1; i <= m - 1; i++)
				sum += days[i];
			sum += m == 1 ? d - 1 : d;
			sum += 4;
			System.out.println(week[sum % 7]);
		}

	}

}
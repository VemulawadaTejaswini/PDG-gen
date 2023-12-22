
import java.util.Calendar;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			boolean flag = true;
			int[] num = new int[6];
			for (int i = 0; i < 6; i++) {
				num[i] = scanner.nextInt();
				if (num[i] < 0)
					flag = false;
			}
			if (!flag)
				break;
			Calendar date = Calendar.getInstance();
			date.set(num[0], num[1] - 1, num[2]);
			long a = date.getTimeInMillis();
			Calendar date2 = Calendar.getInstance();
			date2.set(num[3], num[4] - 1, num[5]);
			long b = date2.getTimeInMillis();
			long c = (b - a) / (1000 * 60 * 60 * 24);
			System.out.println(c);
		}

	}
}
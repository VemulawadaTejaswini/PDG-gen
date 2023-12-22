
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			double min = Integer.MAX_VALUE;
			int id = -1;
			while (n-- > 0) {
				int num = scanner.nextInt();
				double a = scanner.nextDouble()/100;
				double b = scanner.nextDouble();
				double bmi = b / a / a;
				double ans = Math.abs(22 - bmi);
				if (min > ans) {
					min = ans;
					id = num;
				} else if (min == ans) {
					if (id > num) {
						id = num;
					}
				}
			}
			System.out.println(id);
		}
	}
}
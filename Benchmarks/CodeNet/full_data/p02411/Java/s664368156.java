import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (s.hasNextInt()) {
			int m = s.nextInt();
			int f = s.nextInt();
			int r = s.nextInt();
			int sum = m + f;
			char ret = 'F';

			if (m == -1 && f == -1 && r == -1) {
				return;
			} else if (80 <= sum) {
				ret = 'A';
			} else if (65 <= sum) {
				ret = 'B';
			} else if (50 <= sum || (30 <= sum && 50 <= r)) {
				ret = 'C';
			} else if (30 <= sum) {
				ret = 'D';
			}
			System.out.println(ret);
		}
	}
}
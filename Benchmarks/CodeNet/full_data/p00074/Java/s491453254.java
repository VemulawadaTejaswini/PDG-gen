import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int h = sc.nextInt();
			int m = sc.nextInt();
			int s = sc.nextInt();

				if (h == -1 && m == -1 && s == -1) {
					break;
				}

			LocalTime l1 = LocalTime.of(h, m, s);
			LocalTime l2 = LocalTime.of(2, 0, 0);

			Duration d = Duration.between(l1, l2);
			System.out.printf("%02d:%02d:%02d\n", d.toHours(), d.toMinutes() % 60, d.getSeconds() % 60);
		}
		sc.close();
	}
}

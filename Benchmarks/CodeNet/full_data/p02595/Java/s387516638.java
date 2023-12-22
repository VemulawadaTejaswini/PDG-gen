import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int cnt = 0;

		for (int i = 0; i < a; i++) {
			int c = sc.nextInt();
			int d = sc.nextInt();

			BigDecimal e = new BigDecimal(c).multiply(new BigDecimal(c)).add(new BigDecimal(d).multiply(new BigDecimal(d)));
			BigDecimal f = new BigDecimal(b).multiply(new BigDecimal(b));

			if (e.compareTo(f) <= 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}

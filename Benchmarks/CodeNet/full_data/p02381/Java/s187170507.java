import static java.lang.Double.*;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int n = 0;
		while (  ( n = sc.nextInt() ) != 0 ) {
			sc.nextLine();

			String[] data = sc.nextLine().split(" ");

			double m = 0;
			for (int i = 0; i < n; i++) {
				m += Double.parseDouble(data[i]);
			}
			m = m / n;

			double aa = 0;
			for (int i = 0; i < n; i++) {
				double sm = parseDouble(data[i]) - m;
				aa += sm*sm;
			}
			aa = aa / n;

			double a = Math.sqrt(aa);

			sb.append(a + "\n");
		}

		System.out.print(sb);
	}

}
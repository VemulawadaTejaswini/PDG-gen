

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			double x1 =  scanner.nextDouble();
			double y1 =  scanner.nextDouble();
			double x2 =  scanner.nextDouble();
			double y2 =  scanner.nextDouble();
			double x3 =  scanner.nextDouble();
			double y3 =  scanner.nextDouble();
			double xp =  scanner.nextDouble();
			double yp =  scanner.nextDouble();

			double v1 = x1 * xp - y1 * yp;
			double v2 = x2 * xp - y2 * yp;
			double v3 = x3 * xp - y3 * yp;
			System.out.println(v1);
			System.out.println(v2);
			System.out.println(v3);

			if ((v1 < 0 && v2 < 0 && v3 < 0) || (v1 >= 0 && v2 >= 0 && v3 >= 0)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}

		}
		scanner.close();

	}

}


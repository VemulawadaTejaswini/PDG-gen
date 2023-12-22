

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int num = in.nextInt();
		int count = 1;

		for (count = 1; count <= num; count++) {

			// 3??§?????????????????°?????¨???
			if (count % 3 == 0) {

				System.out.print(" " + count);

				// ???????????????3?????°?????¨???
			} else if (count % 10 == 3) {

				System.out.print(" " + count);

				// else if(count / 10 == 3)
			} else {

				int x = count;
				int display = 0;

				while (x > 10) {
					x /= 10;

					if (x % 10 == 3) {
						display = count;
					}
				}
				if(display != 0) {
					System.out.print(" " + display);
				}
			}
		}
		System.out.println("");
	}

}
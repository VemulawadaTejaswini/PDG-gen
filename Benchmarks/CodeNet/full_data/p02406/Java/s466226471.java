

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int num = in.nextInt();
		int count = 1;

		for (count = 1; count < num; count++) {

			if (count % 3 == 0 && count % 10 != 0) {

				String dis_count = String.format("%5d", count);
				System.out.print(dis_count);

			}
		}
		String dis_num = String.format("%5d", num);
		System.out.print(dis_num);
	}

}


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int h = in.nextInt();
		int w = in.nextInt();

		for (int i = 0; i < h; i++) {

			for (int n = 0; n < w; n++) {

				System.out.print("#");
			}

			System.out.println();
		}

	}

}
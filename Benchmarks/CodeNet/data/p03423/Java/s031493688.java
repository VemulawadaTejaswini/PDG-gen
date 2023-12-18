package abc89;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();

		if (N / 3 < 1) {
			System.out.println(0);
		}

		if (N % 3 == 0) {
			System.out.println(N / 3);
		} else {
			if (N % 3 > 3) {
				System.out.println((int)Math.ceil(N/3));
			} else {
				System.out.println((int)Math.floor(N/3));
			}
		}



	}
}

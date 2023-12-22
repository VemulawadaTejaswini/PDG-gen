package ABC168;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int r = N % 10;
		String str = " ";
		if (r == 3) {
			str = "bon";
		} else if (r == 0 || r == 1 || r == 6 || r == 8) {
			str = "pon";
		} else {
			str = "hon";
		}

		System.out.println(str);

	}
}

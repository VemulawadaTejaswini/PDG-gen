

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		n %= 10;
		String result = digit(n);
		System.out.println(result);

	}
	private static String digit(int n) {
		if(n == 3) {
			return "bon";
		} else if (n == 0 || n == 1 || n == 6 || n == 8) {
			return "pon";
		} else {
			return "hon";
		}
	}

}



import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//test
		Scanner sc = new Scanner(System.in);
		String s[] = sc.nextLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int X = Integer.parseInt(s[1]);
		int T = Integer.parseInt(s[2]);

		int result = 0;
		if (N % X == 0) {
			result = ( N / X ) * T ;
		} else {
			result = ( N / X + 1) * T;
		}

		System.out.println(result );
	}

}
